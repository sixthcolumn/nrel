
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculationMethodKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="calculationMethodKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "calculationMethodKind")
@XmlEnum
public enum CalculationMethodKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The variable was automatically chosen by the software.
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * The value was chosen by the user.
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CalculationMethodKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationMethodKind fromValue(String v) {
        for (CalculationMethodKind c: CalculationMethodKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
