
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for material.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="material">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="AAAC"/>
 *     &lt;enumeration value="AAC"/>
 *     &lt;enumeration value="ACAR"/>
 *     &lt;enumeration value="ACSR"/>
 *     &lt;enumeration value="ACSRT2"/>
 *     &lt;enumeration value="AlumoWeld"/>
 *     &lt;enumeration value="Anaconda"/>
 *     &lt;enumeration value="CopperWeld"/>
 *     &lt;enumeration value="CopperWeldCopper"/>
 *     &lt;enumeration value="ExpandedACSR"/>
 *     &lt;enumeration value="GalvanizedSteel"/>
 *     &lt;enumeration value="HardDrawnAluminum"/>
 *     &lt;enumeration value="HardDrawnCopper"/>
 *     &lt;enumeration value="HHHollowCopper"/>
 *     &lt;enumeration value="HighStrengthSteel"/>
 *     &lt;enumeration value="StainlessSteelStrand"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "material")
@XmlEnum
public enum Material {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    AAAC("AAAC"),
    AAC("AAC"),
    ACAR("ACAR"),
    ACSR("ACSR"),
    @XmlEnumValue("ACSRT2")
    ACSRT_2("ACSRT2"),
    @XmlEnumValue("AlumoWeld")
    ALUMO_WELD("AlumoWeld"),
    @XmlEnumValue("Anaconda")
    ANACONDA("Anaconda"),
    @XmlEnumValue("CopperWeld")
    COPPER_WELD("CopperWeld"),
    @XmlEnumValue("CopperWeldCopper")
    COPPER_WELD_COPPER("CopperWeldCopper"),
    @XmlEnumValue("ExpandedACSR")
    EXPANDED_ACSR("ExpandedACSR"),
    @XmlEnumValue("GalvanizedSteel")
    GALVANIZED_STEEL("GalvanizedSteel"),
    @XmlEnumValue("HardDrawnAluminum")
    HARD_DRAWN_ALUMINUM("HardDrawnAluminum"),
    @XmlEnumValue("HardDrawnCopper")
    HARD_DRAWN_COPPER("HardDrawnCopper"),
    @XmlEnumValue("HHHollowCopper")
    HH_HOLLOW_COPPER("HHHollowCopper"),
    @XmlEnumValue("HighStrengthSteel")
    HIGH_STRENGTH_STEEL("HighStrengthSteel"),
    @XmlEnumValue("StainlessSteelStrand")
    STAINLESS_STEEL_STRAND("StainlessSteelStrand"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Material(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Material fromValue(String v) {
        for (Material c: Material.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
