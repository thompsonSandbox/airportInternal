
package gov.faa.airnav2.aom.beans.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullStateReferenceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullStateReferenceDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://airnav2.faa.gov/aom/beans/vo}StateReferenceDataType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CityReferenceDataListHolder"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullStateReferenceDataType", propOrder = {
    "cityReferenceDataListHolder"
})
public class FullStateReferenceDataType
    extends StateReferenceDataType
{

    @XmlElement(name = "CityReferenceDataListHolder", required = true, nillable = true)
    protected CityReferenceDataListHolderType cityReferenceDataListHolder;

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

}
