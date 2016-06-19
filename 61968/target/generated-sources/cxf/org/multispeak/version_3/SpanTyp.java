
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spanTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="spanTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="primary"/>
 *     &lt;enumeration value="secondary"/>
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="underbuild"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "spanTyp")
@XmlEnum
public enum SpanTyp {

    @XmlEnumValue("primary")
    PRIMARY("primary"),
    @XmlEnumValue("secondary")
    SECONDARY("secondary"),
    @XmlEnumValue("service")
    SERVICE("service"),
    @XmlEnumValue("underbuild")
    UNDERBUILD("underbuild"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    SpanTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpanTyp fromValue(String v) {
        for (SpanTyp c: SpanTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
