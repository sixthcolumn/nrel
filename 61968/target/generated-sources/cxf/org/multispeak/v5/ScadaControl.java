
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ControlCode;
import org.multispeak.v5_0.enumerations.ControlStatus;
import org.multispeak.v5_0.enumerations.RelayType;
import org.multispeak.v5_0.enumerations.ScadaFunction;


/**
 * <p>Java class for scadaControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="scadaPointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="controlKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="function" type="{http://www.multispeak.org/V5.0/enumerations}scadaFunction"/>
 *         &lt;element name="relayType" type="{http://www.multispeak.org/V5.0/enumerations}relayType"/>
 *         &lt;element name="controlCode" type="{http://www.multispeak.org/V5.0/enumerations}controlCode" minOccurs="0"/>
 *         &lt;element name="onTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="offTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="controlStatus" type="{http://www.multispeak.org/V5.0/enumerations}controlStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scadaControl", propOrder = {
    "scadaPointID",
    "controlKey",
    "function",
    "relayType",
    "controlCode",
    "onTime",
    "offTime",
    "count",
    "controlStatus"
})
public class ScadaControl
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectID scadaPointID;
    @XmlElement(required = true)
    protected String controlKey;
    @XmlElement(required = true)
    protected ScadaFunction function;
    @XmlElement(required = true)
    protected RelayType relayType;
    protected ControlCode controlCode;
    protected Float onTime;
    protected Float offTime;
    protected BigInteger count;
    protected ControlStatus controlStatus;

    /**
     * Gets the value of the scadaPointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getScadaPointID() {
        return scadaPointID;
    }

    /**
     * Sets the value of the scadaPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setScadaPointID(ObjectID value) {
        this.scadaPointID = value;
    }

    /**
     * Gets the value of the controlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlKey() {
        return controlKey;
    }

    /**
     * Sets the value of the controlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlKey(String value) {
        this.controlKey = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link ScadaFunction }
     *     
     */
    public ScadaFunction getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadaFunction }
     *     
     */
    public void setFunction(ScadaFunction value) {
        this.function = value;
    }

    /**
     * Gets the value of the relayType property.
     * 
     * @return
     *     possible object is
     *     {@link RelayType }
     *     
     */
    public RelayType getRelayType() {
        return relayType;
    }

    /**
     * Sets the value of the relayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayType }
     *     
     */
    public void setRelayType(RelayType value) {
        this.relayType = value;
    }

    /**
     * Gets the value of the controlCode property.
     * 
     * @return
     *     possible object is
     *     {@link ControlCode }
     *     
     */
    public ControlCode getControlCode() {
        return controlCode;
    }

    /**
     * Sets the value of the controlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlCode }
     *     
     */
    public void setControlCode(ControlCode value) {
        this.controlCode = value;
    }

    /**
     * Gets the value of the onTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOnTime() {
        return onTime;
    }

    /**
     * Sets the value of the onTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOnTime(Float value) {
        this.onTime = value;
    }

    /**
     * Gets the value of the offTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOffTime() {
        return offTime;
    }

    /**
     * Sets the value of the offTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOffTime(Float value) {
        this.offTime = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the controlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ControlStatus }
     *     
     */
    public ControlStatus getControlStatus() {
        return controlStatus;
    }

    /**
     * Sets the value of the controlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlStatus }
     *     
     */
    public void setControlStatus(ControlStatus value) {
        this.controlStatus = value;
    }

}
