
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RadarComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadarComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MovingTargetIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VmdIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyControlNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DecommissionedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CommissionedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReconfigurationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CoverageDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="CoverageAltitude" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="CoverageAzimuth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AntennaTiltAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ComponentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComponentEquipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandbyPowerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefStandbyPowerTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="AntennaTiltTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DualChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AssociatedPositionListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MagneticVariation" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RadarscopeLocationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ParReflectorListHolder" minOccurs="0"/>
 *         &lt;element name="ParentReferenceListHolder" type="{http://airnav2.faa.gov/aom/beans/vo}RadarSystemComponentReferenceListHolderType"/>
 *         &lt;element name="ComponentUseRestrictionAssociationListHolder" type="{http://airnav2.faa.gov/aom/beans/vo}RadarComponentUseRestrictionAssociationListHolderType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadarComponentType", propOrder = {
    "serialNumber",
    "name",
    "movingTargetIndicator",
    "vmdIndicator",
    "legacyControlNumber",
    "isDeleted",
    "decommissionedDate",
    "commissionedDate",
    "reconfigurationDate",
    "coverageDistance",
    "coverageAltitude",
    "coverageAzimuth",
    "antennaTiltAngle",
    "componentTypeCode",
    "componentEquipmentCode",
    "standbyPowerTypeCode",
    "refStandbyPowerTypeCode",
    "antennaTiltTypeCode",
    "dualChannelCode",
    "stateCode",
    "countryCode",
    "position",
    "associatedPositionListHolder",
    "magneticVariation",
    "surveySource",
    "radarscopeLocationListHolder",
    "parReflectorListHolder",
    "parentReferenceListHolder",
    "componentUseRestrictionAssociationListHolder"
})
public class RadarComponentType
    extends TemporalModelType
{

    @XmlElementRef(name = "SerialNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "Name", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "MovingTargetIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movingTargetIndicator;
    @XmlElementRef(name = "VmdIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vmdIndicator;
    @XmlElementRef(name = "LegacyControlNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> legacyControlNumber;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "DecommissionedDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> decommissionedDate;
    @XmlElementRef(name = "CommissionedDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> commissionedDate;
    @XmlElementRef(name = "ReconfigurationDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reconfigurationDate;
    @XmlElementRef(name = "CoverageDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> coverageDistance;
    @XmlElementRef(name = "CoverageAltitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> coverageAltitude;
    @XmlElementRef(name = "CoverageAzimuth", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> coverageAzimuth;
    @XmlElementRef(name = "AntennaTiltAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> antennaTiltAngle;
    @XmlElementRef(name = "ComponentTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentTypeCode;
    @XmlElementRef(name = "ComponentEquipmentCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentEquipmentCode;
    @XmlElementRef(name = "StandbyPowerTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standbyPowerTypeCode;
    @XmlElementRef(name = "RefStandbyPowerTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refStandbyPowerTypeCode;
    @XmlElementRef(name = "AntennaTiltTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antennaTiltTypeCode;
    @XmlElementRef(name = "DualChannelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dualChannelCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "Position", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> position;
    @XmlElement(name = "AssociatedPositionListHolder", nillable = true)
    protected AssociatedPositionListHolderType associatedPositionListHolder;
    @XmlElement(name = "MagneticVariation", nillable = true)
    protected MagneticVariationType magneticVariation;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "RadarscopeLocationListHolder", nillable = true)
    protected RadarscopeLocationListHolderType radarscopeLocationListHolder;
    @XmlElement(name = "ParReflectorListHolder", nillable = true)
    protected ParReflectorListHolderType parReflectorListHolder;
    @XmlElement(name = "ParentReferenceListHolder", required = true, nillable = true)
    protected RadarSystemComponentReferenceListHolderType parentReferenceListHolder;
    @XmlElement(name = "ComponentUseRestrictionAssociationListHolder", required = true, nillable = true)
    protected RadarComponentUseRestrictionAssociationListHolderType componentUseRestrictionAssociationListHolder;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the movingTargetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovingTargetIndicator() {
        return movingTargetIndicator;
    }

    /**
     * Sets the value of the movingTargetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovingTargetIndicator(JAXBElement<String> value) {
        this.movingTargetIndicator = value;
    }

    /**
     * Gets the value of the vmdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVmdIndicator() {
        return vmdIndicator;
    }

    /**
     * Sets the value of the vmdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVmdIndicator(JAXBElement<String> value) {
        this.vmdIndicator = value;
    }

    /**
     * Gets the value of the legacyControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLegacyControlNumber() {
        return legacyControlNumber;
    }

    /**
     * Sets the value of the legacyControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLegacyControlNumber(JAXBElement<Integer> value) {
        this.legacyControlNumber = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the decommissionedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDecommissionedDate() {
        return decommissionedDate;
    }

    /**
     * Sets the value of the decommissionedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDecommissionedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.decommissionedDate = value;
    }

    /**
     * Gets the value of the commissionedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCommissionedDate() {
        return commissionedDate;
    }

    /**
     * Sets the value of the commissionedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCommissionedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.commissionedDate = value;
    }

    /**
     * Gets the value of the reconfigurationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReconfigurationDate() {
        return reconfigurationDate;
    }

    /**
     * Sets the value of the reconfigurationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReconfigurationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reconfigurationDate = value;
    }

    /**
     * Gets the value of the coverageDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getCoverageDistance() {
        return coverageDistance;
    }

    /**
     * Sets the value of the coverageDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setCoverageDistance(JAXBElement<DistanceMeasurementType> value) {
        this.coverageDistance = value;
    }

    /**
     * Gets the value of the coverageAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getCoverageAltitude() {
        return coverageAltitude;
    }

    /**
     * Sets the value of the coverageAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setCoverageAltitude(JAXBElement<ElevationMeasurementType> value) {
        this.coverageAltitude = value;
    }

    /**
     * Gets the value of the coverageAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCoverageAzimuth() {
        return coverageAzimuth;
    }

    /**
     * Sets the value of the coverageAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCoverageAzimuth(JAXBElement<Double> value) {
        this.coverageAzimuth = value;
    }

    /**
     * Gets the value of the antennaTiltAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAntennaTiltAngle() {
        return antennaTiltAngle;
    }

    /**
     * Sets the value of the antennaTiltAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAntennaTiltAngle(JAXBElement<Double> value) {
        this.antennaTiltAngle = value;
    }

    /**
     * Gets the value of the componentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentTypeCode() {
        return componentTypeCode;
    }

    /**
     * Sets the value of the componentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentTypeCode(JAXBElement<String> value) {
        this.componentTypeCode = value;
    }

    /**
     * Gets the value of the componentEquipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentEquipmentCode() {
        return componentEquipmentCode;
    }

    /**
     * Sets the value of the componentEquipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentEquipmentCode(JAXBElement<String> value) {
        this.componentEquipmentCode = value;
    }

    /**
     * Gets the value of the standbyPowerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStandbyPowerTypeCode() {
        return standbyPowerTypeCode;
    }

    /**
     * Sets the value of the standbyPowerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStandbyPowerTypeCode(JAXBElement<String> value) {
        this.standbyPowerTypeCode = value;
    }

    /**
     * Gets the value of the refStandbyPowerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefStandbyPowerTypeCode() {
        return refStandbyPowerTypeCode;
    }

    /**
     * Sets the value of the refStandbyPowerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefStandbyPowerTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refStandbyPowerTypeCode = value;
    }

    /**
     * Gets the value of the antennaTiltTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntennaTiltTypeCode() {
        return antennaTiltTypeCode;
    }

    /**
     * Sets the value of the antennaTiltTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntennaTiltTypeCode(JAXBElement<String> value) {
        this.antennaTiltTypeCode = value;
    }

    /**
     * Gets the value of the dualChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDualChannelCode() {
        return dualChannelCode;
    }

    /**
     * Sets the value of the dualChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDualChannelCode(JAXBElement<String> value) {
        this.dualChannelCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.position = value;
    }

    /**
     * Gets the value of the associatedPositionListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedPositionListHolderType }
     *     
     */
    public AssociatedPositionListHolderType getAssociatedPositionListHolder() {
        return associatedPositionListHolder;
    }

    /**
     * Sets the value of the associatedPositionListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedPositionListHolderType }
     *     
     */
    public void setAssociatedPositionListHolder(AssociatedPositionListHolderType value) {
        this.associatedPositionListHolder = value;
    }

    /**
     * Gets the value of the magneticVariation property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticVariationType }
     *     
     */
    public MagneticVariationType getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Sets the value of the magneticVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticVariationType }
     *     
     */
    public void setMagneticVariation(MagneticVariationType value) {
        this.magneticVariation = value;
    }

    /**
     * Gets the value of the surveySource property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySourceType }
     *     
     */
    public SurveySourceType getSurveySource() {
        return surveySource;
    }

    /**
     * Sets the value of the surveySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySourceType }
     *     
     */
    public void setSurveySource(SurveySourceType value) {
        this.surveySource = value;
    }

    /**
     * Gets the value of the radarscopeLocationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RadarscopeLocationListHolderType }
     *     
     */
    public RadarscopeLocationListHolderType getRadarscopeLocationListHolder() {
        return radarscopeLocationListHolder;
    }

    /**
     * Sets the value of the radarscopeLocationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadarscopeLocationListHolderType }
     *     
     */
    public void setRadarscopeLocationListHolder(RadarscopeLocationListHolderType value) {
        this.radarscopeLocationListHolder = value;
    }

    /**
     * Gets the value of the parReflectorListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ParReflectorListHolderType }
     *     
     */
    public ParReflectorListHolderType getParReflectorListHolder() {
        return parReflectorListHolder;
    }

    /**
     * Sets the value of the parReflectorListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParReflectorListHolderType }
     *     
     */
    public void setParReflectorListHolder(ParReflectorListHolderType value) {
        this.parReflectorListHolder = value;
    }

    /**
     * Gets the value of the parentReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RadarSystemComponentReferenceListHolderType }
     *     
     */
    public RadarSystemComponentReferenceListHolderType getParentReferenceListHolder() {
        return parentReferenceListHolder;
    }

    /**
     * Sets the value of the parentReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadarSystemComponentReferenceListHolderType }
     *     
     */
    public void setParentReferenceListHolder(RadarSystemComponentReferenceListHolderType value) {
        this.parentReferenceListHolder = value;
    }

    /**
     * Gets the value of the componentUseRestrictionAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RadarComponentUseRestrictionAssociationListHolderType }
     *     
     */
    public RadarComponentUseRestrictionAssociationListHolderType getComponentUseRestrictionAssociationListHolder() {
        return componentUseRestrictionAssociationListHolder;
    }

    /**
     * Sets the value of the componentUseRestrictionAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadarComponentUseRestrictionAssociationListHolderType }
     *     
     */
    public void setComponentUseRestrictionAssociationListHolder(RadarComponentUseRestrictionAssociationListHolderType value) {
        this.componentUseRestrictionAssociationListHolder = value;
    }

}
