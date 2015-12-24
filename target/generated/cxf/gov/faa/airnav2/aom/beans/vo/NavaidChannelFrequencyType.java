
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidChannelFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidChannelFrequencyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="FmIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelFrequency" type="{http://airnav2.faa.gov/aom/beans/vo}FrequencyMeasurementType" minOccurs="0"/>
 *         &lt;element name="FrequencyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmissionBandTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioEmissionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidChannelFrequencyType", propOrder = {
    "identifier",
    "fmIndicator",
    "channelFrequency",
    "frequencyTypeCode",
    "emissionBandTypeCode",
    "radioEmissionTypeCode"
})
public class NavaidChannelFrequencyType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "FmIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fmIndicator;
    @XmlElementRef(name = "ChannelFrequency", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<FrequencyMeasurementType> channelFrequency;
    @XmlElementRef(name = "FrequencyTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequencyTypeCode;
    @XmlElementRef(name = "EmissionBandTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emissionBandTypeCode;
    @XmlElementRef(name = "RadioEmissionTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> radioEmissionTypeCode;

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
     * Gets the value of the fmIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFmIndicator() {
        return fmIndicator;
    }

    /**
     * Sets the value of the fmIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFmIndicator(JAXBElement<String> value) {
        this.fmIndicator = value;
    }

    /**
     * Gets the value of the channelFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public JAXBElement<FrequencyMeasurementType> getChannelFrequency() {
        return channelFrequency;
    }

    /**
     * Sets the value of the channelFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public void setChannelFrequency(JAXBElement<FrequencyMeasurementType> value) {
        this.channelFrequency = value;
    }

    /**
     * Gets the value of the frequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequencyTypeCode() {
        return frequencyTypeCode;
    }

    /**
     * Sets the value of the frequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequencyTypeCode(JAXBElement<String> value) {
        this.frequencyTypeCode = value;
    }

    /**
     * Gets the value of the emissionBandTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmissionBandTypeCode() {
        return emissionBandTypeCode;
    }

    /**
     * Sets the value of the emissionBandTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmissionBandTypeCode(JAXBElement<String> value) {
        this.emissionBandTypeCode = value;
    }

    /**
     * Gets the value of the radioEmissionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRadioEmissionTypeCode() {
        return radioEmissionTypeCode;
    }

    /**
     * Sets the value of the radioEmissionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRadioEmissionTypeCode(JAXBElement<String> value) {
        this.radioEmissionTypeCode = value;
    }

}
