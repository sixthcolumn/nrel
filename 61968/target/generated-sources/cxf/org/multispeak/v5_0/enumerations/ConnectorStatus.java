
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectorStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectorStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OutOfService"/>
 *     &lt;enumeration value="Wired"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectorStatus")
@XmlEnum
public enum ConnectorStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService"),
    @XmlEnumValue("Wired")
    WIRED("Wired"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConnectorStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectorStatus fromValue(String v) {
        for (ConnectorStatus c: ConnectorStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
