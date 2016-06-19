
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phaseCd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phaseCd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phaseCd")
@XmlEnum
public enum PhaseCd {

    A("A"),
    B("B"),
    C("C"),
    AB("AB"),
    AC("AC"),
    BC("BC"),
    ABC("ABC"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PhaseCd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhaseCd fromValue(String v) {
        for (PhaseCd c: PhaseCd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
