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
 *         &lt;element ref="{}ADVISORY_TEXT"/>
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
    "advisorytext"
})
@XmlRootElement(name = "ADVISORY_SUMMARY_TEXT")
public class ADVISORYSUMMARYTEXT {

    @XmlElement(name = "ADVISORY_TEXT", required = true)
    protected Object advisorytext;

    /**
     * Gets the value of the advisorytext property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getADVISORYTEXT() {
        return advisorytext;
    }

    /**
     * Sets the value of the advisorytext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setADVISORYTEXT(Object value) {
        this.advisorytext = value;
    }

}