
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.TemporalType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationScenarioType;


/**
 * Type definition for result of scenario validation
 * 
 * <p>Java class for ValidateScenarioResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateScenarioResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Scenario" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationScenarioType" minOccurs="0"/>
 *         &lt;element name="Temporality" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TemporalType" minOccurs="0"/>
 *         &lt;element name="ValidatedFeature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ValidationResultMessageType" maxOccurs="unbounded"/>
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
@XmlType(name = "ValidateScenarioResponseType", propOrder = {
    "scenario",
    "temporality",
    "validatedFeature"
})
@XmlSeeAlso({
    ValidateScenarioWithUpdateResponse.class,
    ValidateScenarioResponse.class
})
public class ValidateScenarioResponseType {

    @XmlElement(name = "Scenario")
    @XmlSchemaType(name = "string")
    protected ValidationScenarioType scenario;
    @XmlElement(name = "Temporality")
    protected TemporalType temporality;
    @XmlElement(name = "ValidatedFeature", required = true)
    protected List<ValidationResultMessageType> validatedFeature;
    @XmlAttribute(name = "result", required = true)
    protected ValidationResultType result;

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationScenarioType }
     *     
     */
    public ValidationScenarioType getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationScenarioType }
     *     
     */
    public void setScenario(ValidationScenarioType value) {
        this.scenario = value;
    }

    /**
     * Gets the value of the temporality property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalType }
     *     
     */
    public TemporalType getTemporality() {
        return temporality;
    }

    /**
     * Sets the value of the temporality property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalType }
     *     
     */
    public void setTemporality(TemporalType value) {
        this.temporality = value;
    }

    /**
     * Gets the value of the validatedFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validatedFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidatedFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResultMessageType }
     * 
     * 
     */
    public List<ValidationResultMessageType> getValidatedFeature() {
        if (validatedFeature == null) {
            validatedFeature = new ArrayList<ValidationResultMessageType>();
        }
        return this.validatedFeature;
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
