
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceLimitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GTOrEq"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LTOrEQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceLimitType")
@XmlEnum
public enum ServiceLimitType {


    /**
     * Equal to
     * 
     */
    EQ("EQ"),

    /**
     * Greater than
     * 
     */
    GT("GT"),

    /**
     * Greater than or equal to
     * 
     */
    @XmlEnumValue("GTOrEq")
    GT_OR_EQ("GTOrEq"),

    /**
     * Less than
     * 
     */
    LT("LT"),

    /**
     * Less than or equal to
     * 
     */
    @XmlEnumValue("LTOrEQ")
    LT_OR_EQ("LTOrEQ");
    private final String value;

    ServiceLimitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceLimitType fromValue(String v) {
        for (ServiceLimitType c: ServiceLimitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
