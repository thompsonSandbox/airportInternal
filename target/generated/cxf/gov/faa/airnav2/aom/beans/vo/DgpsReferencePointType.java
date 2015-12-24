
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DgpsReferencePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgpsReferencePointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractSystemAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencePointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencePointDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemOwningText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocationType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidSystemAssociationListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgpsReferencePointType", propOrder = {
    "identifier",
    "countryCode",
    "stateCode",
    "referencePointId",
    "referencePointDescription",
    "pointTypeCode",
    "locationDescription",
    "systemOwningText",
    "position",
    "surveySource",
    "airportAssociationListHolder",
    "navaidSystemAssociationListHolder"
})
public class DgpsReferencePointType
    extends AbstractSystemAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "ReferencePointId", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePointId;
    @XmlElementRef(name = "ReferencePointDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePointDescription;
    @XmlElementRef(name = "PointTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointTypeCode;
    @XmlElementRef(name = "LocationDescription", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElementRef(name = "SystemOwningText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> systemOwningText;
    @XmlElementRef(name = "Position", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedLocationType> position;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "AirportAssociationListHolder", nillable = true)
    protected AirportAssociationListHolderType airportAssociationListHolder;
    @XmlElement(name = "NavaidSystemAssociationListHolder", nillable = true)
    protected NavaidSystemAssociationListHolderType navaidSystemAssociationListHolder;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the referencePointId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencePointId() {
        return referencePointId;
    }

    /**
     * Sets the value of the referencePointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencePointId(JAXBElement<String> value) {
        this.referencePointId = value;
    }

    /**
     * Gets the value of the referencePointDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencePointDescription() {
        return referencePointDescription;
    }

    /**
     * Sets the value of the referencePointDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencePointDescription(JAXBElement<String> value) {
        this.referencePointDescription = value;
    }

    /**
     * Gets the value of the pointTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointTypeCode() {
        return pointTypeCode;
    }

    /**
     * Sets the value of the pointTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointTypeCode(JAXBElement<String> value) {
        this.pointTypeCode = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the systemOwningText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemOwningText() {
        return systemOwningText;
    }

    /**
     * Sets the value of the systemOwningText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemOwningText(JAXBElement<String> value) {
        this.systemOwningText = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public JAXBElement<ElevatedLocationType> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<ElevatedLocationType> value) {
        this.position = value;
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
     * Gets the value of the airportAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportAssociationListHolderType }
     *     
     */
    public AirportAssociationListHolderType getAirportAssociationListHolder() {
        return airportAssociationListHolder;
    }

    /**
     * Sets the value of the airportAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportAssociationListHolderType }
     *     
     */
    public void setAirportAssociationListHolder(AirportAssociationListHolderType value) {
        this.airportAssociationListHolder = value;
    }

    /**
     * Gets the value of the navaidSystemAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidSystemAssociationListHolderType }
     *     
     */
    public NavaidSystemAssociationListHolderType getNavaidSystemAssociationListHolder() {
        return navaidSystemAssociationListHolder;
    }

    /**
     * Sets the value of the navaidSystemAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidSystemAssociationListHolderType }
     *     
     */
    public void setNavaidSystemAssociationListHolder(NavaidSystemAssociationListHolderType value) {
        this.navaidSystemAssociationListHolder = value;
    }

}
