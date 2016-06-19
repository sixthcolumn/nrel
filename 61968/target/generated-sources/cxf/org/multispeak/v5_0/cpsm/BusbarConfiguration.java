
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusbarConfiguration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusbarConfiguration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="singleBus"/>
 *     &lt;enumeration value="doubleBus"/>
 *     &lt;enumeration value="mainWithTransfer"/>
 *     &lt;enumeration value="ringBus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusbarConfiguration")
@XmlEnum
public enum BusbarConfiguration {

    @XmlEnumValue("singleBus")
    SINGLE_BUS("singleBus"),
    @XmlEnumValue("doubleBus")
    DOUBLE_BUS("doubleBus"),
    @XmlEnumValue("mainWithTransfer")
    MAIN_WITH_TRANSFER("mainWithTransfer"),
    @XmlEnumValue("ringBus")
    RING_BUS("ringBus");
    private final String value;

    BusbarConfiguration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusbarConfiguration fromValue(String v) {
        for (BusbarConfiguration c: BusbarConfiguration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
