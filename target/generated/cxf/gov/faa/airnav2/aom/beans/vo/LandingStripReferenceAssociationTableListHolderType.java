
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandingStripReferenceAssociationTableListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandingStripReferenceAssociationTableListHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LandingStripReferenceAssociationTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandingStripReferenceAssociationTableListHolderType", propOrder = {
    "landingStripReferenceAssociationTable"
})
public class LandingStripReferenceAssociationTableListHolderType {

    @XmlElement(name = "LandingStripReferenceAssociationTable", nillable = true)
    protected List<LandingStripReferenceAssociationTableType> landingStripReferenceAssociationTable;

    /**
     * Gets the value of the landingStripReferenceAssociationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landingStripReferenceAssociationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandingStripReferenceAssociationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandingStripReferenceAssociationTableType }
     * 
     * 
     */
    public List<LandingStripReferenceAssociationTableType> getLandingStripReferenceAssociationTable() {
        if (landingStripReferenceAssociationTable == null) {
            landingStripReferenceAssociationTable = new ArrayList<LandingStripReferenceAssociationTableType>();
        }
        return this.landingStripReferenceAssociationTable;
    }

}
