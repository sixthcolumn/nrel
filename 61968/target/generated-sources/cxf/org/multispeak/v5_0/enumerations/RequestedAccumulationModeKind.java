
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedAccumulationModeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestedAccumulationModeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="AccumulatedStatus"/>
 *     &lt;enumeration value="IndividualDevices"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestedAccumulationModeKind")
@XmlEnum
public enum RequestedAccumulationModeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AccumulatedStatus")
    ACCUMULATED_STATUS("AccumulatedStatus"),
    @XmlEnumValue("IndividualDevices")
    INDIVIDUAL_DEVICES("IndividualDevices"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RequestedAccumulationModeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedAccumulationModeKind fromValue(String v) {
        for (RequestedAccumulationModeKind c: RequestedAccumulationModeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
