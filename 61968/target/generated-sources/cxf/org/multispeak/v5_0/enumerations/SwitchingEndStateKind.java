
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchingEndStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="switchingEndStateKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="TaggedOpen"/>
 *     &lt;enumeration value="TaggedClosed"/>
 *     &lt;enumeration value="Grounded"/>
 *     &lt;enumeration value="Ungrounded"/>
 *     &lt;enumeration value="Isolated"/>
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "switchingEndStateKind")
@XmlEnum
public enum SwitchingEndStateKind {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("TaggedOpen")
    TAGGED_OPEN("TaggedOpen"),
    @XmlEnumValue("TaggedClosed")
    TAGGED_CLOSED("TaggedClosed"),
    @XmlEnumValue("Grounded")
    GROUNDED("Grounded"),
    @XmlEnumValue("Ungrounded")
    UNGROUNDED("Ungrounded"),
    @XmlEnumValue("Isolated")
    ISOLATED("Isolated"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SwitchingEndStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchingEndStateKind fromValue(String v) {
        for (SwitchingEndStateKind c: SwitchingEndStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
