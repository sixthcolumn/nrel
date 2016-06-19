
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for binaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="binaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Audio"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Application"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "binaryType")
@XmlEnum
public enum BinaryType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Application")
    APPLICATION("Application");
    private final String value;

    BinaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryType fromValue(String v) {
        for (BinaryType c: BinaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
