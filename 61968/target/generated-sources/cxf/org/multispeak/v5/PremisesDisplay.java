
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;
import org.multispeak.v5_0.commontypes.UtilityInfo;


/**
 * This is an in-premises display for customer information.
 * 
 * <p>Java class for premisesDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modules" type="{http://www.multispeak.org/V5.0}modules" minOccurs="0"/>
 *         &lt;element name="premisesDisplayBillingMessages" type="{http://www.multispeak.org/V5.0}premisesDisplayBillingMessages" minOccurs="0"/>
 *         &lt;element name="premisesDisplayMessages" type="{http://www.multispeak.org/V5.0}premisesDisplayMessages" minOccurs="0"/>
 *         &lt;element name="associatedDevices" type="{http://www.multispeak.org/V5.0}associatedDevices" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/V5.0/commonTypes}utilityInfo" minOccurs="0"/>
 *         &lt;element name="communicationsAddress" type="{http://www.multispeak.org/V5.0}communicationsAddress" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "premisesDisplay", propOrder = {
    "servicePointID",
    "deviceType",
    "modules",
    "premisesDisplayBillingMessages",
    "premisesDisplayMessages",
    "associatedDevices",
    "utilityInfo",
    "communicationsAddress",
    "materialManagementAssemblyID"
})
public class PremisesDisplay
    extends MspAsset
{

    protected ServicePointID servicePointID;
    protected String deviceType;
    protected Modules modules;
    protected PremisesDisplayBillingMessages premisesDisplayBillingMessages;
    protected PremisesDisplayMessages premisesDisplayMessages;
    protected AssociatedDevices associatedDevices;
    protected UtilityInfo utilityInfo;
    protected CommunicationsAddress communicationsAddress;
    protected ObjectID materialManagementAssemblyID;

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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Modules }
     *     
     */
    public Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modules }
     *     
     */
    public void setModules(Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the premisesDisplayBillingMessages property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayBillingMessages }
     *     
     */
    public PremisesDisplayBillingMessages getPremisesDisplayBillingMessages() {
        return premisesDisplayBillingMessages;
    }

    /**
     * Sets the value of the premisesDisplayBillingMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayBillingMessages }
     *     
     */
    public void setPremisesDisplayBillingMessages(PremisesDisplayBillingMessages value) {
        this.premisesDisplayBillingMessages = value;
    }

    /**
     * Gets the value of the premisesDisplayMessages property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayMessages }
     *     
     */
    public PremisesDisplayMessages getPremisesDisplayMessages() {
        return premisesDisplayMessages;
    }

    /**
     * Sets the value of the premisesDisplayMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayMessages }
     *     
     */
    public void setPremisesDisplayMessages(PremisesDisplayMessages value) {
        this.premisesDisplayMessages = value;
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedDevices }
     *     
     */
    public AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(AssociatedDevices value) {
        this.associatedDevices = value;
    }

    /**
     * Gets the value of the utilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityInfo }
     *     
     */
    public UtilityInfo getUtilityInfo() {
        return utilityInfo;
    }

    /**
     * Sets the value of the utilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityInfo }
     *     
     */
    public void setUtilityInfo(UtilityInfo value) {
        this.utilityInfo = value;
    }

    /**
     * Gets the value of the communicationsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsAddress }
     *     
     */
    public CommunicationsAddress getCommunicationsAddress() {
        return communicationsAddress;
    }

    /**
     * Sets the value of the communicationsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsAddress }
     *     
     */
    public void setCommunicationsAddress(CommunicationsAddress value) {
        this.communicationsAddress = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

}
