
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultsKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultsKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LoadFlow"/>
 *     &lt;enumeration value="ShortCircuit"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultsKind")
@XmlEnum
public enum ResultsKind {

    @XmlEnumValue("LoadFlow")
    LOAD_FLOW("LoadFlow"),
    @XmlEnumValue("ShortCircuit")
    SHORT_CIRCUIT("ShortCircuit"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResultsKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultsKind fromValue(String v) {
        for (ResultsKind c: ResultsKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
