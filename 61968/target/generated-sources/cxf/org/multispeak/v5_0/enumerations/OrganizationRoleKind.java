
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationRoleKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationRoleKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="RetailPowerSupplier"/>
 *     &lt;enumeration value="BillingServiceSupplier"/>
 *     &lt;enumeration value="BulkPowerSupplier"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="MarketAggregator"/>
 *     &lt;enumeration value="MeteringServiceSupplier"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationRoleKind")
@XmlEnum
public enum OrganizationRoleKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("RetailPowerSupplier")
    RETAIL_POWER_SUPPLIER("RetailPowerSupplier"),
    @XmlEnumValue("BillingServiceSupplier")
    BILLING_SERVICE_SUPPLIER("BillingServiceSupplier"),
    @XmlEnumValue("BulkPowerSupplier")
    BULK_POWER_SUPPLIER("BulkPowerSupplier"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("MarketAggregator")
    MARKET_AGGREGATOR("MarketAggregator"),
    @XmlEnumValue("MeteringServiceSupplier")
    METERING_SERVICE_SUPPLIER("MeteringServiceSupplier"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OrganizationRoleKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationRoleKind fromValue(String v) {
        for (OrganizationRoleKind c: OrganizationRoleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
