
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusOfUnitKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusOfUnitKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="CAndR"/>
 *     &lt;enumeration value="RAndE"/>
 *     &lt;enumeration value="CRAndE"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusOfUnitKind")
@XmlEnum
public enum StatusOfUnitKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Construction
     * 
     */
    C("C"),

    /**
     * Retire
     * 
     */
    R("R"),

    /**
     * Existing
     * 
     */
    E("E"),

    /**
     * Construction and Retire
     * 
     */
    @XmlEnumValue("CAndR")
    C_AND_R("CAndR"),

    /**
     * Retire and Existing
     * 
     */
    @XmlEnumValue("RAndE")
    R_AND_E("RAndE"),

    /**
     * Construction, Retire and Existing
     * 
     */
    @XmlEnumValue("CRAndE")
    CR_AND_E("CRAndE"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    StatusOfUnitKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusOfUnitKind fromValue(String v) {
        for (StatusOfUnitKind c: StatusOfUnitKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
