
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="CustomerServiceRep"/>
 *     &lt;enumeration value="InboundTelephoneDevice"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="Sensor"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callType")
@XmlEnum
public enum CallType {

    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("CustomerServiceRep")
    CUSTOMER_SERVICE_REP("CustomerServiceRep"),
    @XmlEnumValue("InboundTelephoneDevice")
    INBOUND_TELEPHONE_DEVICE("InboundTelephoneDevice"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    IVR("IVR"),
    @XmlEnumValue("Sensor")
    SENSOR("Sensor"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallType fromValue(String v) {
        for (CallType c: CallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
