
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NavaidUseReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidUseReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="Item" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidReferenceType" minOccurs="0"/>
 *         &lt;element name="NavaidUseOwningSysInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NavaidUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="DrivingComponentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidUseReferenceType", propOrder = {
    "identifier",
    "item",
    "navaidUseOwningSysInd",
    "navaidUseCode"
})
public class NavaidUseReferenceType {

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "Item", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidReferenceType> item;
    @XmlElementRef(name = "NavaidUseOwningSysInd", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navaidUseOwningSysInd;
    @XmlElementRef(name = "NavaidUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navaidUseCode;
    @XmlAttribute(name = "EffectiveStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlAttribute(name = "EffectiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlAttribute(name = "DrivingComponentIndicator")
    protected String drivingComponentIndicator;

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
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidReferenceType }{@code >}
     *     
     */
    public JAXBElement<NavaidReferenceType> getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidReferenceType }{@code >}
     *     
     */
    public void setItem(JAXBElement<NavaidReferenceType> value) {
        this.item = value;
    }

    /**
     * Gets the value of the navaidUseOwningSysInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavaidUseOwningSysInd() {
        return navaidUseOwningSysInd;
    }

    /**
     * Sets the value of the navaidUseOwningSysInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavaidUseOwningSysInd(JAXBElement<String> value) {
        this.navaidUseOwningSysInd = value;
    }

    /**
     * Gets the value of the navaidUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavaidUseCode() {
        return navaidUseCode;
    }

    /**
     * Sets the value of the navaidUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavaidUseCode(JAXBElement<String> value) {
        this.navaidUseCode = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the drivingComponentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingComponentIndicator() {
        return drivingComponentIndicator;
    }

    /**
     * Sets the value of the drivingComponentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingComponentIndicator(String value) {
        this.drivingComponentIndicator = value;
    }

}
