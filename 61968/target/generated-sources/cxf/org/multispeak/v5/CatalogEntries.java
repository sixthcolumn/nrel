
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for catalogEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogEntries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="equipmentCatalogRefs" type="{http://www.multispeak.org/V5.0}equipmentCatalogRefs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogEntries", propOrder = {
    "equipmentCatalogRefs"
})
public class CatalogEntries
    extends MspExtensible
{

    protected EquipmentCatalogRefs equipmentCatalogRefs;

    /**
     * Gets the value of the equipmentCatalogRefs property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRefs }
     *     
     */
    public EquipmentCatalogRefs getEquipmentCatalogRefs() {
        return equipmentCatalogRefs;
    }

    /**
     * Sets the value of the equipmentCatalogRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRefs }
     *     
     */
    public void setEquipmentCatalogRefs(EquipmentCatalogRefs value) {
        this.equipmentCatalogRefs = value;
    }

}
