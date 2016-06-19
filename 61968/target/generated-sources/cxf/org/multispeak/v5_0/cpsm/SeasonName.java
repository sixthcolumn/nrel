
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeasonName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeasonName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="winter"/>
 *     &lt;enumeration value="spring"/>
 *     &lt;enumeration value="summer"/>
 *     &lt;enumeration value="fall"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeasonName")
@XmlEnum
public enum SeasonName {

    @XmlEnumValue("winter")
    WINTER("winter"),
    @XmlEnumValue("spring")
    SPRING("spring"),
    @XmlEnumValue("summer")
    SUMMER("summer"),
    @XmlEnumValue("fall")
    FALL("fall");
    private final String value;

    SeasonName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeasonName fromValue(String v) {
        for (SeasonName c: SeasonName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
