
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="switchTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Voltage"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="ReactiveAmps"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Temperature"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "switchTypeKind")
@XmlEnum
public enum SwitchTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Voltage")
    VOLTAGE("Voltage"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("ReactiveAmps")
    REACTIVE_AMPS("ReactiveAmps"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SwitchTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchTypeKind fromValue(String v) {
        for (SwitchTypeKind c: SwitchTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
