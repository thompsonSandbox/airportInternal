
package gov.faa.avnis.ipws.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A fault in the AVN Enterprise Web Services Interface.
 *         
 * 
 * <p>Java class for ServiceExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionInformation" type="{http://www.faa.gov/avnis/ipws/faults}ExceptionInformationType"/>
 *         &lt;element name="ServiceRouteInformation" type="{http://www.faa.gov/avnis/ipws/faults}ServiceRouteInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceExceptionType", propOrder = {
    "exceptionInformation",
    "serviceRouteInformation"
})
@XmlSeeAlso({
    ServiceException.class
})
public class ServiceExceptionType {

    @XmlElement(name = "ExceptionInformation", required = true)
    protected ExceptionInformationType exceptionInformation;
    @XmlElement(name = "ServiceRouteInformation")
    protected ServiceRouteInformationType serviceRouteInformation;

    /**
     * Gets the value of the exceptionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionInformationType }
     *     
     */
    public ExceptionInformationType getExceptionInformation() {
        return exceptionInformation;
    }

    /**
     * Sets the value of the exceptionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionInformationType }
     *     
     */
    public void setExceptionInformation(ExceptionInformationType value) {
        this.exceptionInformation = value;
    }

    /**
     * Gets the value of the serviceRouteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRouteInformationType }
     *     
     */
    public ServiceRouteInformationType getServiceRouteInformation() {
        return serviceRouteInformation;
    }

    /**
     * Sets the value of the serviceRouteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRouteInformationType }
     *     
     */
    public void setServiceRouteInformation(ServiceRouteInformationType value) {
        this.serviceRouteInformation = value;
    }

}
