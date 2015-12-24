
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NavaidComponentUseRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentUseRestrictionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionCancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RestrictionDescText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TacticalAirNavigationRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AixmTacticalAirNavigationRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefTacticalAirNavigationRestriction" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="LocalizerRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsAllComponentsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmeIlsAssociationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencePointCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScallopingAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "NavaidComponentUseRestrictionType", propOrder = {
    "identifier",
    "serviceDate",
    "restrictionDate",
    "restrictionCancelDate",
    "restrictionDescText",
    "tacticalAirNavigationRestrictionCode",
    "aixmTacticalAirNavigationRestrictionCode",
    "refTacticalAirNavigationRestriction",
    "localizerRestrictionCode",
    "mlsAllComponentsIndicator",
    "dmeIlsAssociationId",
    "referencePointCode",
    "scallopingAngle",
    "circleSector"
})
public class NavaidComponentUseRestrictionType
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
    @XmlElementRef(name = "TacticalAirNavigationRestrictionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tacticalAirNavigationRestrictionCode;
    @XmlElementRef(name = "AixmTacticalAirNavigationRestrictionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aixmTacticalAirNavigationRestrictionCode;
    @XmlElementRef(name = "RefTacticalAirNavigationRestriction", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refTacticalAirNavigationRestriction;
    @XmlElementRef(name = "LocalizerRestrictionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localizerRestrictionCode;
    @XmlElementRef(name = "MlsAllComponentsIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsAllComponentsIndicator;
    @XmlElementRef(name = "DmeIlsAssociationId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmeIlsAssociationId;
    @XmlElementRef(name = "ReferencePointCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePointCode;
    @XmlElementRef(name = "ScallopingAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> scallopingAngle;
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
     * Gets the value of the tacticalAirNavigationRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTacticalAirNavigationRestrictionCode() {
        return tacticalAirNavigationRestrictionCode;
    }

    /**
     * Sets the value of the tacticalAirNavigationRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTacticalAirNavigationRestrictionCode(JAXBElement<String> value) {
        this.tacticalAirNavigationRestrictionCode = value;
    }

    /**
     * Gets the value of the aixmTacticalAirNavigationRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAixmTacticalAirNavigationRestrictionCode() {
        return aixmTacticalAirNavigationRestrictionCode;
    }

    /**
     * Sets the value of the aixmTacticalAirNavigationRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAixmTacticalAirNavigationRestrictionCode(JAXBElement<String> value) {
        this.aixmTacticalAirNavigationRestrictionCode = value;
    }

    /**
     * Gets the value of the refTacticalAirNavigationRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefTacticalAirNavigationRestriction() {
        return refTacticalAirNavigationRestriction;
    }

    /**
     * Sets the value of the refTacticalAirNavigationRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefTacticalAirNavigationRestriction(JAXBElement<ReferenceDataType> value) {
        this.refTacticalAirNavigationRestriction = value;
    }

    /**
     * Gets the value of the localizerRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalizerRestrictionCode() {
        return localizerRestrictionCode;
    }

    /**
     * Sets the value of the localizerRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalizerRestrictionCode(JAXBElement<String> value) {
        this.localizerRestrictionCode = value;
    }

    /**
     * Gets the value of the mlsAllComponentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsAllComponentsIndicator() {
        return mlsAllComponentsIndicator;
    }

    /**
     * Sets the value of the mlsAllComponentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsAllComponentsIndicator(JAXBElement<String> value) {
        this.mlsAllComponentsIndicator = value;
    }

    /**
     * Gets the value of the dmeIlsAssociationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmeIlsAssociationId() {
        return dmeIlsAssociationId;
    }

    /**
     * Sets the value of the dmeIlsAssociationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmeIlsAssociationId(JAXBElement<String> value) {
        this.dmeIlsAssociationId = value;
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
     * Gets the value of the scallopingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getScallopingAngle() {
        return scallopingAngle;
    }

    /**
     * Sets the value of the scallopingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setScallopingAngle(JAXBElement<Double> value) {
        this.scallopingAngle = value;
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
