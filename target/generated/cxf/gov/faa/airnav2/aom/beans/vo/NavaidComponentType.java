
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NavaidComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InspectionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LegacyControlNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DecommissionedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CommissionedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReconfigurationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TemporaryMobileIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DopplerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlidePath3FtRuleExceptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LdaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApparentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DualFrequencyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentTypeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RdhUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchiveRdhUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorLimitQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NominalAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ElevationAngleAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GlidePathSlopeAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GlidePathSlopeAngleAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MarkerBeaconWidth" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="InspectionRdhHeight" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="InspectionRdhHeightAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="InspectionReferenceElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="InspectionGpiDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="ArchiveRdhHeight" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="ArchiveRdhHeightAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="GpAfisReferenceElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="DmeBias" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="GpMonitorLowerAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GpMonitorHighAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AzmRunwayAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GpElevationTch" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="ComponentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RolloutCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefAntennaTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="VoiceRecodingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsAzimuthTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MbTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandbyPowerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefStandbyPowerTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="CpbStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TchCalculationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsDmeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsBackAzimuthStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsApproachAzimuthStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MlsApproachElevationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GpAfisCoordinatesTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefGpAfisCoordinatesTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="Gp8240Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AzmCoordinateSystemTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefAzmCoordinateSystemTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="AzmClearSignalTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DualChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="AdptPosition" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="EdptPosition" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="PhaseCenterPosition" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="NavaidChannel" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidChannelType" minOccurs="0"/>
 *         &lt;element name="NavaidComponentFrequency" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentFrequencyType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AssociatedPositionListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MagneticVariation" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CheckpointListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidAlignment" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidCourseListHolder" minOccurs="0"/>
 *         &lt;element name="ParentReferenceListHolder" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseReferenceListHolderType"/>
 *         &lt;element name="ComponentUseRestrictionAssociationListHolder" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentUseRestrictionAssociationListHolderType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentType", propOrder = {
    "serialNumber",
    "name",
    "inspectionDate",
    "legacyControlNumber",
    "isDeleted",
    "decommissionedDate",
    "commissionedDate",
    "reconfigurationDate",
    "temporaryMobileIndicator",
    "dopplerIndicator",
    "glidePath3FtRuleExceptionIndicator",
    "ldaIndicator",
    "apparentIndicator",
    "dualFrequencyIndicator",
    "equipmentTypeText",
    "equipmentTypeCode",
    "rdhUsedIndicator",
    "archiveRdhUsedIndicator",
    "monitorLimitQuantity",
    "nominalAngle",
    "elevationAngleAccuracy",
    "glidePathSlopeAngle",
    "glidePathSlopeAngleAccuracy",
    "markerBeaconWidth",
    "inspectionRdhHeight",
    "inspectionRdhHeightAccuracy",
    "inspectionReferenceElevation",
    "inspectionGpiDistance",
    "archiveRdhHeight",
    "archiveRdhHeightAccuracy",
    "gpAfisReferenceElevation",
    "dmeBias",
    "gpMonitorLowerAngle",
    "gpMonitorHighAngle",
    "azmRunwayAngle",
    "gpElevationTch",
    "componentTypeCode",
    "rolloutCode",
    "antennaTypeCode",
    "refAntennaTypeCode",
    "voiceRecodingTypeCode",
    "voiceTypeCode",
    "mlsAzimuthTypeCode",
    "antennaClassificationCode",
    "dmeTypeCode",
    "mbTypeCode",
    "monitorCategoryCode",
    "standbyPowerTypeCode",
    "refStandbyPowerTypeCode",
    "cpbStatusCode",
    "stateCode",
    "countryCode",
    "tchCalculationTypeCode",
    "mlsDmeStatusCode",
    "mlsBackAzimuthStatusCode",
    "mlsApproachAzimuthStatusCode",
    "mlsApproachElevationStatusCode",
    "gpAfisCoordinatesTypeCode",
    "refGpAfisCoordinatesTypeCode",
    "gp8240Code",
    "azmCoordinateSystemTypeCode",
    "refAzmCoordinateSystemTypeCode",
    "azmClearSignalTypeCode",
    "dualChannelCode",
    "position",
    "adptPosition",
    "edptPosition",
    "phaseCenterPosition",
    "navaidChannel",
    "navaidComponentFrequency",
    "associatedPositionListHolder",
    "magneticVariation",
    "surveySource",
    "checkpointListHolder",
    "navaidAlignment",
    "navaidCourseListHolder",
    "parentReferenceListHolder",
    "componentUseRestrictionAssociationListHolder"
})
@XmlSeeAlso({
    NavaidNavaidComponentType.class
})
public class NavaidComponentType
    extends TemporalModelType
{

    @XmlElementRef(name = "SerialNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "Name", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "InspectionDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> inspectionDate;
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
    @XmlElementRef(name = "TemporaryMobileIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryMobileIndicator;
    @XmlElementRef(name = "DopplerIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dopplerIndicator;
    @XmlElementRef(name = "GlidePath3FtRuleExceptionIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> glidePath3FtRuleExceptionIndicator;
    @XmlElementRef(name = "LdaIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ldaIndicator;
    @XmlElementRef(name = "ApparentIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apparentIndicator;
    @XmlElementRef(name = "DualFrequencyIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dualFrequencyIndicator;
    @XmlElementRef(name = "EquipmentTypeText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeText;
    @XmlElementRef(name = "EquipmentTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeCode;
    @XmlElementRef(name = "RdhUsedIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rdhUsedIndicator;
    @XmlElementRef(name = "ArchiveRdhUsedIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> archiveRdhUsedIndicator;
    @XmlElementRef(name = "MonitorLimitQuantity", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> monitorLimitQuantity;
    @XmlElementRef(name = "NominalAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nominalAngle;
    @XmlElementRef(name = "ElevationAngleAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> elevationAngleAccuracy;
    @XmlElementRef(name = "GlidePathSlopeAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> glidePathSlopeAngle;
    @XmlElementRef(name = "GlidePathSlopeAngleAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> glidePathSlopeAngleAccuracy;
    @XmlElementRef(name = "MarkerBeaconWidth", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> markerBeaconWidth;
    @XmlElementRef(name = "InspectionRdhHeight", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> inspectionRdhHeight;
    @XmlElementRef(name = "InspectionRdhHeightAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> inspectionRdhHeightAccuracy;
    @XmlElementRef(name = "InspectionReferenceElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> inspectionReferenceElevation;
    @XmlElementRef(name = "InspectionGpiDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> inspectionGpiDistance;
    @XmlElementRef(name = "ArchiveRdhHeight", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> archiveRdhHeight;
    @XmlElementRef(name = "ArchiveRdhHeightAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> archiveRdhHeightAccuracy;
    @XmlElementRef(name = "GpAfisReferenceElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> gpAfisReferenceElevation;
    @XmlElementRef(name = "DmeBias", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> dmeBias;
    @XmlElementRef(name = "GpMonitorLowerAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> gpMonitorLowerAngle;
    @XmlElementRef(name = "GpMonitorHighAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> gpMonitorHighAngle;
    @XmlElementRef(name = "AzmRunwayAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> azmRunwayAngle;
    @XmlElementRef(name = "GpElevationTch", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> gpElevationTch;
    @XmlElementRef(name = "ComponentTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentTypeCode;
    @XmlElementRef(name = "RolloutCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rolloutCode;
    @XmlElementRef(name = "AntennaTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antennaTypeCode;
    @XmlElementRef(name = "RefAntennaTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refAntennaTypeCode;
    @XmlElementRef(name = "VoiceRecodingTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceRecodingTypeCode;
    @XmlElementRef(name = "VoiceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceTypeCode;
    @XmlElementRef(name = "MlsAzimuthTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsAzimuthTypeCode;
    @XmlElementRef(name = "AntennaClassificationCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antennaClassificationCode;
    @XmlElementRef(name = "DmeTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmeTypeCode;
    @XmlElementRef(name = "MbTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbTypeCode;
    @XmlElementRef(name = "MonitorCategoryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorCategoryCode;
    @XmlElementRef(name = "StandbyPowerTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standbyPowerTypeCode;
    @XmlElementRef(name = "RefStandbyPowerTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refStandbyPowerTypeCode;
    @XmlElementRef(name = "CpbStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpbStatusCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "TchCalculationTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tchCalculationTypeCode;
    @XmlElementRef(name = "MlsDmeStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsDmeStatusCode;
    @XmlElementRef(name = "MlsBackAzimuthStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsBackAzimuthStatusCode;
    @XmlElementRef(name = "MlsApproachAzimuthStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsApproachAzimuthStatusCode;
    @XmlElementRef(name = "MlsApproachElevationStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlsApproachElevationStatusCode;
    @XmlElementRef(name = "GpAfisCoordinatesTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gpAfisCoordinatesTypeCode;
    @XmlElementRef(name = "RefGpAfisCoordinatesTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refGpAfisCoordinatesTypeCode;
    @XmlElementRef(name = "Gp8240Code", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gp8240Code;
    @XmlElementRef(name = "AzmCoordinateSystemTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> azmCoordinateSystemTypeCode;
    @XmlElementRef(name = "RefAzmCoordinateSystemTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refAzmCoordinateSystemTypeCode;
    @XmlElementRef(name = "AzmClearSignalTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> azmClearSignalTypeCode;
    @XmlElementRef(name = "DualChannelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dualChannelCode;
    @XmlElementRef(name = "Position", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> position;
    @XmlElementRef(name = "AdptPosition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> adptPosition;
    @XmlElementRef(name = "EdptPosition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> edptPosition;
    @XmlElementRef(name = "PhaseCenterPosition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> phaseCenterPosition;
    @XmlElementRef(name = "NavaidChannel", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidChannelType> navaidChannel;
    @XmlElementRef(name = "NavaidComponentFrequency", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidComponentFrequencyType> navaidComponentFrequency;
    @XmlElement(name = "AssociatedPositionListHolder", nillable = true)
    protected AssociatedPositionListHolderType associatedPositionListHolder;
    @XmlElement(name = "MagneticVariation", nillable = true)
    protected MagneticVariationType magneticVariation;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "CheckpointListHolder", nillable = true)
    protected CheckpointListHolderType checkpointListHolder;
    @XmlElement(name = "NavaidAlignment", nillable = true)
    protected NavaidAlignmentType navaidAlignment;
    @XmlElement(name = "NavaidCourseListHolder", nillable = true)
    protected NavaidCourseListHolderType navaidCourseListHolder;
    @XmlElement(name = "ParentReferenceListHolder", required = true, nillable = true)
    protected NavaidUseReferenceListHolderType parentReferenceListHolder;
    @XmlElement(name = "ComponentUseRestrictionAssociationListHolder", required = true, nillable = true)
    protected NavaidComponentUseRestrictionAssociationListHolderType componentUseRestrictionAssociationListHolder;

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
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInspectionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.inspectionDate = value;
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
     * Gets the value of the temporaryMobileIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemporaryMobileIndicator() {
        return temporaryMobileIndicator;
    }

    /**
     * Sets the value of the temporaryMobileIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemporaryMobileIndicator(JAXBElement<String> value) {
        this.temporaryMobileIndicator = value;
    }

    /**
     * Gets the value of the dopplerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDopplerIndicator() {
        return dopplerIndicator;
    }

    /**
     * Sets the value of the dopplerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDopplerIndicator(JAXBElement<String> value) {
        this.dopplerIndicator = value;
    }

    /**
     * Gets the value of the glidePath3FtRuleExceptionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlidePath3FtRuleExceptionIndicator() {
        return glidePath3FtRuleExceptionIndicator;
    }

    /**
     * Sets the value of the glidePath3FtRuleExceptionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlidePath3FtRuleExceptionIndicator(JAXBElement<String> value) {
        this.glidePath3FtRuleExceptionIndicator = value;
    }

    /**
     * Gets the value of the ldaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLdaIndicator() {
        return ldaIndicator;
    }

    /**
     * Sets the value of the ldaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLdaIndicator(JAXBElement<String> value) {
        this.ldaIndicator = value;
    }

    /**
     * Gets the value of the apparentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApparentIndicator() {
        return apparentIndicator;
    }

    /**
     * Sets the value of the apparentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApparentIndicator(JAXBElement<String> value) {
        this.apparentIndicator = value;
    }

    /**
     * Gets the value of the dualFrequencyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDualFrequencyIndicator() {
        return dualFrequencyIndicator;
    }

    /**
     * Sets the value of the dualFrequencyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDualFrequencyIndicator(JAXBElement<String> value) {
        this.dualFrequencyIndicator = value;
    }

    /**
     * Gets the value of the equipmentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeText() {
        return equipmentTypeText;
    }

    /**
     * Sets the value of the equipmentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeText(JAXBElement<String> value) {
        this.equipmentTypeText = value;
    }

    /**
     * Gets the value of the equipmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeCode() {
        return equipmentTypeCode;
    }

    /**
     * Sets the value of the equipmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeCode(JAXBElement<String> value) {
        this.equipmentTypeCode = value;
    }

    /**
     * Gets the value of the rdhUsedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRdhUsedIndicator() {
        return rdhUsedIndicator;
    }

    /**
     * Sets the value of the rdhUsedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRdhUsedIndicator(JAXBElement<String> value) {
        this.rdhUsedIndicator = value;
    }

    /**
     * Gets the value of the archiveRdhUsedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArchiveRdhUsedIndicator() {
        return archiveRdhUsedIndicator;
    }

    /**
     * Sets the value of the archiveRdhUsedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArchiveRdhUsedIndicator(JAXBElement<String> value) {
        this.archiveRdhUsedIndicator = value;
    }

    /**
     * Gets the value of the monitorLimitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMonitorLimitQuantity() {
        return monitorLimitQuantity;
    }

    /**
     * Sets the value of the monitorLimitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMonitorLimitQuantity(JAXBElement<Double> value) {
        this.monitorLimitQuantity = value;
    }

    /**
     * Gets the value of the nominalAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNominalAngle() {
        return nominalAngle;
    }

    /**
     * Sets the value of the nominalAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNominalAngle(JAXBElement<Double> value) {
        this.nominalAngle = value;
    }

    /**
     * Gets the value of the elevationAngleAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getElevationAngleAccuracy() {
        return elevationAngleAccuracy;
    }

    /**
     * Sets the value of the elevationAngleAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setElevationAngleAccuracy(JAXBElement<Double> value) {
        this.elevationAngleAccuracy = value;
    }

    /**
     * Gets the value of the glidePathSlopeAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGlidePathSlopeAngle() {
        return glidePathSlopeAngle;
    }

    /**
     * Sets the value of the glidePathSlopeAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGlidePathSlopeAngle(JAXBElement<Double> value) {
        this.glidePathSlopeAngle = value;
    }

    /**
     * Gets the value of the glidePathSlopeAngleAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGlidePathSlopeAngleAccuracy() {
        return glidePathSlopeAngleAccuracy;
    }

    /**
     * Sets the value of the glidePathSlopeAngleAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGlidePathSlopeAngleAccuracy(JAXBElement<Double> value) {
        this.glidePathSlopeAngleAccuracy = value;
    }

    /**
     * Gets the value of the markerBeaconWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getMarkerBeaconWidth() {
        return markerBeaconWidth;
    }

    /**
     * Sets the value of the markerBeaconWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setMarkerBeaconWidth(JAXBElement<DistanceMeasurementType> value) {
        this.markerBeaconWidth = value;
    }

    /**
     * Gets the value of the inspectionRdhHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getInspectionRdhHeight() {
        return inspectionRdhHeight;
    }

    /**
     * Sets the value of the inspectionRdhHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setInspectionRdhHeight(JAXBElement<ElevationMeasurementType> value) {
        this.inspectionRdhHeight = value;
    }

    /**
     * Gets the value of the inspectionRdhHeightAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getInspectionRdhHeightAccuracy() {
        return inspectionRdhHeightAccuracy;
    }

    /**
     * Sets the value of the inspectionRdhHeightAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setInspectionRdhHeightAccuracy(JAXBElement<ElevationMeasurementType> value) {
        this.inspectionRdhHeightAccuracy = value;
    }

    /**
     * Gets the value of the inspectionReferenceElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getInspectionReferenceElevation() {
        return inspectionReferenceElevation;
    }

    /**
     * Sets the value of the inspectionReferenceElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setInspectionReferenceElevation(JAXBElement<ElevationMeasurementType> value) {
        this.inspectionReferenceElevation = value;
    }

    /**
     * Gets the value of the inspectionGpiDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getInspectionGpiDistance() {
        return inspectionGpiDistance;
    }

    /**
     * Sets the value of the inspectionGpiDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setInspectionGpiDistance(JAXBElement<DistanceMeasurementType> value) {
        this.inspectionGpiDistance = value;
    }

    /**
     * Gets the value of the archiveRdhHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getArchiveRdhHeight() {
        return archiveRdhHeight;
    }

    /**
     * Sets the value of the archiveRdhHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setArchiveRdhHeight(JAXBElement<ElevationMeasurementType> value) {
        this.archiveRdhHeight = value;
    }

    /**
     * Gets the value of the archiveRdhHeightAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getArchiveRdhHeightAccuracy() {
        return archiveRdhHeightAccuracy;
    }

    /**
     * Sets the value of the archiveRdhHeightAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setArchiveRdhHeightAccuracy(JAXBElement<ElevationMeasurementType> value) {
        this.archiveRdhHeightAccuracy = value;
    }

    /**
     * Gets the value of the gpAfisReferenceElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getGpAfisReferenceElevation() {
        return gpAfisReferenceElevation;
    }

    /**
     * Sets the value of the gpAfisReferenceElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setGpAfisReferenceElevation(JAXBElement<ElevationMeasurementType> value) {
        this.gpAfisReferenceElevation = value;
    }

    /**
     * Gets the value of the dmeBias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getDmeBias() {
        return dmeBias;
    }

    /**
     * Sets the value of the dmeBias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setDmeBias(JAXBElement<DistanceMeasurementType> value) {
        this.dmeBias = value;
    }

    /**
     * Gets the value of the gpMonitorLowerAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGpMonitorLowerAngle() {
        return gpMonitorLowerAngle;
    }

    /**
     * Sets the value of the gpMonitorLowerAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGpMonitorLowerAngle(JAXBElement<Double> value) {
        this.gpMonitorLowerAngle = value;
    }

    /**
     * Gets the value of the gpMonitorHighAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGpMonitorHighAngle() {
        return gpMonitorHighAngle;
    }

    /**
     * Sets the value of the gpMonitorHighAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGpMonitorHighAngle(JAXBElement<Double> value) {
        this.gpMonitorHighAngle = value;
    }

    /**
     * Gets the value of the azmRunwayAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAzmRunwayAngle() {
        return azmRunwayAngle;
    }

    /**
     * Sets the value of the azmRunwayAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAzmRunwayAngle(JAXBElement<Double> value) {
        this.azmRunwayAngle = value;
    }

    /**
     * Gets the value of the gpElevationTch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getGpElevationTch() {
        return gpElevationTch;
    }

    /**
     * Sets the value of the gpElevationTch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setGpElevationTch(JAXBElement<ElevationMeasurementType> value) {
        this.gpElevationTch = value;
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
     * Gets the value of the rolloutCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRolloutCode() {
        return rolloutCode;
    }

    /**
     * Sets the value of the rolloutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRolloutCode(JAXBElement<String> value) {
        this.rolloutCode = value;
    }

    /**
     * Gets the value of the antennaTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntennaTypeCode() {
        return antennaTypeCode;
    }

    /**
     * Sets the value of the antennaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntennaTypeCode(JAXBElement<String> value) {
        this.antennaTypeCode = value;
    }

    /**
     * Gets the value of the refAntennaTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefAntennaTypeCode() {
        return refAntennaTypeCode;
    }

    /**
     * Sets the value of the refAntennaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefAntennaTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refAntennaTypeCode = value;
    }

    /**
     * Gets the value of the voiceRecodingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceRecodingTypeCode() {
        return voiceRecodingTypeCode;
    }

    /**
     * Sets the value of the voiceRecodingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceRecodingTypeCode(JAXBElement<String> value) {
        this.voiceRecodingTypeCode = value;
    }

    /**
     * Gets the value of the voiceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceTypeCode() {
        return voiceTypeCode;
    }

    /**
     * Sets the value of the voiceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceTypeCode(JAXBElement<String> value) {
        this.voiceTypeCode = value;
    }

    /**
     * Gets the value of the mlsAzimuthTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsAzimuthTypeCode() {
        return mlsAzimuthTypeCode;
    }

    /**
     * Sets the value of the mlsAzimuthTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsAzimuthTypeCode(JAXBElement<String> value) {
        this.mlsAzimuthTypeCode = value;
    }

    /**
     * Gets the value of the antennaClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntennaClassificationCode() {
        return antennaClassificationCode;
    }

    /**
     * Sets the value of the antennaClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntennaClassificationCode(JAXBElement<String> value) {
        this.antennaClassificationCode = value;
    }

    /**
     * Gets the value of the dmeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmeTypeCode() {
        return dmeTypeCode;
    }

    /**
     * Sets the value of the dmeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmeTypeCode(JAXBElement<String> value) {
        this.dmeTypeCode = value;
    }

    /**
     * Gets the value of the mbTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMbTypeCode() {
        return mbTypeCode;
    }

    /**
     * Sets the value of the mbTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMbTypeCode(JAXBElement<String> value) {
        this.mbTypeCode = value;
    }

    /**
     * Gets the value of the monitorCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorCategoryCode() {
        return monitorCategoryCode;
    }

    /**
     * Sets the value of the monitorCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorCategoryCode(JAXBElement<String> value) {
        this.monitorCategoryCode = value;
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
     * Gets the value of the cpbStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpbStatusCode() {
        return cpbStatusCode;
    }

    /**
     * Sets the value of the cpbStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpbStatusCode(JAXBElement<String> value) {
        this.cpbStatusCode = value;
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
     * Gets the value of the tchCalculationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTchCalculationTypeCode() {
        return tchCalculationTypeCode;
    }

    /**
     * Sets the value of the tchCalculationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTchCalculationTypeCode(JAXBElement<String> value) {
        this.tchCalculationTypeCode = value;
    }

    /**
     * Gets the value of the mlsDmeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsDmeStatusCode() {
        return mlsDmeStatusCode;
    }

    /**
     * Sets the value of the mlsDmeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsDmeStatusCode(JAXBElement<String> value) {
        this.mlsDmeStatusCode = value;
    }

    /**
     * Gets the value of the mlsBackAzimuthStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsBackAzimuthStatusCode() {
        return mlsBackAzimuthStatusCode;
    }

    /**
     * Sets the value of the mlsBackAzimuthStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsBackAzimuthStatusCode(JAXBElement<String> value) {
        this.mlsBackAzimuthStatusCode = value;
    }

    /**
     * Gets the value of the mlsApproachAzimuthStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsApproachAzimuthStatusCode() {
        return mlsApproachAzimuthStatusCode;
    }

    /**
     * Sets the value of the mlsApproachAzimuthStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsApproachAzimuthStatusCode(JAXBElement<String> value) {
        this.mlsApproachAzimuthStatusCode = value;
    }

    /**
     * Gets the value of the mlsApproachElevationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlsApproachElevationStatusCode() {
        return mlsApproachElevationStatusCode;
    }

    /**
     * Sets the value of the mlsApproachElevationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlsApproachElevationStatusCode(JAXBElement<String> value) {
        this.mlsApproachElevationStatusCode = value;
    }

    /**
     * Gets the value of the gpAfisCoordinatesTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGpAfisCoordinatesTypeCode() {
        return gpAfisCoordinatesTypeCode;
    }

    /**
     * Sets the value of the gpAfisCoordinatesTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGpAfisCoordinatesTypeCode(JAXBElement<String> value) {
        this.gpAfisCoordinatesTypeCode = value;
    }

    /**
     * Gets the value of the refGpAfisCoordinatesTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefGpAfisCoordinatesTypeCode() {
        return refGpAfisCoordinatesTypeCode;
    }

    /**
     * Sets the value of the refGpAfisCoordinatesTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefGpAfisCoordinatesTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refGpAfisCoordinatesTypeCode = value;
    }

    /**
     * Gets the value of the gp8240Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGp8240Code() {
        return gp8240Code;
    }

    /**
     * Sets the value of the gp8240Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGp8240Code(JAXBElement<String> value) {
        this.gp8240Code = value;
    }

    /**
     * Gets the value of the azmCoordinateSystemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAzmCoordinateSystemTypeCode() {
        return azmCoordinateSystemTypeCode;
    }

    /**
     * Sets the value of the azmCoordinateSystemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAzmCoordinateSystemTypeCode(JAXBElement<String> value) {
        this.azmCoordinateSystemTypeCode = value;
    }

    /**
     * Gets the value of the refAzmCoordinateSystemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefAzmCoordinateSystemTypeCode() {
        return refAzmCoordinateSystemTypeCode;
    }

    /**
     * Sets the value of the refAzmCoordinateSystemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefAzmCoordinateSystemTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refAzmCoordinateSystemTypeCode = value;
    }

    /**
     * Gets the value of the azmClearSignalTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAzmClearSignalTypeCode() {
        return azmClearSignalTypeCode;
    }

    /**
     * Sets the value of the azmClearSignalTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAzmClearSignalTypeCode(JAXBElement<String> value) {
        this.azmClearSignalTypeCode = value;
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
     * Gets the value of the adptPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getAdptPosition() {
        return adptPosition;
    }

    /**
     * Sets the value of the adptPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setAdptPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.adptPosition = value;
    }

    /**
     * Gets the value of the edptPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getEdptPosition() {
        return edptPosition;
    }

    /**
     * Sets the value of the edptPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setEdptPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.edptPosition = value;
    }

    /**
     * Gets the value of the phaseCenterPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getPhaseCenterPosition() {
        return phaseCenterPosition;
    }

    /**
     * Sets the value of the phaseCenterPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setPhaseCenterPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.phaseCenterPosition = value;
    }

    /**
     * Gets the value of the navaidChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidChannelType }{@code >}
     *     
     */
    public JAXBElement<NavaidChannelType> getNavaidChannel() {
        return navaidChannel;
    }

    /**
     * Sets the value of the navaidChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidChannelType }{@code >}
     *     
     */
    public void setNavaidChannel(JAXBElement<NavaidChannelType> value) {
        this.navaidChannel = value;
    }

    /**
     * Gets the value of the navaidComponentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidComponentFrequencyType }{@code >}
     *     
     */
    public JAXBElement<NavaidComponentFrequencyType> getNavaidComponentFrequency() {
        return navaidComponentFrequency;
    }

    /**
     * Sets the value of the navaidComponentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidComponentFrequencyType }{@code >}
     *     
     */
    public void setNavaidComponentFrequency(JAXBElement<NavaidComponentFrequencyType> value) {
        this.navaidComponentFrequency = value;
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
     * Gets the value of the checkpointListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link CheckpointListHolderType }
     *     
     */
    public CheckpointListHolderType getCheckpointListHolder() {
        return checkpointListHolder;
    }

    /**
     * Sets the value of the checkpointListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckpointListHolderType }
     *     
     */
    public void setCheckpointListHolder(CheckpointListHolderType value) {
        this.checkpointListHolder = value;
    }

    /**
     * Gets the value of the navaidAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidAlignmentType }
     *     
     */
    public NavaidAlignmentType getNavaidAlignment() {
        return navaidAlignment;
    }

    /**
     * Sets the value of the navaidAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidAlignmentType }
     *     
     */
    public void setNavaidAlignment(NavaidAlignmentType value) {
        this.navaidAlignment = value;
    }

    /**
     * Gets the value of the navaidCourseListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidCourseListHolderType }
     *     
     */
    public NavaidCourseListHolderType getNavaidCourseListHolder() {
        return navaidCourseListHolder;
    }

    /**
     * Sets the value of the navaidCourseListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidCourseListHolderType }
     *     
     */
    public void setNavaidCourseListHolder(NavaidCourseListHolderType value) {
        this.navaidCourseListHolder = value;
    }

    /**
     * Gets the value of the parentReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidUseReferenceListHolderType }
     *     
     */
    public NavaidUseReferenceListHolderType getParentReferenceListHolder() {
        return parentReferenceListHolder;
    }

    /**
     * Sets the value of the parentReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidUseReferenceListHolderType }
     *     
     */
    public void setParentReferenceListHolder(NavaidUseReferenceListHolderType value) {
        this.parentReferenceListHolder = value;
    }

    /**
     * Gets the value of the componentUseRestrictionAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidComponentUseRestrictionAssociationListHolderType }
     *     
     */
    public NavaidComponentUseRestrictionAssociationListHolderType getComponentUseRestrictionAssociationListHolder() {
        return componentUseRestrictionAssociationListHolder;
    }

    /**
     * Sets the value of the componentUseRestrictionAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidComponentUseRestrictionAssociationListHolderType }
     *     
     */
    public void setComponentUseRestrictionAssociationListHolder(NavaidComponentUseRestrictionAssociationListHolderType value) {
        this.componentUseRestrictionAssociationListHolder = value;
    }

}
