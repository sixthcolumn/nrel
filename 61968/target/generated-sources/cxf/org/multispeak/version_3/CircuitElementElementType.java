
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElementElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="circuitElementElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ohPrimaryLine"/>
 *     &lt;enumeration value="ohSecondaryLine"/>
 *     &lt;enumeration value="ugPrimaryLine"/>
 *     &lt;enumeration value="ugSecondaryLine"/>
 *     &lt;enumeration value="fakeNodeSection"/>
 *     &lt;enumeration value="capacitorBank"/>
 *     &lt;enumeration value="overcurrentDeviceBank"/>
 *     &lt;enumeration value="switchDeviceBank"/>
 *     &lt;enumeration value="regulatorBank"/>
 *     &lt;enumeration value="transformerBank"/>
 *     &lt;enumeration value="serviceLocation"/>
 *     &lt;enumeration value="substation"/>
 *     &lt;enumeration value="generator"/>
 *     &lt;enumeration value="motor"/>
 *     &lt;enumeration value="root"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "circuitElementElementType")
@XmlEnum
public enum CircuitElementElementType {

    @XmlEnumValue("ohPrimaryLine")
    OH_PRIMARY_LINE("ohPrimaryLine"),
    @XmlEnumValue("ohSecondaryLine")
    OH_SECONDARY_LINE("ohSecondaryLine"),
    @XmlEnumValue("ugPrimaryLine")
    UG_PRIMARY_LINE("ugPrimaryLine"),
    @XmlEnumValue("ugSecondaryLine")
    UG_SECONDARY_LINE("ugSecondaryLine"),
    @XmlEnumValue("fakeNodeSection")
    FAKE_NODE_SECTION("fakeNodeSection"),
    @XmlEnumValue("capacitorBank")
    CAPACITOR_BANK("capacitorBank"),
    @XmlEnumValue("overcurrentDeviceBank")
    OVERCURRENT_DEVICE_BANK("overcurrentDeviceBank"),
    @XmlEnumValue("switchDeviceBank")
    SWITCH_DEVICE_BANK("switchDeviceBank"),
    @XmlEnumValue("regulatorBank")
    REGULATOR_BANK("regulatorBank"),
    @XmlEnumValue("transformerBank")
    TRANSFORMER_BANK("transformerBank"),
    @XmlEnumValue("serviceLocation")
    SERVICE_LOCATION("serviceLocation"),
    @XmlEnumValue("substation")
    SUBSTATION("substation"),
    @XmlEnumValue("generator")
    GENERATOR("generator"),
    @XmlEnumValue("motor")
    MOTOR("motor"),
    @XmlEnumValue("root")
    ROOT("root");
    private final String value;

    CircuitElementElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CircuitElementElementType fromValue(String v) {
        for (CircuitElementElementType c: CircuitElementElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
