
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.AlignmentStatusMessageType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.IfpaObjectType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;


/**
 * Feature is a echo back of request.  RealignFeature is a collection features that were upreved to Feature's time slice.  Unaligned features are features that could not be found in Feature's time slice
 * 
 * <p>Java class for RealignResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealignResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType"/>
 *         &lt;element name="RealignedFeature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}AlignmentStatusMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnalignedFeature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}AlignmentStatusMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Result" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationResultType"/>
 *         &lt;element name="FormattedMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealignResponseType", propOrder = {
    "feature",
    "realignedFeature",
    "unalignedFeature",
    "result",
    "formattedMessage"
})
public class RealignResponseType {

    @XmlElement(name = "Feature", required = true)
    protected IfpaObjectType feature;
    @XmlElement(name = "RealignedFeature")
    protected List<AlignmentStatusMessageType> realignedFeature;
    @XmlElement(name = "UnalignedFeature")
    protected List<AlignmentStatusMessageType> unalignedFeature;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationResultType result;
    @XmlElement(name = "FormattedMessage", required = true)
    protected String formattedMessage;

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
     * Gets the value of the realignedFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realignedFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealignedFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlignmentStatusMessageType }
     * 
     * 
     */
    public List<AlignmentStatusMessageType> getRealignedFeature() {
        if (realignedFeature == null) {
            realignedFeature = new ArrayList<AlignmentStatusMessageType>();
        }
        return this.realignedFeature;
    }

    /**
     * Gets the value of the unalignedFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unalignedFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnalignedFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlignmentStatusMessageType }
     * 
     * 
     */
    public List<AlignmentStatusMessageType> getUnalignedFeature() {
        if (unalignedFeature == null) {
            unalignedFeature = new ArrayList<AlignmentStatusMessageType>();
        }
        return this.unalignedFeature;
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

}
