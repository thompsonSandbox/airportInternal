
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="TrueBearing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TrueBearingAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Gradient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IfrIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PseudoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialUseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwayNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HeliId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldAirnavControlId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RunwayMarkingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefRunwayMarkingCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="RunwayUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefRunwayUseCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="RunwayDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkingConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AixmMarkingConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefMarkingCondition" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="LandingLength" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="FlightInspectionLength" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="FlightInspectionHeight" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="ObstacleSurveySource" type="{http://airnav2.faa.gov/aom/beans/vo}ObstacleSurveySourceType" minOccurs="0"/>
 *         &lt;element name="RunwaySurveySource" type="{http://airnav2.faa.gov/aom/beans/vo}SurveySourceType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayVisualRangeListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayCenterlinePointListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ObstacleReferenceAssociationTableListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LandingStripReferenceAssociationTableListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LightingSystemAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NtzReferenceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AmzReferenceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}VmdReferenceListHolder" minOccurs="0"/>
 *         &lt;element name="ViewOnlyComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EditableComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayType", propOrder = {
    "trueBearing",
    "trueBearingAccuracy",
    "gradient",
    "ifrIndicator",
    "pseudoIndicator",
    "officialUseIndicator",
    "runwayNumber",
    "heliId",
    "oldAirnavControlId",
    "isDeleted",
    "runwayMarkingCode",
    "refRunwayMarkingCode",
    "runwayUseCode",
    "refRunwayUseCode",
    "runwayDesignatorCode",
    "markingConditionCode",
    "aixmMarkingConditionCode",
    "refMarkingCondition",
    "landingLength",
    "flightInspectionLength",
    "flightInspectionHeight",
    "obstacleSurveySource",
    "runwaySurveySource",
    "runwayVisualRangeListHolder",
    "runwayCenterlinePointListHolder",
    "obstacleReferenceAssociationTableListHolder",
    "landingStripReferenceAssociationTableListHolder",
    "lightingSystemAssociationListHolder",
    "ntzReferenceListHolder",
    "amzReferenceListHolder",
    "vmdReferenceListHolder",
    "viewOnlyComment",
    "editableComment"
})
@XmlSeeAlso({
    AirportRunwayType.class
})
public class RunwayType
    extends TemporalModelType
{

    @XmlElementRef(name = "TrueBearing", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> trueBearing;
    @XmlElementRef(name = "TrueBearingAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> trueBearingAccuracy;
    @XmlElementRef(name = "Gradient", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> gradient;
    @XmlElementRef(name = "IfrIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifrIndicator;
    @XmlElementRef(name = "PseudoIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pseudoIndicator;
    @XmlElementRef(name = "OfficialUseIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officialUseIndicator;
    @XmlElementRef(name = "RunwayNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> runwayNumber;
    @XmlElementRef(name = "HeliId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> heliId;
    @XmlElementRef(name = "OldAirnavControlId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> oldAirnavControlId;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "RunwayMarkingCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> runwayMarkingCode;
    @XmlElementRef(name = "RefRunwayMarkingCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refRunwayMarkingCode;
    @XmlElementRef(name = "RunwayUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> runwayUseCode;
    @XmlElementRef(name = "RefRunwayUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refRunwayUseCode;
    @XmlElementRef(name = "RunwayDesignatorCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> runwayDesignatorCode;
    @XmlElementRef(name = "MarkingConditionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markingConditionCode;
    @XmlElementRef(name = "AixmMarkingConditionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aixmMarkingConditionCode;
    @XmlElementRef(name = "RefMarkingCondition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refMarkingCondition;
    @XmlElementRef(name = "LandingLength", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> landingLength;
    @XmlElementRef(name = "FlightInspectionLength", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> flightInspectionLength;
    @XmlElementRef(name = "FlightInspectionHeight", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> flightInspectionHeight;
    @XmlElementRef(name = "ObstacleSurveySource", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ObstacleSurveySourceType> obstacleSurveySource;
    @XmlElementRef(name = "RunwaySurveySource", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<SurveySourceType> runwaySurveySource;
    @XmlElement(name = "RunwayVisualRangeListHolder", nillable = true)
    protected RunwayVisualRangeListHolderType runwayVisualRangeListHolder;
    @XmlElement(name = "RunwayCenterlinePointListHolder", nillable = true)
    protected RunwayCenterlinePointListHolderType runwayCenterlinePointListHolder;
    @XmlElement(name = "ObstacleReferenceAssociationTableListHolder", nillable = true)
    protected ObstacleReferenceAssociationTableListHolderType obstacleReferenceAssociationTableListHolder;
    @XmlElement(name = "LandingStripReferenceAssociationTableListHolder", nillable = true)
    protected LandingStripReferenceAssociationTableListHolderType landingStripReferenceAssociationTableListHolder;
    @XmlElement(name = "LightingSystemAssociationListHolder", nillable = true)
    protected LightingSystemAssociationListHolderType lightingSystemAssociationListHolder;
    @XmlElement(name = "NtzReferenceListHolder", nillable = true)
    protected NtzReferenceListHolderType ntzReferenceListHolder;
    @XmlElement(name = "AmzReferenceListHolder", nillable = true)
    protected AmzReferenceListHolderType amzReferenceListHolder;
    @XmlElement(name = "VmdReferenceListHolder", nillable = true)
    protected VmdReferenceListHolderType vmdReferenceListHolder;
    @XmlElement(name = "ViewOnlyComment")
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment")
    protected List<CommentType> editableComment;

    /**
     * Gets the value of the trueBearing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTrueBearing() {
        return trueBearing;
    }

    /**
     * Sets the value of the trueBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTrueBearing(JAXBElement<Double> value) {
        this.trueBearing = value;
    }

    /**
     * Gets the value of the trueBearingAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTrueBearingAccuracy() {
        return trueBearingAccuracy;
    }

    /**
     * Sets the value of the trueBearingAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTrueBearingAccuracy(JAXBElement<Double> value) {
        this.trueBearingAccuracy = value;
    }

    /**
     * Gets the value of the gradient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGradient() {
        return gradient;
    }

    /**
     * Sets the value of the gradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGradient(JAXBElement<Double> value) {
        this.gradient = value;
    }

    /**
     * Gets the value of the ifrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfrIndicator() {
        return ifrIndicator;
    }

    /**
     * Sets the value of the ifrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfrIndicator(JAXBElement<String> value) {
        this.ifrIndicator = value;
    }

    /**
     * Gets the value of the pseudoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPseudoIndicator() {
        return pseudoIndicator;
    }

    /**
     * Sets the value of the pseudoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPseudoIndicator(JAXBElement<String> value) {
        this.pseudoIndicator = value;
    }

    /**
     * Gets the value of the officialUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficialUseIndicator() {
        return officialUseIndicator;
    }

    /**
     * Sets the value of the officialUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficialUseIndicator(JAXBElement<String> value) {
        this.officialUseIndicator = value;
    }

    /**
     * Gets the value of the runwayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRunwayNumber() {
        return runwayNumber;
    }

    /**
     * Sets the value of the runwayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRunwayNumber(JAXBElement<Integer> value) {
        this.runwayNumber = value;
    }

    /**
     * Gets the value of the heliId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeliId() {
        return heliId;
    }

    /**
     * Sets the value of the heliId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeliId(JAXBElement<String> value) {
        this.heliId = value;
    }

    /**
     * Gets the value of the oldAirnavControlId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOldAirnavControlId() {
        return oldAirnavControlId;
    }

    /**
     * Sets the value of the oldAirnavControlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOldAirnavControlId(JAXBElement<Integer> value) {
        this.oldAirnavControlId = value;
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
     * Gets the value of the runwayMarkingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRunwayMarkingCode() {
        return runwayMarkingCode;
    }

    /**
     * Sets the value of the runwayMarkingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRunwayMarkingCode(JAXBElement<String> value) {
        this.runwayMarkingCode = value;
    }

    /**
     * Gets the value of the refRunwayMarkingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefRunwayMarkingCode() {
        return refRunwayMarkingCode;
    }

    /**
     * Sets the value of the refRunwayMarkingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefRunwayMarkingCode(JAXBElement<ReferenceDataType> value) {
        this.refRunwayMarkingCode = value;
    }

    /**
     * Gets the value of the runwayUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRunwayUseCode() {
        return runwayUseCode;
    }

    /**
     * Sets the value of the runwayUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRunwayUseCode(JAXBElement<String> value) {
        this.runwayUseCode = value;
    }

    /**
     * Gets the value of the refRunwayUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefRunwayUseCode() {
        return refRunwayUseCode;
    }

    /**
     * Sets the value of the refRunwayUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefRunwayUseCode(JAXBElement<ReferenceDataType> value) {
        this.refRunwayUseCode = value;
    }

    /**
     * Gets the value of the runwayDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRunwayDesignatorCode() {
        return runwayDesignatorCode;
    }

    /**
     * Sets the value of the runwayDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRunwayDesignatorCode(JAXBElement<String> value) {
        this.runwayDesignatorCode = value;
    }

    /**
     * Gets the value of the markingConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkingConditionCode() {
        return markingConditionCode;
    }

    /**
     * Sets the value of the markingConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkingConditionCode(JAXBElement<String> value) {
        this.markingConditionCode = value;
    }

    /**
     * Gets the value of the aixmMarkingConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAixmMarkingConditionCode() {
        return aixmMarkingConditionCode;
    }

    /**
     * Sets the value of the aixmMarkingConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAixmMarkingConditionCode(JAXBElement<String> value) {
        this.aixmMarkingConditionCode = value;
    }

    /**
     * Gets the value of the refMarkingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefMarkingCondition() {
        return refMarkingCondition;
    }

    /**
     * Sets the value of the refMarkingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefMarkingCondition(JAXBElement<ReferenceDataType> value) {
        this.refMarkingCondition = value;
    }

    /**
     * Gets the value of the landingLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getLandingLength() {
        return landingLength;
    }

    /**
     * Sets the value of the landingLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setLandingLength(JAXBElement<DistanceMeasurementType> value) {
        this.landingLength = value;
    }

    /**
     * Gets the value of the flightInspectionLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getFlightInspectionLength() {
        return flightInspectionLength;
    }

    /**
     * Sets the value of the flightInspectionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setFlightInspectionLength(JAXBElement<DistanceMeasurementType> value) {
        this.flightInspectionLength = value;
    }

    /**
     * Gets the value of the flightInspectionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getFlightInspectionHeight() {
        return flightInspectionHeight;
    }

    /**
     * Sets the value of the flightInspectionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setFlightInspectionHeight(JAXBElement<ElevationMeasurementType> value) {
        this.flightInspectionHeight = value;
    }

    /**
     * Gets the value of the obstacleSurveySource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObstacleSurveySourceType }{@code >}
     *     
     */
    public JAXBElement<ObstacleSurveySourceType> getObstacleSurveySource() {
        return obstacleSurveySource;
    }

    /**
     * Sets the value of the obstacleSurveySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObstacleSurveySourceType }{@code >}
     *     
     */
    public void setObstacleSurveySource(JAXBElement<ObstacleSurveySourceType> value) {
        this.obstacleSurveySource = value;
    }

    /**
     * Gets the value of the runwaySurveySource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurveySourceType }{@code >}
     *     
     */
    public JAXBElement<SurveySourceType> getRunwaySurveySource() {
        return runwaySurveySource;
    }

    /**
     * Sets the value of the runwaySurveySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurveySourceType }{@code >}
     *     
     */
    public void setRunwaySurveySource(JAXBElement<SurveySourceType> value) {
        this.runwaySurveySource = value;
    }

    /**
     * Gets the value of the runwayVisualRangeListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayVisualRangeListHolderType }
     *     
     */
    public RunwayVisualRangeListHolderType getRunwayVisualRangeListHolder() {
        return runwayVisualRangeListHolder;
    }

    /**
     * Sets the value of the runwayVisualRangeListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayVisualRangeListHolderType }
     *     
     */
    public void setRunwayVisualRangeListHolder(RunwayVisualRangeListHolderType value) {
        this.runwayVisualRangeListHolder = value;
    }

    /**
     * Gets the value of the runwayCenterlinePointListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayCenterlinePointListHolderType }
     *     
     */
    public RunwayCenterlinePointListHolderType getRunwayCenterlinePointListHolder() {
        return runwayCenterlinePointListHolder;
    }

    /**
     * Sets the value of the runwayCenterlinePointListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayCenterlinePointListHolderType }
     *     
     */
    public void setRunwayCenterlinePointListHolder(RunwayCenterlinePointListHolderType value) {
        this.runwayCenterlinePointListHolder = value;
    }

    /**
     * Gets the value of the obstacleReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ObstacleReferenceAssociationTableListHolderType }
     *     
     */
    public ObstacleReferenceAssociationTableListHolderType getObstacleReferenceAssociationTableListHolder() {
        return obstacleReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the obstacleReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstacleReferenceAssociationTableListHolderType }
     *     
     */
    public void setObstacleReferenceAssociationTableListHolder(ObstacleReferenceAssociationTableListHolderType value) {
        this.obstacleReferenceAssociationTableListHolder = value;
    }

    /**
     * Gets the value of the landingStripReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link LandingStripReferenceAssociationTableListHolderType }
     *     
     */
    public LandingStripReferenceAssociationTableListHolderType getLandingStripReferenceAssociationTableListHolder() {
        return landingStripReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the landingStripReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingStripReferenceAssociationTableListHolderType }
     *     
     */
    public void setLandingStripReferenceAssociationTableListHolder(LandingStripReferenceAssociationTableListHolderType value) {
        this.landingStripReferenceAssociationTableListHolder = value;
    }

    /**
     * Gets the value of the lightingSystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link LightingSystemAssociationListHolderType }
     *     
     */
    public LightingSystemAssociationListHolderType getLightingSystemAssociationListHolder() {
        return lightingSystemAssociationListHolder;
    }

    /**
     * Sets the value of the lightingSystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingSystemAssociationListHolderType }
     *     
     */
    public void setLightingSystemAssociationListHolder(LightingSystemAssociationListHolderType value) {
        this.lightingSystemAssociationListHolder = value;
    }

    /**
     * Gets the value of the ntzReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NtzReferenceListHolderType }
     *     
     */
    public NtzReferenceListHolderType getNtzReferenceListHolder() {
        return ntzReferenceListHolder;
    }

    /**
     * Sets the value of the ntzReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NtzReferenceListHolderType }
     *     
     */
    public void setNtzReferenceListHolder(NtzReferenceListHolderType value) {
        this.ntzReferenceListHolder = value;
    }

    /**
     * Gets the value of the amzReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AmzReferenceListHolderType }
     *     
     */
    public AmzReferenceListHolderType getAmzReferenceListHolder() {
        return amzReferenceListHolder;
    }

    /**
     * Sets the value of the amzReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmzReferenceListHolderType }
     *     
     */
    public void setAmzReferenceListHolder(AmzReferenceListHolderType value) {
        this.amzReferenceListHolder = value;
    }

    /**
     * Gets the value of the vmdReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link VmdReferenceListHolderType }
     *     
     */
    public VmdReferenceListHolderType getVmdReferenceListHolder() {
        return vmdReferenceListHolder;
    }

    /**
     * Sets the value of the vmdReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmdReferenceListHolderType }
     *     
     */
    public void setVmdReferenceListHolder(VmdReferenceListHolderType value) {
        this.vmdReferenceListHolder = value;
    }

    /**
     * Gets the value of the viewOnlyComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewOnlyComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewOnlyComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getViewOnlyComment() {
        if (viewOnlyComment == null) {
            viewOnlyComment = new ArrayList<CommentType>();
        }
        return this.viewOnlyComment;
    }

    /**
     * Gets the value of the editableComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editableComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditableComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getEditableComment() {
        if (editableComment == null) {
            editableComment = new ArrayList<CommentType>();
        }
        return this.editableComment;
    }

}
