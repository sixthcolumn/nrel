
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Electric"/>
 *     &lt;enumeration value="Gas"/>
 *     &lt;enumeration value="Water"/>
 *     &lt;enumeration value="Propane"/>
 *     &lt;enumeration value="Refuse"/>
 *     &lt;enumeration value="Sewer"/>
 *     &lt;enumeration value="Telecom"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="Cable"/>
 *     &lt;enumeration value="Heating"/>
 *     &lt;enumeration value="Steam"/>
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceKind")
@XmlEnum
public enum ServiceKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Propane")
    PROPANE("Propane"),
    @XmlEnumValue("Refuse")
    REFUSE("Refuse"),
    @XmlEnumValue("Sewer")
    SEWER("Sewer"),
    @XmlEnumValue("Telecom")
    TELECOM("Telecom"),
    TV("TV"),
    @XmlEnumValue("Cable")
    CABLE("Cable"),
    @XmlEnumValue("Heating")
    HEATING("Heating"),
    @XmlEnumValue("Steam")
    STEAM("Steam"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ServiceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceKind fromValue(String v) {
        for (ServiceKind c: ServiceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
