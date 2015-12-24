
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ValidationResultType;


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
 *         &lt;element name="RealignResponseItem" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}RealignResponseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="result" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationResultType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realignResponseItem"
})
@XmlRootElement(name = "RealignFeatureResponse")
public class RealignFeatureResponse {

    @XmlElement(name = "RealignResponseItem", required = true)
    protected List<RealignResponseType> realignResponseItem;
    @XmlAttribute(name = "result")
    protected ValidationResultType result;

    /**
     * Gets the value of the realignResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realignResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealignResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealignResponseType }
     * 
     * 
     */
    public List<RealignResponseType> getRealignResponseItem() {
        if (realignResponseItem == null) {
            realignResponseItem = new ArrayList<RealignResponseType>();
        }
        return this.realignResponseItem;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultType }
     *     
     */
    public ValidationResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultType }
     *     
     */
    public void setResult(ValidationResultType value) {
        this.result = value;
    }

}
