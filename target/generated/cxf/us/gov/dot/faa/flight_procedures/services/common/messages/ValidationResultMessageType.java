
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.IfpaObjectType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;


/**
 * <p>Java class for ValidationResultMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationResultMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType"/>
 *         &lt;element name="ResultSet" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ValidationResultSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormattedMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ValidationResultMessageType", propOrder = {
    "feature",
    "resultSet",
    "formattedMessage"
})
@XmlSeeAlso({
    UpdateFeatureResponseItemType.class
})
public class ValidationResultMessageType {

    @XmlElement(name = "Feature", required = true)
    protected IfpaObjectType feature;
    @XmlElement(name = "ResultSet")
    protected List<ValidationResultSet> resultSet;
    @XmlElement(name = "FormattedMessage", required = true)
    protected String formattedMessage;
    @XmlAttribute(name = "result", required = true)
    protected ValidationResultType result;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link IfpaObjectType }
     *     
     */
    public IfpaObjectType getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfpaObjectType }
     *     
     */
    public void setFeature(IfpaObjectType value) {
        this.feature = value;
    }

    /**
     * Gets the value of the resultSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResultSet }
     * 
     * 
     */
    public List<ValidationResultSet> getResultSet() {
        if (resultSet == null) {
            resultSet = new ArrayList<ValidationResultSet>();
        }
        return this.resultSet;
    }

    /**
     * Gets the value of the formattedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedMessage() {
        return formattedMessage;
    }

    /**
     * Sets the value of the formattedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedMessage(String value) {
        this.formattedMessage = value;
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
