
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountyReferenceDataListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountyReferenceDataListHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}CountyReferenceData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountyReferenceDataListHolderType", propOrder = {
    "countyReferenceData"
})
public class CountyReferenceDataListHolderType {

    @XmlElement(name = "CountyReferenceData", nillable = true)
    protected List<CountyReferenceDataType> countyReferenceData;

    /**
     * Gets the value of the countyReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountyReferenceDataType }
     * 
     * 
     */
    public List<CountyReferenceDataType> getCountyReferenceData() {
        if (countyReferenceData == null) {
            countyReferenceData = new ArrayList<CountyReferenceDataType>();
        }
        return this.countyReferenceData;
    }

}
