
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domainMemberAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="domainMemberAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Changed"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "domainMemberAction")
@XmlEnum
public enum DomainMemberAction {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Changed")
    CHANGED("Changed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    DomainMemberAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainMemberAction fromValue(String v) {
        for (DomainMemberAction c: DomainMemberAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
