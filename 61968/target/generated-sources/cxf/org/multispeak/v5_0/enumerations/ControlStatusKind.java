
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ControlAccepted"/>
 *     &lt;enumeration value="SelectTimeout"/>
 *     &lt;enumeration value="PointNotSelected"/>
 *     &lt;enumeration value="FormattingErrorsInControlRequest"/>
 *     &lt;enumeration value="ControlNotSupported"/>
 *     &lt;enumeration value="ControlQueueFull"/>
 *     &lt;enumeration value="HardwareFailure"/>
 *     &lt;enumeration value="PointAlreadySelected"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlStatusKind")
@XmlEnum
public enum ControlStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ControlAccepted")
    CONTROL_ACCEPTED("ControlAccepted"),
    @XmlEnumValue("SelectTimeout")
    SELECT_TIMEOUT("SelectTimeout"),
    @XmlEnumValue("PointNotSelected")
    POINT_NOT_SELECTED("PointNotSelected"),
    @XmlEnumValue("FormattingErrorsInControlRequest")
    FORMATTING_ERRORS_IN_CONTROL_REQUEST("FormattingErrorsInControlRequest"),
    @XmlEnumValue("ControlNotSupported")
    CONTROL_NOT_SUPPORTED("ControlNotSupported"),
    @XmlEnumValue("ControlQueueFull")
    CONTROL_QUEUE_FULL("ControlQueueFull"),
    @XmlEnumValue("HardwareFailure")
    HARDWARE_FAILURE("HardwareFailure"),
    @XmlEnumValue("PointAlreadySelected")
    POINT_ALREADY_SELECTED("PointAlreadySelected"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ControlStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlStatusKind fromValue(String v) {
        for (ControlStatusKind c: ControlStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
