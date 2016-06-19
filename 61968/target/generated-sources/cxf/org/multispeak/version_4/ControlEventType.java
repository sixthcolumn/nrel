
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Restore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlEventType")
@XmlEnum
public enum ControlEventType {

    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Restore")
    RESTORE("Restore");
    private final String value;

    ControlEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlEventType fromValue(String v) {
        for (ControlEventType c: ControlEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
