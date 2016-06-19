
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Address;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * <p>Java class for outagePriorityLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outagePriorityLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
 *         &lt;element name="serviceAddress" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="outageContact" type="{http://www.multispeak.org/V5.0}outageContact" minOccurs="0"/>
 *         &lt;element name="servicePriorities" type="{http://www.multispeak.org/V5.0}servicePriorities" minOccurs="0"/>
 *         &lt;element name="locationNotes" type="{http://www.multispeak.org/V5.0}locationNotes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outagePriorityLocation", propOrder = {
    "servicePointID",
    "serviceAddress",
    "outageContact",
    "servicePriorities",
    "locationNotes"
})
public class OutagePriorityLocation
    extends MspReferable
{

    @XmlElement(required = true)
    protected ServicePointID servicePointID;
    protected Address serviceAddress;
    protected OutageContact outageContact;
    protected ServicePriorities servicePriorities;
    protected LocationNotes locationNotes;

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
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setServiceAddress(Address value) {
        this.serviceAddress = value;
    }

    /**
     * Gets the value of the outageContact property.
     * 
     * @return
     *     possible object is
     *     {@link OutageContact }
     *     
     */
    public OutageContact getOutageContact() {
        return outageContact;
    }

    /**
     * Sets the value of the outageContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageContact }
     *     
     */
    public void setOutageContact(OutageContact value) {
        this.outageContact = value;
    }

    /**
     * Gets the value of the servicePriorities property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePriorities }
     *     
     */
    public ServicePriorities getServicePriorities() {
        return servicePriorities;
    }

    /**
     * Sets the value of the servicePriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriorities }
     *     
     */
    public void setServicePriorities(ServicePriorities value) {
        this.servicePriorities = value;
    }

    /**
     * Gets the value of the locationNotes property.
     * 
     * @return
     *     possible object is
     *     {@link LocationNotes }
     *     
     */
    public LocationNotes getLocationNotes() {
        return locationNotes;
    }

    /**
     * Sets the value of the locationNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationNotes }
     *     
     */
    public void setLocationNotes(LocationNotes value) {
        this.locationNotes = value;
    }

}
