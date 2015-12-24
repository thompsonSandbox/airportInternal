
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BroadcastId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NdbClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportSystemAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwaySystemAssociationListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidReferenceType", propOrder = {
    "name",
    "id",
    "serviceTypeCode",
    "broadcastId",
    "locationText",
    "ndbClassCode",
    "airportSystemAssociationListHolder",
    "runwaySystemAssociationListHolder"
})
public class NavaidReferenceType
    extends TemporalModelType
{

    @XmlElementRef(name = "Name", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Id", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "ServiceTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTypeCode;
    @XmlElementRef(name = "BroadcastId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> broadcastId;
    @XmlElementRef(name = "LocationText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationText;
    @XmlElementRef(name = "NdbClassCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ndbClassCode;
    @XmlElement(name = "AirportSystemAssociationListHolder", nillable = true)
    protected AirportSystemAssociationListHolderType airportSystemAssociationListHolder;
    @XmlElement(name = "RunwaySystemAssociationListHolder", nillable = true)
    protected RunwaySystemAssociationListHolderType runwaySystemAssociationListHolder;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Sets the value of the serviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTypeCode(JAXBElement<String> value) {
        this.serviceTypeCode = value;
    }

    /**
     * Gets the value of the broadcastId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBroadcastId() {
        return broadcastId;
    }

    /**
     * Sets the value of the broadcastId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBroadcastId(JAXBElement<String> value) {
        this.broadcastId = value;
    }

    /**
     * Gets the value of the locationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationText() {
        return locationText;
    }

    /**
     * Sets the value of the locationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationText(JAXBElement<String> value) {
        this.locationText = value;
    }

    /**
     * Gets the value of the ndbClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNdbClassCode() {
        return ndbClassCode;
    }

    /**
     * Sets the value of the ndbClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNdbClassCode(JAXBElement<String> value) {
        this.ndbClassCode = value;
    }

    /**
     * Gets the value of the airportSystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportSystemAssociationListHolderType }
     *     
     */
    public AirportSystemAssociationListHolderType getAirportSystemAssociationListHolder() {
        return airportSystemAssociationListHolder;
    }

    /**
     * Sets the value of the airportSystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportSystemAssociationListHolderType }
     *     
     */
    public void setAirportSystemAssociationListHolder(AirportSystemAssociationListHolderType value) {
        this.airportSystemAssociationListHolder = value;
    }

    /**
     * Gets the value of the runwaySystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwaySystemAssociationListHolderType }
     *     
     */
    public RunwaySystemAssociationListHolderType getRunwaySystemAssociationListHolder() {
        return runwaySystemAssociationListHolder;
    }

    /**
     * Sets the value of the runwaySystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwaySystemAssociationListHolderType }
     *     
     */
    public void setRunwaySystemAssociationListHolder(RunwaySystemAssociationListHolderType value) {
        this.runwaySystemAssociationListHolder = value;
    }

}
