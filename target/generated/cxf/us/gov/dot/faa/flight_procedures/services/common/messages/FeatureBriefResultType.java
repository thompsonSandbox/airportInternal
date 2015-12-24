
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureBriefType;


/**
 * <p>Java class for FeatureBriefResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureBriefResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureBrief" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureBriefResultType", propOrder = {
    "featureBrief"
})
public class FeatureBriefResultType {

    @XmlElement(name = "FeatureBrief", namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype")
    protected List<FeatureBriefType> featureBrief;

    /**
     * Gets the value of the featureBrief property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBrief property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBrief().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureBriefType }
     * 
     * 
     */
    public List<FeatureBriefType> getFeatureBrief() {
        if (featureBrief == null) {
            featureBrief = new ArrayList<FeatureBriefType>();
        }
        return this.featureBrief;
    }

}
