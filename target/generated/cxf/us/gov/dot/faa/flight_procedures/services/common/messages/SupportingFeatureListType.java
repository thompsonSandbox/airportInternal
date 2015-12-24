
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportingFeatureListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportingFeatureListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportingFeature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ValidatedFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingFeatureListType", propOrder = {
    "supportingFeature"
})
public class SupportingFeatureListType {

    @XmlElement(name = "SupportingFeature")
    protected List<ValidatedFeatureType> supportingFeature;

    /**
     * Gets the value of the supportingFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatedFeatureType }
     * 
     * 
     */
    public List<ValidatedFeatureType> getSupportingFeature() {
        if (supportingFeature == null) {
            supportingFeature = new ArrayList<ValidatedFeatureType>();
        }
        return this.supportingFeature;
    }

}
