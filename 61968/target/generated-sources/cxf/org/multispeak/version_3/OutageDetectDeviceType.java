
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageDetectDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="CustomerServiceRep"/>
 *     &lt;enumeration value="InboundTelephoneDevice"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageDetectDeviceType")
@XmlEnum
public enum OutageDetectDeviceType {

    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("CustomerServiceRep")
    CUSTOMER_SERVICE_REP("CustomerServiceRep"),
    @XmlEnumValue("InboundTelephoneDevice")
    INBOUND_TELEPHONE_DEVICE("InboundTelephoneDevice"),
    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageDetectDeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageDetectDeviceType fromValue(String v) {
        for (OutageDetectDeviceType c: OutageDetectDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
