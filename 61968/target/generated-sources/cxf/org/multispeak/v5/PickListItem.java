
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.UnitAction;


/**
 * <p>Java class for pickListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pickListItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="materialItemID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="unitAction" type="{http://www.multispeak.org/V5.0/enumerations}unitAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pickListItem", propOrder = {
    "materialItemID",
    "quantity",
    "unitAction"
})
public class PickListItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID materialItemID;
    protected float quantity;
    @XmlElement(required = true)
    protected UnitAction unitAction;

    /**
     * Gets the value of the materialItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialItemID() {
        return materialItemID;
    }

    /**
     * Sets the value of the materialItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialItemID(ObjectID value) {
        this.materialItemID = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitAction property.
     * 
     * @return
     *     possible object is
     *     {@link UnitAction }
     *     
     */
    public UnitAction getUnitAction() {
        return unitAction;
    }

    /**
     * Sets the value of the unitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitAction }
     *     
     */
    public void setUnitAction(UnitAction value) {
        this.unitAction = value;
    }

}
