
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadConnection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Delta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadConnection")
@XmlEnum
public enum LoadConnection {

    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Delta")
    DELTA("Delta");
    private final String value;

    LoadConnection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadConnection fromValue(String v) {
        for (LoadConnection c: LoadConnection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
