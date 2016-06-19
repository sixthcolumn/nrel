
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apparentPowerUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apparentPowerUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="kVA"/>
 *     &lt;enumeration value="MVA"/>
 *     &lt;enumeration value="GVA"/>
 *     &lt;enumeration value="mVA"/>
 *     &lt;enumeration value="microVA"/>
 *     &lt;enumeration value="Per Unit"/>
 *     &lt;enumeration value="Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apparentPowerUnits")
@XmlEnum
public enum ApparentPowerUnits {

    VA("VA"),
    @XmlEnumValue("kVA")
    K_VA("kVA"),
    MVA("MVA"),
    GVA("GVA"),
    @XmlEnumValue("mVA")
    M_VA("mVA"),
    @XmlEnumValue("microVA")
    MICRO_VA("microVA"),
    @XmlEnumValue("Per Unit")
    PER_UNIT("Per Unit"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    ApparentPowerUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApparentPowerUnits fromValue(String v) {
        for (ApparentPowerUnits c: ApparentPowerUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
