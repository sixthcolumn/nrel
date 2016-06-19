
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchingStepOperationKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="switchingStepOperationKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="CheckOpen"/>
 *     &lt;enumeration value="CheckClosed"/>
 *     &lt;enumeration value="InstallGround"/>
 *     &lt;enumeration value="RemoveGround"/>
 *     &lt;enumeration value="SetTags"/>
 *     &lt;enumeration value="RemoveTag"/>
 *     &lt;enumeration value="TagClosed"/>
 *     &lt;enumeration value="TagOpen"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "switchingStepOperationKind")
@XmlEnum
public enum SwitchingStepOperationKind {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("CheckOpen")
    CHECK_OPEN("CheckOpen"),
    @XmlEnumValue("CheckClosed")
    CHECK_CLOSED("CheckClosed"),
    @XmlEnumValue("InstallGround")
    INSTALL_GROUND("InstallGround"),
    @XmlEnumValue("RemoveGround")
    REMOVE_GROUND("RemoveGround"),
    @XmlEnumValue("SetTags")
    SET_TAGS("SetTags"),
    @XmlEnumValue("RemoveTag")
    REMOVE_TAG("RemoveTag"),
    @XmlEnumValue("TagClosed")
    TAG_CLOSED("TagClosed"),
    @XmlEnumValue("TagOpen")
    TAG_OPEN("TagOpen"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SwitchingStepOperationKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchingStepOperationKind fromValue(String v) {
        for (SwitchingStepOperationKind c: SwitchingStepOperationKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
