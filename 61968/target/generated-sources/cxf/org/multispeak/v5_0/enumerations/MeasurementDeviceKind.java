
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementDeviceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="measurementDeviceKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ElectricMeter"/>
 *     &lt;enumeration value="GasMeter"/>
 *     &lt;enumeration value="WaterMeter"/>
 *     &lt;enumeration value="Demand"/>
 *     &lt;enumeration value="Harmonic"/>
 *     &lt;enumeration value="PhaseAngle"/>
 *     &lt;enumeration value="BusVoltage"/>
 *     &lt;enumeration value="BusCurrent"/>
 *     &lt;enumeration value="BreakerVoltage"/>
 *     &lt;enumeration value="BreakerCurrent"/>
 *     &lt;enumeration value="LineVoltage"/>
 *     &lt;enumeration value="LineCurrent"/>
 *     &lt;enumeration value="GPSClock"/>
 *     &lt;enumeration value="Temperature"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "measurementDeviceKind")
@XmlEnum
public enum MeasurementDeviceKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ElectricMeter")
    ELECTRIC_METER("ElectricMeter"),
    @XmlEnumValue("GasMeter")
    GAS_METER("GasMeter"),
    @XmlEnumValue("WaterMeter")
    WATER_METER("WaterMeter"),
    @XmlEnumValue("Demand")
    DEMAND("Demand"),
    @XmlEnumValue("Harmonic")
    HARMONIC("Harmonic"),
    @XmlEnumValue("PhaseAngle")
    PHASE_ANGLE("PhaseAngle"),
    @XmlEnumValue("BusVoltage")
    BUS_VOLTAGE("BusVoltage"),
    @XmlEnumValue("BusCurrent")
    BUS_CURRENT("BusCurrent"),
    @XmlEnumValue("BreakerVoltage")
    BREAKER_VOLTAGE("BreakerVoltage"),
    @XmlEnumValue("BreakerCurrent")
    BREAKER_CURRENT("BreakerCurrent"),
    @XmlEnumValue("LineVoltage")
    LINE_VOLTAGE("LineVoltage"),
    @XmlEnumValue("LineCurrent")
    LINE_CURRENT("LineCurrent"),
    @XmlEnumValue("GPSClock")
    GPS_CLOCK("GPSClock"),
    @XmlEnumValue("Temperature")
    TEMPERATURE("Temperature"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MeasurementDeviceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementDeviceKind fromValue(String v) {
        for (MeasurementDeviceKind c: MeasurementDeviceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
