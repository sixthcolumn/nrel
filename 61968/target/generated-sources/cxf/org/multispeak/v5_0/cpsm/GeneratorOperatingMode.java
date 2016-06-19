
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneratorOperatingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneratorOperatingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="LFC"/>
 *     &lt;enumeration value="AGC"/>
 *     &lt;enumeration value="EDC"/>
 *     &lt;enumeration value="MRN"/>
 *     &lt;enumeration value="REG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneratorOperatingMode")
@XmlEnum
public enum GeneratorOperatingMode {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    LFC("LFC"),
    AGC("AGC"),
    EDC("EDC"),
    MRN("MRN"),
    REG("REG");
    private final String value;

    GeneratorOperatingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneratorOperatingMode fromValue(String v) {
        for (GeneratorOperatingMode c: GeneratorOperatingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
