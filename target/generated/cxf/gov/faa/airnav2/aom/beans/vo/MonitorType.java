
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonitorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="CommissionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecommissionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LocationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeatureUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilitaryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlignmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ElevatedLocation" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}VmdListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AmzListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NtzListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}MonitorFrequencyListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ContactAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportAssociationListHolder" minOccurs="0"/>
 *         &lt;element name="ViewOnlyComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EditableComment" type="{http://airnav2.faa.gov/aom/beans/vo}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorType", propOrder = {
    "commissionDate",
    "recommissionDate",
    "locationText",
    "isDeleted",
    "featureUseCode",
    "militaryTypeCode",
    "equipmentCode",
    "typeCode",
    "antennaCode",
    "alignmentCode",
    "elevatedLocation",
    "vmdListHolder",
    "amzListHolder",
    "ntzListHolder",
    "monitorFrequencyListHolder",
    "contactAssociationListHolder",
    "airportAssociationListHolder",
    "viewOnlyComment",
    "editableComment"
})
public class MonitorType
    extends TemporalModelType
{

    @XmlElementRef(name = "CommissionDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> commissionDate;
    @XmlElementRef(name = "RecommissionDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recommissionDate;
    @XmlElementRef(name = "LocationText", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationText;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "FeatureUseCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> featureUseCode;
    @XmlElementRef(name = "MilitaryTypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> militaryTypeCode;
    @XmlElementRef(name = "EquipmentCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentCode;
    @XmlElementRef(name = "TypeCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeCode;
    @XmlElementRef(name = "AntennaCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antennaCode;
    @XmlElementRef(name = "AlignmentCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alignmentCode;
    @XmlElement(name = "ElevatedLocation", nillable = true)
    protected ElevatedLocationType elevatedLocation;
    @XmlElement(name = "VmdListHolder", nillable = true)
    protected VmdListHolderType vmdListHolder;
    @XmlElement(name = "AmzListHolder", nillable = true)
    protected AmzListHolderType amzListHolder;
    @XmlElement(name = "NtzListHolder", nillable = true)
    protected NtzListHolderType ntzListHolder;
    @XmlElement(name = "MonitorFrequencyListHolder", nillable = true)
    protected MonitorFrequencyListHolderType monitorFrequencyListHolder;
    @XmlElement(name = "ContactAssociationListHolder", nillable = true)
    protected ContactReferenceListHolderType contactAssociationListHolder;
    @XmlElement(name = "AirportAssociationListHolder", nillable = true)
    protected AirportAssociationListHolderType airportAssociationListHolder;
    @XmlElement(name = "ViewOnlyComment")
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment")
    protected List<CommentType> editableComment;

    /**
     * Gets the value of the commissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCommissionDate() {
        return commissionDate;
    }

    /**
     * Sets the value of the commissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCommissionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.commissionDate = value;
    }

    /**
     * Gets the value of the recommissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecommissionDate() {
        return recommissionDate;
    }

    /**
     * Sets the value of the recommissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecommissionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.recommissionDate = value;
    }

    /**
     * Gets the value of the locationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationText() {
        return locationText;
    }

    /**
     * Sets the value of the locationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationText(JAXBElement<String> value) {
        this.locationText = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the featureUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeatureUseCode() {
        return featureUseCode;
    }

    /**
     * Sets the value of the featureUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeatureUseCode(JAXBElement<String> value) {
        this.featureUseCode = value;
    }

    /**
     * Gets the value of the militaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMilitaryTypeCode() {
        return militaryTypeCode;
    }

    /**
     * Sets the value of the militaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMilitaryTypeCode(JAXBElement<String> value) {
        this.militaryTypeCode = value;
    }

    /**
     * Gets the value of the equipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentCode() {
        return equipmentCode;
    }

    /**
     * Sets the value of the equipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentCode(JAXBElement<String> value) {
        this.equipmentCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeCode(JAXBElement<String> value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the antennaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntennaCode() {
        return antennaCode;
    }

    /**
     * Sets the value of the antennaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntennaCode(JAXBElement<String> value) {
        this.antennaCode = value;
    }

    /**
     * Gets the value of the alignmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlignmentCode() {
        return alignmentCode;
    }

    /**
     * Sets the value of the alignmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlignmentCode(JAXBElement<String> value) {
        this.alignmentCode = value;
    }

    /**
     * Gets the value of the elevatedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedLocationType }
     *     
     */
    public ElevatedLocationType getElevatedLocation() {
        return elevatedLocation;
    }

    /**
     * Sets the value of the elevatedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedLocationType }
     *     
     */
    public void setElevatedLocation(ElevatedLocationType value) {
        this.elevatedLocation = value;
    }

    /**
     * Gets the value of the vmdListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link VmdListHolderType }
     *     
     */
    public VmdListHolderType getVmdListHolder() {
        return vmdListHolder;
    }

    /**
     * Sets the value of the vmdListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmdListHolderType }
     *     
     */
    public void setVmdListHolder(VmdListHolderType value) {
        this.vmdListHolder = value;
    }

    /**
     * Gets the value of the amzListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AmzListHolderType }
     *     
     */
    public AmzListHolderType getAmzListHolder() {
        return amzListHolder;
    }

    /**
     * Sets the value of the amzListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmzListHolderType }
     *     
     */
    public void setAmzListHolder(AmzListHolderType value) {
        this.amzListHolder = value;
    }

    /**
     * Gets the value of the ntzListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link NtzListHolderType }
     *     
     */
    public NtzListHolderType getNtzListHolder() {
        return ntzListHolder;
    }

    /**
     * Sets the value of the ntzListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NtzListHolderType }
     *     
     */
    public void setNtzListHolder(NtzListHolderType value) {
        this.ntzListHolder = value;
    }

    /**
     * Gets the value of the monitorFrequencyListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorFrequencyListHolderType }
     *     
     */
    public MonitorFrequencyListHolderType getMonitorFrequencyListHolder() {
        return monitorFrequencyListHolder;
    }

    /**
     * Sets the value of the monitorFrequencyListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorFrequencyListHolderType }
     *     
     */
    public void setMonitorFrequencyListHolder(MonitorFrequencyListHolderType value) {
        this.monitorFrequencyListHolder = value;
    }

    /**
     * Gets the value of the contactAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link ContactReferenceListHolderType }
     *     
     */
    public ContactReferenceListHolderType getContactAssociationListHolder() {
        return contactAssociationListHolder;
    }

    /**
     * Sets the value of the contactAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactReferenceListHolderType }
     *     
     */
    public void setContactAssociationListHolder(ContactReferenceListHolderType value) {
        this.contactAssociationListHolder = value;
    }

    /**
     * Gets the value of the airportAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportAssociationListHolderType }
     *     
     */
    public AirportAssociationListHolderType getAirportAssociationListHolder() {
        return airportAssociationListHolder;
    }

    /**
     * Sets the value of the airportAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportAssociationListHolderType }
     *     
     */
    public void setAirportAssociationListHolder(AirportAssociationListHolderType value) {
        this.airportAssociationListHolder = value;
    }

    /**
     * Gets the value of the viewOnlyComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewOnlyComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewOnlyComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getViewOnlyComment() {
        if (viewOnlyComment == null) {
            viewOnlyComment = new ArrayList<CommentType>();
        }
        return this.viewOnlyComment;
    }

    /**
     * Gets the value of the editableComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editableComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditableComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getEditableComment() {
        if (editableComment == null) {
            editableComment = new ArrayList<CommentType>();
        }
        return this.editableComment;
    }

}
