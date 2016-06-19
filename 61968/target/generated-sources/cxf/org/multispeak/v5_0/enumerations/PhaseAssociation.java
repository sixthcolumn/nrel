
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phaseAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phaseAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A-B"/>
 *     &lt;enumeration value="B-C"/>
 *     &lt;enumeration value="C-A"/>
 *     &lt;enumeration value="Neutral-Gnd"/>
 *     &lt;enumeration value="A-Neutral"/>
 *     &lt;enumeration value="B-Neutral"/>
 *     &lt;enumeration value="C-Neutral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phaseAssociation")
@XmlEnum
public enum PhaseAssociation {

    @XmlEnumValue("A-B")
    A_B("A-B"),
    @XmlEnumValue("B-C")
    B_C("B-C"),
    @XmlEnumValue("C-A")
    C_A("C-A"),
    @XmlEnumValue("Neutral-Gnd")
    NEUTRAL_GND("Neutral-Gnd"),
    @XmlEnumValue("A-Neutral")
    A_NEUTRAL("A-Neutral"),
    @XmlEnumValue("B-Neutral")
    B_NEUTRAL("B-Neutral"),
    @XmlEnumValue("C-Neutral")
    C_NEUTRAL("C-Neutral");
    private final String value;

    PhaseAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhaseAssociation fromValue(String v) {
        for (PhaseAssociation c: PhaseAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
