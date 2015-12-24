
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidatorType;


/**
 * <p>Java class for ValidationResultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationResultSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationResultType"/>
 *         &lt;element name="ValidationType" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidatorType"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DependentValidationResult" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ValidationResultMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResultSet", propOrder = {
    "result",
    "validationType",
    "reason",
    "dependentValidationResult"
})
public class ValidationResultSet {

    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationResultType result;
    @XmlElement(name = "ValidationType", required = true)
    @XmlSchemaType(name = "string")
    protected ValidatorType validationType;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "DependentValidationResult")
    protected List<ValidationResultMessageType> dependentValidationResult;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultType }
     *     
     */
    public ValidationResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultType }
     *     
     */
    public void setResult(ValidationResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorType }
     *     
     */
    public ValidatorType getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorType }
     *     
     */
    public void setValidationType(ValidatorType value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the dependentValidationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentValidationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResultMessageType }
     * 
     * 
     */
    public List<ValidationResultMessageType> getDependentValidationResult() {
        if (dependentValidationResult == null) {
            dependentValidationResult = new ArrayList<ValidationResultMessageType>();
        }
        return this.dependentValidationResult;
    }

}
