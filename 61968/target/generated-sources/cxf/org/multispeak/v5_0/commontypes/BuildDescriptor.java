
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildDescriptor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildDescriptor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="Release"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildDescriptor")
@XmlEnum
public enum BuildDescriptor {


    /**
     * Branch - A Branch is a draft build that is issued to investigate a concept.  The concept may or may not result in the issuance of a PR.
     * 
     */
    @XmlEnumValue("Branch")
    BRANCH("Branch"),

    /**
     * Pre-Release.  A Pre-Release is a draft build that has not yet been adopted as a Release Candidate.
     * 
     */
    PR("PR"),

    /**
     * Release Candidate - A Release Candidate is a draft build that is candidate for balloting to become a Release for Development or Release.
     * 
     */
    RC("RC"),

    /**
     * Release for Development - A Release for Development is a build that has been balloted by the MultiSpeak Technical Committee to be ready for internal development by MultiSpeak members, but has not yet been adopted as a Release.  
     * 
     */
    RD("RD"),

    /**
     * Release - A Release is a build that has been balloted by the MultiSpeak Technical Committee as being ready for development into commercial products.
     * 
     */
    @XmlEnumValue("Release")
    RELEASE("Release");
    private final String value;

    BuildDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuildDescriptor fromValue(String v) {
        for (BuildDescriptor c: BuildDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
