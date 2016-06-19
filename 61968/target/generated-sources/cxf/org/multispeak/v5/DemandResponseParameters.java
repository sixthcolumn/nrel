
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * Parameters to setup/manage the response to a DR event
 * 
 * <p>Java class for demandResponseParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResponseParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="DRProgramID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="startRandomizationDuration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="stopRandomizationDuration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
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
@XmlType(name = "demandResponseParameters", propOrder = {
    "panDeviceRef",
    "drProgramID",
    "startRandomizationDuration",
    "stopRandomizationDuration"
})
public class DemandResponseParameters
    extends MspObject
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    @XmlElement(name = "DRProgramID")
    protected ObjectID drProgramID;
    protected Duration startRandomizationDuration;
    protected Duration stopRandomizationDuration;

    /**
     * Gets the value of the panDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRef }
     *     
     */
    public PANDeviceRef getPANDeviceRef() {
        return panDeviceRef;
    }

    /**
     * Sets the value of the panDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRef }
     *     
     */
    public void setPANDeviceRef(PANDeviceRef value) {
        this.panDeviceRef = value;
    }

    /**
     * Gets the value of the drProgramID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDRProgramID() {
        return drProgramID;
    }

    /**
     * Sets the value of the drProgramID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDRProgramID(ObjectID value) {
        this.drProgramID = value;
    }

    /**
     * Gets the value of the startRandomizationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStartRandomizationDuration() {
        return startRandomizationDuration;
    }

    /**
     * Sets the value of the startRandomizationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStartRandomizationDuration(Duration value) {
        this.startRandomizationDuration = value;
    }

    /**
     * Gets the value of the stopRandomizationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStopRandomizationDuration() {
        return stopRandomizationDuration;
    }

    /**
     * Sets the value of the stopRandomizationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStopRandomizationDuration(Duration value) {
        this.stopRandomizationDuration = value;
    }

}
