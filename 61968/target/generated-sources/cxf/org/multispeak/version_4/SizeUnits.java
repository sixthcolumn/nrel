
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sizeUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="kcmil"/>
 *     &lt;enumeration value="MCM"/>
 *     &lt;enumeration value="square mm"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sizeUnits")
@XmlEnum
public enum SizeUnits {

    AWG("AWG"),
    @XmlEnumValue("kcmil")
    KCMIL("kcmil"),
    MCM("MCM"),
    @XmlEnumValue("square mm")
    SQUARE_MM("square mm"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SizeUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SizeUnits fromValue(String v) {
        for (SizeUnits c: SizeUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
