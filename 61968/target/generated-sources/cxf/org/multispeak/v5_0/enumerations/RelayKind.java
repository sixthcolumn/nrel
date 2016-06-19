
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relayKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relayKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Trip"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relayKind")
@XmlEnum
public enum RelayKind {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Trip")
    TRIP("Trip"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RelayKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayKind fromValue(String v) {
        for (RelayKind c: RelayKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
