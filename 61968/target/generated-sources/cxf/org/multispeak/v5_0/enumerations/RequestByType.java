
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Before"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="After"/>
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestByType")
@XmlEnum
public enum RequestByType {

    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RequestByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestByType fromValue(String v) {
        for (RequestByType c: RequestByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
