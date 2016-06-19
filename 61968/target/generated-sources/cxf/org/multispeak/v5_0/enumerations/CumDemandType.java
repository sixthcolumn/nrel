
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cumDemandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cumDemandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Max"/>
 *     &lt;enumeration value="Min"/>
 *     &lt;enumeration value="ContinousMax"/>
 *     &lt;enumeration value="ContinousMin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cumDemandType")
@XmlEnum
public enum CumDemandType {

    @XmlEnumValue("Max")
    MAX("Max"),
    @XmlEnumValue("Min")
    MIN("Min"),
    @XmlEnumValue("ContinousMax")
    CONTINOUS_MAX("ContinousMax"),
    @XmlEnumValue("ContinousMin")
    CONTINOUS_MIN("ContinousMin");
    private final String value;

    CumDemandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CumDemandType fromValue(String v) {
        for (CumDemandType c: CumDemandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
