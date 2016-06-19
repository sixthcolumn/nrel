
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callBackTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callBackTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callBackTypeKind")
@XmlEnum
public enum CallBackTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    IVR("IVR"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CallBackTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallBackTypeKind fromValue(String v) {
        for (CallBackTypeKind c: CallBackTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
