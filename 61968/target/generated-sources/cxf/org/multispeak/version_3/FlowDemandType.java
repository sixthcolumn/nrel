
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowDemandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="flowDemandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="max"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "flowDemandType")
@XmlEnum
public enum FlowDemandType {

    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("max")
    MAX("max");
    private final String value;

    FlowDemandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowDemandType fromValue(String v) {
        for (FlowDemandType c: FlowDemandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
