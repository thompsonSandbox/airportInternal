
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LightingSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LightingSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="CategoryConfigurationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommisioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CommisioningAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GroundLightSystemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroundLightSystemEmergencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighAngleMeasurement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ApproachLightAlignmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceFlashingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LightColorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LightSystemTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VgsiHghtGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntlInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocation" minOccurs="0"/>
 *         &lt;element name="DownWidthBarMeasurement" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="ThresholdDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="LightingSystemLength" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="DownWidthBarElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="ThresholdCrossingHeight" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="PilotControlFrequency" type="{http://airnav2.faa.gov/aom/beans/vo}FrequencyMeasurementType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ApproachLightingConfiguration" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayLightingSystemConfiguration" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}VgsiConfiguration" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayReferenceAssociationTableListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightingSystemType", propOrder = {
    "categoryConfigurationDescription",
    "commisioningDate",
    "commisioningAngle",
    "groundLightSystemDescription",
    "groundLightSystemEmergencyDescription",
    "highAngleMeasurement",
    "approachLightAlignmentIndicator",
    "portIndicator",
    "sequenceFlashingDescription",
    "lightColorCode",
    "lightSystemTypeCode",
    "operationalStatusCode",
    "ownerCode",
    "vgsiHghtGroupCode",
    "intlInd",
    "milTypeCd",
    "elevatedLocation",
    "downWidthBarMeasurement",
    "thresholdDistance",
    "lightingSystemLength",
    "downWidthBarElevation",
    "thresholdCrossingHeight",
    "pilotControlFrequency",
    "approachLightingConfiguration",
    "runwayLightingSystemConfiguration",
    "vgsiConfiguration",
    "runwayReferenceAssociationTableListHolder"
})
public class LightingSystemType
    extends TemporalModelType
{

    @XmlElementRef(name = "CategoryConfigurationDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryConfigurationDescription;
    @XmlElementRef(name = "CommisioningDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> commisioningDate;
    @XmlElementRef(name = "CommisioningAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> commisioningAngle;
    @XmlElementRef(name = "GroundLightSystemDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groundLightSystemDescription;
    @XmlElementRef(name = "GroundLightSystemEmergencyDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groundLightSystemEmergencyDescription;
    @XmlElementRef(name = "HighAngleMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> highAngleMeasurement;
    @XmlElementRef(name = "ApproachLightAlignmentIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approachLightAlignmentIndicator;
    @XmlElementRef(name = "PortIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portIndicator;
    @XmlElementRef(name = "SequenceFlashingDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequenceFlashingDescription;
    @XmlElementRef(name = "LightColorCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lightColorCode;
    @XmlElementRef(name = "LightSystemTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lightSystemTypeCode;
    @XmlElementRef(name = "OperationalStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationalStatusCode;
    @XmlElementRef(name = "OwnerCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerCode;
    @XmlElementRef(name = "VgsiHghtGroupCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vgsiHghtGroupCode;
    @XmlElementRef(name = "IntlInd", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intlInd;
    @XmlElementRef(name = "MilTypeCd", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> milTypeCd;
    @XmlElement(name = "ElevatedLocation", nillable = true)
    protected ElevatedLocationType elevatedLocation;
    @XmlElementRef(name = "DownWidthBarMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> downWidthBarMeasurement;
    @XmlElementRef(name = "ThresholdDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> thresholdDistance;
    @XmlElementRef(name = "LightingSystemLength", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> lightingSystemLength;
    @XmlElementRef(name = "DownWidthBarElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> downWidthBarElevation;
    @XmlElementRef(name = "ThresholdCrossingHeight", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> thresholdCrossingHeight;
    @XmlElementRef(name = "PilotControlFrequency", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<FrequencyMeasurementType> pilotControlFrequency;
    @XmlElement(name = "ApproachLightingConfiguration", nillable = true)
    protected ApproachLightingConfigurationType approachLightingConfiguration;
    @XmlElement(name = "RunwayLightingSystemConfiguration", nillable = true)
    protected RunwayLightingSystemConfigurationType runwayLightingSystemConfiguration;
    @XmlElement(name = "VgsiConfiguration", nillable = true)
    protected VgsiConfigurationType vgsiConfiguration;
    @XmlElement(name = "RunwayReferenceAssociationTableListHolder", nillable = true)
    protected RunwayReferenceAssociationTableListHolderType runwayReferenceAssociationTableListHolder;

    /**
     * Gets the value of the categoryConfigurationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryConfigurationDescription() {
        return categoryConfigurationDescription;
    }

    /**
     * Sets the value of the categoryConfigurationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryConfigurationDescription(JAXBElement<String> value) {
        this.categoryConfigurationDescription = value;
    }

    /**
     * Gets the value of the commisioningDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCommisioningDate() {
        return commisioningDate;
    }

    /**
     * Sets the value of the commisioningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCommisioningDate(JAXBElement<XMLGregorianCalendar> value) {
        this.commisioningDate = value;
    }

    /**
     * Gets the value of the commisioningAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCommisioningAngle() {
        return commisioningAngle;
    }

    /**
     * Sets the value of the commisioningAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCommisioningAngle(JAXBElement<Double> value) {
        this.commisioningAngle = value;
    }

    /**
     * Gets the value of the groundLightSystemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroundLightSystemDescription() {
        return groundLightSystemDescription;
    }

    /**
     * Sets the value of the groundLightSystemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroundLightSystemDescription(JAXBElement<String> value) {
        this.groundLightSystemDescription = value;
    }

    /**
     * Gets the value of the groundLightSystemEmergencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroundLightSystemEmergencyDescription() {
        return groundLightSystemEmergencyDescription;
    }

    /**
     * Sets the value of the groundLightSystemEmergencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroundLightSystemEmergencyDescription(JAXBElement<String> value) {
        this.groundLightSystemEmergencyDescription = value;
    }

    /**
     * Gets the value of the highAngleMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHighAngleMeasurement() {
        return highAngleMeasurement;
    }

    /**
     * Sets the value of the highAngleMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHighAngleMeasurement(JAXBElement<Double> value) {
        this.highAngleMeasurement = value;
    }

    /**
     * Gets the value of the approachLightAlignmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApproachLightAlignmentIndicator() {
        return approachLightAlignmentIndicator;
    }

    /**
     * Sets the value of the approachLightAlignmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApproachLightAlignmentIndicator(JAXBElement<String> value) {
        this.approachLightAlignmentIndicator = value;
    }

    /**
     * Gets the value of the portIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortIndicator() {
        return portIndicator;
    }

    /**
     * Sets the value of the portIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortIndicator(JAXBElement<String> value) {
        this.portIndicator = value;
    }

    /**
     * Gets the value of the sequenceFlashingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequenceFlashingDescription() {
        return sequenceFlashingDescription;
    }

    /**
     * Sets the value of the sequenceFlashingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequenceFlashingDescription(JAXBElement<String> value) {
        this.sequenceFlashingDescription = value;
    }

    /**
     * Gets the value of the lightColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLightColorCode() {
        return lightColorCode;
    }

    /**
     * Sets the value of the lightColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLightColorCode(JAXBElement<String> value) {
        this.lightColorCode = value;
    }

    /**
     * Gets the value of the lightSystemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLightSystemTypeCode() {
        return lightSystemTypeCode;
    }

    /**
     * Sets the value of the lightSystemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLightSystemTypeCode(JAXBElement<String> value) {
        this.lightSystemTypeCode = value;
    }

    /**
     * Gets the value of the operationalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationalStatusCode() {
        return operationalStatusCode;
    }

    /**
     * Sets the value of the operationalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationalStatusCode(JAXBElement<String> value) {
        this.operationalStatusCode = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerCode(JAXBElement<String> value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the vgsiHghtGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVgsiHghtGroupCode() {
        return vgsiHghtGroupCode;
    }

    /**
     * Sets the value of the vgsiHghtGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVgsiHghtGroupCode(JAXBElement<String> value) {
        this.vgsiHghtGroupCode = value;
    }

    /**
     * Gets the value of the intlInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntlInd() {
        return intlInd;
    }

    /**
     * Sets the value of the intlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntlInd(JAXBElement<String> value) {
        this.intlInd = value;
    }

    /**
     * Gets the value of the milTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMilTypeCd() {
        return milTypeCd;
    }

    /**
     * Sets the value of the milTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMilTypeCd(JAXBElement<String> value) {
        this.milTypeCd = value;
    }

    /**
     * Gets the value of the elevatedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedLocationType }
     *     
     */
    public ElevatedLocationType getElevatedLocation() {
        return elevatedLocation;
    }

    /**
     * Sets the value of the elevatedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedLocationType }
     *     
     */
    public void setElevatedLocation(ElevatedLocationType value) {
        this.elevatedLocation = value;
    }

    /**
     * Gets the value of the downWidthBarMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getDownWidthBarMeasurement() {
        return downWidthBarMeasurement;
    }

    /**
     * Sets the value of the downWidthBarMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setDownWidthBarMeasurement(JAXBElement<DistanceMeasurementType> value) {
        this.downWidthBarMeasurement = value;
    }

    /**
     * Gets the value of the thresholdDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getThresholdDistance() {
        return thresholdDistance;
    }

    /**
     * Sets the value of the thresholdDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setThresholdDistance(JAXBElement<DistanceMeasurementType> value) {
        this.thresholdDistance = value;
    }

    /**
     * Gets the value of the lightingSystemLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getLightingSystemLength() {
        return lightingSystemLength;
    }

    /**
     * Sets the value of the lightingSystemLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setLightingSystemLength(JAXBElement<DistanceMeasurementType> value) {
        this.lightingSystemLength = value;
    }

    /**
     * Gets the value of the downWidthBarElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getDownWidthBarElevation() {
        return downWidthBarElevation;
    }

    /**
     * Sets the value of the downWidthBarElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setDownWidthBarElevation(JAXBElement<ElevationMeasurementType> value) {
        this.downWidthBarElevation = value;
    }

    /**
     * Gets the value of the thresholdCrossingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getThresholdCrossingHeight() {
        return thresholdCrossingHeight;
    }

    /**
     * Sets the value of the thresholdCrossingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setThresholdCrossingHeight(JAXBElement<ElevationMeasurementType> value) {
        this.thresholdCrossingHeight = value;
    }

    /**
     * Gets the value of the pilotControlFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public JAXBElement<FrequencyMeasurementType> getPilotControlFrequency() {
        return pilotControlFrequency;
    }

    /**
     * Sets the value of the pilotControlFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public void setPilotControlFrequency(JAXBElement<FrequencyMeasurementType> value) {
        this.pilotControlFrequency = value;
    }

    /**
     * Gets the value of the approachLightingConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ApproachLightingConfigurationType }
     *     
     */
    public ApproachLightingConfigurationType getApproachLightingConfiguration() {
        return approachLightingConfiguration;
    }

    /**
     * Sets the value of the approachLightingConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachLightingConfigurationType }
     *     
     */
    public void setApproachLightingConfiguration(ApproachLightingConfigurationType value) {
        this.approachLightingConfiguration = value;
    }

    /**
     * Gets the value of the runwayLightingSystemConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayLightingSystemConfigurationType }
     *     
     */
    public RunwayLightingSystemConfigurationType getRunwayLightingSystemConfiguration() {
        return runwayLightingSystemConfiguration;
    }

    /**
     * Sets the value of the runwayLightingSystemConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayLightingSystemConfigurationType }
     *     
     */
    public void setRunwayLightingSystemConfiguration(RunwayLightingSystemConfigurationType value) {
        this.runwayLightingSystemConfiguration = value;
    }

    /**
     * Gets the value of the vgsiConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link VgsiConfigurationType }
     *     
     */
    public VgsiConfigurationType getVgsiConfiguration() {
        return vgsiConfiguration;
    }

    /**
     * Sets the value of the vgsiConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VgsiConfigurationType }
     *     
     */
    public void setVgsiConfiguration(VgsiConfigurationType value) {
        this.vgsiConfiguration = value;
    }

    /**
     * Gets the value of the runwayReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayReferenceAssociationTableListHolderType }
     *     
     */
    public RunwayReferenceAssociationTableListHolderType getRunwayReferenceAssociationTableListHolder() {
        return runwayReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the runwayReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayReferenceAssociationTableListHolderType }
     *     
     */
    public void setRunwayReferenceAssociationTableListHolder(RunwayReferenceAssociationTableListHolderType value) {
        this.runwayReferenceAssociationTableListHolder = value;
    }

}
