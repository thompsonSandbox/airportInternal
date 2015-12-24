
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidComponentDistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentDistanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="Distance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="Accuracy" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="DistanceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidUse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentDistanceType", propOrder = {
    "identifier",
    "distance",
    "accuracy",
    "distanceTypeCode",
    "surveySource",
    "navaidUse"
})
public class NavaidComponentDistanceType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "Distance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> distance;
    @XmlElementRef(name = "Accuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> accuracy;
    @XmlElementRef(name = "DistanceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceTypeCode;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "NavaidUse", nillable = true)
    protected NavaidUseType navaidUse;

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
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setAccuracy(JAXBElement<DistanceMeasurementType> value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the distanceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceTypeCode() {
        return distanceTypeCode;
    }

    /**
     * Sets the value of the distanceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceTypeCode(JAXBElement<String> value) {
        this.distanceTypeCode = value;
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
     * Gets the value of the navaidUse property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidUseType }
     *     
     */
    public NavaidUseType getNavaidUse() {
        return navaidUse;
    }

    /**
     * Sets the value of the navaidUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidUseType }
     *     
     */
    public void setNavaidUse(NavaidUseType value) {
        this.navaidUse = value;
    }

}
