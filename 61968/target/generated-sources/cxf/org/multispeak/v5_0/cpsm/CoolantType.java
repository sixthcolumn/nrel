
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoolantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoolantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="air"/>
 *     &lt;enumeration value="hydrogenGas"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoolantType")
@XmlEnum
public enum CoolantType {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("hydrogenGas")
    HYDROGEN_GAS("hydrogenGas"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CoolantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoolantType fromValue(String v) {
        for (CoolantType c: CoolantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
