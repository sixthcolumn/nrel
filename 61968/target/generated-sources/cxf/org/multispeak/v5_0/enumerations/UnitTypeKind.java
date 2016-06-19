
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Anchor"/>
 *     &lt;enumeration value="OhPrimaryConductor"/>
 *     &lt;enumeration value="UgPrimaryConductor"/>
 *     &lt;enumeration value="OhSecondaryConductor"/>
 *     &lt;enumeration value="UgSecondaryConductor"/>
 *     &lt;enumeration value="Conductor"/>
 *     &lt;enumeration value="Guy"/>
 *     &lt;enumeration value="OhAssembly"/>
 *     &lt;enumeration value="OhPrimary"/>
 *     &lt;enumeration value="OhSecondary"/>
 *     &lt;enumeration value="OhTransformer"/>
 *     &lt;enumeration value="Overhead"/>
 *     &lt;enumeration value="Pole"/>
 *     &lt;enumeration value="SubUnit"/>
 *     &lt;enumeration value="UgAssembly"/>
 *     &lt;enumeration value="UgPrimary"/>
 *     &lt;enumeration value="UgSecondary"/>
 *     &lt;enumeration value="UgTransformer"/>
 *     &lt;enumeration value="Underground"/>
 *     &lt;enumeration value="Conduit"/>
 *     &lt;enumeration value="Duct"/>
 *     &lt;enumeration value="LaborOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitTypeKind")
@XmlEnum
public enum UnitTypeKind {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Anchor")
    ANCHOR("Anchor"),
    @XmlEnumValue("OhPrimaryConductor")
    OH_PRIMARY_CONDUCTOR("OhPrimaryConductor"),
    @XmlEnumValue("UgPrimaryConductor")
    UG_PRIMARY_CONDUCTOR("UgPrimaryConductor"),
    @XmlEnumValue("OhSecondaryConductor")
    OH_SECONDARY_CONDUCTOR("OhSecondaryConductor"),
    @XmlEnumValue("UgSecondaryConductor")
    UG_SECONDARY_CONDUCTOR("UgSecondaryConductor"),
    @XmlEnumValue("Conductor")
    CONDUCTOR("Conductor"),
    @XmlEnumValue("Guy")
    GUY("Guy"),
    @XmlEnumValue("OhAssembly")
    OH_ASSEMBLY("OhAssembly"),
    @XmlEnumValue("OhPrimary")
    OH_PRIMARY("OhPrimary"),
    @XmlEnumValue("OhSecondary")
    OH_SECONDARY("OhSecondary"),
    @XmlEnumValue("OhTransformer")
    OH_TRANSFORMER("OhTransformer"),
    @XmlEnumValue("Overhead")
    OVERHEAD("Overhead"),
    @XmlEnumValue("Pole")
    POLE("Pole"),
    @XmlEnumValue("SubUnit")
    SUB_UNIT("SubUnit"),
    @XmlEnumValue("UgAssembly")
    UG_ASSEMBLY("UgAssembly"),
    @XmlEnumValue("UgPrimary")
    UG_PRIMARY("UgPrimary"),
    @XmlEnumValue("UgSecondary")
    UG_SECONDARY("UgSecondary"),
    @XmlEnumValue("UgTransformer")
    UG_TRANSFORMER("UgTransformer"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("Conduit")
    CONDUIT("Conduit"),
    @XmlEnumValue("Duct")
    DUCT("Duct"),
    @XmlEnumValue("LaborOnly")
    LABOR_ONLY("LaborOnly");
    private final String value;

    UnitTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitTypeKind fromValue(String v) {
        for (UnitTypeKind c: UnitTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
