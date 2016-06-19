
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageContext.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageContext">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Development"/>
 *     &lt;enumeration value="Production"/>
 *     &lt;enumeration value="Study"/>
 *     &lt;enumeration value="Testing"/>
 *     &lt;enumeration value="Training"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageContext")
@XmlEnum
public enum MessageContext {

    @XmlEnumValue("Development")
    DEVELOPMENT("Development"),
    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Study")
    STUDY("Study"),
    @XmlEnumValue("Testing")
    TESTING("Testing"),
    @XmlEnumValue("Training")
    TRAINING("Training"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MessageContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageContext fromValue(String v) {
        for (MessageContext c: MessageContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
