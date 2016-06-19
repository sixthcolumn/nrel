
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadInterruptibleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadInterruptibleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Interruptible"/>
 *     &lt;enumeration value="Noninterruptible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadInterruptibleType")
@XmlEnum
public enum LoadInterruptibleType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Interruptible")
    INTERRUPTIBLE("Interruptible"),
    @XmlEnumValue("Noninterruptible")
    NONINTERRUPTIBLE("Noninterruptible");
    private final String value;

    LoadInterruptibleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadInterruptibleType fromValue(String v) {
        for (LoadInterruptibleType c: LoadInterruptibleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
