
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outagePriorityKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outagePriorityKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outagePriorityKind")
@XmlEnum
public enum OutagePriorityKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutagePriorityKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutagePriorityKind fromValue(String v) {
        for (OutagePriorityKind c: OutagePriorityKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
