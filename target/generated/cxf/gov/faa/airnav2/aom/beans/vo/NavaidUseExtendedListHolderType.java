
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidUseExtendedListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidUseExtendedListHolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseListHolderType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseExtended" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidUseExtendedListHolderType", propOrder = {
    "navaidUseExtended"
})
public class NavaidUseExtendedListHolderType
    extends NavaidUseListHolderType
{

    @XmlElement(name = "NavaidUseExtended", nillable = true)
    protected List<NavaidUseExtendedType> navaidUseExtended;

    /**
     * Gets the value of the navaidUseExtended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidUseExtended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidUseExtended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidUseExtendedType }
     * 
     * 
     */
    public List<NavaidUseExtendedType> getNavaidUseExtended() {
        if (navaidUseExtended == null) {
            navaidUseExtended = new ArrayList<NavaidUseExtendedType>();
        }
        return this.navaidUseExtended;
    }

}
