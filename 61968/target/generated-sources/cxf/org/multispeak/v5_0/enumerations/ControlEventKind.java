
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlEventKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlEventKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Restore"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlEventKind")
@XmlEnum
public enum ControlEventKind {

    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Restore")
    RESTORE("Restore"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ControlEventKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlEventKind fromValue(String v) {
        for (ControlEventKind c: ControlEventKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
