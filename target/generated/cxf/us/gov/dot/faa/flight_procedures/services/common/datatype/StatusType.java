
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="WORKING"/>
 *     &lt;enumeration value="HISTORY"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="DISAPPROVE"/>
 *     &lt;enumeration value="RESTRICT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    ACTIVE,
    PENDING,
    WORKING,
    HISTORY,
    CANCEL,
    DISAPPROVE,
    RESTRICT;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
