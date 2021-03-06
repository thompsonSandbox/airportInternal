
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlignmentStatusMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlignmentStatusMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType"/>
 *         &lt;element name="AlignmentDetailMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlignmentStatusMessageType", propOrder = {
    "feature",
    "alignmentDetailMessage"
})
public class AlignmentStatusMessageType {

    @XmlElement(name = "Feature", required = true)
    protected IfpaObjectType feature;
    @XmlElement(name = "AlignmentDetailMessage", required = true)
    protected String alignmentDetailMessage;

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
     * Gets the value of the alignmentDetailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignmentDetailMessage() {
        return alignmentDetailMessage;
    }

    /**
     * Sets the value of the alignmentDetailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignmentDetailMessage(String value) {
        this.alignmentDetailMessage = value;
    }

}
