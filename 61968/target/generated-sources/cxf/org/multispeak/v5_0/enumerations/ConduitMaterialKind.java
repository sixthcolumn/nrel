
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conduitMaterialKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="conduitMaterialKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PVC"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="Fiber"/>
 *     &lt;enumeration value="Transite"/>
 *     &lt;enumeration value="Steel"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "conduitMaterialKind")
@XmlEnum
public enum ConduitMaterialKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    PVC("PVC"),
    PE("PE"),
    @XmlEnumValue("Fiber")
    FIBER("Fiber"),
    @XmlEnumValue("Transite")
    TRANSITE("Transite"),
    @XmlEnumValue("Steel")
    STEEL("Steel"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConduitMaterialKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConduitMaterialKind fromValue(String v) {
        for (ConduitMaterialKind c: ConduitMaterialKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
