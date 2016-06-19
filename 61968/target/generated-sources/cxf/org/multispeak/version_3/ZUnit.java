
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ohms"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Per Unit"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zUnit")
@XmlEnum
public enum ZUnit {

    @XmlEnumValue("Ohms")
    OHMS("Ohms"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Per Unit")
    PER_UNIT("Per Unit"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    ZUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZUnit fromValue(String v) {
        for (ZUnit c: ZUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
