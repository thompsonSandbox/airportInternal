
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureIdentifierType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.TemporalType;


/**
 * The realign request type includes Feature identifier input type and end user ID.  The feature identifier input type requires either a control number or a UUID and a revision.
 * 
 * <p>Java class for RealignRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealignRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}BaseUpdateRequestType">
 *       &lt;sequence>
 *         &lt;element name="Temporality" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TemporalType" minOccurs="0"/>
 *         &lt;element name="FeatureIdentifier" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureIdentifierType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealignRequestType", propOrder = {
    "temporality",
    "featureIdentifier"
})
@XmlSeeAlso({
    RealignFeatureRequest.class
})
public class RealignRequestType
    extends BaseUpdateRequestType
{

    @XmlElement(name = "Temporality")
    protected TemporalType temporality;
    @XmlElement(name = "FeatureIdentifier", required = true)
    protected List<FeatureIdentifierType> featureIdentifier;

    /**
     * Gets the value of the temporality property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalType }
     *     
     */
    public TemporalType getTemporality() {
        return temporality;
    }

    /**
     * Sets the value of the temporality property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalType }
     *     
     */
    public void setTemporality(TemporalType value) {
        this.temporality = value;
    }

    /**
     * Gets the value of the featureIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureIdentifierType }
     * 
     * 
     */
    public List<FeatureIdentifierType> getFeatureIdentifier() {
        if (featureIdentifier == null) {
            featureIdentifier = new ArrayList<FeatureIdentifierType>();
        }
        return this.featureIdentifier;
    }

}
