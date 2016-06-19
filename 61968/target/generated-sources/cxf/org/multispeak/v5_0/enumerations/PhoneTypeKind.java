
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phoneTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="BusinessMobile"/>
 *     &lt;enumeration value="Pager"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phoneTypeKind")
@XmlEnum
public enum PhoneTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("BusinessMobile")
    BUSINESS_MOBILE("BusinessMobile"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PhoneTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneTypeKind fromValue(String v) {
        for (PhoneTypeKind c: PhoneTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
