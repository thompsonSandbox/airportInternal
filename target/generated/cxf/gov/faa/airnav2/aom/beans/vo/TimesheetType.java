
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimesheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimesheetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}SequenceIdentifierType"/>
 *         &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartEventTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndEventTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffectedStartDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffectedEndDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtcConversionNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DaylightConversionNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="YearlyStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearlyEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelativeEventStartTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelativeEventEndTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotamIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotamRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimesheetType", propOrder = {
    "identifier",
    "timeCode",
    "startEvent",
    "endEvent",
    "startEventTimeCode",
    "endEventTimeCode",
    "affectedStartDay",
    "affectedEndDay",
    "utcConversionNumber",
    "daylightConversionNumber",
    "yearlyStartDate",
    "yearlyEndDate",
    "startTime",
    "endTime",
    "relativeEventStartTime",
    "relativeEventEndTime",
    "description",
    "timeIndicator",
    "notamIndicator",
    "notamRemark"
})
public class TimesheetType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected SequenceIdentifierType identifier;
    @XmlElementRef(name = "TimeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeCode;
    @XmlElementRef(name = "StartEvent", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startEvent;
    @XmlElementRef(name = "EndEvent", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endEvent;
    @XmlElementRef(name = "StartEventTimeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startEventTimeCode;
    @XmlElementRef(name = "EndEventTimeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endEventTimeCode;
    @XmlElementRef(name = "AffectedStartDay", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affectedStartDay;
    @XmlElementRef(name = "AffectedEndDay", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> affectedEndDay;
    @XmlElementRef(name = "UtcConversionNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> utcConversionNumber;
    @XmlElementRef(name = "DaylightConversionNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> daylightConversionNumber;
    @XmlElementRef(name = "YearlyStartDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearlyStartDate;
    @XmlElementRef(name = "YearlyEndDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearlyEndDate;
    @XmlElementRef(name = "StartTime", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startTime;
    @XmlElementRef(name = "EndTime", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endTime;
    @XmlElementRef(name = "RelativeEventStartTime", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> relativeEventStartTime;
    @XmlElementRef(name = "RelativeEventEndTime", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> relativeEventEndTime;
    @XmlElementRef(name = "Description", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "TimeIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeIndicator;
    @XmlElementRef(name = "NotamIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notamIndicator;
    @XmlElementRef(name = "NotamRemark", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notamRemark;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceIdentifierType }
     *     
     */
    public SequenceIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceIdentifierType }
     *     
     */
    public void setIdentifier(SequenceIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the timeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeCode() {
        return timeCode;
    }

    /**
     * Sets the value of the timeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeCode(JAXBElement<String> value) {
        this.timeCode = value;
    }

    /**
     * Gets the value of the startEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartEvent() {
        return startEvent;
    }

    /**
     * Sets the value of the startEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartEvent(JAXBElement<String> value) {
        this.startEvent = value;
    }

    /**
     * Gets the value of the endEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndEvent() {
        return endEvent;
    }

    /**
     * Sets the value of the endEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndEvent(JAXBElement<String> value) {
        this.endEvent = value;
    }

    /**
     * Gets the value of the startEventTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartEventTimeCode() {
        return startEventTimeCode;
    }

    /**
     * Sets the value of the startEventTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartEventTimeCode(JAXBElement<String> value) {
        this.startEventTimeCode = value;
    }

    /**
     * Gets the value of the endEventTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndEventTimeCode() {
        return endEventTimeCode;
    }

    /**
     * Sets the value of the endEventTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndEventTimeCode(JAXBElement<String> value) {
        this.endEventTimeCode = value;
    }

    /**
     * Gets the value of the affectedStartDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffectedStartDay() {
        return affectedStartDay;
    }

    /**
     * Sets the value of the affectedStartDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffectedStartDay(JAXBElement<String> value) {
        this.affectedStartDay = value;
    }

    /**
     * Gets the value of the affectedEndDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffectedEndDay() {
        return affectedEndDay;
    }

    /**
     * Sets the value of the affectedEndDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffectedEndDay(JAXBElement<String> value) {
        this.affectedEndDay = value;
    }

    /**
     * Gets the value of the utcConversionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUtcConversionNumber() {
        return utcConversionNumber;
    }

    /**
     * Sets the value of the utcConversionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUtcConversionNumber(JAXBElement<Double> value) {
        this.utcConversionNumber = value;
    }

    /**
     * Gets the value of the daylightConversionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDaylightConversionNumber() {
        return daylightConversionNumber;
    }

    /**
     * Sets the value of the daylightConversionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDaylightConversionNumber(JAXBElement<Double> value) {
        this.daylightConversionNumber = value;
    }

    /**
     * Gets the value of the yearlyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearlyStartDate() {
        return yearlyStartDate;
    }

    /**
     * Sets the value of the yearlyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearlyStartDate(JAXBElement<String> value) {
        this.yearlyStartDate = value;
    }

    /**
     * Gets the value of the yearlyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearlyEndDate() {
        return yearlyEndDate;
    }

    /**
     * Sets the value of the yearlyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearlyEndDate(JAXBElement<String> value) {
        this.yearlyEndDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<String> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<String> value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the relativeEventStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRelativeEventStartTime() {
        return relativeEventStartTime;
    }

    /**
     * Sets the value of the relativeEventStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRelativeEventStartTime(JAXBElement<Integer> value) {
        this.relativeEventStartTime = value;
    }

    /**
     * Gets the value of the relativeEventEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRelativeEventEndTime() {
        return relativeEventEndTime;
    }

    /**
     * Sets the value of the relativeEventEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRelativeEventEndTime(JAXBElement<Integer> value) {
        this.relativeEventEndTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the timeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeIndicator() {
        return timeIndicator;
    }

    /**
     * Sets the value of the timeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeIndicator(JAXBElement<String> value) {
        this.timeIndicator = value;
    }

    /**
     * Gets the value of the notamIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotamIndicator() {
        return notamIndicator;
    }

    /**
     * Sets the value of the notamIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotamIndicator(JAXBElement<String> value) {
        this.notamIndicator = value;
    }

    /**
     * Gets the value of the notamRemark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotamRemark() {
        return notamRemark;
    }

    /**
     * Sets the value of the notamRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotamRemark(JAXBElement<String> value) {
        this.notamRemark = value;
    }

}
