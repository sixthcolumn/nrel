
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedNumberKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestedNumberKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ServiceOrder"/>
 *     &lt;enumeration value="WorkOrder"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestedNumberKind")
@XmlEnum
public enum RequestedNumberKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ServiceOrder")
    SERVICE_ORDER("ServiceOrder"),
    @XmlEnumValue("WorkOrder")
    WORK_ORDER("WorkOrder"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RequestedNumberKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedNumberKind fromValue(String v) {
        for (RequestedNumberKind c: RequestedNumberKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
