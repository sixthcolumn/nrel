
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Hot"/>
 *     &lt;enumeration value="Cold"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constTypeKind")
@XmlEnum
public enum ConstTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Hot")
    HOT("Hot"),
    @XmlEnumValue("Cold")
    COLD("Cold"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstTypeKind fromValue(String v) {
        for (ConstTypeKind c: ConstTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
