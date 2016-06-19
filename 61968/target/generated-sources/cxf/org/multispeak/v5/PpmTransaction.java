
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;


/**
 * <p>Java class for ppmTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="priorityBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="sharedArrears" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="amount" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppmTransaction", propOrder = {
    "priorityBalance",
    "sharedArrears",
    "amount",
    "description"
})
public class PpmTransaction
    extends MspObject
{

    @XmlElement(required = true)
    protected Money priorityBalance;
    @XmlElement(required = true)
    protected Money sharedArrears;
    @XmlElement(required = true)
    protected Money amount;
    protected String description;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
