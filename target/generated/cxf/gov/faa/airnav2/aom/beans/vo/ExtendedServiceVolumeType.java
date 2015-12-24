
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedServiceVolumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedServiceVolumeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NavaidComponentVersionIdent" type="{http://airnav2.faa.gov/aom/beans/vo}VersionIdentifierType" minOccurs="0"/>
 *         &lt;element name="EsvDisplayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Radial1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Radial2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DistanceNm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinAltitudeFeet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxAltitudeFeet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedServiceVolumeType", propOrder = {
    "navaidComponentVersionIdent",
    "esvDisplayDate",
    "radial1",
    "radial2",
    "distanceNm",
    "minAltitudeFeet",
    "maxAltitudeFeet"
})
public class ExtendedServiceVolumeType {

    @XmlElement(name = "NavaidComponentVersionIdent")
    protected VersionIdentifierType navaidComponentVersionIdent;
    @XmlElementRef(name = "EsvDisplayDate", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> esvDisplayDate;
    @XmlElementRef(name = "Radial1", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radial1;
    @XmlElementRef(name = "Radial2", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radial2;
    @XmlElementRef(name = "DistanceNm", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> distanceNm;
    @XmlElementRef(name = "MinAltitudeFeet", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> minAltitudeFeet;
    @XmlElementRef(name = "MaxAltitudeFeet", namespace = "http://airnav2.faa.gov/aom/beans/vo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> maxAltitudeFeet;

    /**
     * Gets the value of the navaidComponentVersionIdent property.
     * 
     * @return
     *     possible object is
     *     {@link VersionIdentifierType }
     *     
     */
    public VersionIdentifierType getNavaidComponentVersionIdent() {
        return navaidComponentVersionIdent;
    }

    /**
     * Sets the value of the navaidComponentVersionIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIdentifierType }
     *     
     */
    public void setNavaidComponentVersionIdent(VersionIdentifierType value) {
        this.navaidComponentVersionIdent = value;
    }

    /**
     * Gets the value of the esvDisplayDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEsvDisplayDate() {
        return esvDisplayDate;
    }

    /**
     * Sets the value of the esvDisplayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEsvDisplayDate(JAXBElement<String> value) {
        this.esvDisplayDate = value;
    }

    /**
     * Gets the value of the radial1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadial1() {
        return radial1;
    }

    /**
     * Sets the value of the radial1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadial1(JAXBElement<Double> value) {
        this.radial1 = value;
    }

    /**
     * Gets the value of the radial2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadial2() {
        return radial2;
    }

    /**
     * Sets the value of the radial2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadial2(JAXBElement<Double> value) {
        this.radial2 = value;
    }

    /**
     * Gets the value of the distanceNm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDistanceNm() {
        return distanceNm;
    }

    /**
     * Sets the value of the distanceNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDistanceNm(JAXBElement<Double> value) {
        this.distanceNm = value;
    }

    /**
     * Gets the value of the minAltitudeFeet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinAltitudeFeet() {
        return minAltitudeFeet;
    }

    /**
     * Sets the value of the minAltitudeFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinAltitudeFeet(JAXBElement<Double> value) {
        this.minAltitudeFeet = value;
    }

    /**
     * Gets the value of the maxAltitudeFeet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaxAltitudeFeet() {
        return maxAltitudeFeet;
    }

    /**
     * Sets the value of the maxAltitudeFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaxAltitudeFeet(JAXBElement<Double> value) {
        this.maxAltitudeFeet = value;
    }

}
