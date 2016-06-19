
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variantTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variantTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Pole"/>
 *     &lt;enumeration value="Wire"/>
 *     &lt;enumeration value="Neutral"/>
 *     &lt;enumeration value="Misc"/>
 *     &lt;enumeration value="Var1"/>
 *     &lt;enumeration value="Var2"/>
 *     &lt;enumeration value="Var3"/>
 *     &lt;enumeration value="Var4"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "variantTypeKind")
@XmlEnum
public enum VariantTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Pole")
    POLE("Pole"),
    @XmlEnumValue("Wire")
    WIRE("Wire"),
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral"),
    @XmlEnumValue("Misc")
    MISC("Misc"),
    @XmlEnumValue("Var1")
    VAR_1("Var1"),
    @XmlEnumValue("Var2")
    VAR_2("Var2"),
    @XmlEnumValue("Var3")
    VAR_3("Var3"),
    @XmlEnumValue("Var4")
    VAR_4("Var4"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VariantTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariantTypeKind fromValue(String v) {
        for (VariantTypeKind c: VariantTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
