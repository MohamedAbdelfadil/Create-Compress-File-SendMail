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
 *       &lt;sequence>
 *         &lt;element ref="{}PE_NMFA" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM1A" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM2A" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM3A" minOccurs="0"/>
 *         &lt;element ref="{}PE_NMFE" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM1E" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM2E" minOccurs="0"/>
 *         &lt;element ref="{}PE_NM3E" minOccurs="0"/>
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
    "penmfa",
    "penm1A",
    "penm2A",
    "penm3A",
    "penmfe",
    "penm1E",
    "penm2E",
    "penm3E"
})
@XmlRootElement(name = "PE_NAME")
public class PENAME {

    @XmlElement(name = "PE_NMFA")
    protected PENMFA penmfa;
    @XmlElement(name = "PE_NM1A")
    protected PENM1A penm1A;
    @XmlElement(name = "PE_NM2A")
    protected PENM2A penm2A;
    @XmlElement(name = "PE_NM3A")
    protected PENM3A penm3A;
    @XmlElement(name = "PE_NMFE")
    protected String penmfe;
    @XmlElement(name = "PE_NM1E")
    protected String penm1E;
    @XmlElement(name = "PE_NM2E")
    protected String penm2E;
    @XmlElement(name = "PE_NM3E")
    protected String penm3E;

    /**
     * Gets the value of the penmfa property.
     * 
     * @return
     *     possible object is
     *     {@link PENMFA }
     *     
     */
    public PENMFA getPENMFA() {
        return penmfa;
    }

    /**
     * Sets the value of the penmfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PENMFA }
     *     
     */
    public void setPENMFA(PENMFA value) {
        this.penmfa = value;
    }

    /**
     * Gets the value of the penm1A property.
     * 
     * @return
     *     possible object is
     *     {@link PENM1A }
     *     
     */
    public PENM1A getPENM1A() {
        return penm1A;
    }

    /**
     * Sets the value of the penm1A property.
     * 
     * @param value
     *     allowed object is
     *     {@link PENM1A }
     *     
     */
    public void setPENM1A(PENM1A value) {
        this.penm1A = value;
    }

    /**
     * Gets the value of the penm2A property.
     * 
     * @return
     *     possible object is
     *     {@link PENM2A }
     *     
     */
    public PENM2A getPENM2A() {
        return penm2A;
    }

    /**
     * Sets the value of the penm2A property.
     * 
     * @param value
     *     allowed object is
     *     {@link PENM2A }
     *     
     */
    public void setPENM2A(PENM2A value) {
        this.penm2A = value;
    }

    /**
     * Gets the value of the penm3A property.
     * 
     * @return
     *     possible object is
     *     {@link PENM3A }
     *     
     */
    public PENM3A getPENM3A() {
        return penm3A;
    }

    /**
     * Sets the value of the penm3A property.
     * 
     * @param value
     *     allowed object is
     *     {@link PENM3A }
     *     
     */
    public void setPENM3A(PENM3A value) {
        this.penm3A = value;
    }

    /**
     * Gets the value of the penmfe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENMFE() {
        return penmfe;
    }

    /**
     * Sets the value of the penmfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENMFE(String value) {
        this.penmfe = value;
    }

    /**
     * Gets the value of the penm1E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENM1E() {
        return penm1E;
    }

    /**
     * Sets the value of the penm1E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENM1E(String value) {
        this.penm1E = value;
    }

    /**
     * Gets the value of the penm2E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENM2E() {
        return penm2E;
    }

    /**
     * Sets the value of the penm2E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENM2E(String value) {
        this.penm2E = value;
    }

    /**
     * Gets the value of the penm3E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENM3E() {
        return penm3E;
    }

    /**
     * Sets the value of the penm3E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENM3E(String value) {
        this.penm3E = value;
    }

}
