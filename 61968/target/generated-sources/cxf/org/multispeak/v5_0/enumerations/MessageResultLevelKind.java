
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageResultLevelKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageResultLevelKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inform"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Fatal"/>
 *     &lt;enumeration value="Catastrophic"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageResultLevelKind")
@XmlEnum
public enum MessageResultLevelKind {

    @XmlEnumValue("Inform")
    INFORM("Inform"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Fatal")
    FATAL("Fatal"),
    @XmlEnumValue("Catastrophic")
    CATASTROPHIC("Catastrophic"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MessageResultLevelKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageResultLevelKind fromValue(String v) {
        for (MessageResultLevelKind c: MessageResultLevelKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
