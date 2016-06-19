
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Planned"/>
 *     &lt;enumeration value="Unplanned"/>
 *     &lt;enumeration value="NonPay"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageKind")
@XmlEnum
public enum OutageKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Unplanned")
    UNPLANNED("Unplanned"),
    @XmlEnumValue("NonPay")
    NON_PAY("NonPay"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageKind fromValue(String v) {
        for (OutageKind c: OutageKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
