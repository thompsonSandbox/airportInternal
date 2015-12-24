
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidNavaidComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidNavaidComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponentType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ParentNavSys" minOccurs="0"/>
 *         &lt;element name="FormatIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidNavaidComponentType", propOrder = {
    "parentNavSys",
    "formatIdent"
})
public class NavaidNavaidComponentType
    extends NavaidComponentType
{

    @XmlElement(name = "ParentNavSys", nillable = true)
    protected ParentNavSysType parentNavSys;
    @XmlElementRef(name = "FormatIdent", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formatIdent;

    /**
     * Gets the value of the parentNavSys property.
     * 
     * @return
     *     possible object is
     *     {@link ParentNavSysType }
     *     
     */
    public ParentNavSysType getParentNavSys() {
        return parentNavSys;
    }

    /**
     * Sets the value of the parentNavSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentNavSysType }
     *     
     */
    public void setParentNavSys(ParentNavSysType value) {
        this.parentNavSys = value;
    }

    /**
     * Gets the value of the formatIdent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormatIdent() {
        return formatIdent;
    }

    /**
     * Sets the value of the formatIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormatIdent(JAXBElement<String> value) {
        this.formatIdent = value;
    }

}
