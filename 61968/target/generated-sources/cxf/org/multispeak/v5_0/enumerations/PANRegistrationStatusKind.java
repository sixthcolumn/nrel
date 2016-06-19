
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANRegistrationStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PANRegistrationStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Joining"/>
 *     &lt;enumeration value="Leaving"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PANRegistrationStatusKind")
@XmlEnum
public enum PANRegistrationStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The device is in the process of joining the HAN. 
     * This usually indicates that the ESI has opened its joining window and is waiting for the device to respond.
     * 
     */
    @XmlEnumValue("Joining")
    JOINING("Joining"),

    /**
     * The device is in the process of leaving the HAN.
     * 
     */
    @XmlEnumValue("Leaving")
    LEAVING("Leaving"),

    /**
     * The communications between the device and ESI have been established. 
     * 
     */
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),

    /**
     * The communications between the device and HAN are not 
     * established.
     * 
     */
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PANRegistrationStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PANRegistrationStatusKind fromValue(String v) {
        for (PANRegistrationStatusKind c: PANRegistrationStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
