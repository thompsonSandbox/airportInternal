
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportRunwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportRunwayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}RunwayType">
 *       &lt;sequence>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirnavAirportIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportWorkflowModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportPublicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportPublicationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportProductionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurfaceCompositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurfaceConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportRunwayType", propOrder = {
    "airportName",
    "airnavAirportIdentifier",
    "airportTypeCode",
    "airportWorkflowModelCode",
    "airportPublicationDate",
    "airportPublicationEndDate",
    "airportProductionStatus",
    "airportUUID",
    "airportRevisionNumber",
    "surfaceCompositionCode",
    "surfaceConditionCode"
})
public class AirportRunwayType
    extends RunwayType
{

    @XmlElementRef(name = "AirportName", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportName;
    @XmlElementRef(name = "AirnavAirportIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airnavAirportIdentifier;
    @XmlElementRef(name = "AirportTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportTypeCode;
    @XmlElementRef(name = "AirportWorkflowModelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportWorkflowModelCode;
    @XmlElementRef(name = "AirportPublicationDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportPublicationDate;
    @XmlElementRef(name = "AirportPublicationEndDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportPublicationEndDate;
    @XmlElementRef(name = "AirportProductionStatus", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportProductionStatus;
    @XmlElementRef(name = "AirportUUID", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportUUID;
    @XmlElementRef(name = "AirportRevisionNumber", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportRevisionNumber;
    @XmlElementRef(name = "SurfaceCompositionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surfaceCompositionCode;
    @XmlElementRef(name = "SurfaceConditionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surfaceConditionCode;

    /**
     * Gets the value of the airportName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportName() {
        return airportName;
    }

    /**
     * Sets the value of the airportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportName(JAXBElement<String> value) {
        this.airportName = value;
    }

    /**
     * Gets the value of the airnavAirportIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirnavAirportIdentifier() {
        return airnavAirportIdentifier;
    }

    /**
     * Sets the value of the airnavAirportIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirnavAirportIdentifier(JAXBElement<String> value) {
        this.airnavAirportIdentifier = value;
    }

    /**
     * Gets the value of the airportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportTypeCode() {
        return airportTypeCode;
    }

    /**
     * Sets the value of the airportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportTypeCode(JAXBElement<String> value) {
        this.airportTypeCode = value;
    }

    /**
     * Gets the value of the airportWorkflowModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportWorkflowModelCode() {
        return airportWorkflowModelCode;
    }

    /**
     * Sets the value of the airportWorkflowModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportWorkflowModelCode(JAXBElement<String> value) {
        this.airportWorkflowModelCode = value;
    }

    /**
     * Gets the value of the airportPublicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportPublicationDate() {
        return airportPublicationDate;
    }

    /**
     * Sets the value of the airportPublicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportPublicationDate(JAXBElement<String> value) {
        this.airportPublicationDate = value;
    }

    /**
     * Gets the value of the airportPublicationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportPublicationEndDate() {
        return airportPublicationEndDate;
    }

    /**
     * Sets the value of the airportPublicationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportPublicationEndDate(JAXBElement<String> value) {
        this.airportPublicationEndDate = value;
    }

    /**
     * Gets the value of the airportProductionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportProductionStatus() {
        return airportProductionStatus;
    }

    /**
     * Sets the value of the airportProductionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportProductionStatus(JAXBElement<String> value) {
        this.airportProductionStatus = value;
    }

    /**
     * Gets the value of the airportUUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportUUID() {
        return airportUUID;
    }

    /**
     * Sets the value of the airportUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportUUID(JAXBElement<String> value) {
        this.airportUUID = value;
    }

    /**
     * Gets the value of the airportRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportRevisionNumber() {
        return airportRevisionNumber;
    }

    /**
     * Sets the value of the airportRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportRevisionNumber(JAXBElement<String> value) {
        this.airportRevisionNumber = value;
    }

    /**
     * Gets the value of the surfaceCompositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurfaceCompositionCode() {
        return surfaceCompositionCode;
    }

    /**
     * Sets the value of the surfaceCompositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurfaceCompositionCode(JAXBElement<String> value) {
        this.surfaceCompositionCode = value;
    }

    /**
     * Gets the value of the surfaceConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurfaceConditionCode() {
        return surfaceConditionCode;
    }

    /**
     * Sets the value of the surfaceConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurfaceConditionCode(JAXBElement<String> value) {
        this.surfaceConditionCode = value;
    }

}
