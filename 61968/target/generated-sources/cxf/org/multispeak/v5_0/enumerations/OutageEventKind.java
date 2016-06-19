
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageEventKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageEventKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Outage"/>
 *     &lt;enumeration value="Restoration"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Inferred"/>
 *     &lt;enumeration value="PowerOn"/>
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageEventKind")
@XmlEnum
public enum OutageEventKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Outage")
    OUTAGE("Outage"),
    @XmlEnumValue("Restoration")
    RESTORATION("Restoration"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Inferred")
    INFERRED("Inferred"),
    @XmlEnumValue("PowerOn")
    POWER_ON("PowerOn"),
    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageEventKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageEventKind fromValue(String v) {
        for (OutageEventKind c: OutageEventKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
