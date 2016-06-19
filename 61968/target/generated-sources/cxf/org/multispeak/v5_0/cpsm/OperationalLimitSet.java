
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * A set of limits associated with equipmnet.
 * 
 * <p>Java class for OperationalLimitSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalLimitSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="limits" type="{http://www.multispeak.org/V5.0/cpsm}Limits" minOccurs="0"/>
 *         &lt;element name="equipmentID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "OperationalLimitSet", propOrder = {
    "limits",
    "equipmentID"
})
public class OperationalLimitSet
    extends MspCIMObject
{

    protected Limits limits;
    protected ObjectID equipmentID;

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link Limits }
     *     
     */
    public Limits getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limits }
     *     
     */
    public void setLimits(Limits value) {
        this.limits = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEquipmentID(ObjectID value) {
        this.equipmentID = value;
    }

}
