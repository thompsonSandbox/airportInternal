
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadarComponentUseRestrictionAssociationListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadarComponentUseRestrictionAssociationListHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RadarComponentUseRestrictionAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadarComponentUseRestrictionAssociationListHolderType", propOrder = {
    "radarComponentUseRestrictionAssociation"
})
public class RadarComponentUseRestrictionAssociationListHolderType {

    @XmlElement(name = "RadarComponentUseRestrictionAssociation", nillable = true)
    protected List<RadarComponentUseRestrictionAssociationType> radarComponentUseRestrictionAssociation;

    /**
     * Gets the value of the radarComponentUseRestrictionAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radarComponentUseRestrictionAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadarComponentUseRestrictionAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadarComponentUseRestrictionAssociationType }
     * 
     * 
     */
    public List<RadarComponentUseRestrictionAssociationType> getRadarComponentUseRestrictionAssociation() {
        if (radarComponentUseRestrictionAssociation == null) {
            radarComponentUseRestrictionAssociation = new ArrayList<RadarComponentUseRestrictionAssociationType>();
        }
        return this.radarComponentUseRestrictionAssociation;
    }

}
