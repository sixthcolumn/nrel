
package org.multispeak.version_3;

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
 *     &lt;enumeration value="Base Type 1"/>
 *     &lt;enumeration value="S-base"/>
 *     &lt;enumeration value="A-Base"/>
 *     &lt;enumeration value="B-Base"/>
 *     &lt;enumeration value="K-Base"/>
 *     &lt;enumeration value="P-Base"/>
 *     &lt;enumeration value="IECBottomConnected"/>
 *     &lt;enumeration value="switchboard"/>
 *     &lt;enumeration value="rackmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "baseType")
@XmlEnum
public enum BaseType {

    @XmlEnumValue("Base Type 1")
    BASE_TYPE_1("Base Type 1"),
    @XmlEnumValue("S-base")
    S_BASE("S-base"),
    @XmlEnumValue("A-Base")
    A_BASE("A-Base"),
    @XmlEnumValue("B-Base")
    B_BASE("B-Base"),
    @XmlEnumValue("K-Base")
    K_BASE("K-Base"),
    @XmlEnumValue("P-Base")
    P_BASE("P-Base"),
    @XmlEnumValue("IECBottomConnected")
    IEC_BOTTOM_CONNECTED("IECBottomConnected"),
    @XmlEnumValue("switchboard")
    SWITCHBOARD("switchboard"),
    @XmlEnumValue("rackmount")
    RACKMOUNT("rackmount");
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
