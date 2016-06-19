
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceStateKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Dispatched"/>
 *     &lt;enumeration value="Acknowledged"/>
 *     &lt;enumeration value="Enroute"/>
 *     &lt;enumeration value="OnSite"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceStateKind")
@XmlEnum
public enum ResourceStateKind {


    /**
     * The state of this crew is not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * At least one crew has been dispatched to this outage.
     * 
     */
    @XmlEnumValue("Dispatched")
    DISPATCHED("Dispatched"),

    /**
     * The crew has acknowledged and accepted the work assignment to work this outage.
     * 
     */
    @XmlEnumValue("Acknowledged")
    ACKNOWLEDGED("Acknowledged"),

    /**
     * The crew is enroute to the work site.
     * 
     */
    @XmlEnumValue("Enroute")
    ENROUTE("Enroute"),

    /**
     * The crew has arrived at the work site.
     * 
     */
    @XmlEnumValue("OnSite")
    ON_SITE("OnSite"),

    /**
     * No acceptable enumeration is listed here and a custom value will be included in the "otherKind" attribute of the crewState.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceStateKind fromValue(String v) {
        for (ResourceStateKind c: ResourceStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
