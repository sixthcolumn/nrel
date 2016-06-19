
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Primary power down"/>
 *     &lt;enumeration value="Primary power up"/>
 *     &lt;enumeration value="Time changed, old time"/>
 *     &lt;enumeration value="Time changed, new time"/>
 *     &lt;enumeration value="Time changed, old time as argument"/>
 *     &lt;enumeration value="Time changed, new time as argument"/>
 *     &lt;enumeration value="Meter accessed for read"/>
 *     &lt;enumeration value="Meter accessed for write"/>
 *     &lt;enumeration value="Procedure invoked"/>
 *     &lt;enumeration value="Written to"/>
 *     &lt;enumeration value="Programmed"/>
 *     &lt;enumeration value="Communication terminated normally"/>
 *     &lt;enumeration value="Communication terminated abnormally"/>
 *     &lt;enumeration value="List cleared"/>
 *     &lt;enumeration value="Last read entry updated"/>
 *     &lt;enumeration value="History Log cleared"/>
 *     &lt;enumeration value="History Log last read entry updated"/>
 *     &lt;enumeration value="Event Log cleared"/>
 *     &lt;enumeration value="Event Log last read entry updated"/>
 *     &lt;enumeration value="Demand reset occurred"/>
 *     &lt;enumeration value="Self read occurred"/>
 *     &lt;enumeration value="Season change"/>
 *     &lt;enumeration value="Rate change"/>
 *     &lt;enumeration value="Special Schedule activation"/>
 *     &lt;enumeration value="Tier changed"/>
 *     &lt;enumeration value="Pending data stucture activation"/>
 *     &lt;enumeration value="Pending data stucture clear"/>
 *     &lt;enumeration value="Metering mode started"/>
 *     &lt;enumeration value="Metering mode stopped"/>
 *     &lt;enumeration value="Test mode started"/>
 *     &lt;enumeration value="Test mode stopped"/>
 *     &lt;enumeration value="Meter shop mode started"/>
 *     &lt;enumeration value="Meter shop mode stopped"/>
 *     &lt;enumeration value="Meter reprogrammed"/>
 *     &lt;enumeration value="Configuration error detected"/>
 *     &lt;enumeration value="Self check error detected"/>
 *     &lt;enumeration value="RAM failure detected"/>
 *     &lt;enumeration value="ROM failure detected"/>
 *     &lt;enumeration value="Nonvolatile memory failure detected"/>
 *     &lt;enumeration value="Clock error detected"/>
 *     &lt;enumeration value="Measurement error detected"/>
 *     &lt;enumeration value="Low battery detected"/>
 *     &lt;enumeration value="Low loss potential detected"/>
 *     &lt;enumeration value="Demand overload detected"/>
 *     &lt;enumeration value="Tamper attempt detected"/>
 *     &lt;enumeration value="Reverse flow detected"/>
 *     &lt;enumeration value="Momentary interruption"/>
 *     &lt;enumeration value="Sustained outage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventCode")
@XmlEnum
public enum EventCode {

