package simahResponse.to.csv.SimahResponseCSV.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import simahResponse.to.csv.SimahResponseCSV.simah.response.RESPONSE;

@Document(collection = "simahReport")
public class SimahReport {

	private String userId;
	private String reportId;
	private LocalDate creationDate;
	private LocalDate expiryDate;
	private RESPONSE response;
	private String errorResponse;
	private String responseXml;
	private boolean valid;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public RESPONSE getResponse() {
		return response;
	}

	public void setResponse(RESPONSE response) {
		this.response = response;
	}

	public String getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(String errorResponse) {
		this.errorResponse = errorResponse;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getResponseXml() {
		return responseXml;
	}

	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}
	
}
