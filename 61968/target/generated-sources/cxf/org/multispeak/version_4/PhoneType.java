
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Business mobile"/>
 *     &lt;enumeration value="Pager"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phoneType")
@XmlEnum
public enum PhoneType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Business mobile")
    BUSINESS_MOBILE("Business mobile"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PhoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneType fromValue(String v) {
        for (PhoneType c: PhoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
