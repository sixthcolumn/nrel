
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guyAgainst.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guyAgainst">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="DeadEnd"/>
 *     &lt;enumeration value="Angle"/>
 *     &lt;enumeration value="StormRight"/>
 *     &lt;enumeration value="StormLeft"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guyAgainst")
@XmlEnum
public enum GuyAgainst {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DeadEnd")
    DEAD_END("DeadEnd"),
    @XmlEnumValue("Angle")
    ANGLE("Angle"),
    @XmlEnumValue("StormRight")
    STORM_RIGHT("StormRight"),
    @XmlEnumValue("StormLeft")
    STORM_LEFT("StormLeft"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GuyAgainst(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuyAgainst fromValue(String v) {
        for (GuyAgainst c: GuyAgainst.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
