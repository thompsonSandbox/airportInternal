
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullCountryReferenceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullCountryReferenceDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}CountryReferenceDataType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CityReferenceDataListHolder"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}FullStateReferenceDataListHolder"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullCountryReferenceDataType", propOrder = {
    "cityReferenceDataListHolder",
    "fullStateReferenceDataListHolder"
})
public class FullCountryReferenceDataType
    extends CountryReferenceDataType
{

    @XmlElement(name = "CityReferenceDataListHolder", required = true, nillable = true)
    protected CityReferenceDataListHolderType cityReferenceDataListHolder;
    @XmlElement(name = "FullStateReferenceDataListHolder", required = true, nillable = true)
    protected FullStateReferenceDataListHolderType fullStateReferenceDataListHolder;

    /**
     * Gets the value of the cityReferenceDataListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link CityReferenceDataListHolderType }
     *     
     */
    public CityReferenceDataListHolderType getCityReferenceDataListHolder() {
        return cityReferenceDataListHolder;
    }

    /**
     * Sets the value of the cityReferenceDataListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityReferenceDataListHolderType }
     *     
     */
    public void setCityReferenceDataListHolder(CityReferenceDataListHolderType value) {
        this.cityReferenceDataListHolder = value;
    }

    /**
     * Gets the value of the fullStateReferenceDataListHolder property.
     * 
     * @return
     *     possible object is
     *     {@link FullStateReferenceDataListHolderType }
     *     
     */
    public FullStateReferenceDataListHolderType getFullStateReferenceDataListHolder() {
        return fullStateReferenceDataListHolder;
    }

    /**
     * Sets the value of the fullStateReferenceDataListHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullStateReferenceDataListHolderType }
     *     
     */
    public void setFullStateReferenceDataListHolder(FullStateReferenceDataListHolderType value) {
        this.fullStateReferenceDataListHolder = value;
    }

}
