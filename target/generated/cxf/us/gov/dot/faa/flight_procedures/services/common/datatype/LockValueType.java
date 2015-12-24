
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNLINKED"/>
 *     &lt;enumeration value="UNLOCKED"/>
 *     &lt;enumeration value="LOCKED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockValueType")
@XmlEnum
public enum LockValueType {

    UNLINKED,
    UNLOCKED,
    LOCKED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LockValueType fromValue(String v) {
        return valueOf(v);
    }

}
