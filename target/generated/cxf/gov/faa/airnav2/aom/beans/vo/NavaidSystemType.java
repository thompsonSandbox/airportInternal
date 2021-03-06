
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
 * <p>Java class for NavaidSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="LocationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BroadcastId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemporaryMobileIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PseudoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialUseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisualFlightRulesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialUseOnlyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialAircraftOnlyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryUseOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculationsStaleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegacyControlNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonitoringLocationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitoringFullTimeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReimbursableNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MsblsTransmissionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefMsblsTransmissionTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="ServiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTypeReference" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="LandingCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonitorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructureToleranceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NdbClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalControlCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MagneticVariation" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}TimesheetAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportSystemAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwaySystemAssociationListHolder" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AssociatedPositionListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}Owner" minOccurs="0"/>
 *         &lt;element name="ChildrenListHolder" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseListHolderType"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ContactAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CityServiceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}OrganizationAssociationListHolder" minOccurs="0"/>
 *         &lt;element name="ViewOnlyComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EditableComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidSystemType", propOrder = {
    "locationText",
    "broadcastId",
    "id",
    "name",
    "temporaryMobileIndicator",
    "pseudoIndicator",
    "officialUseIndicator",
    "visualFlightRulesIndicator",
    "specialUseOnlyCode",
    "specialAircraftOnlyCode",
    "militaryUseOnlyIndicator",
    "calculationsStaleIndicator",
    "legacyControlNumber",
    "monitoringLocationText",
    "monitoringFullTimeIndicator",
    "reimbursableNumber",
    "isDeleted",
    "msblsTransmissionTypeCode",
    "refMsblsTransmissionTypeCode",
    "serviceTypeCode",
    "serviceTypeReference",
    "landingCategoryCode",
    "monitorCategoryCode",
    "structureToleranceCode",
    "featureUseCode",
    "militaryTypeCode",
    "performanceClassCode",
    "ndbClassCode",
    "serviceAreaCode",
    "operationalControlCenterCode",
    "stateCode",
    "countryCode",
    "regionCode",
    "magneticVariation",
    "timesheetAssociationListHolder",
    "airportSystemAssociationListHolder",
    "runwaySystemAssociationListHolder",
    "position",
    "associatedPositionListHolder",
    "surveySource",
    "owner",
    "childrenListHolder",
    "contactAssociationListHolder",
    "cityServiceListHolder",
    "organizationAssociationListHolder",
    "viewOnlyComment",
    "editableComment",
    "contactComment"
})
@XmlSeeAlso({
    NavaidSystemExtendedType.class
})
public class NavaidSystemType
    extends TemporalModelType
{

    @XmlElementRef(name = "LocationText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationText;
    @XmlElementRef(name = "BroadcastId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> broadcastId;
    @XmlElementRef(name = "Id", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Name", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "TemporaryMobileIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryMobileIndicator;
    @XmlElementRef(name = "PseudoIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pseudoIndicator;
    @XmlElementRef(name = "OfficialUseIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officialUseIndicator;
    @XmlElementRef(name = "VisualFlightRulesIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visualFlightRulesIndicator;
    @XmlElementRef(name = "SpecialUseOnlyCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialUseOnlyCode;
    @XmlElementRef(name = "SpecialAircraftOnlyCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialAircraftOnlyCode;
    @XmlElementRef(name = "MilitaryUseOnlyIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> militaryUseOnlyIndicator;
    @XmlElementRef(name = "CalculationsStaleIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> calculationsStaleIndicator;
    @XmlElementRef(name = "LegacyControlNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> legacyControlNumber;
    @XmlElementRef(name = "MonitoringLocationText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitoringLocationText;
    @XmlElementRef(name = "MonitoringFullTimeIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitoringFullTimeIndicator;
    @XmlElementRef(name = "ReimbursableNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reimbursableNumber;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "MsblsTransmissionTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msblsTransmissionTypeCode;
    @XmlElementRef(name = "RefMsblsTransmissionTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refMsblsTransmissionTypeCode;
    @XmlElementRef(name = "ServiceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTypeCode;
    @XmlElementRef(name = "ServiceTypeReference", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> serviceTypeReference;
    @XmlElementRef(name = "LandingCategoryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> landingCategoryCode;
    @XmlElementRef(name = "MonitorCategoryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorCategoryCode;
    @XmlElementRef(name = "StructureToleranceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureToleranceCode;
    @XmlElementRef(name = "FeatureUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureUseCode;
    @XmlElementRef(name = "MilitaryTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> militaryTypeCode;
    @XmlElementRef(name = "PerformanceClassCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> performanceClassCode;
    @XmlElementRef(name = "NdbClassCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ndbClassCode;
    @XmlElementRef(name = "ServiceAreaCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaCode;
    @XmlElementRef(name = "OperationalControlCenterCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationalControlCenterCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "RegionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionCode;
    @XmlElement(name = "MagneticVariation", nillable = true)
    protected MagneticVariationType magneticVariation;
    @XmlElement(name = "TimesheetAssociationListHolder", nillable = true)
    protected TimesheetAssociationListHolderType timesheetAssociationListHolder;
    @XmlElement(name = "AirportSystemAssociationListHolder", nillable = true)
    protected AirportSystemAssociationListHolderType airportSystemAssociationListHolder;
    @XmlElement(name = "RunwaySystemAssociationListHolder", nillable = true)
    protected RunwaySystemAssociationListHolderType runwaySystemAssociationListHolder;
    @XmlElementRef(name = "Position", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> position;
    @XmlElement(name = "AssociatedPositionListHolder", nillable = true)
    protected AssociatedPositionListHolderType associatedPositionListHolder;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "Owner", nillable = true)
    protected OwnerType owner;
    @XmlElement(name = "ChildrenListHolder", required = true, nillable = true)
    protected NavaidUseListHolderType childrenListHolder;
    @XmlElement(name = "ContactAssociationListHolder", nillable = true)
    protected ContactReferenceListHolderType contactAssociationListHolder;
    @XmlElement(name = "CityServiceListHolder", nillable = true)
    protected CityServiceListHolderType cityServiceListHolder;
    @XmlElement(name = "OrganizationAssociationListHolder", nillable = true)
    protected OrganizationAssociationListHolderType organizationAssociationListHolder;
    @XmlElement(name = "ViewOnlyComment")
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment")
    protected List<CommentType> editableComment;
    @XmlElement(name = "ContactComment")
    protected List<CommentType> contactComment;

    /**
     * Gets the value of the locationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationText() {
        return locationText;
    }

    /**
     * Sets the value of the locationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationText(JAXBElement<String> value) {
        this.locationText = value;
    }

    /**
     * Gets the value of the broadcastId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBroadcastId() {
        return broadcastId;
    }

    /**
     * Sets the value of the broadcastId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBroadcastId(JAXBElement<String> value) {
        this.broadcastId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
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
     * Gets the value of the visualFlightRulesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisualFlightRulesIndicator() {
        return visualFlightRulesIndicator;
    }

    /**
     * Sets the value of the visualFlightRulesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisualFlightRulesIndicator(JAXBElement<String> value) {
        this.visualFlightRulesIndicator = value;
    }

    /**
     * Gets the value of the specialUseOnlyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialUseOnlyCode() {
        return specialUseOnlyCode;
    }

    /**
     * Sets the value of the specialUseOnlyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialUseOnlyCode(JAXBElement<String> value) {
        this.specialUseOnlyCode = value;
    }

    /**
     * Gets the value of the specialAircraftOnlyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialAircraftOnlyCode() {
        return specialAircraftOnlyCode;
    }

    /**
     * Sets the value of the specialAircraftOnlyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialAircraftOnlyCode(JAXBElement<String> value) {
        this.specialAircraftOnlyCode = value;
    }

    /**
     * Gets the value of the militaryUseOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMilitaryUseOnlyIndicator() {
        return militaryUseOnlyIndicator;
    }

    /**
     * Sets the value of the militaryUseOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMilitaryUseOnlyIndicator(JAXBElement<String> value) {
        this.militaryUseOnlyIndicator = value;
    }

    /**
     * Gets the value of the calculationsStaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCalculationsStaleIndicator() {
        return calculationsStaleIndicator;
    }

    /**
     * Sets the value of the calculationsStaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCalculationsStaleIndicator(JAXBElement<Boolean> value) {
        this.calculationsStaleIndicator = value;
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
     * Gets the value of the monitoringLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitoringLocationText() {
        return monitoringLocationText;
    }

    /**
     * Sets the value of the monitoringLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitoringLocationText(JAXBElement<String> value) {
        this.monitoringLocationText = value;
    }

    /**
     * Gets the value of the monitoringFullTimeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitoringFullTimeIndicator() {
        return monitoringFullTimeIndicator;
    }

    /**
     * Sets the value of the monitoringFullTimeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitoringFullTimeIndicator(JAXBElement<String> value) {
        this.monitoringFullTimeIndicator = value;
    }

    /**
     * Gets the value of the reimbursableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReimbursableNumber() {
        return reimbursableNumber;
    }

    /**
     * Sets the value of the reimbursableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReimbursableNumber(JAXBElement<String> value) {
        this.reimbursableNumber = value;
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
     * Gets the value of the msblsTransmissionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsblsTransmissionTypeCode() {
        return msblsTransmissionTypeCode;
    }

    /**
     * Sets the value of the msblsTransmissionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsblsTransmissionTypeCode(JAXBElement<String> value) {
        this.msblsTransmissionTypeCode = value;
    }

    /**
     * Gets the value of the refMsblsTransmissionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefMsblsTransmissionTypeCode() {
        return refMsblsTransmissionTypeCode;
    }

    /**
     * Sets the value of the refMsblsTransmissionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefMsblsTransmissionTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refMsblsTransmissionTypeCode = value;
    }

    /**
     * Gets the value of the serviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Sets the value of the serviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTypeCode(JAXBElement<String> value) {
        this.serviceTypeCode = value;
    }

    /**
     * Gets the value of the serviceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getServiceTypeReference() {
        return serviceTypeReference;
    }

    /**
     * Sets the value of the serviceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setServiceTypeReference(JAXBElement<ReferenceDataType> value) {
        this.serviceTypeReference = value;
    }

    /**
     * Gets the value of the landingCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLandingCategoryCode() {
        return landingCategoryCode;
    }

    /**
     * Sets the value of the landingCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLandingCategoryCode(JAXBElement<String> value) {
        this.landingCategoryCode = value;
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
     * Gets the value of the structureToleranceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStructureToleranceCode() {
        return structureToleranceCode;
    }

    /**
     * Sets the value of the structureToleranceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStructureToleranceCode(JAXBElement<String> value) {
        this.structureToleranceCode = value;
    }

    /**
     * Gets the value of the featureUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeatureUseCode() {
        return featureUseCode;
    }

    /**
     * Sets the value of the featureUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeatureUseCode(JAXBElement<String> value) {
        this.featureUseCode = value;
    }

    /**
     * Gets the value of the militaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMilitaryTypeCode() {
        return militaryTypeCode;
    }

    /**
     * Sets the value of the militaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMilitaryTypeCode(JAXBElement<String> value) {
        this.militaryTypeCode = value;
    }

    /**
     * Gets the value of the performanceClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerformanceClassCode() {
        return performanceClassCode;
    }

    /**
     * Sets the value of the performanceClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerformanceClassCode(JAXBElement<String> value) {
        this.performanceClassCode = value;
    }

    /**
     * Gets the value of the ndbClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNdbClassCode() {
        return ndbClassCode;
    }

    /**
     * Sets the value of the ndbClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNdbClassCode(JAXBElement<String> value) {
        this.ndbClassCode = value;
    }

    /**
     * Gets the value of the serviceAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAreaCode() {
        return serviceAreaCode;
    }

    /**
     * Sets the value of the serviceAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAreaCode(JAXBElement<String> value) {
        this.serviceAreaCode = value;
    }

    /**
     * Gets the value of the operationalControlCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationalControlCenterCode() {
        return operationalControlCenterCode;
    }

    /**
     * Sets the value of the operationalControlCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationalControlCenterCode(JAXBElement<String> value) {
        this.operationalControlCenterCode = value;
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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionCode(JAXBElement<String> value) {
        this.regionCode = value;
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
     * Gets the value of the timesheetAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetAssociationListHolderType }
     *     
     */
    public TimesheetAssociationListHolderType getTimesheetAssociationListHolder() {
        return timesheetAssociationListHolder;
    }

    /**
     * Sets the value of the timesheetAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetAssociationListHolderType }
     *     
     */
    public void setTimesheetAssociationListHolder(TimesheetAssociationListHolderType value) {
        this.timesheetAssociationListHolder = value;
    }

    /**
     * Gets the value of the airportSystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportSystemAssociationListHolderType }
     *     
     */
    public AirportSystemAssociationListHolderType getAirportSystemAssociationListHolder() {
        return airportSystemAssociationListHolder;
    }

    /**
     * Sets the value of the airportSystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportSystemAssociationListHolderType }
     *     
     */
    public void setAirportSystemAssociationListHolder(AirportSystemAssociationListHolderType value) {
        this.airportSystemAssociationListHolder = value;
    }

    /**
     * Gets the value of the runwaySystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwaySystemAssociationListHolderType }
     *     
     */
    public RunwaySystemAssociationListHolderType getRunwaySystemAssociationListHolder() {
        return runwaySystemAssociationListHolder;
    }

    /**
     * Sets the value of the runwaySystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwaySystemAssociationListHolderType }
     *     
     */
    public void setRunwaySystemAssociationListHolder(RunwaySystemAssociationListHolderType value) {
        this.runwaySystemAssociationListHolder = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerType }
     *     
     */
    public OwnerType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerType }
     *     
     */
    public void setOwner(OwnerType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the childrenListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidUseListHolderType }
     *     
     */
    public NavaidUseListHolderType getChildrenListHolder() {
        return childrenListHolder;
    }

    /**
     * Sets the value of the childrenListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidUseListHolderType }
     *     
     */
    public void setChildrenListHolder(NavaidUseListHolderType value) {
        this.childrenListHolder = value;
    }

    /**
     * Gets the value of the contactAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ContactReferenceListHolderType }
     *     
     */
    public ContactReferenceListHolderType getContactAssociationListHolder() {
        return contactAssociationListHolder;
    }

    /**
     * Sets the value of the contactAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactReferenceListHolderType }
     *     
     */
    public void setContactAssociationListHolder(ContactReferenceListHolderType value) {
        this.contactAssociationListHolder = value;
    }

    /**
     * Gets the value of the cityServiceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link CityServiceListHolderType }
     *     
     */
    public CityServiceListHolderType getCityServiceListHolder() {
        return cityServiceListHolder;
    }

    /**
     * Sets the value of the cityServiceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityServiceListHolderType }
     *     
     */
    public void setCityServiceListHolder(CityServiceListHolderType value) {
        this.cityServiceListHolder = value;
    }

    /**
     * Gets the value of the organizationAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssociationListHolderType }
     *     
     */
    public OrganizationAssociationListHolderType getOrganizationAssociationListHolder() {
        return organizationAssociationListHolder;
    }

    /**
     * Sets the value of the organizationAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssociationListHolderType }
     *     
     */
    public void setOrganizationAssociationListHolder(OrganizationAssociationListHolderType value) {
        this.organizationAssociationListHolder = value;
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

    /**
     * Gets the value of the contactComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getContactComment() {
        if (contactComment == null) {
            contactComment = new ArrayList<CommentType>();
        }
        return this.contactComment;
    }

}
