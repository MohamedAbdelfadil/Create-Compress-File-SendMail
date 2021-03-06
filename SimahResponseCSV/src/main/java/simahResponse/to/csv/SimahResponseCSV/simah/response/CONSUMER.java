package simahResponse.to.csv.SimahResponseCSV.simah.response;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 09:05:30 AM EET 
//


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ENTITY" minOccurs="0"/>
 *         &lt;element ref="{}CAPL"/>
 *         &lt;element ref="{}CID"/>
 *         &lt;element ref="{}CVIP"/>
 *         &lt;element ref="{}PROVIDED"/>
 *         &lt;element ref="{}AVAILABLE"/>
 *         &lt;element ref="{}PREV_ENQUIRIES" minOccurs="0"/>
 *         &lt;element ref="{}CI_DETAILS" minOccurs="0"/>
 *         &lt;element ref="{}DEFAULTS" minOccurs="0"/>
 *         &lt;element ref="{}BOUNCED_CHECKS" minOccurs="0"/>
 *         &lt;element ref="{}PUBLIC_NOTICES" minOccurs="0"/>
 *         &lt;element ref="{}JUDGEMENTS" minOccurs="0"/>
 *         &lt;element ref="{}NARRATIVES" minOccurs="0"/>
 *         &lt;element ref="{}ADDRESSES" minOccurs="0"/>
 *         &lt;element ref="{}CONTACTS" minOccurs="0"/>
 *         &lt;element ref="{}EMPLOYERS" minOccurs="0"/>
 *         &lt;element ref="{}ADVISORY_SUMMARY_TEXT" minOccurs="0"/>
 *         &lt;element ref="{}SUMMARY"/>
 *         &lt;element ref="{}SCORE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entity",
    "capl",
    "cid",
    "cvip",
    "provided",
    "available",
    "prevenquiries",
    "cidetails",
    "defaults",
    "bouncedchecks",
    "publicnotices",
    "judgements",
    "narratives",
    "addresses",
    "contacts",
    "employers",
    "advisorysummarytext",
    "summary",
    "score"
})
@XmlRootElement(name = "CONSUMER")
public class CONSUMER {

    @XmlElement(name = "ENTITY")
    protected String entity;
    @XmlElement(name = "CAPL", required = true)
    protected String capl;
    @XmlElement(name = "CID", required = true)
    protected CID cid;
    @XmlElement(name = "CVIP", required = true)
    protected String cvip;
    @XmlElement(name = "PROVIDED", required = true)
    protected PROVIDED provided;
    @XmlElement(name = "AVAILABLE", required = true)
    protected AVAILABLE available;
    @XmlElement(name = "PREV_ENQUIRIES")
    protected PREVENQUIRIES prevenquiries;
    @XmlElement(name = "CI_DETAILS")
    protected CIDETAILS cidetails;
    @XmlElement(name = "DEFAULTS")
    protected DEFAULTS defaults;
    @XmlElement(name = "BOUNCED_CHECKS")
    protected BOUNCEDCHECKS bouncedchecks;
    @XmlElement(name = "PUBLIC_NOTICES")
    protected PUBLICNOTICES publicnotices;
    @XmlElement(name = "JUDGEMENTS")
    protected JUDGEMENTS judgements;
    @XmlElement(name = "NARRATIVES")
    protected NARRATIVES narratives;
    @XmlElement(name = "ADDRESSES")
    protected ADDRESSES addresses;
    @XmlElement(name = "CONTACTS")
    protected CONTACTS contacts;
    @XmlElement(name = "EMPLOYERS")
    protected EMPLOYERS employers;
    @XmlElement(name = "ADVISORY_SUMMARY_TEXT")
    protected ADVISORYSUMMARYTEXT advisorysummarytext;
    @XmlElement(name = "SUMMARY", required = true)
    protected SUMMARY summary;
    @XmlElement(name = "SCORE")
    protected SCORE score;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITY() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITY(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the capl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPL() {
        return capl;
    }

    /**
     * Sets the value of the capl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPL(String value) {
        this.capl = value;
    }

    /**
     * Gets the value of the cid property.
     * 
     * @return
     *     possible object is
     *     {@link CID }
     *     
     */
    public CID getCID() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CID }
     *     
     */
    public void setCID(CID value) {
        this.cid = value;
    }

    /**
     * Gets the value of the cvip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVIP() {
        return cvip;
    }

    /**
     * Sets the value of the cvip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVIP(String value) {
        this.cvip = value;
    }

    /**
     * Gets the value of the provided property.
     * 
     * @return
     *     possible object is
     *     {@link PROVIDED }
     *     
     */
    public PROVIDED getPROVIDED() {
        return provided;
    }

