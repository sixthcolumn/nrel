
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for treatmentKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="treatmentKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Butt"/>
 *     &lt;enumeration value="Natural"/>
 *     &lt;enumeration value="Penta"/>
 *     &lt;enumeration value="Creosote"/>
 *     &lt;enumeration value="CCA"/>
 *     &lt;enumeration value="Chemonite"/>
 *     &lt;enumeration value="Napthena"/>
 *     &lt;enumeration value="Cellon"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "treatmentKind")
@XmlEnum
public enum TreatmentKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Butt")
    BUTT("Butt"),
    @XmlEnumValue("Natural")
    NATURAL("Natural"),
    @XmlEnumValue("Penta")
    PENTA("Penta"),
    @XmlEnumValue("Creosote")
    CREOSOTE("Creosote"),
    CCA("CCA"),
    @XmlEnumValue("Chemonite")
    CHEMONITE("Chemonite"),
    @XmlEnumValue("Napthena")
    NAPTHENA("Napthena"),
    @XmlEnumValue("Cellon")
    CELLON("Cellon"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TreatmentKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreatmentKind fromValue(String v) {
        for (TreatmentKind c: TreatmentKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
