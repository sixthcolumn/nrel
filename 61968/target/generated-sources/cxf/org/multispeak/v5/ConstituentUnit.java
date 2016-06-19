
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.StatusOfUnit;
import org.multispeak.v5_0.enumerations.UnitAction;


/**
 * A set of materialManagementAssemblies that are defined elsewhere, but are included here.  An example might be a set of signs, pole numbers, guy guards, etc that are always installed with every pole.
 * 
 * <p>Java class for constituentUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constituentUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="constituentUnitRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="applicationActions" type="{http://www.multispeak.org/V5.0/enumerations}unitAction"/>
 *         &lt;element name="statusOfUnit" type="{http://www.multispeak.org/V5.0/enumerations}statusOfUnit" minOccurs="0"/>
 *         &lt;element name="variant" type="{http://www.multispeak.org/V5.0}variant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constituentUnit", propOrder = {
    "constituentUnitRef",
    "quantity",
    "applicationActions",
    "statusOfUnit",
    "variant"
})
public class ConstituentUnit
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectRef constituentUnitRef;
    protected float quantity;
    @XmlElement(required = true)
    protected UnitAction applicationActions;
    protected StatusOfUnit statusOfUnit;
    protected Variant variant;

    /**
     * Gets the value of the constituentUnitRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getConstituentUnitRef() {
        return constituentUnitRef;
    }

    /**
     * Sets the value of the constituentUnitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setConstituentUnitRef(ObjectRef value) {
        this.constituentUnitRef = value;
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
     * Gets the value of the applicationActions property.
     * 
     * @return
     *     possible object is
     *     {@link UnitAction }
     *     
     */
    public UnitAction getApplicationActions() {
        return applicationActions;
    }

    /**
     * Sets the value of the applicationActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitAction }
     *     
     */
    public void setApplicationActions(UnitAction value) {
        this.applicationActions = value;
    }

    /**
     * Gets the value of the statusOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link StatusOfUnit }
     *     
     */
    public StatusOfUnit getStatusOfUnit() {
        return statusOfUnit;
    }

    /**
     * Sets the value of the statusOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOfUnit }
     *     
     */
    public void setStatusOfUnit(StatusOfUnit value) {
        this.statusOfUnit = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setVariant(Variant value) {
        this.variant = value;
    }

}
