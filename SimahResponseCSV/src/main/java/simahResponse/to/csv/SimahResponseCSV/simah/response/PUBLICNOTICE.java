//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 09:05:30 AM EET 
//


package simahResponse.to.csv.SimahResponseCSV.simah.response;

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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}PN_LOAD_DT"/>
 *         &lt;element ref="{}PN_TYPE"/>
 *         &lt;element ref="{}PN_PUBLICATION" minOccurs="0"/>
 *         &lt;element ref="{}PN_COMMENT" minOccurs="0"/>
 *         &lt;element ref="{}PN_PUBLICATION_AR" minOccurs="0"/>
 *         &lt;element ref="{}PN_COMMENT_AR" minOccurs="0"/>
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
    "pnloaddt",
    "pntype",
    "pnpublication",
    "pncomment",
    "pnpublicationar",
    "pncommentar"
})
@XmlRootElement(name = "PUBLIC_NOTICE")
public class PUBLICNOTICE {

    @XmlElement(name = "PN_LOAD_DT")
    protected String pnloaddt;
    @XmlElement(name = "PN_TYPE")
    protected String pntype;
    @XmlElement(name = "PN_PUBLICATION")
    protected String pnpublication;
    @XmlElement(name = "PN_COMMENT")
    protected String pncomment;
    @XmlElement(name = "PN_PUBLICATION_AR")
    protected PNPUBLICATIONAR pnpublicationar;
    @XmlElement(name = "PN_COMMENT_AR")
    protected PNCOMMENTAR pncommentar;

    /**
     * Gets the value of the pnloaddt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNLOADDT() {
        return pnloaddt;
    }

    /**
     * Sets the value of the pnloaddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNLOADDT(String value) {
        this.pnloaddt = value;
    }

    /**
     * Gets the value of the pntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNTYPE() {
        return pntype;
    }

    /**
     * Sets the value of the pntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNTYPE(String value) {
        this.pntype = value;
    }

    /**
     * Gets the value of the pnpublication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNPUBLICATION() {
        return pnpublication;
    }

    /**
     * Sets the value of the pnpublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNPUBLICATION(String value) {
        this.pnpublication = value;
    }

    /**
     * Gets the value of the pncomment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNCOMMENT() {
        return pncomment;
    }

    /**
     * Sets the value of the pncomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNCOMMENT(String value) {
        this.pncomment = value;
    }

    /**
     * Gets the value of the pnpublicationar property.
     * 
     * @return
     *     possible object is
     *     {@link PNPUBLICATIONAR }
     *     
     */
    public PNPUBLICATIONAR getPNPUBLICATIONAR() {
        return pnpublicationar;
    }

    /**
     * Sets the value of the pnpublicationar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNPUBLICATIONAR }
     *     
     */
    public void setPNPUBLICATIONAR(PNPUBLICATIONAR value) {
        this.pnpublicationar = value;
    }

    /**
     * Gets the value of the pncommentar property.
     * 
     * @return
     *     possible object is
     *     {@link PNCOMMENTAR }
     *     
     */
    public PNCOMMENTAR getPNCOMMENTAR() {
        return pncommentar;
    }

    /**
     * Sets the value of the pncommentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNCOMMENTAR }
     *     
     */
    public void setPNCOMMENTAR(PNCOMMENTAR value) {
        this.pncommentar = value;
    }

}