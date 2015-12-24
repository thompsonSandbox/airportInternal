
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportingFeatures" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}SupportingFeatureListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonDetailType", propOrder = {
    "supportingFeatures"
})
public class ReasonDetailType {

    @XmlElement(name = "SupportingFeatures")
    protected SupportingFeatureListType supportingFeatures;

    /**
     * Gets the value of the supportingFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SupportingFeatureListType }
     *     
     */
    public SupportingFeatureListType getSupportingFeatures() {
        return supportingFeatures;
    }

    /**
     * Sets the value of the supportingFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportingFeatureListType }
     *     
     */
    public void setSupportingFeatures(SupportingFeatureListType value) {
        this.supportingFeatures = value;
    }

}
