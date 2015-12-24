
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidComponentFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentFrequencyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="FrequencyMeasurement" type="{http://airnav2.faa.gov/aom/beans/vo}FrequencyMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentFrequencyType", propOrder = {
    "identifier",
    "frequencyMeasurement"
})
public class NavaidComponentFrequencyType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "FrequencyMeasurement", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<FrequencyMeasurementType> frequencyMeasurement;

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
     * Gets the value of the frequencyMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public JAXBElement<FrequencyMeasurementType> getFrequencyMeasurement() {
        return frequencyMeasurement;
    }

    /**
     * Sets the value of the frequencyMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrequencyMeasurementType }{@code >}
     *     
     */
    public void setFrequencyMeasurement(JAXBElement<FrequencyMeasurementType> value) {
        this.frequencyMeasurement = value;
    }

}
