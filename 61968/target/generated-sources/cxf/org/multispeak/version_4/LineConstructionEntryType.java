
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineConstructionEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lineConstructionEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="ServiceDrop"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lineConstructionEntryType")
@XmlEnum
public enum LineConstructionEntryType {

    OH("OH"),
    CN("CN"),
    TS("TS"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("ServiceDrop")
    SERVICE_DROP("ServiceDrop"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LineConstructionEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineConstructionEntryType fromValue(String v) {
        for (LineConstructionEntryType c: LineConstructionEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
