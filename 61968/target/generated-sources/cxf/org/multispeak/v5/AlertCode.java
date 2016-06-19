
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * These are vehicle device code types (aka modem code types) which are typically associated with events which require the immediate or near-immediate attention of an end user of the AVL system of record. This type of code is often, but not always, associated with a configurable threshold value relating to a particular vehicle condition. Examples of Alert Codes with no threshold configurable include “Vehicle Off-Route” and “Man Down” alert originating with a personal emergency pendant but delivered via the vehicle modem. Examples of alerts with a configured threshold are “Vehicle Speeding” and “Water Temperature”. It is the responsibility of the sending system to determine which type of codes received from the modem constitute “Alert” type codes.
 * 
 * <p>Java class for alertCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alertCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspLTDeviceCode">
 *       &lt;sequence>
 *         &lt;element name="alertType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionValue" type="{http://www.multispeak.org/V5.0}conditionValue" minOccurs="0"/>
 *         &lt;element name="currentValue" type="{http://www.multispeak.org/V5.0}currentValue" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertCode", propOrder = {
    "alertType",
    "conditionValue",
    "currentValue",
    "operator",
    "operand"
})
public class AlertCode
    extends MspLTDeviceCode
{

    protected String alertType;
    protected ConditionValue conditionValue;
    protected CurrentValue currentValue;
    protected String operator;
    protected String operand;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the conditionValue property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValue }
     *     
     */
    public ConditionValue getConditionValue() {
        return conditionValue;
    }

    /**
     * Sets the value of the conditionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValue }
     *     
     */
    public void setConditionValue(ConditionValue value) {
        this.conditionValue = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentValue }
     *     
     */
    public CurrentValue getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentValue }
     *     
     */
    public void setCurrentValue(CurrentValue value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand(String value) {
        this.operand = value;
    }

}
