
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.DepositStatus;


/**
 * <p>Java class for accountDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="depositType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depositAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="depositStatus" type="{http://www.multispeak.org/V5.0/enumerations}depositStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDeposit", propOrder = {
    "depositType",
    "depositAmount",
    "depositStatus"
})
public class AccountDeposit
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String depositType;
    @XmlElement(required = true)
    protected Money depositAmount;
    @XmlElement(required = true)
    protected DepositStatus depositStatus;

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDepositAmount(Money value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepositStatus }
     *     
     */
    public DepositStatus getDepositStatus() {
        return depositStatus;
    }

    /**
     * Sets the value of the depositStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositStatus }
     *     
     */
    public void setDepositStatus(DepositStatus value) {
        this.depositStatus = value;
    }

}
