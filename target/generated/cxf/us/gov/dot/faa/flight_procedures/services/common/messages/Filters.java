
package us.gov.dot.faa.flight_procedures.services.common.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.BBoxType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.ChartDateOperationType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.DateTSOperationType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.StatusType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.WorkflowModelType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.YesOrNoType;


/**
 * <p>Java class for Filters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filters">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}commonFilters">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}StatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkflowModel" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}WorkflowModelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}DateTSOperationType" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateOperationType" minOccurs="0"/>
 *         &lt;element name="PublicationEndDate" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ChartDateOperationType" minOccurs="0"/>
 *         &lt;element name="BBox" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}BBoxType" minOccurs="0"/>
 *         &lt;element name="CancelIndicator" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}YesOrNoType" minOccurs="0"/>
 *         &lt;element name="AdditionalCriteria" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}AdditionalCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filters", propOrder = {
    "status",
    "workflowModel",
    "countryCode",
    "stateCode",
    "lastUpdateDate",
    "publicationDate",
    "publicationEndDate",
    "bBox",
    "cancelIndicator",
    "additionalCriteria"
})
@XmlSeeAlso({
    FilterCriteriaType.class
})
public abstract class Filters
    extends CommonFilters
{

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected List<StatusType> status;
    @XmlElement(name = "WorkflowModel")
    @XmlSchemaType(name = "string")
    protected List<WorkflowModelType> workflowModel;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "LastUpdateDate")
    protected DateTSOperationType lastUpdateDate;
    @XmlElement(name = "PublicationDate")
    protected ChartDateOperationType publicationDate;
    @XmlElement(name = "PublicationEndDate")
    protected ChartDateOperationType publicationEndDate;
    @XmlElement(name = "BBox")
    protected BBoxType bBox;
    @XmlElement(name = "CancelIndicator")
    @XmlSchemaType(name = "string")
    protected YesOrNoType cancelIndicator;
    @XmlElement(name = "AdditionalCriteria")
    protected List<AdditionalCriteriaType> additionalCriteria;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the workflowModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowModelType }
     * 
     * 
     */
    public List<WorkflowModelType> getWorkflowModel() {
        if (workflowModel == null) {
            workflowModel = new ArrayList<WorkflowModelType>();
        }
        return this.workflowModel;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTSOperationType }
     *     
     */
    public DateTSOperationType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTSOperationType }
     *     
     */
    public void setLastUpdateDate(DateTSOperationType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDateOperationType }
     *     
     */
    public ChartDateOperationType getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDateOperationType }
     *     
     */
    public void setPublicationDate(ChartDateOperationType value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDateOperationType }
     *     
     */
    public ChartDateOperationType getPublicationEndDate() {
        return publicationEndDate;
    }

    /**
     * Sets the value of the publicationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDateOperationType }
     *     
     */
    public void setPublicationEndDate(ChartDateOperationType value) {
        this.publicationEndDate = value;
    }

    /**
     * Gets the value of the bBox property.
     * 
     * @return
     *     possible object is
     *     {@link BBoxType }
     *     
     */
    public BBoxType getBBox() {
        return bBox;
    }

    /**
     * Sets the value of the bBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBoxType }
     *     
     */
    public void setBBox(BBoxType value) {
        this.bBox = value;
    }

    /**
     * Gets the value of the cancelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNoType }
     *     
     */
    public YesOrNoType getCancelIndicator() {
        return cancelIndicator;
    }

    /**
     * Sets the value of the cancelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNoType }
     *     
     */
    public void setCancelIndicator(YesOrNoType value) {
        this.cancelIndicator = value;
    }

    /**
     * Gets the value of the additionalCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalCriteriaType }
     * 
     * 
     */
    public List<AdditionalCriteriaType> getAdditionalCriteria() {
        if (additionalCriteria == null) {
            additionalCriteria = new ArrayList<AdditionalCriteriaType>();
        }
        return this.additionalCriteria;
    }

}
