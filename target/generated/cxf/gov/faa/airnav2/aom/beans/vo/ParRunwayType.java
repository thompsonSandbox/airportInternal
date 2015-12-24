
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParRunwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParRunwayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="GlideslopeExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RpiTchCalculationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element name="AntennaOffsetDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="GpiThresholdDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="GpiPosition" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="TchElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="RpiElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="RpiThresholdDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="RpiPosition" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element name="GlideslopeAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GlideslopeAngleAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SequenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwayUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwayRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ParRunwayType", propOrder = {
    "identifier",
    "glideslopeExistsIndicator",
    "rpiTchCalculationIndicator",
    "surveySource",
    "antennaOffsetDistance",
    "gpiThresholdDistance",
    "gpiPosition",
    "tchElevation",
    "rpiElevation",
    "rpiThresholdDistance",
    "rpiPosition",
    "glideslopeAngle",
    "glideslopeAngleAccuracy",
    "sequenceId",
    "runwayUUID",
    "runwayRevisionNumber"
})
public class ParRunwayType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "GlideslopeExistsIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> glideslopeExistsIndicator;
    @XmlElementRef(name = "RpiTchCalculationIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rpiTchCalculationIndicator;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElementRef(name = "AntennaOffsetDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> antennaOffsetDistance;
    @XmlElementRef(name = "GpiThresholdDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> gpiThresholdDistance;
    @XmlElementRef(name = "GpiPosition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> gpiPosition;
    @XmlElementRef(name = "TchElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> tchElevation;
    @XmlElementRef(name = "RpiElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> rpiElevation;
    @XmlElementRef(name = "RpiThresholdDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> rpiThresholdDistance;
    @XmlElementRef(name = "RpiPosition", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> rpiPosition;
    @XmlElementRef(name = "GlideslopeAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> glideslopeAngle;
    @XmlElementRef(name = "GlideslopeAngleAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> glideslopeAngleAccuracy;
    @XmlElementRef(name = "SequenceId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequenceId;
    @XmlElementRef(name = "RunwayUUID", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> runwayUUID;
    @XmlElementRef(name = "RunwayRevisionNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> runwayRevisionNumber;
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
     * Gets the value of the glideslopeExistsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlideslopeExistsIndicator() {
        return glideslopeExistsIndicator;
    }

    /**
     * Sets the value of the glideslopeExistsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlideslopeExistsIndicator(JAXBElement<String> value) {
        this.glideslopeExistsIndicator = value;
    }

    /**
     * Gets the value of the rpiTchCalculationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRpiTchCalculationIndicator() {
        return rpiTchCalculationIndicator;
    }

    /**
     * Sets the value of the rpiTchCalculationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRpiTchCalculationIndicator(JAXBElement<String> value) {
        this.rpiTchCalculationIndicator = value;
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
     * Gets the value of the antennaOffsetDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getAntennaOffsetDistance() {
        return antennaOffsetDistance;
    }

    /**
     * Sets the value of the antennaOffsetDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setAntennaOffsetDistance(JAXBElement<DistanceMeasurementType> value) {
        this.antennaOffsetDistance = value;
    }

    /**
     * Gets the value of the gpiThresholdDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getGpiThresholdDistance() {
        return gpiThresholdDistance;
    }

    /**
     * Sets the value of the gpiThresholdDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setGpiThresholdDistance(JAXBElement<DistanceMeasurementType> value) {
        this.gpiThresholdDistance = value;
    }

    /**
     * Gets the value of the gpiPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getGpiPosition() {
        return gpiPosition;
    }

    /**
     * Sets the value of the gpiPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setGpiPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.gpiPosition = value;
    }

    /**
     * Gets the value of the tchElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getTchElevation() {
        return tchElevation;
    }

    /**
     * Sets the value of the tchElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setTchElevation(JAXBElement<ElevationMeasurementType> value) {
        this.tchElevation = value;
    }

    /**
     * Gets the value of the rpiElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getRpiElevation() {
        return rpiElevation;
    }

    /**
     * Sets the value of the rpiElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setRpiElevation(JAXBElement<ElevationMeasurementType> value) {
        this.rpiElevation = value;
    }

    /**
     * Gets the value of the rpiThresholdDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getRpiThresholdDistance() {
        return rpiThresholdDistance;
    }

    /**
     * Sets the value of the rpiThresholdDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setRpiThresholdDistance(JAXBElement<DistanceMeasurementType> value) {
        this.rpiThresholdDistance = value;
    }

    /**
     * Gets the value of the rpiPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getRpiPosition() {
        return rpiPosition;
    }

    /**
     * Sets the value of the rpiPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setRpiPosition(JAXBElement<NavaidRadarPositionType> value) {
        this.rpiPosition = value;
    }

    /**
     * Gets the value of the glideslopeAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGlideslopeAngle() {
        return glideslopeAngle;
    }

    /**
     * Sets the value of the glideslopeAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGlideslopeAngle(JAXBElement<Double> value) {
        this.glideslopeAngle = value;
    }

    /**
     * Gets the value of the glideslopeAngleAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGlideslopeAngleAccuracy() {
        return glideslopeAngleAccuracy;
    }

    /**
     * Sets the value of the glideslopeAngleAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGlideslopeAngleAccuracy(JAXBElement<Double> value) {
        this.glideslopeAngleAccuracy = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequenceId(JAXBElement<String> value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the runwayUUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRunwayUUID() {
        return runwayUUID;
    }

    /**
     * Sets the value of the runwayUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRunwayUUID(JAXBElement<String> value) {
        this.runwayUUID = value;
    }

    /**
     * Gets the value of the runwayRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRunwayRevisionNumber() {
        return runwayRevisionNumber;
    }

    /**
     * Sets the value of the runwayRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRunwayRevisionNumber(JAXBElement<Integer> value) {
        this.runwayRevisionNumber = value;
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
