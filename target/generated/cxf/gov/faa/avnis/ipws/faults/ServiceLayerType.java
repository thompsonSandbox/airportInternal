
package gov.faa.avnis.ipws.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information regarding each call layer of a service call that raised an exception 
 *             in the enterprise.
 *         
 * 
 * <p>Java class for ServiceLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOAPRequestMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OperationName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InterfaceVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isFaultInstigator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MachineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MachineAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceAdminContact" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLayerType", propOrder = {
    "soapRequestMessage"
})
public class ServiceLayerType {

    @XmlElement(name = "SOAPRequestMessage", required = true)
    protected String soapRequestMessage;
    @XmlAttribute(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlAttribute(name = "OperationName", required = true)
    protected String operationName;
    @XmlAttribute(name = "InterfaceVersion", required = true)
    protected String interfaceVersion;
    @XmlAttribute(name = "isFaultInstigator")
    protected Boolean isFaultInstigator;
    @XmlAttribute(name = "MachineName")
    protected String machineName;
    @XmlAttribute(name = "MachineAddress")
    protected String machineAddress;
    @XmlAttribute(name = "ServiceAdminContact")
    protected String serviceAdminContact;

    /**
     * Gets the value of the soapRequestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAPRequestMessage() {
        return soapRequestMessage;
    }

    /**
     * Sets the value of the soapRequestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAPRequestMessage(String value) {
        this.soapRequestMessage = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the interfaceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    /**
     * Sets the value of the interfaceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceVersion(String value) {
        this.interfaceVersion = value;
    }

    /**
     * Gets the value of the isFaultInstigator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsFaultInstigator() {
        if (isFaultInstigator == null) {
            return false;
        } else {
            return isFaultInstigator;
        }
    }

    /**
     * Sets the value of the isFaultInstigator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFaultInstigator(Boolean value) {
        this.isFaultInstigator = value;
    }

    /**
     * Gets the value of the machineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * Sets the value of the machineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }

    /**
     * Gets the value of the machineAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineAddress() {
        return machineAddress;
    }

    /**
     * Sets the value of the machineAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineAddress(String value) {
        this.machineAddress = value;
    }

    /**
     * Gets the value of the serviceAdminContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAdminContact() {
        return serviceAdminContact;
    }

    /**
     * Sets the value of the serviceAdminContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAdminContact(String value) {
        this.serviceAdminContact = value;
    }

}
