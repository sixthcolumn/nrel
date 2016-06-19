
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ConstructionReferenceType;


/**
 * Each constructionItem refers to either the details of the structure framing if this is an overhead ACLine or conduit if this is an underground line.  For instance if this line segment models a single overhead span, one constructionItem would be for the head span and one would be for the back span.
 * 
 * <p>Java class for constructionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constructionItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="constructionReferenceType" type="{http://www.multispeak.org/V5.0/enumerations}constructionReferenceType"/>
 *         &lt;element name="constructionRef" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef"/>
 *         &lt;element name="verticalReference" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionItem", propOrder = {
    "constructionReferenceType",
    "constructionRef",
    "verticalReference"
})
public class ConstructionItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ConstructionReferenceType constructionReferenceType;
    @XmlElement(required = true)
    protected EquipmentCatalogRef constructionRef;
    protected Height verticalReference;

    /**
     * Gets the value of the constructionReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionReferenceType }
     *     
     */
    public ConstructionReferenceType getConstructionReferenceType() {
        return constructionReferenceType;
    }

    /**
     * Sets the value of the constructionReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionReferenceType }
     *     
     */
    public void setConstructionReferenceType(ConstructionReferenceType value) {
        this.constructionReferenceType = value;
    }

    /**
     * Gets the value of the constructionRef property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getConstructionRef() {
        return constructionRef;
    }

    /**
     * Sets the value of the constructionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setConstructionRef(EquipmentCatalogRef value) {
        this.constructionRef = value;
    }

    /**
     * Gets the value of the verticalReference property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getVerticalReference() {
        return verticalReference;
    }

    /**
     * Sets the value of the verticalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setVerticalReference(Height value) {
        this.verticalReference = value;
    }

}
