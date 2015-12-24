
package gov.faa.avnis.ipws.headers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationSetNameTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigurationSetNameTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CountryCode"/>
 *     &lt;enumeration value="MasterFixName"/>
 *     &lt;enumeration value="SIAPStandardNote"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationSetNameTypeType")
@XmlEnum
public enum ConfigurationSetNameTypeType {

    @XmlEnumValue("CountryCode")
    COUNTRY_CODE("CountryCode"),
    @XmlEnumValue("MasterFixName")
    MASTER_FIX_NAME("MasterFixName"),
    @XmlEnumValue("SIAPStandardNote")
    SIAP_STANDARD_NOTE("SIAPStandardNote");
    private final String value;

    ConfigurationSetNameTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationSetNameTypeType fromValue(String v) {
        for (ConfigurationSetNameTypeType c: ConfigurationSetNameTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
