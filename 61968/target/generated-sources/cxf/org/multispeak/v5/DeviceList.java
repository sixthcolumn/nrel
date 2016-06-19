
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * List of electrical devices that are associated with this electric service point
 * 
 * <p>Java class for deviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="premisesDisplayIDs" type="{http://www.multispeak.org/V5.0}premisesDisplayIDs" minOccurs="0"/>
 *         &lt;element name="loadManagementDeviceIDs" type="{http://www.multispeak.org/V5.0}loadManagementDeviceIDs" minOccurs="0"/>
 *         &lt;element name="CDDeviceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="PANDeviceIDs" type="{http://www.multispeak.org/V5.0}PANDeviceIDs" minOccurs="0"/>
 *         &lt;element name="instrumentTransformers" type="{http://www.multispeak.org/V5.0}instrumentTransformers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceList", propOrder = {
    "premisesDisplayIDs",
    "loadManagementDeviceIDs",
    "cdDeviceID",
    "panDeviceIDs",
    "instrumentTransformers"
})
public class DeviceList
    extends MspExtensible
{

    protected PremisesDisplayIDs premisesDisplayIDs;
    protected LoadManagementDeviceIDs loadManagementDeviceIDs;
    @XmlElement(name = "CDDeviceID")
    protected ObjectID cdDeviceID;
    @XmlElement(name = "PANDeviceIDs")
    protected PANDeviceIDs panDeviceIDs;
    protected InstrumentTransformers instrumentTransformers;

    /**
     * Gets the value of the premisesDisplayIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayIDs }
     *     
     */
    public PremisesDisplayIDs getPremisesDisplayIDs() {
        return premisesDisplayIDs;
    }

    /**
     * Sets the value of the premisesDisplayIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayIDs }
     *     
     */
    public void setPremisesDisplayIDs(PremisesDisplayIDs value) {
        this.premisesDisplayIDs = value;
    }

    /**
     * Gets the value of the loadManagementDeviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link LoadManagementDeviceIDs }
     *     
     */
    public LoadManagementDeviceIDs getLoadManagementDeviceIDs() {
        return loadManagementDeviceIDs;
    }

    /**
     * Sets the value of the loadManagementDeviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadManagementDeviceIDs }
     *     
     */
    public void setLoadManagementDeviceIDs(LoadManagementDeviceIDs value) {
        this.loadManagementDeviceIDs = value;
    }

    /**
     * Gets the value of the cdDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCDDeviceID() {
        return cdDeviceID;
    }

    /**
     * Sets the value of the cdDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCDDeviceID(ObjectID value) {
        this.cdDeviceID = value;
    }

    /**
     * Gets the value of the panDeviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceIDs }
     *     
     */
    public PANDeviceIDs getPANDeviceIDs() {
        return panDeviceIDs;
    }

    /**
     * Sets the value of the panDeviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceIDs }
     *     
     */
    public void setPANDeviceIDs(PANDeviceIDs value) {
        this.panDeviceIDs = value;
    }

    /**
     * Gets the value of the instrumentTransformers property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformers }
     *     
     */
    public InstrumentTransformers getInstrumentTransformers() {
        return instrumentTransformers;
    }

    /**
     * Sets the value of the instrumentTransformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformers }
     *     
     */
    public void setInstrumentTransformers(InstrumentTransformers value) {
        this.instrumentTransformers = value;
    }

}
