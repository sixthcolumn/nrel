
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for machineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="machineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Motor"/>
 *     &lt;enumeration value="Generator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "machineType")
@XmlEnum
public enum MachineType {

    @XmlEnumValue("Motor")
    MOTOR("Motor"),
    @XmlEnumValue("Generator")
    GENERATOR("Generator");
    private final String value;

    MachineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MachineType fromValue(String v) {
        for (MachineType c: MachineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
