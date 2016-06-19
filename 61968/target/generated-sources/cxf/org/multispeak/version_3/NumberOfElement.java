
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberOfElement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="numberOfElement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="numberOfElements 1"/>
 *     &lt;enumeration value="numberOfElements 1.5"/>
 *     &lt;enumeration value="numberOfElements 2"/>
 *     &lt;enumeration value="numberOfElements 2.5"/>
 *     &lt;enumeration value="numberOfElements 3"/>
 *     &lt;enumeration value="numberOfElements 6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "numberOfElement")
@XmlEnum
public enum NumberOfElement {

    @XmlEnumValue("numberOfElements 1")
    NUMBER_OF_ELEMENTS_1("numberOfElements 1"),
    @XmlEnumValue("numberOfElements 1.5")
    NUMBER_OF_ELEMENTS_1_5("numberOfElements 1.5"),
    @XmlEnumValue("numberOfElements 2")
    NUMBER_OF_ELEMENTS_2("numberOfElements 2"),
    @XmlEnumValue("numberOfElements 2.5")
    NUMBER_OF_ELEMENTS_2_5("numberOfElements 2.5"),
    @XmlEnumValue("numberOfElements 3")
    NUMBER_OF_ELEMENTS_3("numberOfElements 3"),
    @XmlEnumValue("numberOfElements 6")
    NUMBER_OF_ELEMENTS_6("numberOfElements 6");
    private final String value;

    NumberOfElement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumberOfElement fromValue(String v) {
        for (NumberOfElement c: NumberOfElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
