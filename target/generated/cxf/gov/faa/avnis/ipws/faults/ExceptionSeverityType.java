
package gov.faa.avnis.ipws.faults;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionSeverityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionSeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETRY"/>
 *     &lt;enumeration value="MINOR"/>
 *     &lt;enumeration value="MAJOR"/>
 *     &lt;enumeration value="FATAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionSeverityType")
@XmlEnum
public enum ExceptionSeverityType {


    /**
     * 
     *                     Cue that the exception is not fatal and that a simple retry
     *                     will possibly remedy the situation.
     *                 
     * 
     */
    RETRY,

    /**
     * 
     *                     Cue that a recourse is possibly available and notification to 
     *                     user plus logging may not be necessary.
     *                 
     * 
     */
    MINOR,

    /**
     * 
     *                     Cue that a recourse is not possible and notification to the
     *                     user plus logging may be necessary.  Also notification to 
     *                     the Help Desk may be necessary.
     *                 
     * 
     */
    MAJOR,

    /**
     * 
     *                     Cue that no recourse is available and notification to user
     *                     plus logging is necessary.  Also notification to the Help 
     *                     Desk is be necessary.
     *                 
     * 
     */
    FATAL;

    public String value() {
        return name();
    }

    public static ExceptionSeverityType fromValue(String v) {
        return valueOf(v);
    }

}
