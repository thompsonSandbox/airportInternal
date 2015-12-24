
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsOfMeasurement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsOfMeasurement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="MI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsOfMeasurement")
@XmlEnum
public enum UnitsOfMeasurement {


    /**
     * Nautical Miles
     * 
     */
    NM,

    /**
     * Kilometers
     * 
     */
    KM,

    /**
     * Meters
     * 
     */
    M,

    /**
     * Feet
     * 
     */
    FT,

    /**
     * Statute Miles
     * 
     */
    MI;

    public String value() {
        return name();
    }

    public static UnitsOfMeasurement fromValue(String v) {
        return valueOf(v);
    }

}
