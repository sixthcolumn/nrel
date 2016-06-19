
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for treatment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="treatment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Butt"/>
 *     &lt;enumeration value="Natural"/>
 *     &lt;enumeration value="Penta"/>
 *     &lt;enumeration value="Creosote"/>
 *     &lt;enumeration value="CCA"/>
 *     &lt;enumeration value="Chemonite"/>
 *     &lt;enumeration value="Napthena"/>
 *     &lt;enumeration value="Cellon"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "treatment")
@XmlEnum
public enum Treatment {

    @XmlEnumValue("Other")
    OTHER("Other"),
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
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Treatment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Treatment fromValue(String v) {
        for (Treatment c: Treatment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