    @XmlEnumValue("Primary power down")
    PRIMARY_POWER_DOWN("Primary power down"),
    @XmlEnumValue("Primary power up")
    PRIMARY_POWER_UP("Primary power up"),
    @XmlEnumValue("Time changed, old time")
    TIME_CHANGED_OLD_TIME("Time changed, old time"),
    @XmlEnumValue("Time changed, new time")
    TIME_CHANGED_NEW_TIME("Time changed, new time"),
    @XmlEnumValue("Time changed, old time as argument")
    TIME_CHANGED_OLD_TIME_AS_ARGUMENT("Time changed, old time as argument"),
    @XmlEnumValue("Time changed, new time as argument")
    TIME_CHANGED_NEW_TIME_AS_ARGUMENT("Time changed, new time as argument"),
    @XmlEnumValue("Meter accessed for read")
    METER_ACCESSED_FOR_READ("Meter accessed for read"),
    @XmlEnumValue("Meter accessed for write")
    METER_ACCESSED_FOR_WRITE("Meter accessed for write"),
    @XmlEnumValue("Procedure invoked")
    PROCEDURE_INVOKED("Procedure invoked"),
    @XmlEnumValue("Written to")
    WRITTEN_TO("Written to"),
    @XmlEnumValue("Programmed")
    PROGRAMMED("Programmed"),
    @XmlEnumValue("Communication terminated normally")
    COMMUNICATION_TERMINATED_NORMALLY("Communication terminated normally"),
    @XmlEnumValue("Communication terminated abnormally")
    COMMUNICATION_TERMINATED_ABNORMALLY("Communication terminated abnormally"),
    @XmlEnumValue("List cleared")
    LIST_CLEARED("List cleared"),
    @XmlEnumValue("Last read entry updated")
    LAST_READ_ENTRY_UPDATED("Last read entry updated"),
    @XmlEnumValue("History Log cleared")
    HISTORY_LOG_CLEARED("History Log cleared"),
    @XmlEnumValue("History Log last read entry updated")
    HISTORY_LOG_LAST_READ_ENTRY_UPDATED("History Log last read entry updated"),
    @XmlEnumValue("Event Log cleared")
    EVENT_LOG_CLEARED("Event Log cleared"),
    @XmlEnumValue("Event Log last read entry updated")
    EVENT_LOG_LAST_READ_ENTRY_UPDATED("Event Log last read entry updated"),
    @XmlEnumValue("Demand reset occurred")
    DEMAND_RESET_OCCURRED("Demand reset occurred"),
    @XmlEnumValue("Self read occurred")
    SELF_READ_OCCURRED("Self read occurred"),
    @XmlEnumValue("Season change")
    SEASON_CHANGE("Season change"),
    @XmlEnumValue("Rate change")
    RATE_CHANGE("Rate change"),
    @XmlEnumValue("Special Schedule activation")
    SPECIAL_SCHEDULE_ACTIVATION("Special Schedule activation"),
    @XmlEnumValue("Tier changed")
    TIER_CHANGED("Tier changed"),
    @XmlEnumValue("Pending data stucture activation")
    PENDING_DATA_STUCTURE_ACTIVATION("Pending data stucture activation"),
    @XmlEnumValue("Pending data stucture clear")
    PENDING_DATA_STUCTURE_CLEAR("Pending data stucture clear"),
    @XmlEnumValue("Metering mode started")
    METERING_MODE_STARTED("Metering mode started"),
    @XmlEnumValue("Metering mode stopped")
    METERING_MODE_STOPPED("Metering mode stopped"),
    @XmlEnumValue("Test mode started")
    TEST_MODE_STARTED("Test mode started"),
    @XmlEnumValue("Test mode stopped")
    TEST_MODE_STOPPED("Test mode stopped"),
    @XmlEnumValue("Meter shop mode started")
    METER_SHOP_MODE_STARTED("Meter shop mode started"),
    @XmlEnumValue("Meter shop mode stopped")
    METER_SHOP_MODE_STOPPED("Meter shop mode stopped"),
    @XmlEnumValue("Meter reprogrammed")
    METER_REPROGRAMMED("Meter reprogrammed"),
    @XmlEnumValue("Configuration error detected")
    CONFIGURATION_ERROR_DETECTED("Configuration error detected"),
    @XmlEnumValue("Self check error detected")
    SELF_CHECK_ERROR_DETECTED("Self check error detected"),
    @XmlEnumValue("RAM failure detected")
    RAM_FAILURE_DETECTED("RAM failure detected"),
    @XmlEnumValue("ROM failure detected")
    ROM_FAILURE_DETECTED("ROM failure detected"),
    @XmlEnumValue("Nonvolatile memory failure detected")
    NONVOLATILE_MEMORY_FAILURE_DETECTED("Nonvolatile memory failure detected"),
    @XmlEnumValue("Clock error detected")
    CLOCK_ERROR_DETECTED("Clock error detected"),
    @XmlEnumValue("Measurement error detected")
    MEASUREMENT_ERROR_DETECTED("Measurement error detected"),
    @XmlEnumValue("Low battery detected")
    LOW_BATTERY_DETECTED("Low battery detected"),
    @XmlEnumValue("Low loss potential detected")
    LOW_LOSS_POTENTIAL_DETECTED("Low loss potential detected"),
    @XmlEnumValue("Demand overload detected")
    DEMAND_OVERLOAD_DETECTED("Demand overload detected"),
    @XmlEnumValue("Tamper attempt detected")
    TAMPER_ATTEMPT_DETECTED("Tamper attempt detected"),
    @XmlEnumValue("Reverse flow detected")
    REVERSE_FLOW_DETECTED("Reverse flow detected"),
    @XmlEnumValue("Momentary interruption")
    MOMENTARY_INTERRUPTION("Momentary interruption"),
    @XmlEnumValue("Sustained outage")
    SUSTAINED_OUTAGE("Sustained outage");
    private final String value;

    EventCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventCode fromValue(String v) {
        for (EventCode c: EventCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
