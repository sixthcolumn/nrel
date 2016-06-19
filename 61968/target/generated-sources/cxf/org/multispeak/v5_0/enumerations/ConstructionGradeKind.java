
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constructionGradeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constructionGradeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="GradeB"/>
 *     &lt;enumeration value="GradeC"/>
 *     &lt;enumeration value="GradeN"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constructionGradeKind")
@XmlEnum
public enum ConstructionGradeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("GradeB")
    GRADE_B("GradeB"),
    @XmlEnumValue("GradeC")
    GRADE_C("GradeC"),
    @XmlEnumValue("GradeN")
    GRADE_N("GradeN"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstructionGradeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionGradeKind fromValue(String v) {
        for (ConstructionGradeKind c: ConstructionGradeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
