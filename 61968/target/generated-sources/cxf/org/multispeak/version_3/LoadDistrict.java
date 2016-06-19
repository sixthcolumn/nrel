
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadDistrict.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadDistrict">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Heavy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadDistrict")
@XmlEnum
public enum LoadDistrict {

    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Heavy")
    HEAVY("Heavy");
    private final String value;

    LoadDistrict(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadDistrict fromValue(String v) {
        for (LoadDistrict c: LoadDistrict.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
