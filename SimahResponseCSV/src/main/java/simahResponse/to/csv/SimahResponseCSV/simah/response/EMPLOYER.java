package simahResponse.to.csv.SimahResponseCSV.simah.response;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 09:05:30 AM EET 
//


import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}ETYP"/>
 *         &lt;element ref="{}ENME" minOccurs="0"/>
 *         &lt;element ref="{}ENMA" minOccurs="0"/>
 *         &lt;element ref="{}EADR" maxOccurs="3"/>
 *         &lt;element ref="{}EOCA" minOccurs="0"/>
 *         &lt;element ref="{}EOCE" minOccurs="0"/>
 *         &lt;element ref="{}EDOE"/>
 *         &lt;element ref="{}ELEN"/>
 *         &lt;element ref="{}ECEX"/>
 *         &lt;element ref="{}EDLD"/>
 *         &lt;element ref="{}EMBS"/>
 *         &lt;element ref="{}ETMS"/>
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
    "etyp",
    "enme",
    "enma",
    "eadr",
    "eoca",
    "eoce",
    "edoe",
    "elen",
    "ecex",
    "edld",
    "embs",
    "etms"
})
@XmlRootElement(name = "EMPLOYER")
public class EMPLOYER {

    @XmlElement(name = "ETYP", required = true)
    protected String etyp;
    @XmlElement(name = "ENME")
    protected String enme;
    @XmlElement(name = "ENMA")
    protected ENMA enma;
    @XmlElement(name = "EADR", required = true)
    protected List<EADR> eadr;
    @XmlElement(name = "EOCA")
    protected EOCA eoca;
    @XmlElement(name = "EOCE")
    protected String eoce;
    @XmlElement(name = "EDOE", required = true)
    protected String edoe;
    @XmlElement(name = "ELEN", required = true)
    protected String elen;
    @XmlElement(name = "ECEX", required = true)
    protected String ecex;
    @XmlElement(name = "EDLD", required = true)
    protected String edld;
    @XmlElement(name = "EMBS", required = true)
    protected String embs;
    @XmlElement(name = "ETMS", required = true)
    protected String etms;

    /**
     * Gets the value of the etyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETYP() {
        return etyp;
    }

    /**
     * Sets the value of the etyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETYP(String value) {
        this.etyp = value;
    }

    /**
     * Gets the value of the enme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENME() {
        return enme;
    }

    /**
     * Sets the value of the enme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENME(String value) {
        this.enme = value;
    }

    /**
     * Gets the value of the enma property.
     * 
     * @return
     *     possible object is
     *     {@link ENMA }
     *     
     */
    public ENMA getENMA() {
        return enma;
    }

    /**
     * Sets the value of the enma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENMA }
     *     
     */
    public void setENMA(ENMA value) {
        this.enma = value;
    }

    /**
     * Gets the value of the eadr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eadr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEADR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EADR }
     * 
     * 
     */
    public List<EADR> getEADR() {
        if (eadr == null) {
            eadr = new ArrayList<EADR>();
        }
        return this.eadr;
    }

    /**
     * Gets the value of the eoca property.
     * 
     * @return
     *     possible object is
     *     {@link EOCA }
     *     
     */
    public EOCA getEOCA() {
        return eoca;
    }

    /**
     * Sets the value of the eoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link EOCA }
     *     
     */
    public void setEOCA(EOCA value) {
        this.eoca = value;
    }

    /**
     * Gets the value of the eoce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOCE() {
        return eoce;
    }

    /**
     * Sets the value of the eoce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOCE(String value) {
        this.eoce = value;
    }

    /**
     * Gets the value of the edoe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDOE() {
        return edoe;
    }

    /**
     * Sets the value of the edoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDOE(String value) {
        this.edoe = value;
    }

    /**
     * Gets the value of the elen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEN() {
        return elen;
    }

    /**
     * Sets the value of the elen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEN(String value) {
        this.elen = value;
    }

    /**
     * Gets the value of the ecex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECEX() {
        return ecex;
    }

    /**
     * Sets the value of the ecex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECEX(String value) {
        this.ecex = value;
    }

    /**
     * Gets the value of the edld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDLD() {
        return edld;
    }

    /**
     * Sets the value of the edld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDLD(String value) {
        this.edld = value;
    }

    /**
     * Gets the value of the embs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMBS() {
        return embs;
    }

    /**
     * Sets the value of the embs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMBS(String value) {
        this.embs = value;
    }

    /**
     * Gets the value of the etms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETMS() {
        return etms;
    }

    /**
     * Sets the value of the etms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETMS(String value) {
        this.etms = value;
    }

}