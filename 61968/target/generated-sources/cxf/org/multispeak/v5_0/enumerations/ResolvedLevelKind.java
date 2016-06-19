
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resolvedLevelKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resolvedLevelKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resolvedLevelKind")
@XmlEnum
public enum ResolvedLevelKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResolvedLevelKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolvedLevelKind fromValue(String v) {
        for (ResolvedLevelKind c: ResolvedLevelKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
