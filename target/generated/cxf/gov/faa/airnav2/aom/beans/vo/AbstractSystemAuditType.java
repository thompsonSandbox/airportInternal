
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractSystemAuditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSystemAuditType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}AbstractAuditType">
 *       &lt;attribute name="LastSystemUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastSystemUpdateUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSystemAuditType")
@XmlSeeAlso({
    DgpsReferencePointType.class,
    ObstacleType.class,
    TemporalModelType.class
})
public abstract class AbstractSystemAuditType
    extends AbstractAuditType
{

    @XmlAttribute(name = "LastSystemUpdateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSystemUpdateDateTime;
    @XmlAttribute(name = "LastSystemUpdateUserId")
    protected String lastSystemUpdateUserId;

    /**
     * Gets the value of the lastSystemUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSystemUpdateDateTime() {
        return lastSystemUpdateDateTime;
    }

    /**
     * Sets the value of the lastSystemUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSystemUpdateDateTime(XMLGregorianCalendar value) {
        this.lastSystemUpdateDateTime = value;
    }

    /**
     * Gets the value of the lastSystemUpdateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSystemUpdateUserId() {
        return lastSystemUpdateUserId;
    }

    /**
     * Sets the value of the lastSystemUpdateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSystemUpdateUserId(String value) {
        this.lastSystemUpdateUserId = value;
    }

}
