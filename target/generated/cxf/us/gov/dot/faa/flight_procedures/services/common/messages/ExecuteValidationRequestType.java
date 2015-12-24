
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
import us.gov.dot.faa.flight_procedures.services.common.datatype.IfpaObjectType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.IfpaValidationItemType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.TemporalType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidatorType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.YesOrNoType;


/**
 * Type definition for request to call single validator
 * 
 * <p>Java class for ExecuteValidationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteValidationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}BaseUpdateRequestType">
 *       &lt;sequence>
 *         &lt;element name="ValidationType" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidatorType" maxOccurs="unbounded"/>
 *         &lt;element name="Temporality" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TemporalType" minOccurs="0"/>
 *         &lt;element name="ValidationItem" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaValidationItemType" maxOccurs="unbounded"/>
 *         &lt;element name="IgnoreFeature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dependentValidationResults" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}YesOrNoType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteValidationRequestType", propOrder = {
    "validationType",
    "temporality",
    "validationItem",
    "ignoreFeature"
})
@XmlSeeAlso({
    ExecuteValidationRequest.class,
    ExecuteValidationWithUpdateRequest.class
})
public class ExecuteValidationRequestType
    extends BaseUpdateRequestType
{

    @XmlElement(name = "ValidationType", required = true)
    @XmlSchemaType(name = "string")
    protected List<ValidatorType> validationType;
    @XmlElement(name = "Temporality")
    protected TemporalType temporality;
    @XmlElement(name = "ValidationItem", required = true)
    protected List<IfpaValidationItemType> validationItem;
    @XmlElement(name = "IgnoreFeature")
    protected List<IfpaObjectType> ignoreFeature;
    @XmlAttribute(name = "dependentValidationResults")
    protected YesOrNoType dependentValidationResults;

    /**
     * Gets the value of the validationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatorType }
     * 
     * 
     */
    public List<ValidatorType> getValidationType() {
        if (validationType == null) {
            validationType = new ArrayList<ValidatorType>();
        }
        return this.validationType;
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
     * Gets the value of the validationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfpaValidationItemType }
     * 
     * 
     */
    public List<IfpaValidationItemType> getValidationItem() {
        if (validationItem == null) {
            validationItem = new ArrayList<IfpaValidationItemType>();
        }
        return this.validationItem;
    }

    /**
     * Gets the value of the ignoreFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfpaObjectType }
     * 
     * 
     */
    public List<IfpaObjectType> getIgnoreFeature() {
        if (ignoreFeature == null) {
            ignoreFeature = new ArrayList<IfpaObjectType>();
        }
        return this.ignoreFeature;
    }

    /**
     * Gets the value of the dependentValidationResults property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNoType }
     *     
     */
    public YesOrNoType getDependentValidationResults() {
        return dependentValidationResults;
    }

    /**
     * Sets the value of the dependentValidationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNoType }
     *     
     */
    public void setDependentValidationResults(YesOrNoType value) {
        this.dependentValidationResults = value;
    }

}
