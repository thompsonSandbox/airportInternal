
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandingStripType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandingStripType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}TemporalModelType">
 *       &lt;sequence>
 *         &lt;element name="SurfaceConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurfaceCompositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="LengthAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="WidthAccuracy" type="{http://airnav2.faa.gov/aom/beans/vo}DistanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="CalculationsStaleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}SurveySource" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RunwayAssociationListHolder" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AirportReferenceAssociationTableListHolder" minOccurs="0"/>
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
@XmlType(name = "LandingStripType", propOrder = {
    "surfaceConditionCode",
    "surfaceCompositionCode",
    "length",
    "lengthAccuracy",
    "width",
    "widthAccuracy",
    "calculationsStaleIndicator",
    "isDeleted",
    "surveySource",
    "runwayAssociationListHolder",
    "airportReferenceAssociationTableListHolder",
    "viewOnlyComment",
    "editableComment"
})
public class LandingStripType
    extends TemporalModelType
{

    @XmlElementRef(name = "SurfaceConditionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surfaceConditionCode;
    @XmlElementRef(name = "SurfaceCompositionCode", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surfaceCompositionCode;
    @XmlElementRef(name = "Length", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> length;
    @XmlElementRef(name = "LengthAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> lengthAccuracy;
    @XmlElementRef(name = "Width", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> width;
    @XmlElementRef(name = "WidthAccuracy", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceMeasurementType> widthAccuracy;
    @XmlElementRef(name = "CalculationsStaleIndicator", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> calculationsStaleIndicator;
    @XmlElementRef(name = "IsDeleted", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElement(name = "SurveySource", nillable = true)
    protected SurveySourceType surveySource;
    @XmlElement(name = "RunwayAssociationListHolder", nillable = true)
    protected RunwayAssociationListHolderType runwayAssociationListHolder;
    @XmlElement(name = "AirportReferenceAssociationTableListHolder", nillable = true)
    protected AirportReferenceAssociationTableListHolderType airportReferenceAssociationTableListHolder;
    @XmlElement(name = "ViewOnlyComment", nillable = true)
    protected List<CommentType> viewOnlyComment;
    @XmlElement(name = "EditableComment", nillable = true)
    protected List<CommentType> editableComment;

    /**
     * Gets the value of the surfaceConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurfaceConditionCode() {
        return surfaceConditionCode;
    }

    /**
     * Sets the value of the surfaceConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurfaceConditionCode(JAXBElement<String> value) {
        this.surfaceConditionCode = value;
    }

    /**
     * Gets the value of the surfaceCompositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurfaceCompositionCode() {
        return surfaceCompositionCode;
    }

    /**
     * Sets the value of the surfaceCompositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurfaceCompositionCode(JAXBElement<String> value) {
        this.surfaceCompositionCode = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setLength(JAXBElement<DistanceMeasurementType> value) {
        this.length = value;
    }

    /**
     * Gets the value of the lengthAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getLengthAccuracy() {
        return lengthAccuracy;
    }

    /**
     * Sets the value of the lengthAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setLengthAccuracy(JAXBElement<DistanceMeasurementType> value) {
        this.lengthAccuracy = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setWidth(JAXBElement<DistanceMeasurementType> value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public JAXBElement<DistanceMeasurementType> getWidthAccuracy() {
        return widthAccuracy;
    }

    /**
     * Sets the value of the widthAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceMeasurementType }{@code >}
     *     
     */
    public void setWidthAccuracy(JAXBElement<DistanceMeasurementType> value) {
        this.widthAccuracy = value;
    }

    /**
     * Gets the value of the calculationsStaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCalculationsStaleIndicator() {
        return calculationsStaleIndicator;
    }

    /**
     * Sets the value of the calculationsStaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCalculationsStaleIndicator(JAXBElement<Boolean> value) {
        this.calculationsStaleIndicator = value;
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
     * Gets the value of the surveySource property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySourceType }
     *     
     */
    public SurveySourceType getSurveySource() {
        return surveySource;
    }

    /**
     * Sets the value of the surveySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySourceType }
     *     
     */
    public void setSurveySource(SurveySourceType value) {
        this.surveySource = value;
    }

    /**
     * Gets the value of the runwayAssociationListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayAssociationListHolderType }
     *     
     */
    public RunwayAssociationListHolderType getRunwayAssociationListHolder() {
        return runwayAssociationListHolder;
    }

    /**
     * Sets the value of the runwayAssociationListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayAssociationListHolderType }
     *     
     */
    public void setRunwayAssociationListHolder(RunwayAssociationListHolderType value) {
        this.runwayAssociationListHolder = value;
    }

    /**
     * Gets the value of the airportReferenceAssociationTableListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link AirportReferenceAssociationTableListHolderType }
     *     
     */
    public AirportReferenceAssociationTableListHolderType getAirportReferenceAssociationTableListHolder() {
        return airportReferenceAssociationTableListHolder;
    }

    /**
     * Sets the value of the airportReferenceAssociationTableListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportReferenceAssociationTableListHolderType }
     *     
     */
    public void setAirportReferenceAssociationTableListHolder(AirportReferenceAssociationTableListHolderType value) {
        this.airportReferenceAssociationTableListHolder = value;
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
