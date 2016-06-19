
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.
 * 
 * <p>Java class for ControlAreaGeneratingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlAreaGeneratingUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="generatingUnitID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="controlAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "ControlAreaGeneratingUnit", propOrder = {
    "generatingUnitID",
    "controlAreaID"
})
public class ControlAreaGeneratingUnit
    extends MspCIMObject
{

    protected ObjectID generatingUnitID;
    protected ObjectID controlAreaID;

    /**
     * Gets the value of the generatingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getGeneratingUnitID() {
        return generatingUnitID;
    }

    /**
     * Sets the value of the generatingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setGeneratingUnitID(ObjectID value) {
        this.generatingUnitID = value;
    }

    /**
     * Gets the value of the controlAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getControlAreaID() {
        return controlAreaID;
    }

    /**
     * Sets the value of the controlAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setControlAreaID(ObjectID value) {
        this.controlAreaID = value;
    }

}
