
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.UnitAction;


/**
 * This is a link by objectID to the continuing property record that is installed at a station in a design.
 * 
 * <p>Java class for CPRAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPRAdjustment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CPRID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
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
@XmlType(name = "CPRAdjustment", propOrder = {
    "cprid",
    "quantity",
    "unitAction"
})
public class CPRAdjustment
    extends MspExtensible
{

    @XmlElement(name = "CPRID", required = true)
    protected ObjectID cprid;
    protected float quantity;
    @XmlElement(required = true)
    protected UnitAction unitAction;

    /**
     * Gets the value of the cprid property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCPRID() {
        return cprid;
    }

    /**
     * Sets the value of the cprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCPRID(ObjectID value) {
        this.cprid = value;
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
