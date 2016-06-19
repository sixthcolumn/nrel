
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Outage"/>
 *     &lt;enumeration value="Restoration"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Inferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageEventType")
@XmlEnum
public enum OutageEventType {

    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Outage")
    OUTAGE("Outage"),
    @XmlEnumValue("Restoration")
    RESTORATION("Restoration"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Inferred")
    INFERRED("Inferred");
    private final String value;

    OutageEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageEventType fromValue(String v) {
        for (OutageEventType c: OutageEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
