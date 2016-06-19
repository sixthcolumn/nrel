
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designRoleKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="designRoleKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alternative"/>
 *     &lt;enumeration value="Part"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "designRoleKind")
@XmlEnum
public enum DesignRoleKind {


    /**
     * Alternative means that this design is a version or alternative, such as underground and overhead designs, etc.  The intention is that only one of these alternatives will be constructed.
     * 
     */
    @XmlEnumValue("Alternative")
    ALTERNATIVE("Alternative"),

    /**
     * Part implies that this is a design for a portion of the complete work. For instance, retirement and new construction might be parts of the entire work.  In this case, the intention is that all parts of the work are to be completed.
     * 
     */
    @XmlEnumValue("Part")
    PART("Part"),

    /**
     * If no acceptable hard enumeration value is available, the choice "Other" SHALL be used and the extended enumeration SHALL be included in the otherKind attribute.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DesignRoleKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesignRoleKind fromValue(String v) {
        for (DesignRoleKind c: DesignRoleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
