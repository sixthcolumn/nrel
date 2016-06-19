
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.enumerations.MaterialClass;
import org.multispeak.v5_0.enumerations.MaterialUnits;


/**
 * This is an item of material that may be used in maintenance or construction of plant.
 * 
 * <p>Java class for materialItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="averageCost" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="newCost" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="laborFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="materialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialUnits" type="{http://www.multispeak.org/V5.0/enumerations}materialUnits" minOccurs="0"/>
 *         &lt;element name="warehouseLocations" type="{http://www.multispeak.org/V5.0}warehouseLocations" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="materialClass" type="{http://www.multispeak.org/V5.0/enumerations}materialClass" minOccurs="0"/>
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
@XmlType(name = "materialItem", propOrder = {
    "stockNumber",
    "stockDescription",
    "item",
    "averageCost",
    "newCost",
    "laborFactor",
    "materialType",
    "materialUnits",
    "warehouseLocations",
    "effectiveDate",
    "materialClass"
})
public class MaterialItem
    extends MspObject
{

    protected String stockNumber;
    protected String stockDescription;
    protected String item;
    protected Money averageCost;
    protected Money newCost;
    protected Float laborFactor;
    protected String materialType;
    protected MaterialUnits materialUnits;
    protected WarehouseLocations warehouseLocations;
    protected XMLGregorianCalendar effectiveDate;
    protected MaterialClass materialClass;

    /**
     * Gets the value of the stockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNumber() {
        return stockNumber;
    }

    /**
     * Sets the value of the stockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNumber(String value) {
        this.stockNumber = value;
    }

    /**
     * Gets the value of the stockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDescription() {
        return stockDescription;
    }

    /**
     * Sets the value of the stockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDescription(String value) {
        this.stockDescription = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageCost(Money value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the newCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNewCost() {
        return newCost;
    }

    /**
     * Sets the value of the newCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNewCost(Money value) {
        this.newCost = value;
    }

    /**
     * Gets the value of the laborFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLaborFactor() {
        return laborFactor;
    }

    /**
     * Sets the value of the laborFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLaborFactor(Float value) {
        this.laborFactor = value;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the materialUnits property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialUnits }
     *     
     */
    public MaterialUnits getMaterialUnits() {
        return materialUnits;
    }

    /**
     * Sets the value of the materialUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialUnits }
     *     
     */
    public void setMaterialUnits(MaterialUnits value) {
        this.materialUnits = value;
    }

    /**
     * Gets the value of the warehouseLocations property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseLocations }
     *     
     */
    public WarehouseLocations getWarehouseLocations() {
        return warehouseLocations;
    }

    /**
     * Sets the value of the warehouseLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseLocations }
     *     
     */
    public void setWarehouseLocations(WarehouseLocations value) {
        this.warehouseLocations = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the materialClass property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialClass }
     *     
     */
    public MaterialClass getMaterialClass() {
        return materialClass;
    }

    /**
     * Sets the value of the materialClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialClass }
     *     
     */
    public void setMaterialClass(MaterialClass value) {
        this.materialClass = value;
    }

}
