
package gov.faa.avnis.ipws.faults;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information regarding the route that the service call made before generating
 *             the exception.  This is seperate from the source of the exception in the 
 *             application itself.
 *         
 * 
 * <p>Java class for ServiceRouteInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRouteInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceLayer" type="{http://www.faa.gov/avnis/ipws/faults}ServiceLayerType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRouteInformationType", propOrder = {
    "serviceLayer"
})
public class ServiceRouteInformationType {

    @XmlElement(name = "ServiceLayer", required = true)
    protected List<ServiceLayerType> serviceLayer;

    /**
     * Gets the value of the serviceLayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLayerType }
     * 
     * 
     */
    public List<ServiceLayerType> getServiceLayer() {
        if (serviceLayer == null) {
            serviceLayer = new ArrayList<ServiceLayerType>();
        }
        return this.serviceLayer;
    }

}
