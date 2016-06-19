
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quantityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="quantityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="summation"/>
 *     &lt;enumeration value="demand"/>
 *     &lt;enumeration value="value"/>
 *     &lt;enumeration value="consumption"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "quantityType")
@XmlEnum
public enum QuantityType {

    @XmlEnumValue("summation")
    SUMMATION("summation"),
    @XmlEnumValue("demand")
    DEMAND("demand"),
    @XmlEnumValue("value")
    VALUE("value"),
    @XmlEnumValue("consumption")
    CONSUMPTION("consumption");
    private final String value;

    QuantityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityType fromValue(String v) {
        for (QuantityType c: QuantityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
