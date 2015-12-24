
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckpointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckpointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="RadialAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerticalReferenceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportCheckpointListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckpointType", propOrder = {
    "identifier",
    "description",
    "altitude",
    "distance",
    "radialAngle",
    "typeCode",
    "verticalReferenceTypeCode",
    "surveySource",
    "position",
    "airportCheckpointListHolder"
})
public class CheckpointType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "Description", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Altitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> altitude;
    @XmlElementRef(name = "Distance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> distance;
    @XmlElementRef(name = "RadialAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radialAngle;
    @XmlElementRef(name = "TypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeCode;
    @XmlElementRef(name = "VerticalReferenceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verticalReferenceTypeCode;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElementRef(name = "Position", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> position;
    @XmlElement(name = "AirportCheckpointListHolder", nillable = true)
    protected AirportCheckpointListHolderType airportCheckpointListHolder;

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
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<ElevationMeasurementType> value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<DistanceMeasurementType> value) {
        this.distance = value;
    }

    /**
     * Gets the value of the radialAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadialAngle() {
        return radialAngle;
    }

    /**
     * Sets the value of the radialAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadialAngle(JAXBElement<Double> value) {
        this.radialAngle = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeCode(JAXBElement<String> value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the verticalReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerticalReferenceTypeCode() {
        return verticalReferenceTypeCode;
    }

    /**
     * Sets the value of the verticalReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerticalReferenceTypeCode(JAXBElement<String> value) {
        this.verticalReferenceTypeCode = value;
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
     * Gets the value of the airportCheckpointListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportCheckpointListHolderType }
     *     
     */
    public AirportCheckpointListHolderType getAirportCheckpointListHolder() {
        return airportCheckpointListHolder;
    }

    /**
     * Sets the value of the airportCheckpointListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportCheckpointListHolderType }
     *     
     */
    public void setAirportCheckpointListHolder(AirportCheckpointListHolderType value) {
        this.airportCheckpointListHolder = value;
    }

}
