
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="notEquals"/>
 *     &lt;enumeration value="greaterThanEqualsTo"/>
 *     &lt;enumeration value="lessThanEqualsTo"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="like"/>
 *     &lt;enumeration value="between"/>
 *     &lt;enumeration value="activeOn"/>
 *     &lt;enumeration value="isNull"/>
 *     &lt;enumeration value="isNotNull"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorType")
@XmlEnum
public enum OperatorType {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("greaterThanEqualsTo")
    GREATER_THAN_EQUALS_TO("greaterThanEqualsTo"),
    @XmlEnumValue("lessThanEqualsTo")
    LESS_THAN_EQUALS_TO("lessThanEqualsTo"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("between")
    BETWEEN("between"),
    @XmlEnumValue("activeOn")
    ACTIVE_ON("activeOn"),
    @XmlEnumValue("isNull")
    IS_NULL("isNull"),
    @XmlEnumValue("isNotNull")
    IS_NOT_NULL("isNotNull");
    private final String value;

    OperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorType fromValue(String v) {
        for (OperatorType c: OperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
