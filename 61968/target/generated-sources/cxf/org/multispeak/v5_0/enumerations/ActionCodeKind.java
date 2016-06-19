
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionCodeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionCodeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Estimate"/>
 *     &lt;enumeration value="CPROnly"/>
 *     &lt;enumeration value="MaterialOnly"/>
 *     &lt;enumeration value="CPRAndMaterial"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionCodeKind")
@XmlEnum
public enum ActionCodeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("CPROnly")
    CPR_ONLY("CPROnly"),
    @XmlEnumValue("MaterialOnly")
    MATERIAL_ONLY("MaterialOnly"),
    @XmlEnumValue("CPRAndMaterial")
    CPR_AND_MATERIAL("CPRAndMaterial"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ActionCodeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeKind fromValue(String v) {
        for (ActionCodeKind c: ActionCodeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
