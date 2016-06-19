
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callBackStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callBackStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="StillOff"/>
 *     &lt;enumeration value="Undialable"/>
 *     &lt;enumeration value="MaxDial"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callBackStatusKind")
@XmlEnum
public enum CallBackStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("StillOff")
    STILL_OFF("StillOff"),
    @XmlEnumValue("Undialable")
    UNDIALABLE("Undialable"),
    @XmlEnumValue("MaxDial")
    MAX_DIAL("MaxDial"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CallBackStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallBackStatusKind fromValue(String v) {
        for (CallBackStatusKind c: CallBackStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
