
package org.w3._1999.xlink;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryAssociationTypeShow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeometryAssociationTypeShow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="embed"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeometryAssociationTypeShow", namespace = "http://www.w3.org/1999/xlink")
@XmlEnum
public enum GeometryAssociationTypeShow {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("embed")
    EMBED("embed"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    GeometryAssociationTypeShow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeometryAssociationTypeShow fromValue(String v) {
        for (GeometryAssociationTypeShow c: GeometryAssociationTypeShow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
