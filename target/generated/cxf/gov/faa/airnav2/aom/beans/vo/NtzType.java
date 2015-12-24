
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
 * <p>Java class for NtzType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NtzType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="DesignatorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CenterlineDistance" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="LowerMslMeasurement" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="UpperMslMeasurement" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="PurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolygonPoints" type="{http://airnav2.faa.gov/aom/beans/vo}LatLongType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayAssociationListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NtzType", propOrder = {
    "identifier",
    "designatorText",
    "centerlineDistance",
    "lowerMslMeasurement",
    "upperMslMeasurement",
    "purposeCode",
    "typeCode",
    "polygonPoints",
    "runwayAssociationListHolder"
})
public class NtzType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "DesignatorText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designatorText;
    @XmlElementRef(name = "CenterlineDistance", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> centerlineDistance;
    @XmlElementRef(name = "LowerMslMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> lowerMslMeasurement;
    @XmlElementRef(name = "UpperMslMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> upperMslMeasurement;
    @XmlElementRef(name = "PurposeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purposeCode;
    @XmlElementRef(name = "TypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeCode;
    @XmlElement(name = "PolygonPoints")
    protected List<LatLongType> polygonPoints;
    @XmlElement(name = "RunwayAssociationListHolder", nillable = true)
    protected RunwayAssociationListHolderType runwayAssociationListHolder;

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
     * Gets the value of the designatorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignatorText() {
        return designatorText;
    }

    /**
     * Sets the value of the designatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignatorText(JAXBElement<String> value) {
        this.designatorText = value;
    }

    /**
     * Gets the value of the centerlineDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getCenterlineDistance() {
        return centerlineDistance;
    }

    /**
     * Sets the value of the centerlineDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setCenterlineDistance(JAXBElement<DistanceMeasurementType> value) {
        this.centerlineDistance = value;
    }

    /**
     * Gets the value of the lowerMslMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getLowerMslMeasurement() {
        return lowerMslMeasurement;
    }

    /**
     * Sets the value of the lowerMslMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setLowerMslMeasurement(JAXBElement<ElevationMeasurementType> value) {
        this.lowerMslMeasurement = value;
    }

    /**
     * Gets the value of the upperMslMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public JAXBElement<ElevationMeasurementType> getUpperMslMeasurement() {
        return upperMslMeasurement;
    }

    /**
     * Sets the value of the upperMslMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevationMeasurementType }{@code >}
     *     
     */
    public void setUpperMslMeasurement(JAXBElement<ElevationMeasurementType> value) {
        this.upperMslMeasurement = value;
    }

    /**
     * Gets the value of the purposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurposeCode() {
        return purposeCode;
    }

    /**
     * Sets the value of the purposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurposeCode(JAXBElement<String> value) {
        this.purposeCode = value;
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
     * Gets the value of the polygonPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LatLongType }
     * 
     * 
     */
    public List<LatLongType> getPolygonPoints() {
        if (polygonPoints == null) {
            polygonPoints = new ArrayList<LatLongType>();
        }
        return this.polygonPoints;
    }

    /**
     * Gets the value of the runwayAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayAssociationListHolderType }
     *     
     */
    public RunwayAssociationListHolderType getRunwayAssociationListHolder() {
        return runwayAssociationListHolder;
    }

    /**
     * Sets the value of the runwayAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayAssociationListHolderType }
     *     
     */
    public void setRunwayAssociationListHolder(RunwayAssociationListHolderType value) {
        this.runwayAssociationListHolder = value;
    }

}
