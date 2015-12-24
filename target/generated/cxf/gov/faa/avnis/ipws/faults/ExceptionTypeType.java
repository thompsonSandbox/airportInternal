
package gov.faa.avnis.ipws.faults;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION_EXCEPTION"/>
 *     &lt;enumeration value="DATA_SOURCE_UNAVAILABLE"/>
 *     &lt;enumeration value="DATA_STALE"/>
 *     &lt;enumeration value="DATA_UNAVAILABLE"/>
 *     &lt;enumeration value="DATA_VALIDATION_ERROR"/>
 *     &lt;enumeration value="INVALID_PERMISSIONS"/>
 *     &lt;enumeration value="INVALID_VERSION"/>
 *     &lt;enumeration value="NOT_AUTHENTICATED"/>
 *     &lt;enumeration value="QUERY_SIZE"/>
 *     &lt;enumeration value="SCHEMA_VALIDATION_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionTypeType")
@XmlEnum
public enum ExceptionTypeType {


    /**
     * 
     *                     An exception has occured in the application.
     *                     
     *                     Recourse: Notify help desk.
     *                 
     * 
     */
    APPLICATION_EXCEPTION,

    /**
     * 
     *                     The data source has timed out or is otherwise unavailable.
     *                     
     *                     Recourse: Retry request after a delay.
     *                 
     * 
     */
    DATA_SOURCE_UNAVAILABLE,

    /**
     * 
     *                     The data being acted upon is stale and thus must be refreshed.
     *                     
     *                     Recourse: Refresh data and repeat operation.
     *                 
     * 
     */
    DATA_STALE,

    /**
     * 
     *                     The data being acted upon is unavailable.
     *                     
     *                     Recourse: Notify of problem.
     *                 
     * 
     */
    DATA_UNAVAILABLE,

    /**
     * 
     *                     The data submitted is not valid.
     *                     
     *                     Recourse: Notify of validation problems, fix, then resubmit.
     *                 
     * 
     */
    DATA_VALIDATION_ERROR,

    /**
     * 
     *                     The client does not have the appropriate permissions to 
     *                     perform the given operation.
     *                     
     *                     Recourse: Notify of permission problems.
     *                 
     * 
     */
    INVALID_PERMISSIONS,

    /**
     * 
     *                     The version of the web service being called is old/invalid.
     *                     
     *                     Recourse: Notify help desk.
     *                 
     * 
     */
    INVALID_VERSION,

    /**
     * 
     *                     The client is not authenticated with the enterprise.
     *                     
     *                     Recourse: Re-authenticate client.
     *                 
     * 
     */
    NOT_AUTHENTICATED,

    /**
     * 
     *                     The size of the query is too large to handle a must be redone with a smaller 
     *                     request.
     *                     
     *                     Recourse: Repeat operation with smaller query size.
     *                 
     * 
     */
    QUERY_SIZE,

    /**
     * 
     *                     A message failed validation.
     *                     
     *                     Recourse: Notify help desk.
     *                 
     * 
     */
    SCHEMA_VALIDATION_ERROR,

    /**
     * 
     *                     Umbrella fault type for as yet unknown exceptions.
     *                     
     *                     Recourse: Gain insight from severity as to recourse.
     *                 
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExceptionTypeType fromValue(String v) {
        return valueOf(v);
    }

}
