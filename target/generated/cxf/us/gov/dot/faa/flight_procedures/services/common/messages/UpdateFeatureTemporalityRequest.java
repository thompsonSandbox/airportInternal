
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.TemporalType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}BaseUpdateRequestType">
 *       &lt;sequence>
 *         &lt;element name="Temporality" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TemporalType" minOccurs="0"/>
 *         &lt;element name="UpdateFeatureReqItem" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}UpdateFeatureRequestItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "temporality",
    "updateFeatureReqItem"
})
@XmlRootElement(name = "UpdateFeatureTemporalityRequest")
public class UpdateFeatureTemporalityRequest
    extends BaseUpdateRequestType
{

    @XmlElement(name = "Temporality")
    protected TemporalType temporality;
    @XmlElement(name = "UpdateFeatureReqItem", required = true)
    protected List<UpdateFeatureRequestItemType> updateFeatureReqItem;

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
     * Gets the value of the updateFeatureReqItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateFeatureReqItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateFeatureReqItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateFeatureRequestItemType }
     * 
     * 
     */
    public List<UpdateFeatureRequestItemType> getUpdateFeatureReqItem() {
        if (updateFeatureReqItem == null) {
            updateFeatureReqItem = new ArrayList<UpdateFeatureRequestItemType>();
        }
        return this.updateFeatureReqItem;
    }

}
