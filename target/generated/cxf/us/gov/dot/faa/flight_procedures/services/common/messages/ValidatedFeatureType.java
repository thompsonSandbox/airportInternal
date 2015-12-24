
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureIdentifierType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.YesOrNoType;


/**
 * <p>Java class for ValidatedFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidatedFeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}FeatureIdentifier"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonDetail" type="{urn:us:gov:dot:faa:flight-procedures:services:common:messages}ReasonDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isValid" use="required" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}YesOrNoType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatedFeatureType", propOrder = {
    "featureIdentifier",
    "name",
    "formattedMsg",
    "reason",
    "reasonDetail"
})
public class ValidatedFeatureType {

    @XmlElement(name = "FeatureIdentifier", required = true)
    protected FeatureIdentifierType featureIdentifier;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FormattedMsg")
    protected String formattedMsg;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "ReasonDetail")
    protected ReasonDetailType reasonDetail;
    @XmlAttribute(name = "isValid", required = true)
    protected YesOrNoType isValid;

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

    /**
     * Gets the value of the formattedMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedMsg() {
        return formattedMsg;
    }

    /**
     * Sets the value of the formattedMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedMsg(String value) {
        this.formattedMsg = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonDetailType }
     *     
     */
    public ReasonDetailType getReasonDetail() {
        return reasonDetail;
    }

    /**
     * Sets the value of the reasonDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonDetailType }
     *     
     */
    public void setReasonDetail(ReasonDetailType value) {
        this.reasonDetail = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNoType }
     *     
     */
    public YesOrNoType getIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNoType }
     *     
     */
    public void setIsValid(YesOrNoType value) {
        this.isValid = value;
    }

}
