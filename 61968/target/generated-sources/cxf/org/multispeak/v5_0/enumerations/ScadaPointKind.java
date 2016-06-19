
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scadaPointKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scadaPointKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Analog"/>
 *     &lt;enumeration value="Accumulator"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scadaPointKind")
@XmlEnum
public enum ScadaPointKind {

    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Analog")
    ANALOG("Analog"),
    @XmlEnumValue("Accumulator")
    ACCUMULATOR("Accumulator"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ScadaPointKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScadaPointKind fromValue(String v) {
        for (ScadaPointKind c: ScadaPointKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
