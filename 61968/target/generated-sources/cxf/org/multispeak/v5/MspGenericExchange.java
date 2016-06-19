
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This abstract class is intended to permit the exchange of a data instance of any object with another data instance of the same type of object.  For example, the replacement of an existing faulty switch in a switchBank with a new switch. 
 * 
 * <p>Java class for mspGenericExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspGenericExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="removedObjectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="installedObjectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="locationReferences" type="{http://www.multispeak.org/V5.0}locationReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspGenericExchange", propOrder = {
    "removedObjectRef",
    "installedObjectRef",
    "locationReferences"
})
@XmlSeeAlso({
    MspServiceDeviceExchange.class
})
public abstract class MspGenericExchange
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectRef removedObjectRef;
    @XmlElement(required = true)
    protected ObjectRef installedObjectRef;
    protected LocationReferences locationReferences;

    /**
     * Gets the value of the removedObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getRemovedObjectRef() {
        return removedObjectRef;
    }

    /**
     * Sets the value of the removedObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setRemovedObjectRef(ObjectRef value) {
        this.removedObjectRef = value;
    }

    /**
     * Gets the value of the installedObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getInstalledObjectRef() {
        return installedObjectRef;
    }

    /**
     * Sets the value of the installedObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setInstalledObjectRef(ObjectRef value) {
        this.installedObjectRef = value;
    }

    /**
     * Gets the value of the locationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReferences }
     *     
     */
    public LocationReferences getLocationReferences() {
        return locationReferences;
    }

    /**
     * Sets the value of the locationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReferences }
     *     
     */
    public void setLocationReferences(LocationReferences value) {
        this.locationReferences = value;
    }

}
