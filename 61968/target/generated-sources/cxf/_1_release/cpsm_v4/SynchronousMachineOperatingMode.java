
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronousMachineOperatingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchronousMachineOperatingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="generator"/>
 *     &lt;enumeration value="condenser"/>
 *     &lt;enumeration value="motor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SynchronousMachineOperatingMode")
@XmlEnum
public enum SynchronousMachineOperatingMode {

    @XmlEnumValue("generator")
    GENERATOR("generator"),
    @XmlEnumValue("condenser")
    CONDENSER("condenser"),
    @XmlEnumValue("motor")
    MOTOR("motor");
    private final String value;

    SynchronousMachineOperatingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronousMachineOperatingMode fromValue(String v) {
        for (SynchronousMachineOperatingMode c: SynchronousMachineOperatingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
