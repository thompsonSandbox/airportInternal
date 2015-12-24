
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AltimeterSourceListHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltimeterSourceListHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}AltimeterSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltimeterSourceListHolderType", propOrder = {
    "altimeterSource"
})
public class AltimeterSourceListHolderType {

    @XmlElement(name = "AltimeterSource", nillable = true)
    protected List<AltimeterSourceType> altimeterSource;

    /**
     * Gets the value of the altimeterSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altimeterSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltimeterSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltimeterSourceType }
     * 
     * 
     */
    public List<AltimeterSourceType> getAltimeterSource() {
        if (altimeterSource == null) {
            altimeterSource = new ArrayList<AltimeterSourceType>();
        }
        return this.altimeterSource;
    }

}
