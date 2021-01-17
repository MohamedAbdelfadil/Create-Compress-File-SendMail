package simahResponse.to.csv.SimahResponseCSV.service;

import java.io.File;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import simahResponse.to.csv.SimahResponseCSV.DTO.SimahResponseCSVDataObject;
import simahResponse.to.csv.SimahResponseCSV.constants.SimahCSVDataHeadersNUM;
import simahResponse.to.csv.SimahResponseCSV.model.SimahReport;
import simahResponse.to.csv.SimahResponseCSV.repository.SimahReportRepository;
import simahResponse.to.csv.SimahResponseCSV.simah.response.ACNAM;
import simahResponse.to.csv.SimahResponseCSV.simah.response.CIDETAILS;
import simahResponse.to.csv.SimahResponseCSV.simah.response.CONTACTS;
import simahResponse.to.csv.SimahResponseCSV.simah.response.DEFAULTS;
import simahResponse.to.csv.SimahResponseCSV.simah.response.RESPONSE;

@Service
public class SimahService {

	@Autowired
	SimahReportRepository simahReportRepo;
	
	public ResponseEntity<Object> simahXmlResponseToCSV() {
		try {
			
			Iterable<SimahReport> reports = simahReportRepo.findAll();
			
			List<SimahResponseCSVDataObject> simahReportDataList = formSimahReportData(reports);
			
			
			List<String> headers = SimahCSVDataHeadersNUM.getHeaders();
			String[] headersArray = new String[headers.size()];
			headersArray = headers.toArray(headersArray);
			
			File file = new File("/home/abdelfadil/Desktop/simahResponse.csv");
			FileWriter writer = new FileWriter(file);
			
			// write CSV file
			CSVPrinter printer = CSVFormat.DEFAULT.withHeader(headersArray).withQuoteMode(QuoteMode.ALL_NON_NULL)
								.print(writer);
			
			for(SimahResponseCSVDataObject data : simahReportDataList) {
				List<String> csvData = csvFileData(data);
				printer.printRecord(csvData);
			}
			// flush the stream
			printer.flush();
			// close the writer
			writer.close();
			
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	private List<SimahResponseCSVDataObject> formSimahReportData(Iterable<SimahReport> reports) throws JAXBException{
		List<SimahResponseCSVDataObject> simahReportDataList = new ArrayList<SimahResponseCSVDataObject>();
		for(SimahReport report : reports) {
			RESPONSE xmlRes = null;
			System.out.println("report user id ## " + report.getUserId());
			JAXBContext jaxbContext = JAXBContext.newInstance(RESPONSE.class);
			Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
			if (report.getResponseXml() != null) {
				StringReader sw = new StringReader(report.getResponseXml());
				xmlRes = (RESPONSE) jaxbMarshaller.unmarshal(sw);
			}else {
				continue;
			}
			
			SimahResponseCSVDataObject simahResponseDataObject = new SimahResponseCSVDataObject();
			ACNAM acNam = xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getAVAILABLE().getACNAM(); 
			StringBuilder customerName = new StringBuilder("");
			if(acNam != null) {
				if(acNam.getACNM2A() != null)
					customerName.append(acNam.getACNM2A().getValue() + " ").append(acNam.getACNM1A()!=null?acNam.getACNM1A().getValue() + " " : "").append(acNam.getACNMFA()!=null? acNam.getACNMFA().getValue():"");
				else if(acNam.getACNM3E() != null)
					customerName.append(acNam.getACNM3E() + " ").append(acNam.getACNM1E()!=null?acNam.getACNM1E() + " " : "").append( acNam.getACNMFE()!=null?acNam.getACNMFE() + " " : "" );
			}
			
			simahResponseDataObject.setUserId(report.getUserId());
			simahResponseDataObject.setCustomerId( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getCID().getCID2() );
			simahResponseDataObject.setCustomerName( customerName.toString());
			simahResponseDataObject.setNationality( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getPROVIDED().getPCNAT() );
			simahResponseDataObject.setDob( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getPROVIDED().getPCDOB() );
			simahResponseDataObject.setEnquiryType( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getENQUIRYTYPE() );
			simahResponseDataObject.setEnquiryNo( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getENQUIRYNO() );
			simahResponseDataObject.setEnquiryDate( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getREPORTDATE() );
			simahResponseDataObject.setApplicationType( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getPRODUCTTYPE() );
			simahResponseDataObject.setSimahScore( xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getSCORE().getSCSCORE() );
			
			addDefaultsAndLoansAndContactsAttrs(xmlRes, simahResponseDataObject, simahReportDataList);
		}
		return simahReportDataList;
	}
	
	private void addDefaultsAndLoansAndContactsAttrs(RESPONSE xmlRes, SimahResponseCSVDataObject simahResponseDataObject, List<SimahResponseCSVDataObject> simahReportDataList ) {
		
		DEFAULTS defaults = xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getDEFAULTS();
		CIDETAILS simahLoans = xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getCIDETAILS();
		CONTACTS contacts = xmlRes.getMESSAGE().getITEM().get(0).getRSPREPORT().getCONSUMER().get(0).getCONTACTS();
		
		int defaultsSize = 0;
		int simahLoansSize = 0;
		int contactsSize = 0;
		int maxIndex = -1;
		
		if(defaults != null && defaults.getDEFAULT() != null && !defaults.getDEFAULT().isEmpty())
			defaultsSize = defaults.getDEFAULT().size();
		
		if(simahLoans != null && simahLoans.getCIDETAIL() != null && !simahLoans.getCIDETAIL().isEmpty())
			simahLoansSize = simahLoans.getCIDETAIL().size();
		
		if(contacts != null && contacts.getCCNT() != null && !contacts.getCCNT().isEmpty() )
			contactsSize = contacts.getCCNT().size();
		
		maxIndex = Math.max(defaultsSize, Math.max(simahLoansSize,contactsSize) ) - 1;
		
		if(maxIndex == -1) {
			simahReportDataList.add(simahResponseDataObject);
			return;
		}
		
		for(int i=0; i<= maxIndex; i++) {
			if(i == 0) {
				formSimahResponseDataObjectDefaultsAndLoansAndContacts(simahResponseDataObject, i, defaultsSize, simahLoansSize, contactsSize, defaults, simahLoans, contacts);
				simahReportDataList.add(simahResponseDataObject);
			}else {
				SimahResponseCSVDataObject simahResDataObj = new SimahResponseCSVDataObject();
				formSimahResponseDataObjectDefaultsAndLoansAndContacts(simahResDataObj, i, defaultsSize, simahLoansSize, contactsSize, defaults, simahLoans, contacts);
				simahReportDataList.add(simahResDataObj);
			}
		}
		
	}
	
	private void formSimahResponseDataObjectDefaultsAndLoansAndContacts(SimahResponseCSVDataObject simahResponseDataObject, int index, int defaultsSize, int simahLoansSize, int contactsSize,
			DEFAULTS defaults, CIDETAILS simahLoans, CONTACTS contacts) {
		System.out.println("index is: " + index);
		if(defaultsSize > 0 && index <=(defaultsSize-1) ) {
			simahResponseDataObject.setDefaultProduct( defaults.getDEFAULT().get(index).getDFPRD() );
			simahResponseDataObject.setDefaultProductFlag( defaults.getDEFAULT().get(index).getDFCAPL() );
			simahResponseDataObject.setDefaultAccountNumber( defaults.getDEFAULT().get(index).getDFACCNO() );
			simahResponseDataObject.setDefaultCreditorID( defaults.getDEFAULT().get(index).getDFCRDTR() );
			simahResponseDataObject.setDefaultDate( defaults.getDEFAULT().get(index).getDFLOADDT() );
			simahResponseDataObject.setDefaultStatus( defaults.getDEFAULT().get(index).getDFSTAT() );
			simahResponseDataObject.setDefaultStatusDate( defaults.getDEFAULT().get(index).getDFSETTLDDATE() );
			simahResponseDataObject.setDefaultOriginalAmount( defaults.getDEFAULT().get(index).getDFORIGAMT() );
			simahResponseDataObject.setDefaultOutstandingAmount( defaults.getDEFAULT().get(index).getDFCUB() );
		}
		if(simahLoansSize > 0 && index <=(simahLoansSize-1)) {
			simahResponseDataObject.setCiAccountNumber( simahLoans.getCIDETAIL().get(index).getCIACCNO() );
			simahResponseDataObject.setCreditorID( simahLoans.getCIDETAIL().get(index).getCICRDTR() );
			simahResponseDataObject.setProductType( simahLoans.getCIDETAIL().get(index).getCIPRD() );
			simahResponseDataObject.setCreditInstrumentStatus( simahLoans.getCIDETAIL().get(index).getCISTATUS() );
			simahResponseDataObject.setCreditLimit( simahLoans.getCIDETAIL().get(index).getCILIMIT() );
			simahResponseDataObject.setCiIssueDate( simahLoans.getCIDETAIL().get(index).getCIISSUDT() );
			simahResponseDataObject.setCiMaturityDate( simahLoans.getCIDETAIL().get(index).getCIPRODEXPDT() );
			simahResponseDataObject.setCiClosureDate( simahLoans.getCIDETAIL().get(index).getCICLSDDT() );
			simahResponseDataObject.setCiNextDueDate( simahLoans.getCIDETAIL().get(index).getCINXTDUDT() );
			simahResponseDataObject.setCiAsOfDate( simahLoans.getCIDETAIL().get(index).getCIASOFDT() );
			simahResponseDataObject.setCiPaymentString( simahLoans.getCIDETAIL().get(index).getCISUMMRY() );
			simahResponseDataObject.setCiInstl( simahLoans.getCIDETAIL().get(index).getCIINSTL() );
			simahResponseDataObject.setCiPaymentFreq( simahLoans.getCIDETAIL().get(index).getCIFRQ() );
			simahResponseDataObject.setCiTenure( simahLoans.getCIDETAIL().get(index).getCITNR() );
			simahResponseDataObject.setSalaryFlag( simahLoans.getCIDETAIL().get(index).getCISAL() );
			simahResponseDataObject.setCiOutstandingBalance( simahLoans.getCIDETAIL().get(index).getCICUB() );
			simahResponseDataObject.setCiOverdueBalance( simahLoans.getCIDETAIL().get(index).getCIODB() );
			double emiCal = 0;
			if(simahResponseDataObject.getProductType().equalsIgnoreCase("CRC") || simahResponseDataObject.getProductType().equalsIgnoreCase("LCRC") || 
					simahResponseDataObject.getProductType().equalsIgnoreCase("CDC") ) {
				emiCal = (5 * Double.parseDouble( simahResponseDataObject.getCreditLimit() ) ) / 100;
			}else {
				emiCal = Double.parseDouble( simahResponseDataObject.getCiInstl() );
			}
			simahResponseDataObject.setEMICalculation( emiCal );
		}
		if(contactsSize > 0 && index <=(contactsSize-1)) {
			simahResponseDataObject.setCcn1( contacts.getCCNT().get(index).getCCN1() );
			simahResponseDataObject.setCcn2( contacts.getCCNT().get(index).getCCN2() );
			simahResponseDataObject.setCcn3( contacts.getCCNT().get(index).getCCN3() );
			simahResponseDataObject.setCcn4( contacts.getCCNT().get(index).getCCN4() );
		}
		
	}
	
	
	private List<String> csvFileData(SimahResponseCSVDataObject data){
		List<String> reportAsList = new ArrayList<>();
		reportAsList.add( data.getUserId() );
		reportAsList.add( data.getCustomerId() );
		reportAsList.add( data.getCustomerName() );
		reportAsList.add( data.getNationality() );
		reportAsList.add( data.getDob() );
		reportAsList.add( data.getEnquiryType() );
		reportAsList.add( data.getEnquiryNo() );
		reportAsList.add( data.getEnquiryDate() );
		reportAsList.add( data.getApplicationType() );
		reportAsList.add( data.getDefaultProduct() );
		reportAsList.add( data.getDefaultProductFlag() );
		reportAsList.add( data.getDefaultAccountNumber() );
		reportAsList.add( data.getDefaultCreditorID() );
		reportAsList.add( data.getDefaultDate() );
		reportAsList.add( data.getDefaultStatus() );
		reportAsList.add( data.getDefaultStatusDate() );
		reportAsList.add( data.getDefaultOriginalAmount() );
		reportAsList.add( data.getDefaultOutstandingAmount() );
		reportAsList.add( data.getCiAccountNumber() );
		reportAsList.add( data.getCreditorID() );
		reportAsList.add( data.getProductType() );
		reportAsList.add( data.getCreditInstrumentStatus() );
		reportAsList.add( data.getCreditLimit() );
		reportAsList.add( data.getCiIssueDate() );
		reportAsList.add( data.getCiMaturityDate() );
		reportAsList.add( data.getCiClosureDate() );
		reportAsList.add( data.getCiNextDueDate() );
		reportAsList.add( data.getCiAsOfDate() );
		reportAsList.add( data.getCiPaymentString() );
		reportAsList.add( data.getCiInstl() );
		reportAsList.add( data.getCiPaymentFreq() );
		reportAsList.add( data.getCiTenure() );
		reportAsList.add( data.getSalaryFlag() );
		reportAsList.add( data.getCiOutstandingBalance() );
		reportAsList.add( data.getCiOverdueBalance() );
		reportAsList.add( data.getSimahScore() );
		reportAsList.add( String.valueOf(data.getEMICalculation()) );
		reportAsList.add( data.getCcn1() );
		reportAsList.add( data.getCcn2() );
		reportAsList.add( data.getCcn3() );
		reportAsList.add( data.getCcn4() );
		return reportAsList;
	}

}
