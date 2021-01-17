package simahResponse.to.csv.SimahResponseCSV.constants;

import java.util.ArrayList;
import java.util.List;

public enum SimahCSVDataHeadersNUM {
	
	//Report Headers Required -- SIMAH Response Headers
	
	USER_ID("USER_ID"),//B2BZANP
	CUSTOMER_ID("Customer_ID"),//CID2
	CUSTOMER_NAME("Customer_Name"),//PCNAM
	NATIONALITY("Nationality"),//PCNAT
	DATE_OF_BIRTH("Date_of _Birth"),//PCDOB
	ENQUIRY_TYPE("Enquiry Type"),//ENQUIRY_TYPE
	ENQUIRY_NO("ENQUIRY_NO"),//ENQUIRY_NO
	ENQUIRY_DATE("Enquiry Date"),//REPORT_DATE
	APPLICATION_TYPE("Application_Type"),//PRODUCT_TYPE
	DEFAULT_PRODUCT("Default_Product"),//DF_PRD
	DEFAULT_PRODUCT_FLAG("Default Product (Self / Gurantor Flag)"),//DF_CAPL
	DEFAULT_ACCOUNT_NUMBER("Default_Account_Number"),//DF_ACC_NO
	DEFAULT_CREDITOR_ID("Default_Creditor_ID"),//DF_CRDTR
	DEFAULT_DATE("Default_Date"),//DF_LOAD_DT
	DEFAULT_STATUS("Default_Status"),//DF_STAT
	DEFAULT_STATUS_DATE("Default_Status_Date"),//DF_SETTLD_DATE
	DEFAULT_ORIGINAL_AMOUNT("Default_Original_Amount"),//DF_ORIG_AMT
	DEFAULT_OUTSTANDING_AMOUNT("Default_Outstanding_Amount"),//DF_CUB
	CI_ACCOUNT_NUMBER("CI_Account_Number"),//CI_ACC_NO
	CREDITOR_ID("Creditor_ID"),//CI_CRDTR
	PRODUCT_TYPE("Product_Type"),//CI_PRD
	CREDIT_INSTRUMENT_STATUS("Credit_Instrument_Status"),//CI_STATUS
	CREDIT_LIMIT("Credit_Limit"),//CI_LIMIT
	CI_ISSUE_DATE("CI_Issue_Date"),//CI_ISSU_DT
	CI_MATURITY_DATE("CI_Maturity_Date"),//CI_PROD_EXP_DT
	CI_ClOSURE_DATE("CI_Closure_Date"),//CI_CLSD_DT
	CI_NEXT_DUE_DATE("CI_Next_Due_Date"),//CI_NXT_DU_DT
	CI_AS_OF_DATE("CI_As_of_Date"),//CI_AS_OF_DT
	CI_PAYMENT_STRING("CI_Payment_String"),//CI_SUMMRY
	CI_INSTL("CI_INSTL"),//CI_INSTL
	CI_PAYMENT_FREQUENCY("CI_Payment_Frequency"),//CI_FRQ
	CI_TENURE("CI_Tenure"),//CI_TNR
	SALARY_FLAG("Salary_Flag"),//CI_SAL
	CI_OUTSTANDING_BALANCE("CI_Outstanding_Balance"),//CI_CUB
	CI_OVERDUE_BALANCE("CI_Overdue_Balance"),//CI_ODB
	SIMAH_SCORE("SIMAH_Score"),//SC_SCORE
	EMI_CALCULATION("EMI_Calculation"),// For Cards it should be 5% x Credit Limit, and for others it should equal to CI_INSTL
	CCN1("CCN1"),//CCNT
	CCN2("CCN2"),
	CCN3("CCN3"),
	CCN4("CCN4");
	
	
	private String value;
	
	SimahCSVDataHeadersNUM(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static List<String> getHeaders(){
		List<String> headers = new ArrayList<>();
		for(SimahCSVDataHeadersNUM header : SimahCSVDataHeadersNUM.values()) {
			headers.add(header.getValue());
		}
		return headers;
	}

}
