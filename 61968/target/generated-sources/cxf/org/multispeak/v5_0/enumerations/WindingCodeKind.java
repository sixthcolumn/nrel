
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windingCodeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="windingCodeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="DYOne"/>
 *     &lt;enumeration value="YY"/>
 *     &lt;enumeration value="DY"/>
 *     &lt;enumeration value="GroundedYD"/>
 *     &lt;enumeration value="UngroundedYD"/>
 *     &lt;enumeration value="OpenYD"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="YYGroundedImpedance"/>
 *     &lt;enumeration value="YY3PhCoreType"/>
 *     &lt;enumeration value="DDOne"/>
 *     &lt;enumeration value="DDOpen"/>
 *     &lt;enumeration value="YYDGrounded"/>
 *     &lt;enumeration value="YDOne"/>
 *     &lt;enumeration value="DYOpen"/>
 *     &lt;enumeration value="CenterTapSecondary"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "windingCodeKind")
@XmlEnum
public enum WindingCodeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DYOne")
    DY_ONE("DYOne"),
    YY("YY"),
    DY("DY"),
    @XmlEnumValue("GroundedYD")
    GROUNDED_YD("GroundedYD"),
    @XmlEnumValue("UngroundedYD")
    UNGROUNDED_YD("UngroundedYD"),
    @XmlEnumValue("OpenYD")
    OPEN_YD("OpenYD"),
    DD("DD"),
    @XmlEnumValue("YYGroundedImpedance")
    YY_GROUNDED_IMPEDANCE("YYGroundedImpedance"),
    @XmlEnumValue("YY3PhCoreType")
    YY_3_PH_CORE_TYPE("YY3PhCoreType"),
    @XmlEnumValue("DDOne")
    DD_ONE("DDOne"),
    @XmlEnumValue("DDOpen")
    DD_OPEN("DDOpen"),
    @XmlEnumValue("YYDGrounded")
    YYD_GROUNDED("YYDGrounded"),
    @XmlEnumValue("YDOne")
    YD_ONE("YDOne"),
    @XmlEnumValue("DYOpen")
    DY_OPEN("DYOpen"),
    @XmlEnumValue("CenterTapSecondary")
    CENTER_TAP_SECONDARY("CenterTapSecondary"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    WindingCodeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WindingCodeKind fromValue(String v) {
        for (WindingCodeKind c: WindingCodeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
