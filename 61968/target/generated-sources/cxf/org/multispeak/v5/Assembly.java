
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.LineRole;
import org.multispeak.v5_0.enumerations.UnitAction;


/**
 * This is a physical instance of plant and/or labor that was constructed at a particular location using the material and labor definitions that are included in a materialManagementAssembly for this type of construction unit. 
 * 
 * <p>Java class for assembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assembly">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="spatialFeatureRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="assetRefs" type="{http://www.multispeak.org/V5.0}assetRefs" minOccurs="0"/>
 *         &lt;element name="unitAction" type="{http://www.multispeak.org/V5.0/enumerations}unitAction"/>
 *         &lt;element name="spanType" type="{http://www.multispeak.org/V5.0/enumerations}lineRole" minOccurs="0"/>
 *         &lt;element name="unitLength" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/V5.0}geometry" minOccurs="0"/>
 *         &lt;element name="variants" type="{http://www.multispeak.org/V5.0}variants" minOccurs="0"/>
 *         &lt;element name="assemblyAccountingFields" type="{http://www.multispeak.org/V5.0}assemblyAccountingFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assembly", propOrder = {
    "materialManagementAssemblyID",
    "spatialFeatureRef",
    "assetRefs",
    "unitAction",
    "spanType",
    "unitLength",
    "quantity",
    "geometry",
    "variants",
    "assemblyAccountingFields"
})
public class Assembly
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID materialManagementAssemblyID;
    protected ObjectRef spatialFeatureRef;
    protected AssetRefs assetRefs;
    @XmlElement(required = true)
    protected UnitAction unitAction;
    protected LineRole spanType;
    protected Length unitLength;
    protected float quantity;
    protected Geometry geometry;
    protected Variants variants;
    protected AssemblyAccountingFields assemblyAccountingFields;

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
     * Gets the value of the spatialFeatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getSpatialFeatureRef() {
        return spatialFeatureRef;
    }

    /**
     * Sets the value of the spatialFeatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setSpatialFeatureRef(ObjectRef value) {
        this.spatialFeatureRef = value;
    }

    /**
     * Gets the value of the assetRefs property.
     * 
     * @return
     *     possible object is
     *     {@link AssetRefs }
     *     
     */
    public AssetRefs getAssetRefs() {
        return assetRefs;
    }

    /**
     * Sets the value of the assetRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetRefs }
     *     
     */
    public void setAssetRefs(AssetRefs value) {
        this.assetRefs = value;
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

    /**
     * Gets the value of the spanType property.
     * 
     * @return
     *     possible object is
     *     {@link LineRole }
     *     
     */
    public LineRole getSpanType() {
        return spanType;
    }

    /**
     * Sets the value of the spanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRole }
     *     
     */
    public void setSpanType(LineRole value) {
        this.spanType = value;
    }

    /**
     * Gets the value of the unitLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getUnitLength() {
        return unitLength;
    }

    /**
     * Sets the value of the unitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setUnitLength(Length value) {
        this.unitLength = value;
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
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the variants property.
     * 
     * @return
     *     possible object is
     *     {@link Variants }
     *     
     */
    public Variants getVariants() {
        return variants;
    }

    /**
     * Sets the value of the variants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variants }
     *     
     */
    public void setVariants(Variants value) {
        this.variants = value;
    }

    /**
     * Gets the value of the assemblyAccountingFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyAccountingFields }
     *     
     */
    public AssemblyAccountingFields getAssemblyAccountingFields() {
        return assemblyAccountingFields;
    }

    /**
     * Sets the value of the assemblyAccountingFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyAccountingFields }
     *     
     */
    public void setAssemblyAccountingFields(AssemblyAccountingFields value) {
        this.assemblyAccountingFields = value;
    }

}
