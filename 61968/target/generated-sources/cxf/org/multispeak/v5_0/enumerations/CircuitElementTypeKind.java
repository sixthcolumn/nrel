
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElementTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="circuitElementTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACLineSegment"/>
 *     &lt;enumeration value="capacitorBank"/>
 *     &lt;enumeration value="overcurrentDeviceBank"/>
 *     &lt;enumeration value="regulatorBank"/>
 *     &lt;enumeration value="switchingDeviceBank"/>
 *     &lt;enumeration value="transformerBank"/>
 *     &lt;enumeration value="equivalentSource"/>
 *     &lt;enumeration value="root"/>
 *     &lt;enumeration value="electricService"/>
 *     &lt;enumeration value="fakeNodeSection"/>
 *     &lt;enumeration value="inducationMachine"/>
 *     &lt;enumeration value="synchronousMachine"/>
 *     &lt;enumeration value="streetLight"/>
 *     &lt;enumeration value="securityLight"/>
 *     &lt;enumeration value="trafficLight"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "circuitElementTypeKind")
@XmlEnum
public enum CircuitElementTypeKind {

    @XmlEnumValue("ACLineSegment")
    AC_LINE_SEGMENT("ACLineSegment"),
    @XmlEnumValue("capacitorBank")
    CAPACITOR_BANK("capacitorBank"),
    @XmlEnumValue("overcurrentDeviceBank")
    OVERCURRENT_DEVICE_BANK("overcurrentDeviceBank"),
    @XmlEnumValue("regulatorBank")
    REGULATOR_BANK("regulatorBank"),
    @XmlEnumValue("switchingDeviceBank")
    SWITCHING_DEVICE_BANK("switchingDeviceBank"),
    @XmlEnumValue("transformerBank")
    TRANSFORMER_BANK("transformerBank"),
    @XmlEnumValue("equivalentSource")
    EQUIVALENT_SOURCE("equivalentSource"),
    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("electricService")
    ELECTRIC_SERVICE("electricService"),
    @XmlEnumValue("fakeNodeSection")
    FAKE_NODE_SECTION("fakeNodeSection"),
    @XmlEnumValue("inducationMachine")
    INDUCATION_MACHINE("inducationMachine"),
    @XmlEnumValue("synchronousMachine")
    SYNCHRONOUS_MACHINE("synchronousMachine"),
    @XmlEnumValue("streetLight")
    STREET_LIGHT("streetLight"),
    @XmlEnumValue("securityLight")
    SECURITY_LIGHT("securityLight"),
    @XmlEnumValue("trafficLight")
    TRAFFIC_LIGHT("trafficLight"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CircuitElementTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CircuitElementTypeKind fromValue(String v) {
        for (CircuitElementTypeKind c: CircuitElementTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
