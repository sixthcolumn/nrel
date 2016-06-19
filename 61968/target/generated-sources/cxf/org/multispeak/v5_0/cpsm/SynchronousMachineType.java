
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronousMachineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchronousMachineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="generator"/>
 *     &lt;enumeration value="condenser"/>
 *     &lt;enumeration value="generator_or_condenser"/>
 *     &lt;enumeration value="motor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SynchronousMachineType")
@XmlEnum
public enum SynchronousMachineType {

    @XmlEnumValue("generator")
    GENERATOR("generator"),
    @XmlEnumValue("condenser")
    CONDENSER("condenser"),
    @XmlEnumValue("generator_or_condenser")
    GENERATOR_OR_CONDENSER("generator_or_condenser"),
    @XmlEnumValue("motor")
    MOTOR("motor");
    private final String value;

    SynchronousMachineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronousMachineType fromValue(String v) {
        for (SynchronousMachineType c: SynchronousMachineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
