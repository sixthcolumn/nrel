
package com.epri._2013.dergroups;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitSymbol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitSymbol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VAr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitSymbol")
@XmlEnum
public enum UnitSymbol {

    W("W"),
    VA("VA"),
    @XmlEnumValue("VAr")
    V_AR("VAr");
    private final String value;

    UnitSymbol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitSymbol fromValue(String v) {
        for (UnitSymbol c: UnitSymbol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
