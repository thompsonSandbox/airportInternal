
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElevatedLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElevatedLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://airnav2.faa.gov/aom/beans/vo}LatLongType" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://airnav2.faa.gov/aom/beans/vo}LatLongType" minOccurs="0"/>
 *         &lt;element name="EllipsoidElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="PointElevation" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="PointElevationAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="GeoidUndulationDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="PointHorizontalAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="VerticalDatumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerticalAccuracyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HorizontalDatumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AixmEpsgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HorizontalDatumReference" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="HorizontalAccuracyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElevationModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElevationSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EllipsoidSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EllipsoidModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedLocationType", propOrder = {
    "identifier",
    "description",
    "roleCode",
    "surveySource",
    "latitude",
    "longitude",
    "ellipsoidElevation",
    "pointElevation",
    "pointElevationAccuracy",
    "geoidUndulationDistance",
    "pointHorizontalAccuracy",
    "verticalDatumCode",
    "verticalAccuracyCode",
    "horizontalDatumCode",
    "aixmEpsgCode",
    "horizontalDatumReference",
    "horizontalAccuracyCode",
    "elevationModelCode",
    "elevationSourceCode",
    "ellipsoidSourceCode",
    "ellipsoidModelCode"
})
@XmlSeeAlso({
    NavaidRadarPositionType.class
})
public class ElevatedLocationType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "Description", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "RoleCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleCode;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElementRef(name = "Latitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<LatLongType> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<LatLongType> longitude;
    @XmlElementRef(name = "EllipsoidElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> ellipsoidElevation;
    @XmlElementRef(name = "PointElevation", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> pointElevation;
    @XmlElementRef(name = "PointElevationAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> pointElevationAccuracy;
    @XmlElementRef(name = "GeoidUndulationDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> geoidUndulationDistance;
    @XmlElementRef(name = "PointHorizontalAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> pointHorizontalAccuracy;
    @XmlElementRef(name = "VerticalDatumCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verticalDatumCode;
    @XmlElementRef(name = "VerticalAccuracyCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verticalAccuracyCode;
    @XmlElementRef(name = "HorizontalDatumCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horizontalDatumCode;
    @XmlElementRef(name = "AixmEpsgCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aixmEpsgCode;
    @XmlElementRef(name = "HorizontalDatumReference", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> horizontalDatumReference;
    @XmlElementRef(name = "HorizontalAccuracyCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horizontalAccuracyCode;
    @XmlElementRef(name = "ElevationModelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> elevationModelCode;
    @XmlElementRef(name = "ElevationSourceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> elevationSourceCode;
    @XmlElementRef(name = "EllipsoidSourceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ellipsoidSourceCode;
    @XmlElementRef(name = "EllipsoidModelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ellipsoidModelCode;

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
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleCode(JAXBElement<String> value) {
        this.roleCode = value;
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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LatLongType }{@code >}
     *     
     */
    public JAXBElement<LatLongType> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LatLongType }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<LatLongType> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LatLongType }{@code >}
     *     
     */
    public JAXBElement<LatLongType> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LatLongType }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<LatLongType> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the ellipsoidElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getEllipsoidElevation() {
        return ellipsoidElevation;
    }

    /**
     * Sets the value of the ellipsoidElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setEllipsoidElevation(JAXBElement<ElevationMeasurementType> value) {
        this.ellipsoidElevation = value;
    }

    /**
     * Gets the value of the pointElevation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getPointElevation() {
        return pointElevation;
    }

    /**
     * Sets the value of the pointElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setPointElevation(JAXBElement<ElevationMeasurementType> value) {
        this.pointElevation = value;
    }

    /**
     * Gets the value of the pointElevationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getPointElevationAccuracy() {
        return pointElevationAccuracy;
    }

    /**
     * Sets the value of the pointElevationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setPointElevationAccuracy(JAXBElement<DistanceMeasurementType> value) {
        this.pointElevationAccuracy = value;
    }

    /**
     * Gets the value of the geoidUndulationDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getGeoidUndulationDistance() {
        return geoidUndulationDistance;
    }

    /**
     * Sets the value of the geoidUndulationDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setGeoidUndulationDistance(JAXBElement<DistanceMeasurementType> value) {
        this.geoidUndulationDistance = value;
    }

    /**
     * Gets the value of the pointHorizontalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getPointHorizontalAccuracy() {
        return pointHorizontalAccuracy;
    }

    /**
     * Sets the value of the pointHorizontalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setPointHorizontalAccuracy(JAXBElement<DistanceMeasurementType> value) {
        this.pointHorizontalAccuracy = value;
    }

    /**
     * Gets the value of the verticalDatumCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerticalDatumCode() {
        return verticalDatumCode;
    }

    /**
     * Sets the value of the verticalDatumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerticalDatumCode(JAXBElement<String> value) {
        this.verticalDatumCode = value;
    }

    /**
     * Gets the value of the verticalAccuracyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerticalAccuracyCode() {
        return verticalAccuracyCode;
    }

    /**
     * Sets the value of the verticalAccuracyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerticalAccuracyCode(JAXBElement<String> value) {
        this.verticalAccuracyCode = value;
    }

    /**
     * Gets the value of the horizontalDatumCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorizontalDatumCode() {
        return horizontalDatumCode;
    }

    /**
     * Sets the value of the horizontalDatumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorizontalDatumCode(JAXBElement<String> value) {
        this.horizontalDatumCode = value;
    }

    /**
     * Gets the value of the aixmEpsgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAixmEpsgCode() {
        return aixmEpsgCode;
    }

    /**
     * Sets the value of the aixmEpsgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAixmEpsgCode(JAXBElement<String> value) {
        this.aixmEpsgCode = value;
    }

    /**
     * Gets the value of the horizontalDatumReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getHorizontalDatumReference() {
        return horizontalDatumReference;
    }

    /**
     * Sets the value of the horizontalDatumReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setHorizontalDatumReference(JAXBElement<ReferenceDataType> value) {
        this.horizontalDatumReference = value;
    }

    /**
     * Gets the value of the horizontalAccuracyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorizontalAccuracyCode() {
        return horizontalAccuracyCode;
    }

    /**
     * Sets the value of the horizontalAccuracyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorizontalAccuracyCode(JAXBElement<String> value) {
        this.horizontalAccuracyCode = value;
    }

    /**
     * Gets the value of the elevationModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getElevationModelCode() {
        return elevationModelCode;
    }

    /**
     * Sets the value of the elevationModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setElevationModelCode(JAXBElement<String> value) {
        this.elevationModelCode = value;
    }

    /**
     * Gets the value of the elevationSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getElevationSourceCode() {
        return elevationSourceCode;
    }

    /**
     * Sets the value of the elevationSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setElevationSourceCode(JAXBElement<String> value) {
        this.elevationSourceCode = value;
    }

    /**
     * Gets the value of the ellipsoidSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEllipsoidSourceCode() {
        return ellipsoidSourceCode;
    }

    /**
     * Sets the value of the ellipsoidSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEllipsoidSourceCode(JAXBElement<String> value) {
        this.ellipsoidSourceCode = value;
    }

    /**
     * Gets the value of the ellipsoidModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEllipsoidModelCode() {
        return ellipsoidModelCode;
    }

    /**
     * Sets the value of the ellipsoidModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEllipsoidModelCode(JAXBElement<String> value) {
        this.ellipsoidModelCode = value;
    }

}
