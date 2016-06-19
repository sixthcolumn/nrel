
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualityDescriptionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="qualityDescriptionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Measured"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="ScanInhibited"/>
 *     &lt;enumeration value="OldData"/>
 *     &lt;enumeration value="AlarmInhibited"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "qualityDescriptionKind")
@XmlEnum
public enum QualityDescriptionKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Measured")
    MEASURED("Measured"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),
    @XmlEnumValue("Initial")
    INITIAL("Initial"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("ScanInhibited")
    SCAN_INHIBITED("ScanInhibited"),
    @XmlEnumValue("OldData")
    OLD_DATA("OldData"),
    @XmlEnumValue("AlarmInhibited")
    ALARM_INHIBITED("AlarmInhibited"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    QualityDescriptionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityDescriptionKind fromValue(String v) {
        for (QualityDescriptionKind c: QualityDescriptionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
