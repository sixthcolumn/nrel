
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tagKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tagKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HoldOpen"/>
 *     &lt;enumeration value="HoldClosed"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Alarm"/>
 *     &lt;enumeration value="Scan"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tagKind")
@XmlEnum
public enum TagKind {


    /**
     * The device shall be maintained in the open position.
     * 
     */
    @XmlEnumValue("HoldOpen")
    HOLD_OPEN("HoldOpen"),

    /**
     * The device will be maintained in the closed position while the tag is in effect.
     * 
     */
    @XmlEnumValue("HoldClosed")
    HOLD_CLOSED("HoldClosed"),

    /**
     * Full means that no action is permitted to be taken on this device and no reporting is to be performed while this tag is in effect.
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * This tag type is attached to include information on the device state, but that no inhibition is placed on the operation or reporting on the device.
     * 
     */
    @XmlEnumValue("Information")
    INFORMATION("Information"),

    /**
     *  This means that no control action is to be taken on the device, but reporting may be performed.
     * 
     */
    @XmlEnumValue("Control")
    CONTROL("Control"),

    /**
     * This means that alarming is to be suppressed while the tag is in effect.
     * 
     */
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),

    /**
     * Scanning is to be inhibited while the tag is in effect.
     * 
     */
    @XmlEnumValue("Scan")
    SCAN("Scan"),

    /**
     * The system will provide a vendor-specific tagKind and will populate the otherKind attribute of the tagType.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TagKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TagKind fromValue(String v) {
        for (TagKind c: TagKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
