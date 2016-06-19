
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitPrefixKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitPrefixKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Cumulative"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitPrefixKind")
@XmlEnum
public enum UnitPrefixKind {

    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UnitPrefixKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitPrefixKind fromValue(String v) {
        for (UnitPrefixKind c: UnitPrefixKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
