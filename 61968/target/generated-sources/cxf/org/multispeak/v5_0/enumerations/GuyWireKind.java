
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guyWireKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guyWireKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="CommonGrade"/>
 *     &lt;enumeration value="SiemensMartin"/>
 *     &lt;enumeration value="HighStrength"/>
 *     &lt;enumeration value="ExtraHighStrength"/>
 *     &lt;enumeration value="UtilitiesGrade"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guyWireKind")
@XmlEnum
public enum GuyWireKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("CommonGrade")
    COMMON_GRADE("CommonGrade"),
    @XmlEnumValue("SiemensMartin")
    SIEMENS_MARTIN("SiemensMartin"),
    @XmlEnumValue("HighStrength")
    HIGH_STRENGTH("HighStrength"),
    @XmlEnumValue("ExtraHighStrength")
    EXTRA_HIGH_STRENGTH("ExtraHighStrength"),
    @XmlEnumValue("UtilitiesGrade")
    UTILITIES_GRADE("UtilitiesGrade"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GuyWireKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuyWireKind fromValue(String v) {
        for (GuyWireKind c: GuyWireKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
