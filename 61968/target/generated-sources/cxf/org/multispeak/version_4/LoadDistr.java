
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadDistr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadDistr">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Uniform"/>
 *     &lt;enumeration value="LoadEnd"/>
 *     &lt;enumeration value="SourceEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadDistr")
@XmlEnum
public enum LoadDistr {

    @XmlEnumValue("Uniform")
    UNIFORM("Uniform"),
    @XmlEnumValue("LoadEnd")
    LOAD_END("LoadEnd"),
    @XmlEnumValue("SourceEnd")
    SOURCE_END("SourceEnd");
    private final String value;

    LoadDistr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadDistr fromValue(String v) {
        for (LoadDistr c: LoadDistr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
