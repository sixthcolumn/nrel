
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for remainingBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remainingBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="priorityBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="sharedArrears" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="balance" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="finalRead" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remainingBalance", propOrder = {
    "priorityBalance",
    "sharedArrears",
    "balance",
    "finalRead"
})
public class RemainingBalance
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Money priorityBalance;
    @XmlElement(required = true)
    protected Money sharedArrears;
    @XmlElement(required = true)
    protected Money balance;
    protected MeterReading finalRead;

    /**
     * Gets the value of the priorityBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriorityBalance() {
        return priorityBalance;
    }

    /**
     * Sets the value of the priorityBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriorityBalance(Money value) {
        this.priorityBalance = value;
    }

    /**
     * Gets the value of the sharedArrears property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSharedArrears() {
        return sharedArrears;
    }

    /**
     * Sets the value of the sharedArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSharedArrears(Money value) {
        this.sharedArrears = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBalance(Money value) {
        this.balance = value;
    }

    /**
     * Gets the value of the finalRead property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getFinalRead() {
        return finalRead;
    }

    /**
     * Sets the value of the finalRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setFinalRead(MeterReading value) {
        this.finalRead = value;
    }

}
