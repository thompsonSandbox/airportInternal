
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunwayCenterlinePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayCenterlinePointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemporaryDisplacedThresholdIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocation" minOccurs="0"/>
 *         &lt;element name="DisplacedThresholdMeasurement" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayDeclaredDistanceListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayCenterlinePointType", propOrder = {
    "identifier",
    "description",
    "temporaryDisplacedThresholdIndicator",
    "pointRoleCode",
    "elevatedLocation",
    "displacedThresholdMeasurement",
    "runwayDeclaredDistanceListHolder"
})
public class RunwayCenterlinePointType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "Description", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "TemporaryDisplacedThresholdIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryDisplacedThresholdIndicator;
    @XmlElementRef(name = "PointRoleCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointRoleCode;
    @XmlElement(name = "ElevatedLocation", nillable = true)
    protected ElevatedLocationType elevatedLocation;
    @XmlElementRef(name = "DisplacedThresholdMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> displacedThresholdMeasurement;
    @XmlElement(name = "RunwayDeclaredDistanceListHolder", nillable = true)
    protected RunwayDeclaredDistanceListHolderType runwayDeclaredDistanceListHolder;

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
     * Gets the value of the temporaryDisplacedThresholdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemporaryDisplacedThresholdIndicator() {
        return temporaryDisplacedThresholdIndicator;
    }

    /**
     * Sets the value of the temporaryDisplacedThresholdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemporaryDisplacedThresholdIndicator(JAXBElement<String> value) {
        this.temporaryDisplacedThresholdIndicator = value;
    }

    /**
     * Gets the value of the pointRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointRoleCode() {
        return pointRoleCode;
    }

    /**
     * Sets the value of the pointRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointRoleCode(JAXBElement<String> value) {
        this.pointRoleCode = value;
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
     * Gets the value of the displacedThresholdMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getDisplacedThresholdMeasurement() {
        return displacedThresholdMeasurement;
    }

    /**
     * Sets the value of the displacedThresholdMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setDisplacedThresholdMeasurement(JAXBElement<DistanceMeasurementType> value) {
        this.displacedThresholdMeasurement = value;
    }

    /**
     * Gets the value of the runwayDeclaredDistanceListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDeclaredDistanceListHolderType }
     *     
     */
    public RunwayDeclaredDistanceListHolderType getRunwayDeclaredDistanceListHolder() {
        return runwayDeclaredDistanceListHolder;
    }

    /**
     * Sets the value of the runwayDeclaredDistanceListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDeclaredDistanceListHolderType }
     *     
     */
    public void setRunwayDeclaredDistanceListHolder(RunwayDeclaredDistanceListHolderType value) {
        this.runwayDeclaredDistanceListHolder = value;
    }

}
