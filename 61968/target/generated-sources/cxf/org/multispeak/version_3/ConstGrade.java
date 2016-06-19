
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constGrade.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constGrade">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GradeB"/>
 *     &lt;enumeration value="GradeC"/>
 *     &lt;enumeration value="GradeN"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constGrade")
@XmlEnum
public enum ConstGrade {

    @XmlEnumValue("GradeB")
    GRADE_B("GradeB"),
    @XmlEnumValue("GradeC")
    GRADE_C("GradeC"),
    @XmlEnumValue("GradeN")
    GRADE_N("GradeN"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ConstGrade(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstGrade fromValue(String v) {
        for (ConstGrade c: ConstGrade.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
