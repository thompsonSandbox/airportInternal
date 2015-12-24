
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfpaValidationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfpaValidationItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}IfpaObjectType"/>
 *         &lt;element name="TaskInfo" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}ValidationTaskInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfpaValidationItemType", propOrder = {
    "feature",
    "taskInfo"
})
public class IfpaValidationItemType {

    @XmlElement(name = "Feature", required = true)
    protected IfpaObjectType feature;
    @XmlElement(name = "TaskInfo")
    protected ValidationTaskInfoType taskInfo;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link IfpaObjectType }
     *     
     */
    public IfpaObjectType getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfpaObjectType }
     *     
     */
    public void setFeature(IfpaObjectType value) {
        this.feature = value;
    }

    /**
     * Gets the value of the taskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTaskInfoType }
     *     
     */
    public ValidationTaskInfoType getTaskInfo() {
        return taskInfo;
    }

    /**
     * Sets the value of the taskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTaskInfoType }
     *     
     */
    public void setTaskInfo(ValidationTaskInfoType value) {
        this.taskInfo = value;
    }

}
