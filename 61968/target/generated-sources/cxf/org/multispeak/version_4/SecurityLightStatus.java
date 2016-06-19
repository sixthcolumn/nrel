
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityLightStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="securityLightStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NewConnect"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "securityLightStatus")
@XmlEnum
public enum SecurityLightStatus {

    @XmlEnumValue("NewConnect")
    NEW_CONNECT("NewConnect"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SecurityLightStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityLightStatus fromValue(String v) {
        for (SecurityLightStatus c: SecurityLightStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
