
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidComponentDistanceListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentDistanceListHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentDistance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidComponentDistanceListHolderType", propOrder = {
    "navaidComponentDistance"
})
public class NavaidComponentDistanceListHolderType {

    @XmlElement(name = "NavaidComponentDistance", nillable = true)
    protected List<NavaidComponentDistanceType> navaidComponentDistance;

    /**
     * Gets the value of the navaidComponentDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidComponentDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidComponentDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidComponentDistanceType }
     * 
     * 
     */
    public List<NavaidComponentDistanceType> getNavaidComponentDistance() {
        if (navaidComponentDistance == null) {
            navaidComponentDistance = new ArrayList<NavaidComponentDistanceType>();
        }
        return this.navaidComponentDistance;
    }

}
