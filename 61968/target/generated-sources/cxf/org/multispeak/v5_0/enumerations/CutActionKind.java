
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cutActionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cutActionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="InitiateCut"/>
 *     &lt;enumeration value="RestoreCut"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cutActionKind")
@XmlEnum
public enum CutActionKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InitiateCut")
    INITIATE_CUT("InitiateCut"),
    @XmlEnumValue("RestoreCut")
    RESTORE_CUT("RestoreCut"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CutActionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CutActionKind fromValue(String v) {
        for (CutActionKind c: CutActionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
