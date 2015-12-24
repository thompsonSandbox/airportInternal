
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RadarComponentUseRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadarComponentUseRestrictionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionCancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionDescText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencePointCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CircleSector" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarComponentCircleSectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadarComponentUseRestrictionType", propOrder = {
    "identifier",
    "serviceDate",
    "restrictionDate",
    "restrictionCancelDate",
    "restrictionDescText",
    "referencePointCode",
    "circleSector"
})
public class RadarComponentUseRestrictionType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "ServiceDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceDate;
    @XmlElementRef(name = "RestrictionDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> restrictionDate;
    @XmlElementRef(name = "RestrictionCancelDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> restrictionCancelDate;
    @XmlElementRef(name = "RestrictionDescText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictionDescText;
    @XmlElementRef(name = "ReferencePointCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePointCode;
    @XmlElement(name = "CircleSector")
    protected NavaidRadarComponentCircleSectorType circleSector;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierType }
     *     
     */
    public UniqueIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierType }
     *     
     */
    public void setIdentifier(UniqueIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the restrictionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRestrictionDate() {
        return restrictionDate;
    }

    /**
     * Sets the value of the restrictionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRestrictionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.restrictionDate = value;
    }

    /**
     * Gets the value of the restrictionCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRestrictionCancelDate() {
        return restrictionCancelDate;
    }

    /**
     * Sets the value of the restrictionCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRestrictionCancelDate(JAXBElement<XMLGregorianCalendar> value) {
        this.restrictionCancelDate = value;
    }

    /**
     * Gets the value of the restrictionDescText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictionDescText() {
        return restrictionDescText;
    }

    /**
     * Sets the value of the restrictionDescText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictionDescText(JAXBElement<String> value) {
        this.restrictionDescText = value;
    }

    /**
     * Gets the value of the referencePointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencePointCode() {
        return referencePointCode;
    }

    /**
     * Sets the value of the referencePointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencePointCode(JAXBElement<String> value) {
        this.referencePointCode = value;
    }

    /**
     * Gets the value of the circleSector property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidRadarComponentCircleSectorType }
     *     
     */
    public NavaidRadarComponentCircleSectorType getCircleSector() {
        return circleSector;
    }

    /**
     * Sets the value of the circleSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidRadarComponentCircleSectorType }
     *     
     */
    public void setCircleSector(NavaidRadarComponentCircleSectorType value) {
        this.circleSector = value;
    }

}
