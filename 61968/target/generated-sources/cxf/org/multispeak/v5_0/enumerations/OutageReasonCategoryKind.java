
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonCategoryKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageReasonCategoryKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OutageCause"/>
 *     &lt;enumeration value="EquipmentFailure"/>
 *     &lt;enumeration value="VoltageLevel"/>
 *     &lt;enumeration value="WeatherCondition"/>
 *     &lt;enumeration value="ResponsibleSystem"/>
 *     &lt;enumeration value="OutageCondition"/>
 *     &lt;enumeration value="InterruptingDeviceInitiation"/>
 *     &lt;enumeration value="CustomerRestoration"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageReasonCategoryKind")
@XmlEnum
public enum OutageReasonCategoryKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OutageCause")
    OUTAGE_CAUSE("OutageCause"),
    @XmlEnumValue("EquipmentFailure")
    EQUIPMENT_FAILURE("EquipmentFailure"),
    @XmlEnumValue("VoltageLevel")
    VOLTAGE_LEVEL("VoltageLevel"),
    @XmlEnumValue("WeatherCondition")
    WEATHER_CONDITION("WeatherCondition"),
    @XmlEnumValue("ResponsibleSystem")
    RESPONSIBLE_SYSTEM("ResponsibleSystem"),
    @XmlEnumValue("OutageCondition")
    OUTAGE_CONDITION("OutageCondition"),
    @XmlEnumValue("InterruptingDeviceInitiation")
    INTERRUPTING_DEVICE_INITIATION("InterruptingDeviceInitiation"),
    @XmlEnumValue("CustomerRestoration")
    CUSTOMER_RESTORATION("CustomerRestoration"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageReasonCategoryKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageReasonCategoryKind fromValue(String v) {
        for (OutageReasonCategoryKind c: OutageReasonCategoryKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
