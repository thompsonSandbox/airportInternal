
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="AirnavAirportIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefAirportTypeCode" type="{http://airnav2.faa.gov/aom/beans/vo}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChartLocationCityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportReferencePoint" type="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportReferenceType", propOrder = {
    "airnavAirportIdentifier",
    "airportName",
    "airportTypeCode",
    "refAirportTypeCode",
    "countryCode",
    "stateCode",
    "chartLocationCityText",
    "airportReferencePoint"
})
public class AirportReferenceType
    extends TemporalModelType
{

    @XmlElementRef(name = "AirnavAirportIdentifier", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airnavAirportIdentifier;
    @XmlElementRef(name = "AirportName", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportName;
    @XmlElementRef(name = "AirportTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportTypeCode;
    @XmlElementRef(name = "RefAirportTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceDataType> refAirportTypeCode;
    @XmlElementRef(name = "CountryCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "StateCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "ChartLocationCityText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chartLocationCityText;
    @XmlElementRef(name = "AirportReferencePoint", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedLocationType> airportReferencePoint;

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
     * Gets the value of the refAirportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public JAXBElement<ReferenceDataType> getRefAirportTypeCode() {
        return refAirportTypeCode;
    }

    /**
     * Sets the value of the refAirportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenceDataType }{@code >}
     *     
     */
    public void setRefAirportTypeCode(JAXBElement<ReferenceDataType> value) {
        this.refAirportTypeCode = value;
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
     * Gets the value of the chartLocationCityText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChartLocationCityText() {
        return chartLocationCityText;
    }

    /**
     * Sets the value of the chartLocationCityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChartLocationCityText(JAXBElement<String> value) {
        this.chartLocationCityText = value;
    }

    /**
     * Gets the value of the airportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public JAXBElement<ElevatedLocationType> getAirportReferencePoint() {
        return airportReferencePoint;
    }

    /**
     * Sets the value of the airportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedLocationType }{@code >}
     *     
     */
    public void setAirportReferencePoint(JAXBElement<ElevatedLocationType> value) {
        this.airportReferencePoint = value;
    }

}
