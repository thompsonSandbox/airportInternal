
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hits"/>
 *     &lt;enumeration value="summary"/>
 *     &lt;enumeration value="extendedSummary"/>
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="extendedDetail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetailLevelType")
@XmlEnum
public enum DetailLevelType {

    @XmlEnumValue("hits")
    HITS("hits"),
    @XmlEnumValue("summary")
    SUMMARY("summary"),
    @XmlEnumValue("extendedSummary")
    EXTENDED_SUMMARY("extendedSummary"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("extendedDetail")
    EXTENDED_DETAIL("extendedDetail");
    private final String value;

    DetailLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevelType fromValue(String v) {
        for (DetailLevelType c: DetailLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
