
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApproachLightingConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproachLightingConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="AproachLightingConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AproachLightingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IcaoLightClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LightIntensityLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NatoStandardConfigurationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonStandardIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceFlashingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsaConfigurationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ApproachLightingConfigurationType", propOrder = {
    "identifier",
    "aproachLightingConfigurationCode",
    "aproachLightingTypeCode",
    "icaoLightClassCode",
    "lightIntensityLevelCode",
    "positionCode",
    "natoStandardConfigurationIndicator",
    "nonStandardIndicator",
    "sequenceFlashingIndicator",
    "usaConfigurationIndicator"
})
public class ApproachLightingConfigurationType {

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElement(name = "AproachLightingConfigurationCode")
    protected String aproachLightingConfigurationCode;
    @XmlElement(name = "AproachLightingTypeCode")
    protected String aproachLightingTypeCode;
    @XmlElement(name = "IcaoLightClassCode")
    protected String icaoLightClassCode;
    @XmlElement(name = "LightIntensityLevelCode")
    protected String lightIntensityLevelCode;
    @XmlElement(name = "PositionCode")
    protected String positionCode;
    @XmlElement(name = "NatoStandardConfigurationIndicator")
    protected String natoStandardConfigurationIndicator;
    @XmlElement(name = "NonStandardIndicator")
    protected String nonStandardIndicator;
    @XmlElement(name = "SequenceFlashingIndicator")
    protected String sequenceFlashingIndicator;
    @XmlElement(name = "UsaConfigurationIndicator")
    protected String usaConfigurationIndicator;
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
     * Gets the value of the aproachLightingConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAproachLightingConfigurationCode() {
        return aproachLightingConfigurationCode;
    }

    /**
     * Sets the value of the aproachLightingConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAproachLightingConfigurationCode(String value) {
        this.aproachLightingConfigurationCode = value;
    }

    /**
     * Gets the value of the aproachLightingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAproachLightingTypeCode() {
        return aproachLightingTypeCode;
    }

    /**
     * Sets the value of the aproachLightingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAproachLightingTypeCode(String value) {
        this.aproachLightingTypeCode = value;
    }

    /**
     * Gets the value of the icaoLightClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcaoLightClassCode() {
        return icaoLightClassCode;
    }

    /**
     * Sets the value of the icaoLightClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcaoLightClassCode(String value) {
        this.icaoLightClassCode = value;
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
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionCode(String value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the natoStandardConfigurationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatoStandardConfigurationIndicator() {
        return natoStandardConfigurationIndicator;
    }

    /**
     * Sets the value of the natoStandardConfigurationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatoStandardConfigurationIndicator(String value) {
        this.natoStandardConfigurationIndicator = value;
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
     * Gets the value of the sequenceFlashingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceFlashingIndicator() {
        return sequenceFlashingIndicator;
    }

    /**
     * Sets the value of the sequenceFlashingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceFlashingIndicator(String value) {
        this.sequenceFlashingIndicator = value;
    }

    /**
     * Gets the value of the usaConfigurationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsaConfigurationIndicator() {
        return usaConfigurationIndicator;
    }

    /**
     * Sets the value of the usaConfigurationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsaConfigurationIndicator(String value) {
        this.usaConfigurationIndicator = value;
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
