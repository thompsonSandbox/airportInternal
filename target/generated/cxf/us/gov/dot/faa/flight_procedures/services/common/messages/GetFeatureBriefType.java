
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureTypeType;


/**
 * <p>Java class for GetFeatureBriefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureBriefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FeatureType"/>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FilterCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeatureBriefType", propOrder = {
    "featureType",
    "filterCriteria"
})
public class GetFeatureBriefType {

    @XmlElement(name = "FeatureType", required = true)
    @XmlSchemaType(name = "string")
    protected FeatureTypeType featureType;
    @XmlElement(name = "FilterCriteria", required = true)
    protected FilterCriteriaType filterCriteria;

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

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCriteriaType }
     *     
     */
    public FilterCriteriaType getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCriteriaType }
     *     
     */
    public void setFilterCriteria(FilterCriteriaType value) {
        this.filterCriteria = value;
    }

}
