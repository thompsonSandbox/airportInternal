
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractAuditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAuditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreationUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="UpdateUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAuditType")
@XmlSeeAlso({
    RunwayVisualRangeType.class,
    SurveySourceType.class,
    BroadcastNavaidAssociationType.class,
    DgpsAssociationType.class,
    NtzType.class,
    RunwaySystemAssociationType.class,
    TimesheetType.class,
    NavaidChannelType.class,
    MonitorAssociationType.class,
    CommentType.class,
    AltimeterSourceType.class,
    NtzAssociationType.class,
    CommunicationFacilityAssociationType.class,
    ContactPostalAddressType.class,
    MonitorReferenceAssociationTableType.class,
    MonitorFrequencyType.class,
    NavaidComponentUseRestrictionType.class,
    CityServiceType.class,
    RadarSystemAssociationType.class,
    NavaidChannelFrequencyType.class,
    NavaidPointType.class,
    NavaidAlignmentType.class,
    RadarComponentUseRestrictionAssociationType.class,
    NavaidCourseType.class,
    RunwayCenterlinePointType.class,
    CommunicationFacilityType.class,
    NavaidComponentUseRestrictionAssociationType.class,
    LandingStripReferenceAssociationTableType.class,
    CheckpointType.class,
    NavaidComponentFrequencyType.class,
    RunwayDeclaredDistanceType.class,
    NavaidSystemAssociationType.class,
    AirportAssociationType.class,
    AirportSystemAssociationType.class,
    TimesheetAssociationType.class,
    RunwayAssociationType.class,
    OrganizationType.class,
    ObstacleReferenceAssociationTableType.class,
    ObstacleSurveySourceType.class,
    ContactReferenceType.class,
    RadarSystemComponentType.class,
    AirportReferenceAssociationTableType.class,
    AmzType.class,
    NavaidUseType.class,
    ParReflectorType.class,
    RadarscopeLocationType.class,
    OrbitType.class,
    ElevatedLocationType.class,
    AirportCheckpointType.class,
    ParRunwayType.class,
    ObstacleCommentType.class,
    ContactPhoneInformationType.class,
    VmdType.class,
    LandingStripAssociationType.class,
    OwnerType.class,
    RadarComponentUseRestrictionType.class,
    ContactType.class,
    NavaidRadarComponentCircleSectorType.class,
    ContactOnlineInformationType.class,
    NavaidComponentDistanceType.class,
    NavaidComponentRunwayDistanceType.class,
    RunwayReferenceAssociationTableType.class,
    LightingSystemAssociationType.class,
    AbstractSystemAuditType.class
})
public abstract class AbstractAuditType {

    @XmlAttribute(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "CreationUserId")
    protected String creationUserId;
    @XmlAttribute(name = "UpdateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    @XmlAttribute(name = "UpdateUserId")
    protected String updateUserId;

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the creationUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     * Sets the value of the creationUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationUserId(String value) {
        this.creationUserId = value;
    }

    /**
     * Gets the value of the updateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    /**
     * Gets the value of the updateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * Sets the value of the updateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUserId(String value) {
        this.updateUserId = value;
    }

}
