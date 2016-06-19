
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for swType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="swType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Voltage"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="ReactiveAmps"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Temperature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "swType")
@XmlEnum
public enum SwType {

    @XmlEnumValue("Other")
    OTHER("Other"),
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
    TEMPERATURE("Temperature");
    private final String value;

    SwType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwType fromValue(String v) {
        for (SwType c: SwType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