    /**
     * Sets the value of the provided property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDED }
     *     
     */
    public void setPROVIDED(PROVIDED value) {
        this.provided = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABLE }
     *     
     */
    public AVAILABLE getAVAILABLE() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABLE }
     *     
     */
    public void setAVAILABLE(AVAILABLE value) {
        this.available = value;
    }

    /**
     * Gets the value of the prevenquiries property.
     * 
     * @return
     *     possible object is
     *     {@link PREVENQUIRIES }
     *     
     */
    public PREVENQUIRIES getPREVENQUIRIES() {
        return prevenquiries;
    }

    /**
     * Sets the value of the prevenquiries property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREVENQUIRIES }
     *     
     */
    public void setPREVENQUIRIES(PREVENQUIRIES value) {
        this.prevenquiries = value;
    }

    /**
     * Gets the value of the cidetails property.
     * 
     * @return
     *     possible object is
     *     {@link CIDETAILS }
     *     
     */
    public CIDETAILS getCIDETAILS() {
        return cidetails;
    }

    /**
     * Sets the value of the cidetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDETAILS }
     *     
     */
    public void setCIDETAILS(CIDETAILS value) {
        this.cidetails = value;
    }

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link DEFAULTS }
     *     
     */
    public DEFAULTS getDEFAULTS() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFAULTS }
     *     
     */
    public void setDEFAULTS(DEFAULTS value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the bouncedchecks property.
     * 
     * @return
     *     possible object is
     *     {@link BOUNCEDCHECKS }
     *     
     */
    public BOUNCEDCHECKS getBOUNCEDCHECKS() {
        return bouncedchecks;
    }

    /**
     * Sets the value of the bouncedchecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOUNCEDCHECKS }
     *     
     */
    public void setBOUNCEDCHECKS(BOUNCEDCHECKS value) {
        this.bouncedchecks = value;
    }

    /**
     * Gets the value of the publicnotices property.
     * 
     * @return
     *     possible object is
     *     {@link PUBLICNOTICES }
     *     
     */
    public PUBLICNOTICES getPUBLICNOTICES() {
        return publicnotices;
    }

    /**
     * Sets the value of the publicnotices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUBLICNOTICES }
     *     
     */
    public void setPUBLICNOTICES(PUBLICNOTICES value) {
        this.publicnotices = value;
    }

    /**
     * Gets the value of the judgements property.
     * 
     * @return
     *     possible object is
     *     {@link JUDGEMENTS }
     *     
     */
    public JUDGEMENTS getJUDGEMENTS() {
        return judgements;
    }

    /**
     * Sets the value of the judgements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JUDGEMENTS }
     *     
     */
    public void setJUDGEMENTS(JUDGEMENTS value) {
        this.judgements = value;
    }

    /**
     * Gets the value of the narratives property.
     * 
     * @return
     *     possible object is
     *     {@link NARRATIVES }
     *     
     */
    public NARRATIVES getNARRATIVES() {
        return narratives;
    }

    /**
     * Sets the value of the narratives property.
     * 
     * @param value
     *     allowed object is
     *     {@link NARRATIVES }
     *     
     */
    public void setNARRATIVES(NARRATIVES value) {
        this.narratives = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSES }
     *     
     */
    public ADDRESSES getADDRESSES() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSES }
     *     
     */
    public void setADDRESSES(ADDRESSES value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTS }
     *     
     */
    public CONTACTS getCONTACTS() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTS }
     *     
     */
    public void setCONTACTS(CONTACTS value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the employers property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYERS }
     *     
     */
    public EMPLOYERS getEMPLOYERS() {
        return employers;
    }

    /**
     * Sets the value of the employers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYERS }
     *     
     */
    public void setEMPLOYERS(EMPLOYERS value) {
        this.employers = value;
    }

    /**
     * Gets the value of the advisorysummarytext property.
     * 
     * @return
     *     possible object is
     *     {@link ADVISORYSUMMARYTEXT }
     *     
     */
    public ADVISORYSUMMARYTEXT getADVISORYSUMMARYTEXT() {
        return advisorysummarytext;
    }

    /**
     * Sets the value of the advisorysummarytext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADVISORYSUMMARYTEXT }
     *     
     */
    public void setADVISORYSUMMARYTEXT(ADVISORYSUMMARYTEXT value) {
        this.advisorysummarytext = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link SUMMARY }
     *     
     */
    public SUMMARY getSUMMARY() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUMMARY }
     *     
     */
    public void setSUMMARY(SUMMARY value) {
        this.summary = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link SCORE }
     *     
     */
    public SCORE getSCORE() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCORE }
     *     
     */
    public void setSCORE(SCORE value) {
        this.score = value;
    }

}
