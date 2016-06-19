
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depositStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="depositStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="PartlyPaid"/>
 *     &lt;enumeration value="DepositInstallation"/>
 *     &lt;enumeration value="Unpaid"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "depositStatusKind")
@XmlEnum
public enum DepositStatusKind {


    /**
     * Paid implies that the utility has previously collected this deposit from the customer.
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("PartlyPaid")
    PARTLY_PAID("PartlyPaid"),
    @XmlEnumValue("DepositInstallation")
    DEPOSIT_INSTALLATION("DepositInstallation"),

    /**
     * Unpaid implies that the deposit is due from the customer.
     * 
     */
    @XmlEnumValue("Unpaid")
    UNPAID("Unpaid"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DepositStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositStatusKind fromValue(String v) {
        for (DepositStatusKind c: DepositStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
