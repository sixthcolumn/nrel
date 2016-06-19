
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scadaFunctionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scadaFunctionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Select"/>
 *     &lt;enumeration value="Operate"/>
 *     &lt;enumeration value="Direct operate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scadaFunctionKind")
@XmlEnum
public enum ScadaFunctionKind {

    @XmlEnumValue("Select")
    SELECT("Select"),
    @XmlEnumValue("Operate")
    OPERATE("Operate"),
    @XmlEnumValue("Direct operate")
    DIRECT_OPERATE("Direct operate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ScadaFunctionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScadaFunctionKind fromValue(String v) {
        for (ScadaFunctionKind c: ScadaFunctionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
