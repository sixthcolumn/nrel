
package org.multispeak.v5_0.commontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for allocatedLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allocatedLoad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="realPower" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="reactivePower" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="numberOfCustomers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allocatedLoad", propOrder = {
    "phaseCode",
    "realPower",
    "reactivePower",
    "numberOfCustomers"
})
public class AllocatedLoad
    extends MspExtensible
{

    protected PhaseCode phaseCode;
    protected RealPower realPower;
    protected ReactivePower reactivePower;
    protected BigInteger numberOfCustomers;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the realPower property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getRealPower() {
        return realPower;
    }

    /**
     * Sets the value of the realPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setRealPower(RealPower value) {
        this.realPower = value;
    }

    /**
     * Gets the value of the reactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePower() {
        return reactivePower;
    }

    /**
     * Sets the value of the reactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePower(ReactivePower value) {
        this.reactivePower = value;
    }

    /**
     * Gets the value of the numberOfCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * Sets the value of the numberOfCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCustomers(BigInteger value) {
        this.numberOfCustomers = value;
    }

}
