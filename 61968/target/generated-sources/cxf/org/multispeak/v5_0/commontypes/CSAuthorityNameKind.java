
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSAuthorityNameKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CSAuthorityNameKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPCS"/>
 *     &lt;enumeration value="EPSG"/>
 *     &lt;enumeration value="UTM"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CSAuthorityNameKind")
@XmlEnum
public enum CSAuthorityNameKind {


    /**
     * U.S. State Plane Coordinate System.
     * 
     */
    SPCS("SPCS"),

    /**
     * European Petroleum Survey Group.
     * 
     */
    EPSG("EPSG"),

    /**
     * Universal Transverse Mercator.
     * 
     */
    UTM("UTM"),

    /**
     * If none of the specified enumeration options are appropriate, "Other" SHALL be chosen and the appropriate option SHALL be included in the otherKind attribute of the CSAuthorityName complex type.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CSAuthorityNameKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CSAuthorityNameKind fromValue(String v) {
        for (CSAuthorityNameKind c: CSAuthorityNameKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
