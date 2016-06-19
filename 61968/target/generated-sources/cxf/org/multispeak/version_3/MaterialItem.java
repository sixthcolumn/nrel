
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stockDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avgCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="newCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="laborFactor" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="materialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialUnits" type="{http://www.multispeak.org/Version_3.0}materialUnits" minOccurs="0"/>
 *         &lt;element name="warehouseLocationList" type="{http://www.multispeak.org/Version_3.0}ArrayOfWarehouseLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
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
    "stockDescr",
    "item",
    "avgCost",
    "newCost",
    "laborFactor",
    "materialType",
    "materialUnits",
    "warehouseLocationList"
})
public class MaterialItem
    extends MspObject
{

    protected String stockNumber;
    protected String stockDescr;
    protected String item;
    protected Float avgCost;
    protected Float newCost;
    protected Long laborFactor;
    protected String materialType;
    protected MaterialUnits materialUnits;
    protected ArrayOfWarehouseLocation warehouseLocationList;

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
     * Gets the value of the stockDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDescr() {
        return stockDescr;
    }

    /**
     * Sets the value of the stockDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDescr(String value) {
        this.stockDescr = value;
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
     * Gets the value of the avgCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvgCost() {
        return avgCost;
    }

    /**
     * Sets the value of the avgCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvgCost(Float value) {
        this.avgCost = value;
    }

    /**
     * Gets the value of the newCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewCost() {
        return newCost;
    }

    /**
     * Sets the value of the newCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewCost(Float value) {
        this.newCost = value;
    }

    /**
     * Gets the value of the laborFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLaborFactor() {
        return laborFactor;
    }

    /**
     * Sets the value of the laborFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLaborFactor(Long value) {
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
     * Gets the value of the warehouseLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarehouseLocation }
     *     
     */
    public ArrayOfWarehouseLocation getWarehouseLocationList() {
        return warehouseLocationList;
    }

    /**
     * Sets the value of the warehouseLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarehouseLocation }
     *     
     */
    public void setWarehouseLocationList(ArrayOfWarehouseLocation value) {
        this.warehouseLocationList = value;
    }

}
