
package us.gov.dot.faa.flight_procedures.services.airport.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureTypeType;
import us.gov.dot.faa.flight_procedures.services.common.messages.DetailLevelType;
import us.gov.dot.faa.flight_procedures.services.common.messages.FilterCriteriaType;


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
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FeatureType"/>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FilterCriteria"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DetailLevel" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}DetailLevelType" default="summary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "featureType",
    "filterCriteria"
})
@XmlRootElement(name = "GetInternalFeatureRequest")
public class GetInternalFeatureRequest {

    @XmlElement(name = "FeatureType", namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", required = true)
    @XmlSchemaType(name = "string")
    protected FeatureTypeType featureType;
    @XmlElement(name = "FilterCriteria", namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", required = true)
    protected FilterCriteriaType filterCriteria;
    @XmlAttribute(name = "DetailLevel")
    protected DetailLevelType detailLevel;

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

    /**
     * Gets the value of the detailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DetailLevelType }
     *     
     */
    public DetailLevelType getDetailLevel() {
        if (detailLevel == null) {
            return DetailLevelType.SUMMARY;
        } else {
            return detailLevel;
        }
    }

    /**
     * Sets the value of the detailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailLevelType }
     *     
     */
    public void setDetailLevel(DetailLevelType value) {
        this.detailLevel = value;
    }

}
