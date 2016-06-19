
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationHazardKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="locationHazardKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Access"/>
 *     &lt;enumeration value="Animal"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Safety"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "locationHazardKind")
@XmlEnum
public enum LocationHazardKind {

    @XmlEnumValue("Access")
    ACCESS("Access"),
    @XmlEnumValue("Animal")
    ANIMAL("Animal"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Safety")
    SAFETY("Safety"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LocationHazardKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationHazardKind fromValue(String v) {
        for (LocationHazardKind c: LocationHazardKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
