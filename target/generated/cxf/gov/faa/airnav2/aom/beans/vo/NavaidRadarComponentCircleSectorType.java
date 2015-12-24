
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidRadarComponentCircleSectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidRadarComponentCircleSectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="AzimuthFromAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AzimuthToAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DegreesAboveAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DegreesBelowAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DegreesRightAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DegreesLeftAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WithinDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BeyondDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AltitudeAbove" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AltitudeBelow" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DmeBeyond" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DmeWithin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DistanceWithinBeyondUomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltitudeAboveBelowUomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DmeDistanceWithinBeyondUomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AngleDirectionReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArcDirectionReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BearingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltitudeAboveVerticalReferenceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltitudeBelowVerticalReferenceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidRadarComponentCircleSectorType", propOrder = {
    "identifier",
    "azimuthFromAngle",
    "azimuthToAngle",
    "degreesAboveAngle",
    "degreesBelowAngle",
    "degreesRightAngle",
    "degreesLeftAngle",
    "withinDistance",
    "beyondDistance",
    "altitudeAbove",
    "altitudeBelow",
    "dmeBeyond",
    "dmeWithin",
    "distanceWithinBeyondUomCode",
    "altitudeAboveBelowUomCode",
    "dmeDistanceWithinBeyondUomCode",
    "angleDirectionReferenceCode",
    "arcDirectionReferenceCode",
    "bearingTypeCode",
    "altitudeAboveVerticalReferenceTypeCode",
    "altitudeBelowVerticalReferenceTypeCode"
})
public class NavaidRadarComponentCircleSectorType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "AzimuthFromAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> azimuthFromAngle;
    @XmlElementRef(name = "AzimuthToAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> azimuthToAngle;
    @XmlElementRef(name = "DegreesAboveAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> degreesAboveAngle;
    @XmlElementRef(name = "DegreesBelowAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> degreesBelowAngle;
    @XmlElementRef(name = "DegreesRightAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> degreesRightAngle;
    @XmlElementRef(name = "DegreesLeftAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> degreesLeftAngle;
    @XmlElementRef(name = "WithinDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> withinDistance;
    @XmlElementRef(name = "BeyondDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> beyondDistance;
    @XmlElementRef(name = "AltitudeAbove", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> altitudeAbove;
    @XmlElementRef(name = "AltitudeBelow", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> altitudeBelow;
    @XmlElementRef(name = "DmeBeyond", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dmeBeyond;
    @XmlElementRef(name = "DmeWithin", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dmeWithin;
    @XmlElementRef(name = "DistanceWithinBeyondUomCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceWithinBeyondUomCode;
    @XmlElementRef(name = "AltitudeAboveBelowUomCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altitudeAboveBelowUomCode;
    @XmlElementRef(name = "DmeDistanceWithinBeyondUomCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmeDistanceWithinBeyondUomCode;
    @XmlElementRef(name = "AngleDirectionReferenceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> angleDirectionReferenceCode;
    @XmlElementRef(name = "ArcDirectionReferenceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arcDirectionReferenceCode;
    @XmlElementRef(name = "BearingTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bearingTypeCode;
    @XmlElementRef(name = "AltitudeAboveVerticalReferenceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altitudeAboveVerticalReferenceTypeCode;
    @XmlElementRef(name = "AltitudeBelowVerticalReferenceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altitudeBelowVerticalReferenceTypeCode;

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
     * Gets the value of the azimuthFromAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAzimuthFromAngle() {
        return azimuthFromAngle;
    }

    /**
     * Sets the value of the azimuthFromAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAzimuthFromAngle(JAXBElement<Double> value) {
        this.azimuthFromAngle = value;
    }

    /**
     * Gets the value of the azimuthToAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAzimuthToAngle() {
        return azimuthToAngle;
    }

    /**
     * Sets the value of the azimuthToAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAzimuthToAngle(JAXBElement<Double> value) {
        this.azimuthToAngle = value;
    }

    /**
     * Gets the value of the degreesAboveAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDegreesAboveAngle() {
        return degreesAboveAngle;
    }

    /**
     * Sets the value of the degreesAboveAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDegreesAboveAngle(JAXBElement<Double> value) {
        this.degreesAboveAngle = value;
    }

    /**
     * Gets the value of the degreesBelowAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDegreesBelowAngle() {
        return degreesBelowAngle;
    }

    /**
     * Sets the value of the degreesBelowAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDegreesBelowAngle(JAXBElement<Double> value) {
        this.degreesBelowAngle = value;
    }

    /**
     * Gets the value of the degreesRightAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDegreesRightAngle() {
        return degreesRightAngle;
    }

    /**
     * Sets the value of the degreesRightAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDegreesRightAngle(JAXBElement<Double> value) {
        this.degreesRightAngle = value;
    }

    /**
     * Gets the value of the degreesLeftAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDegreesLeftAngle() {
        return degreesLeftAngle;
    }

    /**
     * Sets the value of the degreesLeftAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDegreesLeftAngle(JAXBElement<Double> value) {
        this.degreesLeftAngle = value;
    }

    /**
     * Gets the value of the withinDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getWithinDistance() {
        return withinDistance;
    }

    /**
     * Sets the value of the withinDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setWithinDistance(JAXBElement<Double> value) {
        this.withinDistance = value;
    }

    /**
     * Gets the value of the beyondDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBeyondDistance() {
        return beyondDistance;
    }

    /**
     * Sets the value of the beyondDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBeyondDistance(JAXBElement<Double> value) {
        this.beyondDistance = value;
    }

    /**
     * Gets the value of the altitudeAbove property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAltitudeAbove() {
        return altitudeAbove;
    }

    /**
     * Sets the value of the altitudeAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAltitudeAbove(JAXBElement<Double> value) {
        this.altitudeAbove = value;
    }

    /**
     * Gets the value of the altitudeBelow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAltitudeBelow() {
        return altitudeBelow;
    }

    /**
     * Sets the value of the altitudeBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAltitudeBelow(JAXBElement<Double> value) {
        this.altitudeBelow = value;
    }

    /**
     * Gets the value of the dmeBeyond property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDmeBeyond() {
        return dmeBeyond;
    }

    /**
     * Sets the value of the dmeBeyond property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDmeBeyond(JAXBElement<Double> value) {
        this.dmeBeyond = value;
    }

    /**
     * Gets the value of the dmeWithin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDmeWithin() {
        return dmeWithin;
    }

    /**
     * Sets the value of the dmeWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDmeWithin(JAXBElement<Double> value) {
        this.dmeWithin = value;
    }

    /**
     * Gets the value of the distanceWithinBeyondUomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceWithinBeyondUomCode() {
        return distanceWithinBeyondUomCode;
    }

    /**
     * Sets the value of the distanceWithinBeyondUomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceWithinBeyondUomCode(JAXBElement<String> value) {
        this.distanceWithinBeyondUomCode = value;
    }

    /**
     * Gets the value of the altitudeAboveBelowUomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltitudeAboveBelowUomCode() {
        return altitudeAboveBelowUomCode;
    }

    /**
     * Sets the value of the altitudeAboveBelowUomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltitudeAboveBelowUomCode(JAXBElement<String> value) {
        this.altitudeAboveBelowUomCode = value;
    }

    /**
     * Gets the value of the dmeDistanceWithinBeyondUomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmeDistanceWithinBeyondUomCode() {
        return dmeDistanceWithinBeyondUomCode;
    }

    /**
     * Sets the value of the dmeDistanceWithinBeyondUomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmeDistanceWithinBeyondUomCode(JAXBElement<String> value) {
        this.dmeDistanceWithinBeyondUomCode = value;
    }

    /**
     * Gets the value of the angleDirectionReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAngleDirectionReferenceCode() {
        return angleDirectionReferenceCode;
    }

    /**
     * Sets the value of the angleDirectionReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAngleDirectionReferenceCode(JAXBElement<String> value) {
        this.angleDirectionReferenceCode = value;
    }

    /**
     * Gets the value of the arcDirectionReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArcDirectionReferenceCode() {
        return arcDirectionReferenceCode;
    }

    /**
     * Sets the value of the arcDirectionReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArcDirectionReferenceCode(JAXBElement<String> value) {
        this.arcDirectionReferenceCode = value;
    }

    /**
     * Gets the value of the bearingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBearingTypeCode() {
        return bearingTypeCode;
    }

    /**
     * Sets the value of the bearingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBearingTypeCode(JAXBElement<String> value) {
        this.bearingTypeCode = value;
    }

    /**
     * Gets the value of the altitudeAboveVerticalReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltitudeAboveVerticalReferenceTypeCode() {
        return altitudeAboveVerticalReferenceTypeCode;
    }

    /**
     * Sets the value of the altitudeAboveVerticalReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltitudeAboveVerticalReferenceTypeCode(JAXBElement<String> value) {
        this.altitudeAboveVerticalReferenceTypeCode = value;
    }

    /**
     * Gets the value of the altitudeBelowVerticalReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltitudeBelowVerticalReferenceTypeCode() {
        return altitudeBelowVerticalReferenceTypeCode;
    }

    /**
     * Sets the value of the altitudeBelowVerticalReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltitudeBelowVerticalReferenceTypeCode(JAXBElement<String> value) {
        this.altitudeBelowVerticalReferenceTypeCode = value;
    }

}
