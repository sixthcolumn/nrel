
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectDeviceStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageDetectDeviceStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="OutofService"/>
 *     &lt;enumeration value="Defective"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageDetectDeviceStatusKind")
@XmlEnum
public enum OutageDetectDeviceStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutofService")
    OUTOF_SERVICE("OutofService"),
    @XmlEnumValue("Defective")
    DEFECTIVE("Defective"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageDetectDeviceStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageDetectDeviceStatusKind fromValue(String v) {
        for (OutageDetectDeviceStatusKind c: OutageDetectDeviceStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
