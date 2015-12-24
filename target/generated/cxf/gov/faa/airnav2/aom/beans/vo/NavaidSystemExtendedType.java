
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidSystemExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidSystemExtendedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}NavaidSystemType">
 *       &lt;sequence>
 *         &lt;element name="RunwayCentrelinePoint" type="{http://airnav2.faa.gov/aom/beans/vo}NavaidRadarPositionType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidUseExtendedListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidSystemExtendedType", propOrder = {
    "runwayCentrelinePoint",
    "navaidUseExtendedListHolder"
})
public class NavaidSystemExtendedType
    extends NavaidSystemType
{

    @XmlElementRef(name = "RunwayCentrelinePoint", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidRadarPositionType> runwayCentrelinePoint;
    @XmlElement(name = "NavaidUseExtendedListHolder", nillable = true)
    protected NavaidUseExtendedListHolderType navaidUseExtendedListHolder;

    /**
     * Gets the value of the runwayCentrelinePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public JAXBElement<NavaidRadarPositionType> getRunwayCentrelinePoint() {
        return runwayCentrelinePoint;
    }

    /**
     * Sets the value of the runwayCentrelinePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidRadarPositionType }{@code >}
     *     
     */
    public void setRunwayCentrelinePoint(JAXBElement<NavaidRadarPositionType> value) {
        this.runwayCentrelinePoint = value;
    }

    /**
     * Gets the value of the navaidUseExtendedListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidUseExtendedListHolderType }
     *     
     */
    public NavaidUseExtendedListHolderType getNavaidUseExtendedListHolder() {
        return navaidUseExtendedListHolder;
    }

    /**
     * Sets the value of the navaidUseExtendedListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidUseExtendedListHolderType }
     *     
     */
    public void setNavaidUseExtendedListHolder(NavaidUseExtendedListHolderType value) {
        this.navaidUseExtendedListHolder = value;
    }

}
