
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="AirnavAirportIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IcaoIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NfdcIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportSiteIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlTowerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VfrPrivateUseOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaasAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part139Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApproachLandingNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolarGridIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialUseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChartLocationCityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirnavControlNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TppVolumeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReimbursableNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculationsStaleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PointElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocationType" minOccurs="0"/>
 *         &lt;element name="AirportReferencePoint" type="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocationType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MagneticVariation" minOccurs="0"/>
 *         &lt;element name="LowestTemperature" type="{http://airnav2.faa.gov/aom/beans/vo}TemperatureMeasurementType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}Owner" minOccurs="0"/>
 *         &lt;element name="FeatureUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalControlCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefAirportTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}OrganizationAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LandingStripAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}DgpsAssociationTableListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MonitorReferenceAssociationTableListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CityServiceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AltimeterSourceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ContactAssociationListHolder" minOccurs="0"/>
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
@XmlType(name = "AirportType", propOrder = {
    "airnavAirportIdentifier",
    "airportName",
    "icaoIdentifier",
    "nfdcIdentifier",
    "airportSiteIdentification",
    "controlTowerIndicator",
    "vfrPrivateUseOnlyIndicator",
    "waasAvailable",
    "part139Flag",
    "approachLandingNumber",
    "polarGridIndicator",
    "iataIdentifier",
    "officialUseIndicator",
    "chartLocationCityText",
    "airnavControlNumber",
    "tppVolumeNumber",
    "reimbursableNumber",
    "calculationsStaleIndicator",
    "isDeleted",
    "pointElevation",
    "airportReferencePoint",
    "magneticVariation",
    "lowestTemperature",
    "surveySource",
    "owner",
    "featureUseCode",
    "countryCode",
    "regionCode",
    "serviceAreaCode",
    "operationalControlCenterCode",
    "militaryTypeCode",
    "stateCode",
    "airportTypeCode",
    "refAirportTypeCode",
    "organizationAssociationListHolder",
    "landingStripAssociationListHolder",
    "dgpsAssociationTableListHolder",
    "monitorReferenceAssociationTableListHolder",
    "cityServiceListHolder",
    "altimeterSourceListHolder",
    "contactAssociationListHolder",
    "viewOnlyComment",
    "editableComment",
    "contactComment"
})
public class AirportType
    extends TemporalModelType
{

    @XmlElementRef(name = "AirnavAirportIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airnavAirportIdentifier;
    @XmlElementRef(name = "AirportName", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportName;
    @XmlElementRef(name = "IcaoIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icaoIdentifier;
    @XmlElementRef(name = "NfdcIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nfdcIdentifier;
    @XmlElementRef(name = "AirportSiteIdentification", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportSiteIdentification;
    @XmlElementRef(name = "ControlTowerIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlTowerIndicator;
    @XmlElementRef(name = "VfrPrivateUseOnlyIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vfrPrivateUseOnlyIndicator;
    @XmlElementRef(name = "WaasAvailable", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> waasAvailable;
    @XmlElementRef(name = "Part139Flag", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> part139Flag;
    @XmlElementRef(name = "ApproachLandingNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> approachLandingNumber;
    @XmlElementRef(name = "PolarGridIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> polarGridIndicator;
    @XmlElementRef(name = "IataIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iataIdentifier;
    @XmlElementRef(name = "OfficialUseIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officialUseIndicator;
    @XmlElementRef(name = "ChartLocationCityText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chartLocationCityText;
    @XmlElementRef(name = "AirnavControlNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> airnavControlNumber;
    @XmlElementRef(name = "TppVolumeNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tppVolumeNumber;
    @XmlElementRef(name = "ReimbursableNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reimbursableNumber;
    @XmlElementRef(name = "CalculationsStaleIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> calculationsStaleIndicator;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "PointElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedLocationType> pointElevation;
    @XmlElementRef(name = "AirportReferencePoint", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedLocationType> airportReferencePoint;
    @XmlElement(name = "MagneticVariation", nillable = true)
    protected MagneticVariationType magneticVariation;
    @XmlElementRef(name = "LowestTemperature", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<TemperatureMeasurementType> lowestTemperature;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "Owner", nillable = true)
    protected OwnerType owner;
    @XmlElementRef(name = "FeatureUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureUseCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "RegionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionCode;
    @XmlElementRef(name = "ServiceAreaCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaCode;
    @XmlElementRef(name = "OperationalControlCenterCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationalControlCenterCode;
    @XmlElementRef(name = "MilitaryTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> militaryTypeCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "AirportTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportTypeCode;
    @XmlElementRef(name = "RefAirportTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refAirportTypeCode;
    @XmlElement(name = "OrganizationAssociationListHolder", nillable = true)
    protected OrganizationAssociationListHolderType organizationAssociationListHolder;
    @XmlElement(name = "LandingStripAssociationListHolder", nillable = true)
    protected LandingStripAssociationListHolderType landingStripAssociationListHolder;
    @XmlElement(name = "DgpsAssociationTableListHolder", nillable = true)
    protected DgpsAssociationTableListHolderType dgpsAssociationTableListHolder;
    @XmlElement(name = "MonitorReferenceAssociationTableListHolder", nillable = true)
    protected MonitorReferenceAssociationTableListHolderType monitorReferenceAssociationTableListHolder;
    @XmlElement(name = "CityServiceListHolder", nillable = true)
    protected CityServiceListHolderType cityServiceListHolder;
    @XmlElement(name = "AltimeterSourceListHolder", nillable = true)
    protected AltimeterSourceListHolderType altimeterSourceListHolder;
    @XmlElement(name = "ContactAssociationListHolder", nillable = true)
    protected ContactReferenceListHolderType contactAssociationListHolder;
    @XmlElement(name = "ViewOnlyComment")
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment")
    protected List<CommentType> editableComment;
    @XmlElement(name = "ContactComment")
    protected List<CommentType> contactComment;

    /**
     * Gets the value of the airnavAirportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirnavAirportIdentifier() {
        return airnavAirportIdentifier;
    }

    /**
     * Sets the value of the airnavAirportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirnavAirportIdentifier(JAXBElement<String> value) {
        this.airnavAirportIdentifier = value;
    }

    /**
     * Gets the value of the airportName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportName() {
        return airportName;
    }

    /**
     * Sets the value of the airportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportName(JAXBElement<String> value) {
        this.airportName = value;
    }

    /**
     * Gets the value of the icaoIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcaoIdentifier() {
        return icaoIdentifier;
    }

    /**
     * Sets the value of the icaoIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcaoIdentifier(JAXBElement<String> value) {
        this.icaoIdentifier = value;
    }

    /**
     * Gets the value of the nfdcIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNfdcIdentifier() {
        return nfdcIdentifier;
    }

    /**
     * Sets the value of the nfdcIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNfdcIdentifier(JAXBElement<String> value) {
        this.nfdcIdentifier = value;
    }

    /**
     * Gets the value of the airportSiteIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportSiteIdentification() {
        return airportSiteIdentification;
    }

    /**
     * Sets the value of the airportSiteIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportSiteIdentification(JAXBElement<String> value) {
        this.airportSiteIdentification = value;
    }

    /**
     * Gets the value of the controlTowerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlTowerIndicator() {
        return controlTowerIndicator;
    }

    /**
     * Sets the value of the controlTowerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlTowerIndicator(JAXBElement<String> value) {
        this.controlTowerIndicator = value;
    }

    /**
     * Gets the value of the vfrPrivateUseOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVfrPrivateUseOnlyIndicator() {
        return vfrPrivateUseOnlyIndicator;
    }

    /**
     * Sets the value of the vfrPrivateUseOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVfrPrivateUseOnlyIndicator(JAXBElement<String> value) {
        this.vfrPrivateUseOnlyIndicator = value;
    }

    /**
     * Gets the value of the waasAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWaasAvailable() {
        return waasAvailable;
    }

    /**
     * Sets the value of the waasAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWaasAvailable(JAXBElement<String> value) {
        this.waasAvailable = value;
    }

    /**
     * Gets the value of the part139Flag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPart139Flag() {
        return part139Flag;
    }

    /**
     * Sets the value of the part139Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPart139Flag(JAXBElement<String> value) {
        this.part139Flag = value;
    }

    /**
     * Gets the value of the approachLandingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getApproachLandingNumber() {
        return approachLandingNumber;
    }

    /**
     * Sets the value of the approachLandingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setApproachLandingNumber(JAXBElement<Integer> value) {
        this.approachLandingNumber = value;
    }

    /**
     * Gets the value of the polarGridIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolarGridIndicator() {
        return polarGridIndicator;
    }

    /**
     * Sets the value of the polarGridIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolarGridIndicator(JAXBElement<String> value) {
        this.polarGridIndicator = value;
    }

    /**
     * Gets the value of the iataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIataIdentifier() {
        return iataIdentifier;
    }

    /**
     * Sets the value of the iataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIataIdentifier(JAXBElement<String> value) {
        this.iataIdentifier = value;
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
     * Gets the value of the chartLocationCityText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChartLocationCityText() {
        return chartLocationCityText;
    }

    /**
     * Sets the value of the chartLocationCityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChartLocationCityText(JAXBElement<String> value) {
        this.chartLocationCityText = value;
    }

    /**
     * Gets the value of the airnavControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAirnavControlNumber() {
        return airnavControlNumber;
    }

    /**
     * Sets the value of the airnavControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAirnavControlNumber(JAXBElement<Integer> value) {
        this.airnavControlNumber = value;
    }

    /**
     * Gets the value of the tppVolumeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTppVolumeNumber() {
        return tppVolumeNumber;
    }

    /**
     * Sets the value of the tppVolumeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTppVolumeNumber(JAXBElement<String> value) {
        this.tppVolumeNumber = value;
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
     * Gets the value of the pointElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public JAXBElement<ElevatedLocationType> getPointElevation() {
        return pointElevation;
    }

    /**
     * Sets the value of the pointElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public void setPointElevation(JAXBElement<ElevatedLocationType> value) {
        this.pointElevation = value;
    }

    /**
     * Gets the value of the airportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public JAXBElement<ElevatedLocationType> getAirportReferencePoint() {
        return airportReferencePoint;
    }

    /**
     * Sets the value of the airportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public void setAirportReferencePoint(JAXBElement<ElevatedLocationType> value) {
        this.airportReferencePoint = value;
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
     * Gets the value of the lowestTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemperatureMeasurementType }{@code >}
     *     
     */
    public JAXBElement<TemperatureMeasurementType> getLowestTemperature() {
        return lowestTemperature;
    }

    /**
     * Sets the value of the lowestTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemperatureMeasurementType }{@code >}
     *     
     */
    public void setLowestTemperature(JAXBElement<TemperatureMeasurementType> value) {
        this.lowestTemperature = value;
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
     * Gets the value of the airportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportTypeCode() {
        return airportTypeCode;
    }

    /**
     * Sets the value of the airportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportTypeCode(JAXBElement<String> value) {
        this.airportTypeCode = value;
    }

    /**
     * Gets the value of the refAirportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefAirportTypeCode() {
        return refAirportTypeCode;
    }

    /**
     * Sets the value of the refAirportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefAirportTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refAirportTypeCode = value;
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
     * Gets the value of the landingStripAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link LandingStripAssociationListHolderType }
     *     
     */
    public LandingStripAssociationListHolderType getLandingStripAssociationListHolder() {
        return landingStripAssociationListHolder;
    }

    /**
     * Sets the value of the landingStripAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingStripAssociationListHolderType }
     *     
     */
    public void setLandingStripAssociationListHolder(LandingStripAssociationListHolderType value) {
        this.landingStripAssociationListHolder = value;
    }

    /**
     * Gets the value of the dgpsAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link DgpsAssociationTableListHolderType }
     *     
     */
    public DgpsAssociationTableListHolderType getDgpsAssociationTableListHolder() {
        return dgpsAssociationTableListHolder;
    }

    /**
     * Sets the value of the dgpsAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DgpsAssociationTableListHolderType }
     *     
     */
    public void setDgpsAssociationTableListHolder(DgpsAssociationTableListHolderType value) {
        this.dgpsAssociationTableListHolder = value;
    }

    /**
     * Gets the value of the monitorReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorReferenceAssociationTableListHolderType }
     *     
     */
    public MonitorReferenceAssociationTableListHolderType getMonitorReferenceAssociationTableListHolder() {
        return monitorReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the monitorReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorReferenceAssociationTableListHolderType }
     *     
     */
    public void setMonitorReferenceAssociationTableListHolder(MonitorReferenceAssociationTableListHolderType value) {
        this.monitorReferenceAssociationTableListHolder = value;
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
     * Gets the value of the altimeterSourceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AltimeterSourceListHolderType }
     *     
     */
    public AltimeterSourceListHolderType getAltimeterSourceListHolder() {
        return altimeterSourceListHolder;
    }

    /**
     * Sets the value of the altimeterSourceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltimeterSourceListHolderType }
     *     
     */
    public void setAltimeterSourceListHolder(AltimeterSourceListHolderType value) {
        this.altimeterSourceListHolder = value;
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
