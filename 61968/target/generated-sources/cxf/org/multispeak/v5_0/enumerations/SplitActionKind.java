
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitActionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="splitActionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OriginalOutageDeleted"/>
 *     &lt;enumeration value="OriginalOutageRetained"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "splitActionKind")
@XmlEnum
public enum SplitActionKind {

    @XmlEnumValue("OriginalOutageDeleted")
    ORIGINAL_OUTAGE_DELETED("OriginalOutageDeleted"),
    @XmlEnumValue("OriginalOutageRetained")
    ORIGINAL_OUTAGE_RETAINED("OriginalOutageRetained"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SplitActionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SplitActionKind fromValue(String v) {
        for (SplitActionKind c: SplitActionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
