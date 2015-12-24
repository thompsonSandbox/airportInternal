
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationTaskInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationTaskInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskAction" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}TaskActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationTaskInfoType", propOrder = {
    "projectId",
    "taskID",
    "taskAction"
})
public class ValidationTaskInfoType {

    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "TaskID")
    protected String taskID;
    @XmlElement(name = "TaskAction")
    @XmlSchemaType(name = "string")
    protected TaskActionType taskAction;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskID(String value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the taskAction property.
     * 
     * @return
     *     possible object is
     *     {@link TaskActionType }
     *     
     */
    public TaskActionType getTaskAction() {
        return taskAction;
    }

    /**
     * Sets the value of the taskAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskActionType }
     *     
     */
    public void setTaskAction(TaskActionType value) {
        this.taskAction = value;
    }

}
