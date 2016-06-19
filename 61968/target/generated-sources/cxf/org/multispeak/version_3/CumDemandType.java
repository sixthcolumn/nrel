
package org.multispeak.version_3;

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
 *     &lt;enumeration value="max"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="continousMax"/>
 *     &lt;enumeration value="continousMin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cumDemandType")
@XmlEnum
public enum CumDemandType {

    @XmlEnumValue("max")
    MAX("max"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("continousMax")
    CONTINOUS_MAX("continousMax"),
    @XmlEnumValue("continousMin")
    CONTINOUS_MIN("continousMin");
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
