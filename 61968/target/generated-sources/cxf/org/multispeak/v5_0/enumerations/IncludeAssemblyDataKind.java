
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for includeAssemblyDataKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="includeAssemblyDataKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Assemblies"/>
 *     &lt;enumeration value="AssemblyDetails"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "includeAssemblyDataKind")
@XmlEnum
public enum IncludeAssemblyDataKind {

    @XmlEnumValue("Assemblies")
    ASSEMBLIES("Assemblies"),
    @XmlEnumValue("AssemblyDetails")
    ASSEMBLY_DETAILS("AssemblyDetails"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IncludeAssemblyDataKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeAssemblyDataKind fromValue(String v) {
        for (IncludeAssemblyDataKind c: IncludeAssemblyDataKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
