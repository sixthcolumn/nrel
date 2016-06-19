
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectivityModelKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectivityModelKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nodal"/>
 *     &lt;enumeration value="Sectional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectivityModelKind")
@XmlEnum
public enum ConnectivityModelKind {

    @XmlEnumValue("Nodal")
    NODAL("Nodal"),
    @XmlEnumValue("Sectional")
    SECTIONAL("Sectional");
    private final String value;

    ConnectivityModelKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectivityModelKind fromValue(String v) {
        for (ConnectivityModelKind c: ConnectivityModelKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
