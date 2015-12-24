
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLICATION"/>
 *     &lt;enumeration value="PROPOSED"/>
 *     &lt;enumeration value="FUTURE"/>
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowModelType")
@XmlEnum
public enum WorkflowModelType {

    PUBLICATION,
    PROPOSED,
    FUTURE,
    TEST,
    OTHER;

    public String value() {
        return name();
    }

    public static WorkflowModelType fromValue(String v) {
        return valueOf(v);
    }

}
