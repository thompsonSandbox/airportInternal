
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObstacleCommentIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObstacleCommentIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ObstacleIdentity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstacleCommentIdType")
public class ObstacleCommentIdType {

    @XmlAttribute(name = "ObstacleIdentity")
    protected String obstacleIdentity;
    @XmlAttribute(name = "Topic")
    protected String topic;

    /**
     * Gets the value of the obstacleIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObstacleIdentity() {
        return obstacleIdentity;
    }

    /**
     * Sets the value of the obstacleIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObstacleIdentity(String value) {
        this.obstacleIdentity = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

}
