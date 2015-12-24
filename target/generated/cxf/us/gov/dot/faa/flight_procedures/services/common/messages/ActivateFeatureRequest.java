
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureTypeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateStringType"/>
 *         &lt;element name="FeatureType" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activationDate",
    "featureType"
})
@XmlRootElement(name = "ActivateFeatureRequest")
public class ActivateFeatureRequest {

    @XmlElement(name = "ActivationDate", required = true)
    protected String activationDate;
    @XmlElement(name = "FeatureType", required = true)
    @XmlSchemaType(name = "string")
    protected FeatureTypeType featureType;

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeType }
     *     
     */
    public FeatureTypeType getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeType }
     *     
     */
    public void setFeatureType(FeatureTypeType value) {
        this.featureType = value;
    }

}
