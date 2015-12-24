
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TemporalModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractSystemAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}VersionIdentifierType"/>
 *         &lt;element name="WorkflowModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PublicationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CanceledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalModelType", propOrder = {
    "identifier",
    "workflowModelCode",
    "productionStatusCode",
    "publicationDate",
    "publicationEndDate",
    "canceledDate"
})
@XmlSeeAlso({
    AirportType.class,
    LandingStripReferenceType.class,
    NavaidComponentType.class,
    WeatherSourceType.class,
    MonitorType.class,
    AirportReferenceType.class,
    LightingSystemType.class,
    NavaidReferenceType.class,
    NavaidSystemType.class,
    LandingStripType.class,
    RadarComponentType.class,
    RunwayType.class,
    RadarReferenceType.class,
    MonitorReferenceType.class,
    RadarSystemType.class
})
public abstract class TemporalModelType
    extends AbstractSystemAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected VersionIdentifierType identifier;
    @XmlElementRef(name = "WorkflowModelCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowModelCode;
    @XmlElementRef(name = "ProductionStatusCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productionStatusCode;
    @XmlElementRef(name = "PublicationDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> publicationDate;
    @XmlElementRef(name = "PublicationEndDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> publicationEndDate;
    @XmlElementRef(name = "CanceledDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> canceledDate;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link VersionIdentifierType }
     *     
     */
    public VersionIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIdentifierType }
     *     
     */
    public void setIdentifier(VersionIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the workflowModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowModelCode() {
        return workflowModelCode;
    }

    /**
     * Sets the value of the workflowModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowModelCode(JAXBElement<String> value) {
        this.workflowModelCode = value;
    }

    /**
     * Gets the value of the productionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductionStatusCode() {
        return productionStatusCode;
    }

    /**
     * Sets the value of the productionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductionStatusCode(JAXBElement<String> value) {
        this.productionStatusCode = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPublicationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPublicationEndDate() {
        return publicationEndDate;
    }

    /**
     * Sets the value of the publicationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPublicationEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.publicationEndDate = value;
    }

    /**
     * Gets the value of the canceledDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCanceledDate() {
        return canceledDate;
    }

    /**
     * Sets the value of the canceledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCanceledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.canceledDate = value;
    }

}
