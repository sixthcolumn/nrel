
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulatorBankConnectionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regulatorBankConnectionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Uknown"/>
 *     &lt;enumeration value="Wye3Ph"/>
 *     &lt;enumeration value="Delta3Ph"/>
 *     &lt;enumeration value="LineNeutral"/>
 *     &lt;enumeration value="OpenDelta"/>
 *     &lt;enumeration value="ClosedDelta"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regulatorBankConnectionKind")
@XmlEnum
public enum RegulatorBankConnectionKind {

    @XmlEnumValue("Uknown")
    UKNOWN("Uknown"),
    @XmlEnumValue("Wye3Ph")
    WYE_3_PH("Wye3Ph"),
    @XmlEnumValue("Delta3Ph")
    DELTA_3_PH("Delta3Ph"),
    @XmlEnumValue("LineNeutral")
    LINE_NEUTRAL("LineNeutral"),
    @XmlEnumValue("OpenDelta")
    OPEN_DELTA("OpenDelta"),
    @XmlEnumValue("ClosedDelta")
    CLOSED_DELTA("ClosedDelta"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RegulatorBankConnectionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulatorBankConnectionKind fromValue(String v) {
        for (RegulatorBankConnectionKind c: RegulatorBankConnectionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
