
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialClassKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="materialClassKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Expensed"/>
 *     &lt;enumeration value="GeneralInventory"/>
 *     &lt;enumeration value="SpecialEquipment"/>
 *     &lt;enumeration value="ForRequisition"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "materialClassKind")
@XmlEnum
public enum MaterialClassKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Expensed")
    EXPENSED("Expensed"),
    @XmlEnumValue("GeneralInventory")
    GENERAL_INVENTORY("GeneralInventory"),
    @XmlEnumValue("SpecialEquipment")
    SPECIAL_EQUIPMENT("SpecialEquipment"),
    @XmlEnumValue("ForRequisition")
    FOR_REQUISITION("ForRequisition"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MaterialClassKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialClassKind fromValue(String v) {
        for (MaterialClassKind c: MaterialClassKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
