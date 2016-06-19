
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qualityDescription.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="qualityDescription">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Measured"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "qualityDescription")
@XmlEnum
public enum QualityDescription {

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
    FAILED("Failed");
    private final String value;

    QualityDescription(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityDescription fromValue(String v) {
        for (QualityDescription c: QualityDescription.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
