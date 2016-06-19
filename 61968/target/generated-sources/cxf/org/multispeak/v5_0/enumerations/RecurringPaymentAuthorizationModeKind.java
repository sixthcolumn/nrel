
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recurringPaymentAuthorizationModeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recurringPaymentAuthorizationModeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recurringPaymentAuthorizationModeKind")
@XmlEnum
public enum RecurringPaymentAuthorizationModeKind {

    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecurringPaymentAuthorizationModeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurringPaymentAuthorizationModeKind fromValue(String v) {
        for (RecurringPaymentAuthorizationModeKind c: RecurringPaymentAuthorizationModeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
