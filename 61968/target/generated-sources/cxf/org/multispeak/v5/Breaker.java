
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for breaker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="breaker">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspOverCurrentDevice">
 *       &lt;sequence>
 *         &lt;element name="phaseTripRating" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="breakerImpedances" type="{http://www.multispeak.org/V5.0}breakerImpedances" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="overcurrentDeviceBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "breaker", propOrder = {
    "phaseTripRating",
    "breakerImpedances",
    "materialManagementAssemblyID",
    "overcurrentDeviceBankID",
    "switchingDeviceBankID"
})
public class Breaker
    extends MspOverCurrentDevice
{

    protected Current phaseTripRating;
    protected BreakerImpedances breakerImpedances;
    protected ObjectID materialManagementAssemblyID;
    protected ObjectID overcurrentDeviceBankID;
    protected ObjectID switchingDeviceBankID;

    /**
     * Gets the value of the phaseTripRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getPhaseTripRating() {
        return phaseTripRating;
    }

    /**
     * Sets the value of the phaseTripRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setPhaseTripRating(Current value) {
        this.phaseTripRating = value;
    }

    /**
     * Gets the value of the breakerImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link BreakerImpedances }
     *     
     */
    public BreakerImpedances getBreakerImpedances() {
        return breakerImpedances;
    }

    /**
     * Sets the value of the breakerImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakerImpedances }
     *     
     */
    public void setBreakerImpedances(BreakerImpedances value) {
        this.breakerImpedances = value;
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

    /**
     * Gets the value of the overcurrentDeviceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getOvercurrentDeviceBankID() {
        return overcurrentDeviceBankID;
    }

    /**
     * Sets the value of the overcurrentDeviceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setOvercurrentDeviceBankID(ObjectID value) {
        this.overcurrentDeviceBankID = value;
    }

    /**
     * Gets the value of the switchingDeviceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSwitchingDeviceBankID() {
        return switchingDeviceBankID;
    }

    /**
     * Sets the value of the switchingDeviceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSwitchingDeviceBankID(ObjectID value) {
        this.switchingDeviceBankID = value;
    }

}
