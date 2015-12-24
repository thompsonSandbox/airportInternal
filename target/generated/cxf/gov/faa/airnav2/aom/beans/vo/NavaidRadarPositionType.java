
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidRadarPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidRadarPositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocationType">
 *       &lt;sequence>
 *         &lt;element name="PointRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PseudoPositionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidRadarPositionType", propOrder = {
    "pointRoleCode",
    "positionUsage",
    "pseudoPositionIndicator"
})
public class NavaidRadarPositionType
    extends ElevatedLocationType
{

    @XmlElementRef(name = "PointRoleCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointRoleCode;
    @XmlElementRef(name = "PositionUsage", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionUsage;
    @XmlElementRef(name = "PseudoPositionIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pseudoPositionIndicator;

    /**
     * Gets the value of the pointRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointRoleCode() {
        return pointRoleCode;
    }

    /**
     * Sets the value of the pointRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointRoleCode(JAXBElement<String> value) {
        this.pointRoleCode = value;
    }

    /**
     * Gets the value of the positionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionUsage() {
        return positionUsage;
    }

    /**
     * Sets the value of the positionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionUsage(JAXBElement<String> value) {
        this.positionUsage = value;
    }

    /**
     * Gets the value of the pseudoPositionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPseudoPositionIndicator() {
        return pseudoPositionIndicator;
    }

    /**
     * Sets the value of the pseudoPositionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPseudoPositionIndicator(JAXBElement<String> value) {
        this.pseudoPositionIndicator = value;
    }

}
