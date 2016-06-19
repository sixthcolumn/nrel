
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadDistribution.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadDistribution">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Uniform"/>
 *     &lt;enumeration value="LoadEnd"/>
 *     &lt;enumeration value="SourceEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadDistribution")
@XmlEnum
public enum LoadDistribution {

    @XmlEnumValue("Uniform")
    UNIFORM("Uniform"),
    @XmlEnumValue("LoadEnd")
    LOAD_END("LoadEnd"),
    @XmlEnumValue("SourceEnd")
    SOURCE_END("SourceEnd");
    private final String value;

    LoadDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadDistribution fromValue(String v) {
        for (LoadDistribution c: LoadDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
