
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="AMEND"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="ABRVT_AMEND"/>
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="P_NOTAM"/>
 *     &lt;enumeration value="REINSTATE"/>
 *     &lt;enumeration value="REVW_INQ"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="T_NOTAM"/>
 *     &lt;enumeration value="AMEND_ALIGN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskActionType")
@XmlEnum
public enum TaskActionType {

    CREATE,
    AMEND,
    UPDATE,
    CANCEL,
    ABRVT_AMEND,
    ADD,
    NEW,
    P_NOTAM,
    REINSTATE,
    REVW_INQ,
    SUSPEND,
    T_NOTAM,
    AMEND_ALIGN;

    public String value() {
        return name();
    }

    public static TaskActionType fromValue(String v) {
        return valueOf(v);
    }

}
