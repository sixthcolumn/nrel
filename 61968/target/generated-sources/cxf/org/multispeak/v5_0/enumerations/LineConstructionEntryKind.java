
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineConstructionEntryKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lineConstructionEntryKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Overhead"/>
 *     &lt;enumeration value="ConcentricNeutral"/>
 *     &lt;enumeration value="TapeShield"/>
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="ServiceDrop"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lineConstructionEntryKind")
@XmlEnum
public enum LineConstructionEntryKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Overhead")
    OVERHEAD("Overhead"),
    @XmlEnumValue("ConcentricNeutral")
    CONCENTRIC_NEUTRAL("ConcentricNeutral"),
    @XmlEnumValue("TapeShield")
    TAPE_SHIELD("TapeShield"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("ServiceDrop")
    SERVICE_DROP("ServiceDrop"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LineConstructionEntryKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineConstructionEntryKind fromValue(String v) {
        for (LineConstructionEntryKind c: LineConstructionEntryKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
