
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resolvedLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resolvedLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resolvedLevel")
@XmlEnum
public enum ResolvedLevel {

    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ResolvedLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolvedLevel fromValue(String v) {
        for (ResolvedLevel c: ResolvedLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
