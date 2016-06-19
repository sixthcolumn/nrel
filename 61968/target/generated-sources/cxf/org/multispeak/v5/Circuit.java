
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for circuit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="electricLineRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="lineConstructionType" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="hCoordinate" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuit", propOrder = {
    "electricLineRef",
    "lineConstructionType",
    "hCoordinate"
})
public class Circuit
    extends MspExtensible
{

    protected ObjectRef electricLineRef;
    protected EquipmentCatalogRef lineConstructionType;
    protected Length hCoordinate;

    /**
     * Gets the value of the electricLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getElectricLineRef() {
        return electricLineRef;
    }

    /**
     * Sets the value of the electricLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setElectricLineRef(ObjectRef value) {
        this.electricLineRef = value;
    }

    /**
     * Gets the value of the lineConstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getLineConstructionType() {
        return lineConstructionType;
    }

    /**
     * Sets the value of the lineConstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setLineConstructionType(EquipmentCatalogRef value) {
        this.lineConstructionType = value;
    }

    /**
     * Gets the value of the hCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getHCoordinate() {
        return hCoordinate;
    }

    /**
     * Sets the value of the hCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setHCoordinate(Length value) {
        this.hCoordinate = value;
    }

}
