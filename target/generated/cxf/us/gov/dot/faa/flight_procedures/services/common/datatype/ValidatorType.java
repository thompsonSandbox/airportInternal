
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IS_LOCKED"/>
 *     &lt;enumeration value="PRINTABLE_VERSION"/>
 *     &lt;enumeration value="TIME_SLICE_ALIGNMENT"/>
 *     &lt;enumeration value="TIME_SLICE_CHANGE"/>
 *     &lt;enumeration value="WORKFLOW"/>
 *     &lt;enumeration value="INSERTION"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="ELIGIBLE_FOR_CANCELLATION"/>
 *     &lt;enumeration value="CHART_DATE"/>
 *     &lt;enumeration value="ARINC"/>
 *     &lt;enumeration value="STATUS_W_TO_P"/>
 *     &lt;enumeration value="STATUS_P_TO_A"/>
 *     &lt;enumeration value="PARAMETER_VALIDATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidatorType")
@XmlEnum
public enum ValidatorType {

    IS_LOCKED,
    PRINTABLE_VERSION,
    TIME_SLICE_ALIGNMENT,
    TIME_SLICE_CHANGE,
    WORKFLOW,
    INSERTION,
    DELETE,
    ELIGIBLE_FOR_CANCELLATION,
    CHART_DATE,
    ARINC,
    STATUS_W_TO_P,
    STATUS_P_TO_A,
    PARAMETER_VALIDATION;

    public String value() {
        return name();
    }

    public static ValidatorType fromValue(String v) {
        return valueOf(v);
    }

}
