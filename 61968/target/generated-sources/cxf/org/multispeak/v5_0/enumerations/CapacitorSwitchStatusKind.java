
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitorSwitchStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capacitorSwitchStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="InTransition"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "capacitorSwitchStatusKind")
@XmlEnum
public enum CapacitorSwitchStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("InTransition")
    IN_TRANSITION("InTransition"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CapacitorSwitchStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapacitorSwitchStatusKind fromValue(String v) {
        for (CapacitorSwitchStatusKind c: CapacitorSwitchStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
