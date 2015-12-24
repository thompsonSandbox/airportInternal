
package gov.faa.avnis.ipws.headers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.faa.gov/avnis/ipws/headers>ConfigurationSetNameTypeType">
 *       &lt;attribute ref="{http://www.w3.org/2005/08/addressing}IsReferenceParameter fixed="true""/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ConfigurationSetNameType")
public class ConfigurationSetNameType {

    @XmlValue
    protected ConfigurationSetNameTypeType value;
    @XmlAttribute(name = "IsReferenceParameter", namespace = "http://www.w3.org/2005/08/addressing")
    protected Boolean isReferenceParameter;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationSetNameTypeType }
     *     
     */
    public ConfigurationSetNameTypeType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationSetNameTypeType }
     *     
     */
    public void setValue(ConfigurationSetNameTypeType value) {
        this.value = value;
    }

    /**
     * Gets the value of the isReferenceParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsReferenceParameter() {
        if (isReferenceParameter == null) {
            return true;
        } else {
            return isReferenceParameter;
        }
    }

    /**
     * Sets the value of the isReferenceParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReferenceParameter(Boolean value) {
        this.isReferenceParameter = value;
    }

}
