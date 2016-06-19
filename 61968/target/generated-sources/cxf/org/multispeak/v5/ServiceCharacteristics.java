
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for serviceCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceCharacteristics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceVoltage" type="{http://www.multispeak.org/V5.0}serviceVoltage" minOccurs="0"/>
 *         &lt;element name="serviceCurrent" type="{http://www.multispeak.org/V5.0}serviceCurrent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceCharacteristics", propOrder = {
    "phases",
    "serviceVoltage",
    "serviceCurrent"
})
public class ServiceCharacteristics
    extends MspExtensible
{

    protected BigInteger phases;
    protected ServiceVoltage serviceVoltage;
    protected ServiceCurrent serviceCurrent;

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhases(BigInteger value) {
        this.phases = value;
    }

    /**
     * Gets the value of the serviceVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceVoltage }
     *     
     */
    public ServiceVoltage getServiceVoltage() {
        return serviceVoltage;
    }

    /**
     * Sets the value of the serviceVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceVoltage }
     *     
     */
    public void setServiceVoltage(ServiceVoltage value) {
        this.serviceVoltage = value;
    }

    /**
     * Gets the value of the serviceCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCurrent }
     *     
     */
    public ServiceCurrent getServiceCurrent() {
        return serviceCurrent;
    }

    /**
     * Sets the value of the serviceCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCurrent }
     *     
     */
    public void setServiceCurrent(ServiceCurrent value) {
        this.serviceCurrent = value;
    }

}
