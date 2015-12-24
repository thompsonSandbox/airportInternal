
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateStringType" minOccurs="0"/>
 *         &lt;element name="PublicationEndDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateStringType" minOccurs="0"/>
 *         &lt;element name="CancellationDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalType", propOrder = {
    "publicationDate",
    "publicationEndDate",
    "cancellationDate"
})
public class TemporalType {

    @XmlElement(name = "PublicationDate")
    protected String publicationDate;
    @XmlElement(name = "PublicationEndDate")
    protected String publicationEndDate;
    @XmlElement(name = "CancellationDate")
    protected String cancellationDate;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationEndDate() {
        return publicationEndDate;
    }

    /**
     * Sets the value of the publicationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationEndDate(String value) {
        this.publicationEndDate = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationDate(String value) {
        this.cancellationDate = value;
    }

}
