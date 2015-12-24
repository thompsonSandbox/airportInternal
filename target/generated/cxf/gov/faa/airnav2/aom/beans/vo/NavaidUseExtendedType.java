
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidUseExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidUseExtendedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidNavaidComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidUseExtendedType", propOrder = {
    "navaidNavaidComponent"
})
public class NavaidUseExtendedType
    extends NavaidUseType
{

    @XmlElement(name = "NavaidNavaidComponent", nillable = true)
    protected NavaidNavaidComponentType navaidNavaidComponent;

    /**
     * Gets the value of the navaidNavaidComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidNavaidComponentType }
     *     
     */
    public NavaidNavaidComponentType getNavaidNavaidComponent() {
        return navaidNavaidComponent;
    }

    /**
     * Sets the value of the navaidNavaidComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidNavaidComponentType }
     *     
     */
    public void setNavaidNavaidComponent(NavaidNavaidComponentType value) {
        this.navaidNavaidComponent = value;
    }

}
