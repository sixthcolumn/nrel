
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priorityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priorityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="NeedsAttention"/>
 *     &lt;enumeration value="Urgent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priorityType")
@XmlEnum
public enum PriorityType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("NeedsAttention")
    NEEDS_ATTENTION("NeedsAttention"),
    @XmlEnumValue("Urgent")
    URGENT("Urgent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PriorityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriorityType fromValue(String v) {
        for (PriorityType c: PriorityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
