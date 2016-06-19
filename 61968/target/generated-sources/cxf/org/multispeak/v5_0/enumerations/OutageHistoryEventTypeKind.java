
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageHistoryEventTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageHistoryEventTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="OutageDefined"/>
 *     &lt;enumeration value="FirstDispatch"/>
 *     &lt;enumeration value="FirstETA"/>
 *     &lt;enumeration value="FirstArrival"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageHistoryEventTypeKind")
@XmlEnum
public enum OutageHistoryEventTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),
    @XmlEnumValue("OutageDefined")
    OUTAGE_DEFINED("OutageDefined"),
    @XmlEnumValue("FirstDispatch")
    FIRST_DISPATCH("FirstDispatch"),
    @XmlEnumValue("FirstETA")
    FIRST_ETA("FirstETA"),
    @XmlEnumValue("FirstArrival")
    FIRST_ARRIVAL("FirstArrival"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageHistoryEventTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageHistoryEventTypeKind fromValue(String v) {
        for (OutageHistoryEventTypeKind c: OutageHistoryEventTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
