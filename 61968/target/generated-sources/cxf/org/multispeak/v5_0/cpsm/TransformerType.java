
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransformerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fix"/>
 *     &lt;enumeration value="voltageControl"/>
 *     &lt;enumeration value="phaseControl"/>
 *     &lt;enumeration value="voltageAndPhaseControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransformerType")
@XmlEnum
public enum TransformerType {

    @XmlEnumValue("fix")
    FIX("fix"),
    @XmlEnumValue("voltageControl")
    VOLTAGE_CONTROL("voltageControl"),
    @XmlEnumValue("phaseControl")
    PHASE_CONTROL("phaseControl"),
    @XmlEnumValue("voltageAndPhaseControl")
    VOLTAGE_AND_PHASE_CONTROL("voltageAndPhaseControl");
    private final String value;

    TransformerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransformerType fromValue(String v) {
        for (TransformerType c: TransformerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
