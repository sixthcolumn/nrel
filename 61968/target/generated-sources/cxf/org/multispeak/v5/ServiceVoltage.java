
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.NominalServiceVoltage;
import org.multispeak.v5_0.enumerations.ServiceLimitType;


/**
 * Voltage characteristics for this tariff to be effective.
 * 
 * <p>Java class for serviceVoltage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceVoltage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nominalServiceVoltage" type="{http://www.multispeak.org/V5.0/enumerations}nominalServiceVoltage"/>
 *         &lt;element name="serviceLimitType" type="{http://www.multispeak.org/V5.0/enumerations}serviceLimitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceVoltage", propOrder = {
    "nominalServiceVoltage",
    "serviceLimitType"
})
public class ServiceVoltage {

    @XmlElement(required = true)
    protected NominalServiceVoltage nominalServiceVoltage;
    @XmlElement(required = true)
    protected ServiceLimitType serviceLimitType;

    /**
     * Gets the value of the nominalServiceVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link NominalServiceVoltage }
     *     
     */
    public NominalServiceVoltage getNominalServiceVoltage() {
        return nominalServiceVoltage;
    }

    /**
     * Sets the value of the nominalServiceVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominalServiceVoltage }
     *     
     */
    public void setNominalServiceVoltage(NominalServiceVoltage value) {
        this.nominalServiceVoltage = value;
    }

    /**
     * Gets the value of the serviceLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLimitType }
     *     
     */
    public ServiceLimitType getServiceLimitType() {
        return serviceLimitType;
    }

    /**
     * Sets the value of the serviceLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLimitType }
     *     
     */
    public void setServiceLimitType(ServiceLimitType value) {
        this.serviceLimitType = value;
    }

}
