
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ShuntWye"/>
 *     &lt;enumeration value="ShuntDelta"/>
 *     &lt;enumeration value="ShuntSameAsParent"/>
 *     &lt;enumeration value="Series"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectionCode")
@XmlEnum
public enum ConnectionCode {

    @XmlEnumValue("ShuntWye")
    SHUNT_WYE("ShuntWye"),
    @XmlEnumValue("ShuntDelta")
    SHUNT_DELTA("ShuntDelta"),
    @XmlEnumValue("ShuntSameAsParent")
    SHUNT_SAME_AS_PARENT("ShuntSameAsParent"),
    @XmlEnumValue("Series")
    SERIES("Series");
    private final String value;

    ConnectionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionCode fromValue(String v) {
        for (ConnectionCode c: ConnectionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
