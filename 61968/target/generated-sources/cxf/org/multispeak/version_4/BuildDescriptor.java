
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildDescriptor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildDescriptor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Release"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildDescriptor")
@XmlEnum
public enum BuildDescriptor {

    PR("PR"),
    RC("RC"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Release")
    RELEASE("Release"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    BuildDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildDescriptor fromValue(String v) {
        for (BuildDescriptor c: BuildDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
