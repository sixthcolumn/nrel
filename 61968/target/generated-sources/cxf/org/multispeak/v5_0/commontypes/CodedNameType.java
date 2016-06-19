
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codedNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codedNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GlobalDomain"/>
 *     &lt;enumeration value="RegisteredName"/>
 *     &lt;enumeration value="SystemName"/>
 *     &lt;enumeration value="NounType"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codedNameType")
@XmlEnum
public enum CodedNameType {

    @XmlEnumValue("GlobalDomain")
    GLOBAL_DOMAIN("GlobalDomain"),
    @XmlEnumValue("RegisteredName")
    REGISTERED_NAME("RegisteredName"),
    @XmlEnumValue("SystemName")
    SYSTEM_NAME("SystemName"),
    @XmlEnumValue("NounType")
    NOUN_TYPE("NounType"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CodedNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodedNameType fromValue(String v) {
        for (CodedNameType c: CodedNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
