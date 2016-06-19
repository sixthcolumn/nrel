
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DRProgramStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DRProgramStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Rescinded"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DRProgramStatusKind")
@XmlEnum
public enum DRProgramStatusKind {

    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Active means a program for which the end date is in the future and enrollments can be accepted (regardless of DR is currently in effect).
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Suspended means that a customer can be enrolled in the program, but no DR signals will be sent.
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * Rescinded means new customers can no longer be enrolled in the program, but existing customers can continue to participate in the program until the end date of the program.
     * 
     */
    @XmlEnumValue("Rescinded")
    RESCINDED("Rescinded"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DRProgramStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DRProgramStatusKind fromValue(String v) {
        for (DRProgramStatusKind c: DRProgramStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
