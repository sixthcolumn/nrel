
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlCodeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlCodeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pulse on"/>
 *     &lt;enumeration value="Pulse off"/>
 *     &lt;enumeration value="Latch on"/>
 *     &lt;enumeration value="Latch off"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlCodeKind")
@XmlEnum
public enum ControlCodeKind {

    @XmlEnumValue("Pulse on")
    PULSE_ON("Pulse on"),
    @XmlEnumValue("Pulse off")
    PULSE_OFF("Pulse off"),
    @XmlEnumValue("Latch on")
    LATCH_ON("Latch on"),
    @XmlEnumValue("Latch off")
    LATCH_OFF("Latch off"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ControlCodeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlCodeKind fromValue(String v) {
        for (ControlCodeKind c: ControlCodeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
