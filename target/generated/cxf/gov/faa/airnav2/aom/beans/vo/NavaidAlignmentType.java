
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NavaidAlignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidAlignmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AlignmentRadial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AlignmentRadialStart" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="AlignmentRadialEnd" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://airnav2.faa.gov/aom/beans/vo}ElevationMeasurementType" minOccurs="0"/>
 *         &lt;element name="T1AlignmentRadialNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="T2AlignmentRadialNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}OrbitListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidAlignmentType", propOrder = {
    "identifier",
    "arrDate",
    "alignmentRadial",
    "alignmentRadialStart",
    "alignmentRadialEnd",
    "altitude",
    "t1AlignmentRadialNumber",
    "t2AlignmentRadialNumber",
    "orbitListHolder"
})
public class NavaidAlignmentType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "ArrDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> arrDate;
    @XmlElementRef(name = "AlignmentRadial", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> alignmentRadial;
    @XmlElementRef(name = "AlignmentRadialStart", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> alignmentRadialStart;
    @XmlElementRef(name = "AlignmentRadialEnd", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> alignmentRadialEnd;
    @XmlElementRef(name = "Altitude", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevationMeasurementType> altitude;
    @XmlElementRef(name = "T1AlignmentRadialNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> t1AlignmentRadialNumber;
    @XmlElementRef(name = "T2AlignmentRadialNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> t2AlignmentRadialNumber;
    @XmlElement(name = "OrbitListHolder", nillable = true)
    protected OrbitListHolderType orbitListHolder;

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
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setArrDate(JAXBElement<XMLGregorianCalendar> value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the alignmentRadial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAlignmentRadial() {
        return alignmentRadial;
    }

    /**
     * Sets the value of the alignmentRadial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAlignmentRadial(JAXBElement<Double> value) {
        this.alignmentRadial = value;
    }

    /**
     * Gets the value of the alignmentRadialStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getAlignmentRadialStart() {
        return alignmentRadialStart;
    }

    /**
     * Sets the value of the alignmentRadialStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setAlignmentRadialStart(JAXBElement<DistanceMeasurementType> value) {
        this.alignmentRadialStart = value;
    }

    /**
     * Gets the value of the alignmentRadialEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getAlignmentRadialEnd() {
        return alignmentRadialEnd;
    }

    /**
     * Sets the value of the alignmentRadialEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setAlignmentRadialEnd(JAXBElement<DistanceMeasurementType> value) {
        this.alignmentRadialEnd = value;
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
     * Gets the value of the t1AlignmentRadialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getT1AlignmentRadialNumber() {
        return t1AlignmentRadialNumber;
    }

    /**
     * Sets the value of the t1AlignmentRadialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setT1AlignmentRadialNumber(JAXBElement<Double> value) {
        this.t1AlignmentRadialNumber = value;
    }

    /**
     * Gets the value of the t2AlignmentRadialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getT2AlignmentRadialNumber() {
        return t2AlignmentRadialNumber;
    }

    /**
     * Sets the value of the t2AlignmentRadialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setT2AlignmentRadialNumber(JAXBElement<Double> value) {
        this.t2AlignmentRadialNumber = value;
    }

    /**
     * Gets the value of the orbitListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link OrbitListHolderType }
     *     
     */
    public OrbitListHolderType getOrbitListHolder() {
        return orbitListHolder;
    }

    /**
     * Sets the value of the orbitListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrbitListHolderType }
     *     
     */
    public void setOrbitListHolder(OrbitListHolderType value) {
        this.orbitListHolder = value;
    }

}
