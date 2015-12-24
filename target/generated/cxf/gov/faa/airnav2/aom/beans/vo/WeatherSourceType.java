
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
 * <p>Java class for WeatherSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherSourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="AltimeterIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherStationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAReportIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocation" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://airnav2.faa.gov/aom/beans/vo}FrequencyMeasurementType" minOccurs="0"/>
 *         &lt;element name="InstrumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherSourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherServiceLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ContactReference" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}BroadcastNavaidAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AltimeterSourceReferenceListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}TimesheetAssociation" minOccurs="0"/>
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
@XmlType(name = "WeatherSourceType", propOrder = {
    "altimeterIndicator",
    "weatherStationIndicator",
    "serviceAReportIndicator",
    "elevatedLocation",
    "surveySource",
    "stateCode",
    "countryCode",
    "frequency",
    "instrumentTypeCode",
    "weatherSourceTypeCode",
    "weatherServiceLevelCode",
    "isDeleted",
    "contactReference",
    "broadcastNavaidAssociationListHolder",
    "altimeterSourceReferenceListHolder",
    "timesheetAssociation",
    "viewOnlyComment",
    "editableComment"
})
public class WeatherSourceType
    extends TemporalModelType
{

    @XmlElementRef(name = "AltimeterIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altimeterIndicator;
    @XmlElementRef(name = "WeatherStationIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weatherStationIndicator;
    @XmlElementRef(name = "ServiceAReportIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAReportIndicator;
    @XmlElement(name = "ElevatedLocation", nillable = true)
    protected ElevatedLocationType elevatedLocation;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "Frequency", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<FrequencyMeasurementType> frequency;
    @XmlElementRef(name = "InstrumentTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrumentTypeCode;
    @XmlElementRef(name = "WeatherSourceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weatherSourceTypeCode;
    @XmlElementRef(name = "WeatherServiceLevelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weatherServiceLevelCode;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElement(name = "ContactReference", nillable = true)
    protected ContactReferenceType contactReference;
    @XmlElement(name = "BroadcastNavaidAssociationListHolder", nillable = true)
    protected BroadcastNavaidAssociationListHolderType broadcastNavaidAssociationListHolder;
    @XmlElement(name = "AltimeterSourceReferenceListHolder", nillable = true)
    protected AltimeterSourceReferenceListHolderType altimeterSourceReferenceListHolder;
    @XmlElement(name = "TimesheetAssociation", nillable = true)
    protected TimesheetAssociationType timesheetAssociation;
    @XmlElement(name = "ViewOnlyComment")
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment")
    protected List<CommentType> editableComment;

    /**
     * Gets the value of the altimeterIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltimeterIndicator() {
        return altimeterIndicator;
    }

    /**
     * Sets the value of the altimeterIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltimeterIndicator(JAXBElement<String> value) {
        this.altimeterIndicator = value;
    }

    /**
     * Gets the value of the weatherStationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeatherStationIndicator() {
        return weatherStationIndicator;
    }

    /**
     * Sets the value of the weatherStationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeatherStationIndicator(JAXBElement<String> value) {
        this.weatherStationIndicator = value;
    }

    /**
     * Gets the value of the serviceAReportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAReportIndicator() {
        return serviceAReportIndicator;
    }

    /**
     * Sets the value of the serviceAReportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAReportIndicator(JAXBElement<String> value) {
        this.serviceAReportIndicator = value;
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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public JAXBElement<FrequencyMeasurementType> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<FrequencyMeasurementType> value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the instrumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrumentTypeCode() {
        return instrumentTypeCode;
    }

    /**
     * Sets the value of the instrumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrumentTypeCode(JAXBElement<String> value) {
        this.instrumentTypeCode = value;
    }

    /**
     * Gets the value of the weatherSourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeatherSourceTypeCode() {
        return weatherSourceTypeCode;
    }

    /**
     * Sets the value of the weatherSourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeatherSourceTypeCode(JAXBElement<String> value) {
        this.weatherSourceTypeCode = value;
    }

    /**
     * Gets the value of the weatherServiceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeatherServiceLevelCode() {
        return weatherServiceLevelCode;
    }

    /**
     * Sets the value of the weatherServiceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeatherServiceLevelCode(JAXBElement<String> value) {
        this.weatherServiceLevelCode = value;
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
     * Gets the value of the contactReference property.
     * 
     * @return
     *     possible object is
     *     {@link ContactReferenceType }
     *     
     */
    public ContactReferenceType getContactReference() {
        return contactReference;
    }

    /**
     * Sets the value of the contactReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactReferenceType }
     *     
     */
    public void setContactReference(ContactReferenceType value) {
        this.contactReference = value;
    }

    /**
     * Gets the value of the broadcastNavaidAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link BroadcastNavaidAssociationListHolderType }
     *     
     */
    public BroadcastNavaidAssociationListHolderType getBroadcastNavaidAssociationListHolder() {
        return broadcastNavaidAssociationListHolder;
    }

    /**
     * Sets the value of the broadcastNavaidAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadcastNavaidAssociationListHolderType }
     *     
     */
    public void setBroadcastNavaidAssociationListHolder(BroadcastNavaidAssociationListHolderType value) {
        this.broadcastNavaidAssociationListHolder = value;
    }

    /**
     * Gets the value of the altimeterSourceReferenceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AltimeterSourceReferenceListHolderType }
     *     
     */
    public AltimeterSourceReferenceListHolderType getAltimeterSourceReferenceListHolder() {
        return altimeterSourceReferenceListHolder;
    }

    /**
     * Sets the value of the altimeterSourceReferenceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltimeterSourceReferenceListHolderType }
     *     
     */
    public void setAltimeterSourceReferenceListHolder(AltimeterSourceReferenceListHolderType value) {
        this.altimeterSourceReferenceListHolder = value;
    }

    /**
     * Gets the value of the timesheetAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetAssociationType }
     *     
     */
    public TimesheetAssociationType getTimesheetAssociation() {
        return timesheetAssociation;
    }

    /**
     * Sets the value of the timesheetAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetAssociationType }
     *     
     */
    public void setTimesheetAssociation(TimesheetAssociationType value) {
        this.timesheetAssociation = value;
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
