
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VgsiConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VgsiConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="VgsiTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LightIntensityLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SideTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VgsiConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoxQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NonStandardIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VgsiConfigurationType", propOrder = {
    "identifier",
    "vgsiTypeCode",
    "lightIntensityLevelCode",
    "sideTypeCode",
    "vgsiConfigurationCode",
    "boxQuantity",
    "nonStandardIndicator"
})
public class VgsiConfigurationType {

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElement(name = "VgsiTypeCode")
    protected String vgsiTypeCode;
    @XmlElement(name = "LightIntensityLevelCode")
    protected String lightIntensityLevelCode;
    @XmlElement(name = "SideTypeCode")
    protected String sideTypeCode;
    @XmlElement(name = "VgsiConfigurationCode")
    protected String vgsiConfigurationCode;
    @XmlElement(name = "BoxQuantity")
    protected Integer boxQuantity;
    @XmlElement(name = "NonStandardIndicator")
    protected String nonStandardIndicator;
    @XmlAttribute(name = "EffectiveStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlAttribute(name = "EffectiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;

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
     * Gets the value of the vgsiTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgsiTypeCode() {
        return vgsiTypeCode;
    }

    /**
     * Sets the value of the vgsiTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgsiTypeCode(String value) {
        this.vgsiTypeCode = value;
    }

    /**
     * Gets the value of the lightIntensityLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightIntensityLevelCode() {
        return lightIntensityLevelCode;
    }

    /**
     * Sets the value of the lightIntensityLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightIntensityLevelCode(String value) {
        this.lightIntensityLevelCode = value;
    }

    /**
     * Gets the value of the sideTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideTypeCode() {
        return sideTypeCode;
    }

    /**
     * Sets the value of the sideTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideTypeCode(String value) {
        this.sideTypeCode = value;
    }

    /**
     * Gets the value of the vgsiConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgsiConfigurationCode() {
        return vgsiConfigurationCode;
    }

    /**
     * Sets the value of the vgsiConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgsiConfigurationCode(String value) {
        this.vgsiConfigurationCode = value;
    }

    /**
     * Gets the value of the boxQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoxQuantity() {
        return boxQuantity;
    }

    /**
     * Sets the value of the boxQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoxQuantity(Integer value) {
        this.boxQuantity = value;
    }

    /**
     * Gets the value of the nonStandardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStandardIndicator() {
        return nonStandardIndicator;
    }

    /**
     * Sets the value of the nonStandardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStandardIndicator(String value) {
        this.nonStandardIndicator = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

}
