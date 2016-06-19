
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectDeviceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageDetectDeviceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="OutofService"/>
 *     &lt;enumeration value="Defective"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageDetectDeviceStatus")
@XmlEnum
public enum OutageDetectDeviceStatus {

    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutofService")
    OUTOF_SERVICE("OutofService"),
    @XmlEnumValue("Defective")
    DEFECTIVE("Defective"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OutageDetectDeviceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageDetectDeviceStatus fromValue(String v) {
        for (OutageDetectDeviceStatus c: OutageDetectDeviceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
