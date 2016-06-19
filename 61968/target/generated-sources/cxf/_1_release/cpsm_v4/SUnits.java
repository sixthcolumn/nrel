
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="microS"/>
 *     &lt;enumeration value="mS"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="kS"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="Siemens"/>
 *     &lt;enumeration value="mho"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sUnits")
@XmlEnum
public enum SUnits {

    @XmlEnumValue("microS")
    MICRO_S("microS"),
    @XmlEnumValue("mS")
    M_S("mS"),
    S("S"),
    @XmlEnumValue("kS")
    K_S("kS"),
    MS("MS"),
    @XmlEnumValue("Siemens")
    SIEMENS("Siemens"),
    @XmlEnumValue("mho")
    MHO("mho");
    private final String value;

    SUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SUnits fromValue(String v) {
        for (SUnits c: SUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
