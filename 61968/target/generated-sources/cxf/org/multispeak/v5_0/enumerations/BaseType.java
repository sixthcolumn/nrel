
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="baseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BaseType1"/>
 *     &lt;enumeration value="SBase"/>
 *     &lt;enumeration value="ABase"/>
 *     &lt;enumeration value="BBase"/>
 *     &lt;enumeration value="KBase"/>
 *     &lt;enumeration value="PBase"/>
 *     &lt;enumeration value="IECBottomConnected"/>
 *     &lt;enumeration value="Switchboard"/>
 *     &lt;enumeration value="Rackmount"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "baseType")
@XmlEnum
public enum BaseType {

    @XmlEnumValue("BaseType1")
    BASE_TYPE_1("BaseType1"),
    @XmlEnumValue("SBase")
    S_BASE("SBase"),
    @XmlEnumValue("ABase")
    A_BASE("ABase"),
    @XmlEnumValue("BBase")
    B_BASE("BBase"),
    @XmlEnumValue("KBase")
    K_BASE("KBase"),
    @XmlEnumValue("PBase")
    P_BASE("PBase"),
    @XmlEnumValue("IECBottomConnected")
    IEC_BOTTOM_CONNECTED("IECBottomConnected"),
    @XmlEnumValue("Switchboard")
    SWITCHBOARD("Switchboard"),
    @XmlEnumValue("Rackmount")
    RACKMOUNT("Rackmount"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaseType fromValue(String v) {
        for (BaseType c: BaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
