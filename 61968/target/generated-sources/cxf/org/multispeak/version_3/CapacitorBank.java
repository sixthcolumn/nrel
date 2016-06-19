
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitorBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="connectionCd" type="{http://www.multispeak.org/Version_3.0}connectionCode" minOccurs="0"/>
 *         &lt;element name="swType" type="{http://www.multispeak.org/Version_3.0}swType" minOccurs="0"/>
 *         &lt;element name="swStatus" type="{http://www.multispeak.org/Version_3.0}swStatus" minOccurs="0"/>
 *         &lt;element name="swOn" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="swOff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cntrCkt" type="{http://www.multispeak.org/Version_3.0}objectRef" minOccurs="0"/>
 *         &lt;element name="bankKvar" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="volts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="capacitorList" type="{http://www.multispeak.org/Version_3.0}ArrayOfCapacitor" minOccurs="0"/>
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
@XmlType(name = "capacitorBank", propOrder = {
    "connectionCd",
    "swType",
    "swStatus",
    "swOn",
    "swOff",
    "cntrCkt",
    "bankKvar",
    "volts",
    "capacitorList"
})
public class CapacitorBank
    extends MspBankObject
{

    protected ConnectionCode connectionCd;
    protected SwType swType;
    protected SwStatus swStatus;
    protected Float swOn;
    protected Float swOff;
    protected ObjectRef cntrCkt;
    protected Float bankKvar;
    protected Float volts;
    protected ArrayOfCapacitor capacitorList;

    /**
     * Gets the value of the connectionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCode }
     *     
     */
    public ConnectionCode getConnectionCd() {
        return connectionCd;
    }

    /**
     * Sets the value of the connectionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCode }
     *     
     */
    public void setConnectionCd(ConnectionCode value) {
        this.connectionCd = value;
    }

    /**
     * Gets the value of the swType property.
     * 
     * @return
     *     possible object is
     *     {@link SwType }
     *     
     */
    public SwType getSwType() {
        return swType;
    }

    /**
     * Sets the value of the swType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwType }
     *     
     */
    public void setSwType(SwType value) {
        this.swType = value;
    }

    /**
     * Gets the value of the swStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwStatus }
     *     
     */
    public SwStatus getSwStatus() {
        return swStatus;
    }

    /**
     * Sets the value of the swStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwStatus }
     *     
     */
    public void setSwStatus(SwStatus value) {
        this.swStatus = value;
    }

    /**
     * Gets the value of the swOn property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSwOn() {
        return swOn;
    }

    /**
     * Sets the value of the swOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSwOn(Float value) {
        this.swOn = value;
    }

    /**
     * Gets the value of the swOff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSwOff() {
        return swOff;
    }

    /**
     * Sets the value of the swOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSwOff(Float value) {
        this.swOff = value;
    }

    /**
     * Gets the value of the cntrCkt property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getCntrCkt() {
        return cntrCkt;
    }

    /**
     * Sets the value of the cntrCkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setCntrCkt(ObjectRef value) {
        this.cntrCkt = value;
    }

    /**
     * Gets the value of the bankKvar property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBankKvar() {
        return bankKvar;
    }

    /**
     * Sets the value of the bankKvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBankKvar(Float value) {
        this.bankKvar = value;
    }

    /**
     * Gets the value of the volts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolts() {
        return volts;
    }

    /**
     * Sets the value of the volts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolts(Float value) {
        this.volts = value;
    }

    /**
     * Gets the value of the capacitorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCapacitor }
     *     
     */
    public ArrayOfCapacitor getCapacitorList() {
        return capacitorList;
    }

    /**
     * Sets the value of the capacitorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCapacitor }
     *     
     */
    public void setCapacitorList(ArrayOfCapacitor value) {
        this.capacitorList = value;
    }

}
