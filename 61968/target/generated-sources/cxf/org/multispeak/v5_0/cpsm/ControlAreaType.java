
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlAreaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ControlAreaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGC"/>
 *     &lt;enumeration value="Forecast"/>
 *     &lt;enumeration value="Interchange"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ControlAreaType")
@XmlEnum
public enum ControlAreaType {

    AGC("AGC"),
    @XmlEnumValue("Forecast")
    FORECAST("Forecast"),
    @XmlEnumValue("Interchange")
    INTERCHANGE("Interchange"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ControlAreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlAreaType fromValue(String v) {
        for (ControlAreaType c: ControlAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
