
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitorComponentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorComponentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType" minOccurs="0"/>
 *         &lt;element name="DesignatorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Monitor" type="{http://airnav2.faa.gov/aom/beans/vo}MonitorReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorComponentReferenceType", propOrder = {
    "identifier",
    "designatorText",
    "monitor"
})
public class MonitorComponentReferenceType {

    @XmlElement(name = "Identifier")
    protected UniqueIdentifierType identifier;
    @XmlElement(name = "DesignatorText")
    protected String designatorText;
    @XmlElement(name = "Monitor")
    protected MonitorReferenceType monitor;

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
     *     {@link String }
     *     
     */
    public String getDesignatorText() {
        return designatorText;
    }

    /**
     * Sets the value of the designatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatorText(String value) {
        this.designatorText = value;
    }

    /**
     * Gets the value of the monitor property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorReferenceType }
     *     
     */
    public MonitorReferenceType getMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorReferenceType }
     *     
     */
    public void setMonitor(MonitorReferenceType value) {
        this.monitor = value;
    }

}
