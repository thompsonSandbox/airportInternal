
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.LogicalOperationType;


/**
 * <p>Java class for FilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}Filters">
 *       &lt;sequence>
 *         &lt;element name="FilterCriteria" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedFeatureCriteria" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}AssociatedFeatureCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LogicalOperation" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}logicalOperationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterCriteriaType", propOrder = {
    "filterCriteria",
    "associatedFeatureCriteria"
})
public class FilterCriteriaType
    extends Filters
{

    @XmlElement(name = "FilterCriteria")
    protected List<FilterCriteriaType> filterCriteria;
    @XmlElement(name = "AssociatedFeatureCriteria")
    protected AssociatedFeatureCriteriaType associatedFeatureCriteria;
    @XmlAttribute(name = "LogicalOperation")
    protected LogicalOperationType logicalOperation;

    /**
     * Gets the value of the filterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterCriteriaType }
     * 
     * 
     */
    public List<FilterCriteriaType> getFilterCriteria() {
        if (filterCriteria == null) {
            filterCriteria = new ArrayList<FilterCriteriaType>();
        }
        return this.filterCriteria;
    }

    /**
     * Gets the value of the associatedFeatureCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedFeatureCriteriaType }
     *     
     */
    public AssociatedFeatureCriteriaType getAssociatedFeatureCriteria() {
        return associatedFeatureCriteria;
    }

    /**
     * Sets the value of the associatedFeatureCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedFeatureCriteriaType }
     *     
     */
    public void setAssociatedFeatureCriteria(AssociatedFeatureCriteriaType value) {
        this.associatedFeatureCriteria = value;
    }

    /**
     * Gets the value of the logicalOperation property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperationType }
     *     
     */
    public LogicalOperationType getLogicalOperation() {
        return logicalOperation;
    }

    /**
     * Sets the value of the logicalOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperationType }
     *     
     */
    public void setLogicalOperation(LogicalOperationType value) {
        this.logicalOperation = value;
    }

}
