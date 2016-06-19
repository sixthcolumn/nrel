
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * <p>Java class for surgeArrestor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surgeArrestor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="continuousOperatingVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="nominalDischargeCurrent" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="lineDischargeClass" type="{http://www.multispeak.org/V5.0/enumerations}lineDischargeClass" minOccurs="0"/>
 *         &lt;element name="impulseWithstand" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="creepageDistance" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="flashOverDistance" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="leakageCurrent" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
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
@XmlType(name = "surgeArrestor", propOrder = {
    "ratedVoltage",
    "continuousOperatingVoltage",
    "nominalDischargeCurrent",
    "lineDischargeClass",
    "impulseWithstand",
    "creepageDistance",
    "flashOverDistance",
    "leakageCurrent",
    "materialManagementAssemblyID"
})
public class SurgeArrestor
    extends MspAsset
{

    protected Voltage ratedVoltage;
    protected Voltage continuousOperatingVoltage;
    protected Current nominalDischargeCurrent;
    protected String lineDischargeClass;
    protected Voltage impulseWithstand;
    protected Length creepageDistance;
    protected Length flashOverDistance;
    protected Current leakageCurrent;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the continuousOperatingVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getContinuousOperatingVoltage() {
        return continuousOperatingVoltage;
    }

    /**
     * Sets the value of the continuousOperatingVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setContinuousOperatingVoltage(Voltage value) {
        this.continuousOperatingVoltage = value;
    }

    /**
     * Gets the value of the nominalDischargeCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getNominalDischargeCurrent() {
        return nominalDischargeCurrent;
    }

    /**
     * Sets the value of the nominalDischargeCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setNominalDischargeCurrent(Current value) {
        this.nominalDischargeCurrent = value;
    }

    /**
     * Gets the value of the lineDischargeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDischargeClass() {
        return lineDischargeClass;
    }

    /**
     * Sets the value of the lineDischargeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDischargeClass(String value) {
        this.lineDischargeClass = value;
    }

    /**
     * Gets the value of the impulseWithstand property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getImpulseWithstand() {
        return impulseWithstand;
    }

    /**
     * Sets the value of the impulseWithstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setImpulseWithstand(Voltage value) {
        this.impulseWithstand = value;
    }

    /**
     * Gets the value of the creepageDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getCreepageDistance() {
        return creepageDistance;
    }

    /**
     * Sets the value of the creepageDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setCreepageDistance(Length value) {
        this.creepageDistance = value;
    }

    /**
     * Gets the value of the flashOverDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getFlashOverDistance() {
        return flashOverDistance;
    }

    /**
     * Sets the value of the flashOverDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setFlashOverDistance(Length value) {
        this.flashOverDistance = value;
    }

    /**
     * Gets the value of the leakageCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getLeakageCurrent() {
        return leakageCurrent;
    }

    /**
     * Sets the value of the leakageCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setLeakageCurrent(Current value) {
        this.leakageCurrent = value;
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
