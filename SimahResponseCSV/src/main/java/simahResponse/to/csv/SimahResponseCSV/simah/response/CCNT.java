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
 *         &lt;element ref="{}CCN1"/>
 *         &lt;element ref="{}CCN2"/>
 *         &lt;element ref="{}CCN3"/>
 *         &lt;element ref="{}CCN4"/>
 *         &lt;element ref="{}CCN5"/>
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
    "ccn1",
    "ccn2",
    "ccn3",
    "ccn4",
    "ccn5"
})
@XmlRootElement(name = "CCNT")
public class CCNT {

    @XmlElement(name = "CCN1", required = true)
    protected String ccn1;
    @XmlElement(name = "CCN2", required = true)
    protected String ccn2;
    @XmlElement(name = "CCN3", required = true)
    protected String ccn3;
    @XmlElement(name = "CCN4", required = true)
    protected String ccn4;
    @XmlElement(name = "CCN5", required = true)
    protected String ccn5;

    /**
     * Gets the value of the ccn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN1() {
        return ccn1;
    }

    /**
     * Sets the value of the ccn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN1(String value) {
        this.ccn1 = value;
    }

    /**
     * Gets the value of the ccn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN2() {
        return ccn2;
    }

    /**
     * Sets the value of the ccn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN2(String value) {
        this.ccn2 = value;
    }

    /**
     * Gets the value of the ccn3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN3() {
        return ccn3;
    }

    /**
     * Sets the value of the ccn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN3(String value) {
        this.ccn3 = value;
    }

    /**
     * Gets the value of the ccn4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN4() {
        return ccn4;
    }

    /**
     * Sets the value of the ccn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN4(String value) {
        this.ccn4 = value;
    }

    /**
     * Gets the value of the ccn5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN5() {
        return ccn5;
    }

    /**
     * Sets the value of the ccn5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN5(String value) {
        this.ccn5 = value;
    }

}
