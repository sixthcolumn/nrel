
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addressKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Mailing"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Headquarters"/>
 *     &lt;enumeration value="Landlord"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressKind")
@XmlEnum
public enum AddressKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Mailing")
    MAILING("Mailing"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Headquarters")
    HEADQUARTERS("Headquarters"),
    @XmlEnumValue("Landlord")
    LANDLORD("Landlord"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AddressKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressKind fromValue(String v) {
        for (AddressKind c: AddressKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
