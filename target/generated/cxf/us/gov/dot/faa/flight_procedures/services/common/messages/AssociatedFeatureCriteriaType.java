
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureTypeType;


/**
 * <p>Java class for AssociatedFeatureCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedFeatureCriteriaType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}commonFilters">
 *       &lt;sequence>
 *         &lt;element name="AdditionalCriteria" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}AdditionalCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeatureType" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedFeatureCriteriaType", propOrder = {
    "additionalCriteria",
    "featureType"
})
public class AssociatedFeatureCriteriaType
    extends CommonFilters
{

    @XmlElement(name = "AdditionalCriteria")
    protected List<AdditionalCriteriaType> additionalCriteria;
    @XmlElement(name = "FeatureType")
    @XmlSchemaType(name = "string")
    protected FeatureTypeType featureType;

    /**
     * Gets the value of the additionalCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalCriteriaType }
     * 
     * 
     */
    public List<AdditionalCriteriaType> getAdditionalCriteria() {
        if (additionalCriteria == null) {
            additionalCriteria = new ArrayList<AdditionalCriteriaType>();
        }
        return this.additionalCriteria;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeType }
     *     
     */
    public FeatureTypeType getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeType }
     *     
     */
    public void setFeatureType(FeatureTypeType value) {
        this.featureType = value;
    }

}
