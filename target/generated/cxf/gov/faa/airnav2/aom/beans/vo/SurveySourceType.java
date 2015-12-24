
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SurveySourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveySourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}UniqueIdentifierType"/>
 *         &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveySourceType", propOrder = {
    "identifier",
    "sourceCode",
    "surveyCode",
    "surveyDate"
})
public class SurveySourceType
    extends AbstractAuditType
{

    @XmlElement(name = "Identifier", required = true)
    protected UniqueIdentifierType identifier;
    @XmlElementRef(name = "SourceCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceCode;
    @XmlElementRef(name = "SurveyCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surveyCode;
    @XmlElementRef(name = "SurveyDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> surveyDate;

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
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceCode(JAXBElement<String> value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the surveyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurveyCode() {
        return surveyCode;
    }

    /**
     * Sets the value of the surveyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurveyCode(JAXBElement<String> value) {
        this.surveyCode = value;
    }

    /**
     * Gets the value of the surveyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSurveyDate() {
        return surveyDate;
    }

    /**
     * Sets the value of the surveyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSurveyDate(JAXBElement<XMLGregorianCalendar> value) {
        this.surveyDate = value;
    }

}
