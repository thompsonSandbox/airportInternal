
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             Contains a distance and its unit of measurement
 *         
 * 
 * <p>Java class for Measurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Measurement">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="unit" type="{urn:us:gov:dot:faa:flight-procedures:services:common:datatype}UnitsOfMeasurement" default="M" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measurement", propOrder = {
    "value"
})
public class Measurement {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "unit")
    protected UnitsOfMeasurement unit;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfMeasurement }
     *     
     */
    public UnitsOfMeasurement getUnit() {
        if (unit == null) {
            return UnitsOfMeasurement.M;
        } else {
            return unit;
        }
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfMeasurement }
     *     
     */
    public void setUnit(UnitsOfMeasurement value) {
        this.unit = value;
    }

}
