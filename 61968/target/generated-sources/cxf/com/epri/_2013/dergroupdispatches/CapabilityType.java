
package com.epri._2013.dergroupdispatches;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RealPower"/>
 *     &lt;enumeration value="ApparentPower"/>
 *     &lt;enumeration value="ReactivePower"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "capabilityType")
@XmlEnum
public enum CapabilityType {

    @XmlEnumValue("RealPower")
    REAL_POWER("RealPower"),
    @XmlEnumValue("ApparentPower")
    APPARENT_POWER("ApparentPower"),
    @XmlEnumValue("ReactivePower")
    REACTIVE_POWER("ReactivePower");
    private final String value;

    CapabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapabilityType fromValue(String v) {
        for (CapabilityType c: CapabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
