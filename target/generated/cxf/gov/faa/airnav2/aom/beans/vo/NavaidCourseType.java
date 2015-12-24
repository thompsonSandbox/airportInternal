
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidCourseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="BackCourseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TailoredCourseWidthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseWidthAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CourseWidthAngleAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TrueBearing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TrueBearingAccuracy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LeftProportionalAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RightProportionalAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LeftCoverAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RightCoverAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AlignFromAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AlignToAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MonitorWideAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MonitorNarrowAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MmlsInboundBrgActualThToAz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MmlsInboundBrgMapToAz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CourseWidth" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="UsableAltitude" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="UsableDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="IlsBackCourseStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidCourseType", propOrder = {
    "identifier",
    "backCourseIndicator",
    "tailoredCourseWidthIndicator",
    "courseWidthAngle",
    "courseWidthAngleAccuracy",
    "trueBearing",
    "trueBearingAccuracy",
    "leftProportionalAngle",
    "rightProportionalAngle",
    "leftCoverAngle",
    "rightCoverAngle",
    "alignFromAngle",
    "alignToAngle",
    "monitorWideAngle",
    "monitorNarrowAngle",
    "mmlsInboundBrgActualThToAz",
    "mmlsInboundBrgMapToAz",
    "courseWidth",
    "usableAltitude",
    "usableDistance",
    "ilsBackCourseStatusCode"
})
public class NavaidCourseType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "BackCourseIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backCourseIndicator;
    @XmlElementRef(name = "TailoredCourseWidthIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tailoredCourseWidthIndicator;
    @XmlElementRef(name = "CourseWidthAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> courseWidthAngle;
    @XmlElementRef(name = "CourseWidthAngleAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> courseWidthAngleAccuracy;
    @XmlElementRef(name = "TrueBearing", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> trueBearing;
    @XmlElementRef(name = "TrueBearingAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> trueBearingAccuracy;
    @XmlElementRef(name = "LeftProportionalAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> leftProportionalAngle;
    @XmlElementRef(name = "RightProportionalAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rightProportionalAngle;
    @XmlElementRef(name = "LeftCoverAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> leftCoverAngle;
    @XmlElementRef(name = "RightCoverAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rightCoverAngle;
    @XmlElementRef(name = "AlignFromAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> alignFromAngle;
    @XmlElementRef(name = "AlignToAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> alignToAngle;
    @XmlElementRef(name = "MonitorWideAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> monitorWideAngle;
    @XmlElementRef(name = "MonitorNarrowAngle", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> monitorNarrowAngle;
    @XmlElementRef(name = "MmlsInboundBrgActualThToAz", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mmlsInboundBrgActualThToAz;
    @XmlElementRef(name = "MmlsInboundBrgMapToAz", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mmlsInboundBrgMapToAz;
    @XmlElementRef(name = "CourseWidth", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> courseWidth;
    @XmlElementRef(name = "UsableAltitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> usableAltitude;
    @XmlElementRef(name = "UsableDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> usableDistance;
    @XmlElementRef(name = "IlsBackCourseStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ilsBackCourseStatusCode;

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
     * Gets the value of the backCourseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackCourseIndicator() {
        return backCourseIndicator;
    }

    /**
     * Sets the value of the backCourseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackCourseIndicator(JAXBElement<String> value) {
        this.backCourseIndicator = value;
    }

    /**
     * Gets the value of the tailoredCourseWidthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTailoredCourseWidthIndicator() {
        return tailoredCourseWidthIndicator;
    }

    /**
     * Sets the value of the tailoredCourseWidthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTailoredCourseWidthIndicator(JAXBElement<String> value) {
        this.tailoredCourseWidthIndicator = value;
    }

    /**
     * Gets the value of the courseWidthAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCourseWidthAngle() {
        return courseWidthAngle;
    }

    /**
     * Sets the value of the courseWidthAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCourseWidthAngle(JAXBElement<Double> value) {
        this.courseWidthAngle = value;
    }

    /**
     * Gets the value of the courseWidthAngleAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCourseWidthAngleAccuracy() {
        return courseWidthAngleAccuracy;
    }

    /**
     * Sets the value of the courseWidthAngleAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCourseWidthAngleAccuracy(JAXBElement<Double> value) {
        this.courseWidthAngleAccuracy = value;
    }

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
     * Gets the value of the leftProportionalAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLeftProportionalAngle() {
        return leftProportionalAngle;
    }

    /**
     * Sets the value of the leftProportionalAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLeftProportionalAngle(JAXBElement<Double> value) {
        this.leftProportionalAngle = value;
    }

    /**
     * Gets the value of the rightProportionalAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRightProportionalAngle() {
        return rightProportionalAngle;
    }

    /**
     * Sets the value of the rightProportionalAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRightProportionalAngle(JAXBElement<Double> value) {
        this.rightProportionalAngle = value;
    }

    /**
     * Gets the value of the leftCoverAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLeftCoverAngle() {
        return leftCoverAngle;
    }

    /**
     * Sets the value of the leftCoverAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLeftCoverAngle(JAXBElement<Double> value) {
        this.leftCoverAngle = value;
    }

    /**
     * Gets the value of the rightCoverAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRightCoverAngle() {
        return rightCoverAngle;
    }

    /**
     * Sets the value of the rightCoverAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRightCoverAngle(JAXBElement<Double> value) {
        this.rightCoverAngle = value;
    }

    /**
     * Gets the value of the alignFromAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAlignFromAngle() {
        return alignFromAngle;
    }

    /**
     * Sets the value of the alignFromAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAlignFromAngle(JAXBElement<Double> value) {
        this.alignFromAngle = value;
    }

    /**
     * Gets the value of the alignToAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAlignToAngle() {
        return alignToAngle;
    }

    /**
     * Sets the value of the alignToAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAlignToAngle(JAXBElement<Double> value) {
        this.alignToAngle = value;
    }

    /**
     * Gets the value of the monitorWideAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMonitorWideAngle() {
        return monitorWideAngle;
    }

    /**
     * Sets the value of the monitorWideAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMonitorWideAngle(JAXBElement<Double> value) {
        this.monitorWideAngle = value;
    }

    /**
     * Gets the value of the monitorNarrowAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMonitorNarrowAngle() {
        return monitorNarrowAngle;
    }

    /**
     * Sets the value of the monitorNarrowAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMonitorNarrowAngle(JAXBElement<Double> value) {
        this.monitorNarrowAngle = value;
    }

    /**
     * Gets the value of the mmlsInboundBrgActualThToAz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMmlsInboundBrgActualThToAz() {
        return mmlsInboundBrgActualThToAz;
    }

    /**
     * Sets the value of the mmlsInboundBrgActualThToAz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMmlsInboundBrgActualThToAz(JAXBElement<Double> value) {
        this.mmlsInboundBrgActualThToAz = value;
    }

    /**
     * Gets the value of the mmlsInboundBrgMapToAz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMmlsInboundBrgMapToAz() {
        return mmlsInboundBrgMapToAz;
    }

    /**
     * Sets the value of the mmlsInboundBrgMapToAz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMmlsInboundBrgMapToAz(JAXBElement<Double> value) {
        this.mmlsInboundBrgMapToAz = value;
    }

    /**
     * Gets the value of the courseWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getCourseWidth() {
        return courseWidth;
    }

    /**
     * Sets the value of the courseWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setCourseWidth(JAXBElement<DistanceMeasurementType> value) {
        this.courseWidth = value;
    }

    /**
     * Gets the value of the usableAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getUsableAltitude() {
        return usableAltitude;
    }

    /**
     * Sets the value of the usableAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setUsableAltitude(JAXBElement<ElevationMeasurementType> value) {
        this.usableAltitude = value;
    }

    /**
     * Gets the value of the usableDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getUsableDistance() {
        return usableDistance;
    }

    /**
     * Sets the value of the usableDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setUsableDistance(JAXBElement<DistanceMeasurementType> value) {
        this.usableDistance = value;
    }

    /**
     * Gets the value of the ilsBackCourseStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIlsBackCourseStatusCode() {
        return ilsBackCourseStatusCode;
    }

    /**
     * Sets the value of the ilsBackCourseStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIlsBackCourseStatusCode(JAXBElement<String> value) {
        this.ilsBackCourseStatusCode = value;
    }

}
