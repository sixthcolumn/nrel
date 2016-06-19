
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchingStepStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="switchingStepStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="Instructed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Aborted"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Skipped"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "switchingStepStatusKind")
@XmlEnum
public enum SwitchingStepStatusKind {

    @XmlEnumValue("Proposed")
    PROPOSED("Proposed"),
    @XmlEnumValue("Instructed")
    INSTRUCTED("Instructed"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Skipped")
    SKIPPED("Skipped"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SwitchingStepStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchingStepStatusKind fromValue(String v) {
        for (SwitchingStepStatusKind c: SwitchingStepStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
