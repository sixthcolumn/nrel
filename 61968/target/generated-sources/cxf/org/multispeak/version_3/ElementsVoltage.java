
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementsVoltage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="elementsVoltage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ElementVoltage 69.3"/>
 *     &lt;enumeration value="ElementVoltage 72"/>
 *     &lt;enumeration value="ElementVoltage 120"/>
 *     &lt;enumeration value="ElementVoltage 208"/>
 *     &lt;enumeration value="ElementVoltage 240"/>
 *     &lt;enumeration value="ElementVoltage 277"/>
 *     &lt;enumeration value="ElementVoltage 347"/>
 *     &lt;enumeration value="ElementVoltage 480"/>
 *     &lt;enumeration value="ElementVoltage 600"/>
 *     &lt;enumeration value="ElementVoltge120-277"/>
 *     &lt;enumeration value="ElementVoltage120-240"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "elementsVoltage")
@XmlEnum
public enum ElementsVoltage {

    @XmlEnumValue("ElementVoltage 69.3")
    ELEMENT_VOLTAGE_69_3("ElementVoltage 69.3"),
    @XmlEnumValue("ElementVoltage 72")
    ELEMENT_VOLTAGE_72("ElementVoltage 72"),
    @XmlEnumValue("ElementVoltage 120")
    ELEMENT_VOLTAGE_120("ElementVoltage 120"),
    @XmlEnumValue("ElementVoltage 208")
    ELEMENT_VOLTAGE_208("ElementVoltage 208"),
    @XmlEnumValue("ElementVoltage 240")
    ELEMENT_VOLTAGE_240("ElementVoltage 240"),
    @XmlEnumValue("ElementVoltage 277")
    ELEMENT_VOLTAGE_277("ElementVoltage 277"),
    @XmlEnumValue("ElementVoltage 347")
    ELEMENT_VOLTAGE_347("ElementVoltage 347"),
    @XmlEnumValue("ElementVoltage 480")
    ELEMENT_VOLTAGE_480("ElementVoltage 480"),
    @XmlEnumValue("ElementVoltage 600")
    ELEMENT_VOLTAGE_600("ElementVoltage 600"),
    @XmlEnumValue("ElementVoltge120-277")
    ELEMENT_VOLTGE_120_277("ElementVoltge120-277"),
    @XmlEnumValue("ElementVoltage120-240")
    ELEMENT_VOLTAGE_120_240("ElementVoltage120-240");
    private final String value;

    ElementsVoltage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElementsVoltage fromValue(String v) {
        for (ElementsVoltage c: ElementsVoltage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
