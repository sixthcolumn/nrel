
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadingDistrictKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadingDistrictKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Heavy"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadingDistrictKind")
@XmlEnum
public enum LoadingDistrictKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Heavy")
    HEAVY("Heavy"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LoadingDistrictKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadingDistrictKind fromValue(String v) {
        for (LoadingDistrictKind c: LoadingDistrictKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
