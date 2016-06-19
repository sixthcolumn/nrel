
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equipmentTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="equipmentTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Conductor"/>
 *     &lt;enumeration value="ConcentricNeutralCable"/>
 *     &lt;enumeration value="TapeShieldCable"/>
 *     &lt;enumeration value="LineConstruction"/>
 *     &lt;enumeration value="SecondaryConductor"/>
 *     &lt;enumeration value="ServiceDrop"/>
 *     &lt;enumeration value="MaterialAttributes"/>
 *     &lt;enumeration value="LineEnvironmentalAttributes"/>
 *     &lt;enumeration value="ROWAttributes"/>
 *     &lt;enumeration value="Material"/>
 *     &lt;enumeration value="Transformer"/>
 *     &lt;enumeration value="Regulator"/>
 *     &lt;enumeration value="Breaker"/>
 *     &lt;enumeration value="Fuse"/>
 *     &lt;enumeration value="Recloser"/>
 *     &lt;enumeration value="Sectionalizer"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="LoadMix"/>
 *     &lt;enumeration value="ZsmImpedance"/>
 *     &lt;enumeration value="InductionMachine"/>
 *     &lt;enumeration value="SynchronousMachine"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "equipmentTypeKind")
@XmlEnum
public enum EquipmentTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Conductor")
    CONDUCTOR("Conductor"),
    @XmlEnumValue("ConcentricNeutralCable")
    CONCENTRIC_NEUTRAL_CABLE("ConcentricNeutralCable"),
    @XmlEnumValue("TapeShieldCable")
    TAPE_SHIELD_CABLE("TapeShieldCable"),
    @XmlEnumValue("LineConstruction")
    LINE_CONSTRUCTION("LineConstruction"),
    @XmlEnumValue("SecondaryConductor")
    SECONDARY_CONDUCTOR("SecondaryConductor"),
    @XmlEnumValue("ServiceDrop")
    SERVICE_DROP("ServiceDrop"),
    @XmlEnumValue("MaterialAttributes")
    MATERIAL_ATTRIBUTES("MaterialAttributes"),
    @XmlEnumValue("LineEnvironmentalAttributes")
    LINE_ENVIRONMENTAL_ATTRIBUTES("LineEnvironmentalAttributes"),
    @XmlEnumValue("ROWAttributes")
    ROW_ATTRIBUTES("ROWAttributes"),
    @XmlEnumValue("Material")
    MATERIAL("Material"),
    @XmlEnumValue("Transformer")
    TRANSFORMER("Transformer"),
    @XmlEnumValue("Regulator")
    REGULATOR("Regulator"),
    @XmlEnumValue("Breaker")
    BREAKER("Breaker"),
    @XmlEnumValue("Fuse")
    FUSE("Fuse"),
    @XmlEnumValue("Recloser")
    RECLOSER("Recloser"),
    @XmlEnumValue("Sectionalizer")
    SECTIONALIZER("Sectionalizer"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("LoadMix")
    LOAD_MIX("LoadMix"),
    @XmlEnumValue("ZsmImpedance")
    ZSM_IMPEDANCE("ZsmImpedance"),
    @XmlEnumValue("InductionMachine")
    INDUCTION_MACHINE("InductionMachine"),
    @XmlEnumValue("SynchronousMachine")
    SYNCHRONOUS_MACHINE("SynchronousMachine"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EquipmentTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentTypeKind fromValue(String v) {
        for (EquipmentTypeKind c: EquipmentTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
