
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ActivatedFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activatedFeature"
})
@XmlRootElement(name = "ActivateFeatureResponse")
public class ActivateFeatureResponse {

    @XmlElement(name = "ActivatedFeature")
    protected List<ValidatedFeatureType> activatedFeature;

    /**
     * Gets the value of the activatedFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activatedFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivatedFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatedFeatureType }
     * 
     * 
     */
    public List<ValidatedFeatureType> getActivatedFeature() {
        if (activatedFeature == null) {
            activatedFeature = new ArrayList<ValidatedFeatureType>();
        }
        return this.activatedFeature;
    }

}
