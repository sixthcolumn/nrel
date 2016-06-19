
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformerControlMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransformerControlMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="volt"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="reactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransformerControlMode")
@XmlEnum
public enum TransformerControlMode {

    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("volt")
    VOLT("volt"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("reactive")
    REACTIVE("reactive");
    private final String value;

    TransformerControlMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransformerControlMode fromValue(String v) {
        for (TransformerControlMode c: TransformerControlMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
