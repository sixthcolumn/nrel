
package org.multispeak.v5_0.commontypes;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.enumerations.ServiceKind;


/**
 * This is the identifier for a meter.  Note that the meter might be of different service types (for example: electric, gas, propane, water, etc.). Since objectIDs are guaranteed to be unique only over the domain of one type of noun (class or object), it is necessary to specify both a serviceType and an objectID in order to ensure a unique instance of a meter.  The value of the meterID should contain a string concatenated as utility.serviceType.objectID
 * 
 * <p>Java class for meterID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="meterName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceType" type="{http://www.multispeak.org/V5.0/enumerations}serviceKind" />
 *       &lt;attribute name="otherServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="communicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="communicationsPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registeredName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;attribute name="systemName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterID", propOrder = {
    "value"
})
public class MeterID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "meterName")
    protected String meterName;
    @XmlAttribute(name = "serviceType")
    protected ServiceKind serviceType;
    @XmlAttribute(name = "otherServiceType")
    protected String otherServiceType;
    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "communicationAddress")
    protected String communicationAddress;
    @XmlAttribute(name = "communicationsPort")
    protected String communicationsPort;
    @XmlAttribute(name = "utility")
    protected String utility;
    @XmlAttribute(name = "registeredName")
    protected String registeredName;
    @XmlAttribute(name = "systemName")
    protected String systemName;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the meterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterName() {
        return meterName;
    }

    /**
     * Sets the value of the meterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterName(String value) {
        this.meterName = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceKind }
     *     
     */
    public ServiceKind getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceKind }
     *     
     */
    public void setServiceType(ServiceKind value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the otherServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherServiceType() {
        return otherServiceType;
    }

    /**
     * Sets the value of the otherServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherServiceType(String value) {
        this.otherServiceType = value;
    }

    /**
     * Gets the value of the objectGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Gets the value of the communicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationAddress() {
        return communicationAddress;
    }

    /**
     * Sets the value of the communicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationAddress(String value) {
        this.communicationAddress = value;
    }

    /**
     * Gets the value of the communicationsPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationsPort() {
        return communicationsPort;
    }

    /**
     * Sets the value of the communicationsPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationsPort(String value) {
        this.communicationsPort = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredName(String value) {
        this.registeredName = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
