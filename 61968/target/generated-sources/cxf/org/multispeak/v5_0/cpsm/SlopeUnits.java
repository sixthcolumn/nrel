
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slopeUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="slopeUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kV/MVAr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "slopeUnits")
@XmlEnum
public enum SlopeUnits {

    @XmlEnumValue("kV/MVAr")
    K_V_MV_AR("kV/MVAr");
    private final String value;

    SlopeUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SlopeUnits fromValue(String v) {
        for (SlopeUnits c: SlopeUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
