
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.SubstationRef;


/**
 * This is a node in a power system model at which there is a zero impedance connection between conducting equipment.  By convention in the CPSM profile, a connectivity node must be associated with exactly one voltageLevel.
 * 
 * <p>Java class for ConnectivityNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectivityNode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="measurementIDs" type="{http://www.multispeak.org/V5.0/cpsm}MeasurementIDs" minOccurs="0"/>
 *         &lt;element name="voltageLevelID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="subControlAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="nominalVoltageID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
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
@XmlType(name = "ConnectivityNode", propOrder = {
    "measurementIDs",
    "voltageLevelID",
    "subControlAreaID",
    "nominalVoltageID",
    "substationRef"
})
public class ConnectivityNode
    extends MspCIMObject
{

    protected MeasurementIDs measurementIDs;
    protected ObjectID voltageLevelID;
    protected ObjectID subControlAreaID;
    protected ObjectID nominalVoltageID;
    protected SubstationRef substationRef;

    /**
     * Gets the value of the measurementIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementIDs }
     *     
     */
    public MeasurementIDs getMeasurementIDs() {
        return measurementIDs;
    }

    /**
     * Sets the value of the measurementIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementIDs }
     *     
     */
    public void setMeasurementIDs(MeasurementIDs value) {
        this.measurementIDs = value;
    }

    /**
     * Gets the value of the voltageLevelID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getVoltageLevelID() {
        return voltageLevelID;
    }

    /**
     * Sets the value of the voltageLevelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setVoltageLevelID(ObjectID value) {
        this.voltageLevelID = value;
    }

    /**
     * Gets the value of the subControlAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSubControlAreaID() {
        return subControlAreaID;
    }

    /**
     * Sets the value of the subControlAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSubControlAreaID(ObjectID value) {
        this.subControlAreaID = value;
    }

    /**
     * Gets the value of the nominalVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getNominalVoltageID() {
        return nominalVoltageID;
    }

    /**
     * Sets the value of the nominalVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setNominalVoltageID(ObjectID value) {
        this.nominalVoltageID = value;
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

}
