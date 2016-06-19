
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspSwitchingBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspSwitchingBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="isGanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partner" type="{http://www.multispeak.org/Version_3.0}objectRef" minOccurs="0"/>
 *         &lt;element name="ldPoint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspSwitchingBank", propOrder = {
    "isGanged",
    "partner",
    "ldPoint"
})
@XmlSeeAlso({
    OvercurrentDeviceBank.class,
    SwitchDeviceBank.class
})
public abstract class MspSwitchingBank
    extends MspBankObject
{

    protected Boolean isGanged;
    protected ObjectRef partner;
    protected Long ldPoint;

    /**
     * Gets the value of the isGanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGanged() {
        return isGanged;
    }

    /**
     * Sets the value of the isGanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGanged(Boolean value) {
        this.isGanged = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPartner(ObjectRef value) {
        this.partner = value;
    }

    /**
     * Gets the value of the ldPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLdPoint() {
        return ldPoint;
    }

    /**
     * Sets the value of the ldPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLdPoint(Long value) {
        this.ldPoint = value;
    }

}
