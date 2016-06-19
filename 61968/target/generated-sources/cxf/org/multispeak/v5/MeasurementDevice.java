
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NetworkModelRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.MeasurementDeviceStatusKind;
import org.multispeak.v5_0.enumerations.MeasurementDeviceType;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for measurementDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="measurementDeviceType" type="{http://www.multispeak.org/V5.0/enumerations}measurementDeviceType" minOccurs="0"/>
 *         &lt;element name="networkModelRef" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="measurementDeviceStatus" type="{http://www.multispeak.org/V5.0/enumerations}measurementDeviceStatusKind" minOccurs="0"/>
 *         &lt;element name="pointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
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
@XmlType(name = "measurementDevice", propOrder = {
    "measurementDeviceType",
    "networkModelRef",
    "substationRef",
    "feederRef",
    "phaseCode",
    "measurementDeviceStatus",
    "pointID",
    "assetData",
    "materialManagementAssemblyID"
})
public class MeasurementDevice
    extends MspPointObject
{

    protected MeasurementDeviceType measurementDeviceType;
    protected NetworkModelRef networkModelRef;
    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected PhaseCode phaseCode;
    protected MeasurementDeviceStatusKind measurementDeviceStatus;
    protected String pointID;
    protected AssetData assetData;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the measurementDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public MeasurementDeviceType getMeasurementDeviceType() {
        return measurementDeviceType;
    }

    /**
     * Sets the value of the measurementDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public void setMeasurementDeviceType(MeasurementDeviceType value) {
        this.measurementDeviceType = value;
    }

    /**
     * Gets the value of the networkModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModelRef }
     *     
     */
    public NetworkModelRef getNetworkModelRef() {
        return networkModelRef;
    }

    /**
     * Sets the value of the networkModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModelRef }
     *     
     */
    public void setNetworkModelRef(NetworkModelRef value) {
        this.networkModelRef = value;
    }

    /**
     * Gets the value of the substationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getSubstationRef() {
        return substationRef;
    }

    /**
     * Sets the value of the substationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setSubstationRef(SubstationRef value) {
        this.substationRef = value;
    }

    /**
     * Gets the value of the feederRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getFeederRef() {
        return feederRef;
    }

    /**
     * Sets the value of the feederRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setFeederRef(ObjectRef value) {
        this.feederRef = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the measurementDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceStatusKind }
     *     
     */
    public MeasurementDeviceStatusKind getMeasurementDeviceStatus() {
        return measurementDeviceStatus;
    }

    /**
     * Sets the value of the measurementDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceStatusKind }
     *     
     */
    public void setMeasurementDeviceStatus(MeasurementDeviceStatusKind value) {
        this.measurementDeviceStatus = value;
    }

    /**
     * Gets the value of the pointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointID() {
        return pointID;
    }

    /**
     * Sets the value of the pointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointID(String value) {
        this.pointID = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
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
