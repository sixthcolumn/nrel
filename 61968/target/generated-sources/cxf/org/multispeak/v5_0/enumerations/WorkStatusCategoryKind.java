
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workStatusCategoryKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workStatusCategoryKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workStatusCategoryKind")
@XmlEnum
public enum WorkStatusCategoryKind {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    WorkStatusCategoryKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkStatusCategoryKind fromValue(String v) {
        for (WorkStatusCategoryKind c: WorkStatusCategoryKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
