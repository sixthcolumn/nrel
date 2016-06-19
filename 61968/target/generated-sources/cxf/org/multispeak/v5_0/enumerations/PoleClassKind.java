
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleClassKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleClassKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Class1"/>
 *     &lt;enumeration value="Class2"/>
 *     &lt;enumeration value="Class3"/>
 *     &lt;enumeration value="Class4"/>
 *     &lt;enumeration value="Class5"/>
 *     &lt;enumeration value="Class6"/>
 *     &lt;enumeration value="Class7"/>
 *     &lt;enumeration value="Class8"/>
 *     &lt;enumeration value="Class9"/>
 *     &lt;enumeration value="Class10"/>
 *     &lt;enumeration value="H1"/>
 *     &lt;enumeration value="H2"/>
 *     &lt;enumeration value="H3"/>
 *     &lt;enumeration value="H4"/>
 *     &lt;enumeration value="H5"/>
 *     &lt;enumeration value="H6"/>
 *     &lt;enumeration value="H7"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleClassKind")
@XmlEnum
public enum PoleClassKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Class1")
    CLASS_1("Class1"),
    @XmlEnumValue("Class2")
    CLASS_2("Class2"),
    @XmlEnumValue("Class3")
    CLASS_3("Class3"),
    @XmlEnumValue("Class4")
    CLASS_4("Class4"),
    @XmlEnumValue("Class5")
    CLASS_5("Class5"),
    @XmlEnumValue("Class6")
    CLASS_6("Class6"),
    @XmlEnumValue("Class7")
    CLASS_7("Class7"),
    @XmlEnumValue("Class8")
    CLASS_8("Class8"),
    @XmlEnumValue("Class9")
    CLASS_9("Class9"),
    @XmlEnumValue("Class10")
    CLASS_10("Class10"),
    @XmlEnumValue("H1")
    H_1("H1"),
    @XmlEnumValue("H2")
    H_2("H2"),
    @XmlEnumValue("H3")
    H_3("H3"),
    @XmlEnumValue("H4")
    H_4("H4"),
    @XmlEnumValue("H5")
    H_5("H5"),
    @XmlEnumValue("H6")
    H_6("H6"),
    @XmlEnumValue("H7")
    H_7("H7"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PoleClassKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleClassKind fromValue(String v) {
        for (PoleClassKind c: PoleClassKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
