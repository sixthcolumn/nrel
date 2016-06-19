
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizatonTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authorizatonTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RequestedBy"/>
 *     &lt;enumeration value="CreatedBy"/>
 *     &lt;enumeration value="CheckedBy"/>
 *     &lt;enumeration value="ModifiedBy"/>
 *     &lt;enumeration value="ReleasedBy"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authorizatonTypeKind")
@XmlEnum
public enum AuthorizatonTypeKind {

    @XmlEnumValue("RequestedBy")
    REQUESTED_BY("RequestedBy"),
    @XmlEnumValue("CreatedBy")
    CREATED_BY("CreatedBy"),
    @XmlEnumValue("CheckedBy")
    CHECKED_BY("CheckedBy"),
    @XmlEnumValue("ModifiedBy")
    MODIFIED_BY("ModifiedBy"),
    @XmlEnumValue("ReleasedBy")
    RELEASED_BY("ReleasedBy"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AuthorizatonTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizatonTypeKind fromValue(String v) {
        for (AuthorizatonTypeKind c: AuthorizatonTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
