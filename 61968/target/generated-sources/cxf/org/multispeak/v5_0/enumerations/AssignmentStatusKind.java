
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignmentStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="ReceivedAssignment"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Queued"/>
 *     &lt;enumeration value="TimedOut"/>
 *     &lt;enumeration value="PartiallyCompleted"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignmentStatusKind")
@XmlEnum
public enum AssignmentStatusKind {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("ReceivedAssignment")
    RECEIVED_ASSIGNMENT("ReceivedAssignment"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("TimedOut")
    TIMED_OUT("TimedOut"),
    @XmlEnumValue("PartiallyCompleted")
    PARTIALLY_COMPLETED("PartiallyCompleted"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("Returned")
    RETURNED("Returned"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AssignmentStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignmentStatusKind fromValue(String v) {
        for (AssignmentStatusKind c: AssignmentStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
