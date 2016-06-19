
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSUnitsKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CSUnitsKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="USSurveyFeet"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CSUnitsKind")
@XmlEnum
public enum CSUnitsKind {

    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("Meters")
    METERS("Meters"),
    @XmlEnumValue("USSurveyFeet")
    US_SURVEY_FEET("USSurveyFeet"),

    /**
     * If none of the enumerations are appropriate, then the choice "Other" MUST be chosen and the appropriate unit SHALL be included in the "otherKind" attribute on the CSUnits complex type.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CSUnitsKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CSUnitsKind fromValue(String v) {
        for (CSUnitsKind c: CSUnitsKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
