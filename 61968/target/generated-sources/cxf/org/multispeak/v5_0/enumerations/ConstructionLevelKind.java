
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constructionLevelKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constructionLevelKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Overhead"/>
 *     &lt;enumeration value="Underbuild"/>
 *     &lt;enumeration value="Underground"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constructionLevelKind")
@XmlEnum
public enum ConstructionLevelKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Overhead")
    OVERHEAD("Overhead"),
    @XmlEnumValue("Underbuild")
    UNDERBUILD("Underbuild"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstructionLevelKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionLevelKind fromValue(String v) {
        for (ConstructionLevelKind c: ConstructionLevelKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
