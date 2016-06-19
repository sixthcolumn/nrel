
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectionSourceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageDetectionSourceKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="PowerMonitor"/>
 *     &lt;enumeration value="CustomerCall"/>
 *     &lt;enumeration value="OtherCustomerInput"/>
 *     &lt;enumeration value="HeadEndSystem"/>
 *     &lt;enumeration value="CustomerServiceRep"/>
 *     &lt;enumeration value="Witness"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageDetectionSourceKind")
@XmlEnum
public enum OutageDetectionSourceKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("PowerMonitor")
    POWER_MONITOR("PowerMonitor"),
    @XmlEnumValue("CustomerCall")
    CUSTOMER_CALL("CustomerCall"),
    @XmlEnumValue("OtherCustomerInput")
    OTHER_CUSTOMER_INPUT("OtherCustomerInput"),
    @XmlEnumValue("HeadEndSystem")
    HEAD_END_SYSTEM("HeadEndSystem"),
    @XmlEnumValue("CustomerServiceRep")
    CUSTOMER_SERVICE_REP("CustomerServiceRep"),
    @XmlEnumValue("Witness")
    WITNESS("Witness"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageDetectionSourceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageDetectionSourceKind fromValue(String v) {
        for (OutageDetectionSourceKind c: OutageDetectionSourceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
