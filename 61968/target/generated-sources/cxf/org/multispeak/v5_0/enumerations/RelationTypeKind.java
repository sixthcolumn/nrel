
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relationTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relationTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Sibling"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relationTypeKind")
@XmlEnum
public enum RelationTypeKind {

    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Sibling")
    SIBLING("Sibling"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RelationTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationTypeKind fromValue(String v) {
        for (RelationTypeKind c: RelationTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
