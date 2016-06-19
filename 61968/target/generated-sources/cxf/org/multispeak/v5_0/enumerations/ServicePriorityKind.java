
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePriorityKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="servicePriorityKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OutagePriority"/>
 *     &lt;enumeration value="PriorityCustomer"/>
 *     &lt;enumeration value="EmergencyServices"/>
 *     &lt;enumeration value="MedicalNecessity"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "servicePriorityKind")
@XmlEnum
public enum ServicePriorityKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OutagePriority")
    OUTAGE_PRIORITY("OutagePriority"),
    @XmlEnumValue("PriorityCustomer")
    PRIORITY_CUSTOMER("PriorityCustomer"),
    @XmlEnumValue("EmergencyServices")
    EMERGENCY_SERVICES("EmergencyServices"),
    @XmlEnumValue("MedicalNecessity")
    MEDICAL_NECESSITY("MedicalNecessity"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ServicePriorityKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServicePriorityKind fromValue(String v) {
        for (ServicePriorityKind c: ServicePriorityKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
