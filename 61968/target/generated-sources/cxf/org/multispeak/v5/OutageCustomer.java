
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * <p>Java class for outageCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef"/>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="callBackInformation" type="{http://www.multispeak.org/V5.0}callBackInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageCustomer", propOrder = {
    "outageRef",
    "customerID",
    "serviceLocationID",
    "servicePointID",
    "meterID",
    "callBackInformation"
})
public class OutageCustomer
    extends MspReferable
{

    @XmlElement(required = true)
    protected OutageRef outageRef;
    protected ObjectID customerID;
    protected ObjectID serviceLocationID;
    protected ServicePointID servicePointID;
    protected MeterID meterID;
    protected CallBackInformation callBackInformation;

    /**
     * Gets the value of the outageRef property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRef }
     *     
     */
    public OutageRef getOutageRef() {
        return outageRef;
    }

    /**
     * Sets the value of the outageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRef }
     *     
     */
    public void setOutageRef(OutageRef value) {
        this.outageRef = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerID(ObjectID value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the callBackInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CallBackInformation }
     *     
     */
    public CallBackInformation getCallBackInformation() {
        return callBackInformation;
    }

    /**
     * Sets the value of the callBackInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBackInformation }
     *     
     */
    public void setCallBackInformation(CallBackInformation value) {
        this.callBackInformation = value;
    }

}
