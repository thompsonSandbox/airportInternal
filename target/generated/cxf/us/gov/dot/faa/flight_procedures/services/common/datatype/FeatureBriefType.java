
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureBriefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureBriefType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureBriefExt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureBriefType", propOrder = {
    "featureBriefExt"
})
public class FeatureBriefType
    extends IfpaObjectType
{

    @XmlElement(name = "FeatureBriefExt")
    protected Object featureBriefExt;

    /**
     * Gets the value of the featureBriefExt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFeatureBriefExt() {
        return featureBriefExt;
    }

    /**
     * Sets the value of the featureBriefExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFeatureBriefExt(Object value) {
        this.featureBriefExt = value;
    }

}
