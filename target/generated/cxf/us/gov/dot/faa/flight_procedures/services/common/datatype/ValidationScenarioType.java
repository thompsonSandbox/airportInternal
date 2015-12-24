
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationScenarioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationScenarioType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADHOC_VALIDATION"/>
 *     &lt;enumeration value="EDIT_PROJ_CHARTDATE"/>
 *     &lt;enumeration value="EDIT_PROJ_CHARTDATE_QC"/>
 *     &lt;enumeration value="EDIT_PRNT_VERSION"/>
 *     &lt;enumeration value="DEV_COMPLETE_WORK"/>
 *     &lt;enumeration value="FEATURE_PRE_PUBLICATION"/>
 *     &lt;enumeration value="FEATURE_PUBLICATION"/>
 *     &lt;enumeration value="FEATURE_CANCELLATION"/>
 *     &lt;enumeration value="CANCELLATION_TASK"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="UNLINK"/>
 *     &lt;enumeration value="IS_EDITABLE"/>
 *     &lt;enumeration value="PUSH_TO_PENDING"/>
 *     &lt;enumeration value="WF_UNLINK"/>
 *     &lt;enumeration value="TERMINATE_PROJECT"/>
 *     &lt;enumeration value="ARINC_VALIDATION"/>
 *     &lt;enumeration value="FIX_REMARK"/>
 *     &lt;enumeration value="REALIGN"/>
 *     &lt;enumeration value="FLIGHT_CHECK"/>
 *     &lt;enumeration value="ROLLBACK_FLIGHT_CHECK"/>
 *     &lt;enumeration value="PIT"/>
 *     &lt;enumeration value="ROLLBACK_PIT"/>
 *     &lt;enumeration value="CHART"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationScenarioType")
@XmlEnum
public enum ValidationScenarioType {

    ADHOC_VALIDATION,
    EDIT_PROJ_CHARTDATE,
    EDIT_PROJ_CHARTDATE_QC,
    EDIT_PRNT_VERSION,
    DEV_COMPLETE_WORK,
    FEATURE_PRE_PUBLICATION,
    FEATURE_PUBLICATION,
    FEATURE_CANCELLATION,
    CANCELLATION_TASK,
    LINK,
    UNLINK,
    IS_EDITABLE,
    PUSH_TO_PENDING,
    WF_UNLINK,
    TERMINATE_PROJECT,
    ARINC_VALIDATION,
    FIX_REMARK,
    REALIGN,
    FLIGHT_CHECK,
    ROLLBACK_FLIGHT_CHECK,
    PIT,
    ROLLBACK_PIT,
    CHART;

    public String value() {
        return name();
    }

    public static ValidationScenarioType fromValue(String v) {
        return valueOf(v);
    }

}
