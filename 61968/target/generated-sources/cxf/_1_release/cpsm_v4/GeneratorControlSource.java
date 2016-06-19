
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneratorControlSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneratorControlSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="offAGC"/>
 *     &lt;enumeration value="onAGC"/>
 *     &lt;enumeration value="PlantControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneratorControlSource")
@XmlEnum
public enum GeneratorControlSource {

    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("offAGC")
    OFF_AGC("offAGC"),
    @XmlEnumValue("onAGC")
    ON_AGC("onAGC"),
    @XmlEnumValue("PlantControl")
    PLANT_CONTROL("PlantControl");
    private final String value;

    GeneratorControlSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneratorControlSource fromValue(String v) {
        for (GeneratorControlSource c: GeneratorControlSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
