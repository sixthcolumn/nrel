
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for districtTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="districtTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Ambulance"/>
 *     &lt;enumeration value="Board"/>
 *     &lt;enumeration value="Fire"/>
 *     &lt;enumeration value="Franchise"/>
 *     &lt;enumeration value="MosquitoControl"/>
 *     &lt;enumeration value="Operations"/>
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="Sanitation"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Water"/>
 *     &lt;enumeration value="WaterAndSanitation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "districtTypeKind")
@XmlEnum
public enum DistrictTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Ambulance")
    AMBULANCE("Ambulance"),
    @XmlEnumValue("Board")
    BOARD("Board"),
    @XmlEnumValue("Fire")
    FIRE("Fire"),
    @XmlEnumValue("Franchise")
    FRANCHISE("Franchise"),
    @XmlEnumValue("MosquitoControl")
    MOSQUITO_CONTROL("MosquitoControl"),
    @XmlEnumValue("Operations")
    OPERATIONS("Operations"),
    @XmlEnumValue("School")
    SCHOOL("School"),
    @XmlEnumValue("Sanitation")
    SANITATION("Sanitation"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("WaterAndSanitation")
    WATER_AND_SANITATION("WaterAndSanitation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DistrictTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistrictTypeKind fromValue(String v) {
        for (DistrictTypeKind c: DistrictTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
