
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constructionReferenceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constructionReferenceKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="BackSpan"/>
 *     &lt;enumeration value="HeadSpan"/>
 *     &lt;enumeration value="Conduit"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constructionReferenceKind")
@XmlEnum
public enum ConstructionReferenceKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BackSpan")
    BACK_SPAN("BackSpan"),
    @XmlEnumValue("HeadSpan")
    HEAD_SPAN("HeadSpan"),
    @XmlEnumValue("Conduit")
    CONDUIT("Conduit"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstructionReferenceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionReferenceKind fromValue(String v) {
        for (ConstructionReferenceKind c: ConstructionReferenceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
