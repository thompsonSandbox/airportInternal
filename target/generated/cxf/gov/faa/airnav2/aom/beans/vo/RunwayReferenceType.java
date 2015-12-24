
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunwayReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://airnav2.faa.gov/aom/beans/vo}VersionIdentifierType" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ObstacleReferenceAssociationTableListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LandingStripReferenceAssociationTableListHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayReferenceType", propOrder = {
    "identifier",
    "obstacleReferenceAssociationTableListHolder",
    "landingStripReferenceAssociationTableListHolder"
})
public class RunwayReferenceType {

    @XmlElement(name = "Identifier")
    protected VersionIdentifierType identifier;
    @XmlElement(name = "ObstacleReferenceAssociationTableListHolder", nillable = true)
    protected ObstacleReferenceAssociationTableListHolderType obstacleReferenceAssociationTableListHolder;
    @XmlElement(name = "LandingStripReferenceAssociationTableListHolder", nillable = true)
    protected LandingStripReferenceAssociationTableListHolderType landingStripReferenceAssociationTableListHolder;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link VersionIdentifierType }
     *     
     */
    public VersionIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIdentifierType }
     *     
     */
    public void setIdentifier(VersionIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the obstacleReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ObstacleReferenceAssociationTableListHolderType }
     *     
     */
    public ObstacleReferenceAssociationTableListHolderType getObstacleReferenceAssociationTableListHolder() {
        return obstacleReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the obstacleReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstacleReferenceAssociationTableListHolderType }
     *     
     */
    public void setObstacleReferenceAssociationTableListHolder(ObstacleReferenceAssociationTableListHolderType value) {
        this.obstacleReferenceAssociationTableListHolder = value;
    }

    /**
     * Gets the value of the landingStripReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link LandingStripReferenceAssociationTableListHolderType }
     *     
     */
    public LandingStripReferenceAssociationTableListHolderType getLandingStripReferenceAssociationTableListHolder() {
        return landingStripReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the landingStripReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingStripReferenceAssociationTableListHolderType }
     *     
     */
    public void setLandingStripReferenceAssociationTableListHolder(LandingStripReferenceAssociationTableListHolderType value) {
        this.landingStripReferenceAssociationTableListHolder = value;
    }

}
