
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cutAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cutAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InitiateCut"/>
 *     &lt;enumeration value="RestoreCut"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cutAction")
@XmlEnum
public enum CutAction {

    @XmlEnumValue("InitiateCut")
    INITIATE_CUT("InitiateCut"),
    @XmlEnumValue("RestoreCut")
    RESTORE_CUT("RestoreCut"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CutAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CutAction fromValue(String v) {
        for (CutAction c: CutAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
