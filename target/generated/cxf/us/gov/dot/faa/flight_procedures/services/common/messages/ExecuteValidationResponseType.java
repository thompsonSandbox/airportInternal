
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;


/**
 * Type definition of response from single validator
 * 
 * <p>Java class for ExecuteValidationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteValidationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationResult" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ValidationResultMessageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="result" use="required" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationResultType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteValidationResponseType", propOrder = {
    "validationResult"
})
@XmlSeeAlso({
    ExecuteValidationResponse.class,
    ExecuteValidationWithUpdateResponse.class
})
public class ExecuteValidationResponseType {

    @XmlElement(name = "ValidationResult", required = true)
    protected List<ValidationResultMessageType> validationResult;
    @XmlAttribute(name = "result", required = true)
    protected ValidationResultType result;

    /**
     * Gets the value of the validationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResultMessageType }
     * 
     * 
     */
    public List<ValidationResultMessageType> getValidationResult() {
        if (validationResult == null) {
            validationResult = new ArrayList<ValidationResultMessageType>();
        }
        return this.validationResult;
    }

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

}
