
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Enable"/>
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionFlag")
@XmlEnum
public enum ActionFlag {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Enable")
    ENABLE("Enable"),
    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ActionFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionFlag fromValue(String v) {
        for (ActionFlag c: ActionFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
