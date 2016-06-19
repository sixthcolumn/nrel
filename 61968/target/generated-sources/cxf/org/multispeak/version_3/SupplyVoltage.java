
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supplyVoltage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="supplyVoltage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SupplyVoltage 69.3"/>
 *     &lt;enumeration value="SupplyVoltage 72"/>
 *     &lt;enumeration value="SupplyVoltage 120"/>
 *     &lt;enumeration value="SupplyVoltage 208"/>
 *     &lt;enumeration value="SupplyVoltage 240"/>
 *     &lt;enumeration value="SupplyVoltage 277"/>
 *     &lt;enumeration value="SupplyVoltage 347"/>
 *     &lt;enumeration value="SupplyVoltage 480"/>
 *     &lt;enumeration value="SupplyVoltage 600"/>
 *     &lt;enumeration value="SupplyVoltage120 through 277"/>
 *     &lt;enumeration value="SupplyVoltage120 through 480"/>
 *     &lt;enumeration value="SupplyVoltage48 DC"/>
 *     &lt;enumeration value="SupplyVoltage125 DC"/>
 *     &lt;enumeration value="SupplyVoltage250 DC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "supplyVoltage")
@XmlEnum
public enum SupplyVoltage {

    @XmlEnumValue("SupplyVoltage 69.3")
    SUPPLY_VOLTAGE_69_3("SupplyVoltage 69.3"),
    @XmlEnumValue("SupplyVoltage 72")
    SUPPLY_VOLTAGE_72("SupplyVoltage 72"),
    @XmlEnumValue("SupplyVoltage 120")
    SUPPLY_VOLTAGE_120("SupplyVoltage 120"),
    @XmlEnumValue("SupplyVoltage 208")
    SUPPLY_VOLTAGE_208("SupplyVoltage 208"),
    @XmlEnumValue("SupplyVoltage 240")
    SUPPLY_VOLTAGE_240("SupplyVoltage 240"),
    @XmlEnumValue("SupplyVoltage 277")
    SUPPLY_VOLTAGE_277("SupplyVoltage 277"),
    @XmlEnumValue("SupplyVoltage 347")
    SUPPLY_VOLTAGE_347("SupplyVoltage 347"),
    @XmlEnumValue("SupplyVoltage 480")
    SUPPLY_VOLTAGE_480("SupplyVoltage 480"),
    @XmlEnumValue("SupplyVoltage 600")
    SUPPLY_VOLTAGE_600("SupplyVoltage 600"),
    @XmlEnumValue("SupplyVoltage120 through 277")
    SUPPLY_VOLTAGE_120_THROUGH_277("SupplyVoltage120 through 277"),
    @XmlEnumValue("SupplyVoltage120 through 480")
    SUPPLY_VOLTAGE_120_THROUGH_480("SupplyVoltage120 through 480"),
    @XmlEnumValue("SupplyVoltage48 DC")
    SUPPLY_VOLTAGE_48_DC("SupplyVoltage48 DC"),
    @XmlEnumValue("SupplyVoltage125 DC")
    SUPPLY_VOLTAGE_125_DC("SupplyVoltage125 DC"),
    @XmlEnumValue("SupplyVoltage250 DC")
    SUPPLY_VOLTAGE_250_DC("SupplyVoltage250 DC");
    private final String value;

    SupplyVoltage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplyVoltage fromValue(String v) {
        for (SupplyVoltage c: SupplyVoltage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
