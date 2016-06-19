
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eMailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eMailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Alternate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eMailType")
@XmlEnum
public enum EMailType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Alternate")
    ALTERNATE("Alternate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EMailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EMailType fromValue(String v) {
        for (EMailType c: EMailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
