
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NavaidUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidUseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="DrivingComponentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwningSystemIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NavaidUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IlsPositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponent" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentDistanceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentRunwayDistanceListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidUseType", propOrder = {
    "identifier",
    "drivingComponentIndicator",
    "owningSystemIndicator",
    "navaidUseCode",
    "ilsPositionCode",
    "navaidComponent",
    "navaidComponentDistanceListHolder",
    "navaidComponentRunwayDistanceListHolder"
})
@XmlSeeAlso({
    NavaidUseExtendedType.class
})
public class NavaidUseType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "DrivingComponentIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drivingComponentIndicator;
    @XmlElementRef(name = "OwningSystemIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owningSystemIndicator;
    @XmlElementRef(name = "NavaidUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navaidUseCode;
    @XmlElementRef(name = "IlsPositionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ilsPositionCode;
    @XmlElement(name = "NavaidComponent", nillable = true)
    protected NavaidComponentType navaidComponent;
    @XmlElement(name = "NavaidComponentDistanceListHolder", nillable = true)
    protected NavaidComponentDistanceListHolderType navaidComponentDistanceListHolder;
    @XmlElement(name = "NavaidComponentRunwayDistanceListHolder", nillable = true)
    protected NavaidComponentRunwayDistanceListHolderType navaidComponentRunwayDistanceListHolder;
    @XmlAttribute(name = "EffectiveStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlAttribute(name = "EffectiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;

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
     * Gets the value of the drivingComponentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrivingComponentIndicator() {
        return drivingComponentIndicator;
    }

    /**
     * Sets the value of the drivingComponentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrivingComponentIndicator(JAXBElement<String> value) {
        this.drivingComponentIndicator = value;
    }

    /**
     * Gets the value of the owningSystemIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwningSystemIndicator() {
        return owningSystemIndicator;
    }

    /**
     * Sets the value of the owningSystemIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwningSystemIndicator(JAXBElement<String> value) {
        this.owningSystemIndicator = value;
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
     * Gets the value of the ilsPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIlsPositionCode() {
        return ilsPositionCode;
    }

    /**
     * Sets the value of the ilsPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIlsPositionCode(JAXBElement<String> value) {
        this.ilsPositionCode = value;
    }

    /**
     * Gets the value of the navaidComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentType }
     *     
     */
    public NavaidComponentType getNavaidComponent() {
        return navaidComponent;
    }

    /**
     * Sets the value of the navaidComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentType }
     *     
     */
    public void setNavaidComponent(NavaidComponentType value) {
        this.navaidComponent = value;
    }

    /**
     * Gets the value of the navaidComponentDistanceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentDistanceListHolderType }
     *     
     */
    public NavaidComponentDistanceListHolderType getNavaidComponentDistanceListHolder() {
        return navaidComponentDistanceListHolder;
    }

    /**
     * Sets the value of the navaidComponentDistanceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentDistanceListHolderType }
     *     
     */
    public void setNavaidComponentDistanceListHolder(NavaidComponentDistanceListHolderType value) {
        this.navaidComponentDistanceListHolder = value;
    }

    /**
     * Gets the value of the navaidComponentRunwayDistanceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentRunwayDistanceListHolderType }
     *     
     */
    public NavaidComponentRunwayDistanceListHolderType getNavaidComponentRunwayDistanceListHolder() {
        return navaidComponentRunwayDistanceListHolder;
    }

    /**
     * Sets the value of the navaidComponentRunwayDistanceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentRunwayDistanceListHolderType }
     *     
     */
    public void setNavaidComponentRunwayDistanceListHolder(NavaidComponentRunwayDistanceListHolderType value) {
        this.navaidComponentRunwayDistanceListHolder = value;
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

}
