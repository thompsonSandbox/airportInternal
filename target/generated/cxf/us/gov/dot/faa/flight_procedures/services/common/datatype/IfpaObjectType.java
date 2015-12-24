
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.messages.UpdateFeatureRequestItemType;


/**
 * <p>Java class for IfpaObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfpaObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureIdentifier" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}FeatureIdentifierType"/>
 *         &lt;element name="Temporality" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TemporalType" minOccurs="0"/>
 *         &lt;element name="PrintableVersion" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}PrintableVersionType" minOccurs="0"/>
 *         &lt;element name="ProductionStatus" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}StatusType" minOccurs="0"/>
 *         &lt;element name="WorkflowModel" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}WorkflowModelType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfpaObjectType", propOrder = {
    "featureIdentifier",
    "temporality",
    "printableVersion",
    "productionStatus",
    "workflowModel",
    "name"
})
@XmlSeeAlso({
    FeatureBriefType.class,
    UpdateFeatureRequestItemType.class
})
public class IfpaObjectType {

    @XmlElement(name = "FeatureIdentifier", required = true)
    protected FeatureIdentifierType featureIdentifier;
    @XmlElement(name = "Temporality")
    protected TemporalType temporality;
    @XmlElement(name = "PrintableVersion")
    protected String printableVersion;
    @XmlElement(name = "ProductionStatus")
    @XmlSchemaType(name = "string")
    protected StatusType productionStatus;
    @XmlElement(name = "WorkflowModel")
    @XmlSchemaType(name = "string")
    protected WorkflowModelType workflowModel;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the featureIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureIdentifierType }
     *     
     */
    public FeatureIdentifierType getFeatureIdentifier() {
        return featureIdentifier;
    }

    /**
     * Sets the value of the featureIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureIdentifierType }
     *     
     */
    public void setFeatureIdentifier(FeatureIdentifierType value) {
        this.featureIdentifier = value;
    }

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
     * Gets the value of the printableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintableVersion() {
        return printableVersion;
    }

    /**
     * Sets the value of the printableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintableVersion(String value) {
        this.printableVersion = value;
    }

    /**
     * Gets the value of the productionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getProductionStatus() {
        return productionStatus;
    }

    /**
     * Sets the value of the productionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setProductionStatus(StatusType value) {
        this.productionStatus = value;
    }

    /**
     * Gets the value of the workflowModel property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowModelType }
     *     
     */
    public WorkflowModelType getWorkflowModel() {
        return workflowModel;
    }

    /**
     * Sets the value of the workflowModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowModelType }
     *     
     */
    public void setWorkflowModel(WorkflowModelType value) {
        this.workflowModel = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
