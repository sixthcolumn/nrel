
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingSchedulingResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="readingSchedulingResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="RejectedInPart"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "readingSchedulingResult")
@XmlEnum
public enum ReadingSchedulingResult {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("RejectedInPart")
    REJECTED_IN_PART("RejectedInPart"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ReadingSchedulingResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingSchedulingResult fromValue(String v) {
        for (ReadingSchedulingResult c: ReadingSchedulingResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
