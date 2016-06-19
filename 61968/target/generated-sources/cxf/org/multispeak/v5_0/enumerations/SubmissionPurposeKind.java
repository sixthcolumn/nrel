
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submissionPurposeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="submissionPurposeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Requisition"/>
 *     &lt;enumeration value="AsBuilt"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "submissionPurposeKind")
@XmlEnum
public enum SubmissionPurposeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Proposed")
    PROPOSED("Proposed"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Requisition")
    REQUISITION("Requisition"),
    @XmlEnumValue("AsBuilt")
    AS_BUILT("AsBuilt"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SubmissionPurposeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubmissionPurposeKind fromValue(String v) {
        for (SubmissionPurposeKind c: SubmissionPurposeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
