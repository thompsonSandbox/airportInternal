
package us.gov.dot.faa.flight_procedures.services.airport.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.faa.airnav2.aom.beans.vo.AirportType;


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
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}Airport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfFeatures" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airport"
})
@XmlRootElement(name = "GetInternalFeatureResponse")
public class GetInternalFeatureResponse {

    @XmlElement(name = "Airport", namespace = "http://airnav2.faa.gov/aom/beans/vo", nillable = true)
    protected List<AirportType> airport;
    @XmlAttribute(name = "numberOfFeatures")
    protected Integer numberOfFeatures;

    /**
     * Gets the value of the airport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportType }
     * 
     * 
     */
    public List<AirportType> getAirport() {
        if (airport == null) {
            airport = new ArrayList<AirportType>();
        }
        return this.airport;
    }

    /**
     * Gets the value of the numberOfFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFeatures() {
        return numberOfFeatures;
    }

    /**
     * Sets the value of the numberOfFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFeatures(Integer value) {
        this.numberOfFeatures = value;
    }

}
