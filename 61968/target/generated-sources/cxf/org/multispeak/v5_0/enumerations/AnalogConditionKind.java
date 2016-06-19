
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for analogConditionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="analogConditionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="L4"/>
 *     &lt;enumeration value="L3"/>
 *     &lt;enumeration value="L2"/>
 *     &lt;enumeration value="L1"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="H1"/>
 *     &lt;enumeration value="H2"/>
 *     &lt;enumeration value="H3"/>
 *     &lt;enumeration value="H4"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "analogConditionKind")
@XmlEnum
public enum AnalogConditionKind {

    @XmlEnumValue("L4")
    L_4("L4"),
    @XmlEnumValue("L3")
    L_3("L3"),
    @XmlEnumValue("L2")
    L_2("L2"),
    @XmlEnumValue("L1")
    L_1("L1"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("H1")
    H_1("H1"),
    @XmlEnumValue("H2")
    H_2("H2"),
    @XmlEnumValue("H3")
    H_3("H3"),
    @XmlEnumValue("H4")
    H_4("H4"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AnalogConditionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnalogConditionKind fromValue(String v) {
        for (AnalogConditionKind c: AnalogConditionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
