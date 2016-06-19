
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakerConfiguration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BreakerConfiguration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="singleBreaker"/>
 *     &lt;enumeration value="breakerAndAHalf"/>
 *     &lt;enumeration value="doubleBreaker"/>
 *     &lt;enumeration value="noBreaker"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BreakerConfiguration")
@XmlEnum
public enum BreakerConfiguration {

    @XmlEnumValue("singleBreaker")
    SINGLE_BREAKER("singleBreaker"),
    @XmlEnumValue("breakerAndAHalf")
    BREAKER_AND_A_HALF("breakerAndAHalf"),
    @XmlEnumValue("doubleBreaker")
    DOUBLE_BREAKER("doubleBreaker"),
    @XmlEnumValue("noBreaker")
    NO_BREAKER("noBreaker");
    private final String value;

    BreakerConfiguration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakerConfiguration fromValue(String v) {
        for (BreakerConfiguration c: BreakerConfiguration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
