
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyEventTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="historyEventTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="IssuedToMobile"/>
 *     &lt;enumeration value="CheckedOut"/>
 *     &lt;enumeration value="CheckedIn"/>
 *     &lt;enumeration value="StatusChanged"/>
 *     &lt;enumeration value="Acknowledged"/>
 *     &lt;enumeration value="Copied"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="DesignReviewed"/>
 *     &lt;enumeration value="Released"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Inspected"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "historyEventTypeKind")
@XmlEnum
public enum HistoryEventTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("IssuedToMobile")
    ISSUED_TO_MOBILE("IssuedToMobile"),
    @XmlEnumValue("CheckedOut")
    CHECKED_OUT("CheckedOut"),
    @XmlEnumValue("CheckedIn")
    CHECKED_IN("CheckedIn"),
    @XmlEnumValue("StatusChanged")
    STATUS_CHANGED("StatusChanged"),
    @XmlEnumValue("Acknowledged")
    ACKNOWLEDGED("Acknowledged"),
    @XmlEnumValue("Copied")
    COPIED("Copied"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("DesignReviewed")
    DESIGN_REVIEWED("DesignReviewed"),
    @XmlEnumValue("Released")
    RELEASED("Released"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Inspected")
    INSPECTED("Inspected"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HistoryEventTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoryEventTypeKind fromValue(String v) {
        for (HistoryEventTypeKind c: HistoryEventTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
