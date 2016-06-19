
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadMixConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadMixConnection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Delta"/>
 *     &lt;enumeration value="Center tap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadMixConnection")
@XmlEnum
public enum LoadMixConnection {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Delta")
    DELTA("Delta"),
    @XmlEnumValue("Center tap")
    CENTER_TAP("Center tap");
    private final String value;

    LoadMixConnection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadMixConnection fromValue(String v) {
        for (LoadMixConnection c: LoadMixConnection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
