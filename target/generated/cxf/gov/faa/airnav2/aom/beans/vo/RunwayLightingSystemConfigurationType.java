
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RunwayLightingSystemConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayLightingSystemConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="LightIntensityLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwayLightSystemConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwayLightSystemTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunwaySectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RunwayLightingSystemConfigurationType", propOrder = {
    "identifier",
    "lightIntensityLevelCode",
    "positionCode",
    "runwayLightSystemConfigurationCode",
    "runwayLightSystemTypeCode",
    "runwaySectionCode",
    "nonStandardIndicator"
})
public class RunwayLightingSystemConfigurationType {

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElement(name = "LightIntensityLevelCode")
    protected String lightIntensityLevelCode;
    @XmlElement(name = "PositionCode")
    protected String positionCode;
    @XmlElement(name = "RunwayLightSystemConfigurationCode")
    protected String runwayLightSystemConfigurationCode;
    @XmlElement(name = "RunwayLightSystemTypeCode")
    protected String runwayLightSystemTypeCode;
    @XmlElement(name = "RunwaySectionCode")
    protected String runwaySectionCode;
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
     * Gets the value of the runwayLightSystemConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunwayLightSystemConfigurationCode() {
        return runwayLightSystemConfigurationCode;
    }

    /**
     * Sets the value of the runwayLightSystemConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunwayLightSystemConfigurationCode(String value) {
        this.runwayLightSystemConfigurationCode = value;
    }

    /**
     * Gets the value of the runwayLightSystemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunwayLightSystemTypeCode() {
        return runwayLightSystemTypeCode;
    }

    /**
     * Sets the value of the runwayLightSystemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunwayLightSystemTypeCode(String value) {
        this.runwayLightSystemTypeCode = value;
    }

    /**
     * Gets the value of the runwaySectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunwaySectionCode() {
        return runwaySectionCode;
    }

    /**
     * Sets the value of the runwaySectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunwaySectionCode(String value) {
        this.runwaySectionCode = value;
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
