
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * List of labor associated with a materialManagementAssembly.  The person-hours contained herein are multiplied by the laborRate in the corresponding laborCategory to obtain the labor cost for completing the work associated with this materialManagementAssembly.
 * 
 * <p>Java class for laborComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="laborCategoryID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="constructionPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="retirementPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="salvagePersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="transferPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotConstructionPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotRetirementPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotSalvagePersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotTransferPersonHours" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "laborComponent", propOrder = {
    "laborCategoryID",
    "constructionPersonHours",
    "retirementPersonHours",
    "salvagePersonHours",
    "transferPersonHours",
    "hotConstructionPersonHours",
    "hotRetirementPersonHours",
    "hotSalvagePersonHours",
    "hotTransferPersonHours",
    "variant"
})
public class LaborComponent
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID laborCategoryID;
    protected Float constructionPersonHours;
    protected Float retirementPersonHours;
    protected Float salvagePersonHours;
    protected Float transferPersonHours;
    protected Float hotConstructionPersonHours;
    protected Float hotRetirementPersonHours;
    protected Float hotSalvagePersonHours;
    protected Float hotTransferPersonHours;
    protected Variant variant;

    /**
     * Gets the value of the laborCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLaborCategoryID() {
        return laborCategoryID;
    }

    /**
     * Sets the value of the laborCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLaborCategoryID(ObjectID value) {
        this.laborCategoryID = value;
    }

    /**
     * Gets the value of the constructionPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConstructionPersonHours() {
        return constructionPersonHours;
    }

    /**
     * Sets the value of the constructionPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstructionPersonHours(Float value) {
        this.constructionPersonHours = value;
    }

    /**
     * Gets the value of the retirementPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetirementPersonHours() {
        return retirementPersonHours;
    }

    /**
     * Sets the value of the retirementPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetirementPersonHours(Float value) {
        this.retirementPersonHours = value;
    }

    /**
     * Gets the value of the salvagePersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalvagePersonHours() {
        return salvagePersonHours;
    }

    /**
     * Sets the value of the salvagePersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalvagePersonHours(Float value) {
        this.salvagePersonHours = value;
    }

    /**
     * Gets the value of the transferPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransferPersonHours() {
        return transferPersonHours;
    }

    /**
     * Sets the value of the transferPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransferPersonHours(Float value) {
        this.transferPersonHours = value;
    }

    /**
     * Gets the value of the hotConstructionPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotConstructionPersonHours() {
        return hotConstructionPersonHours;
    }

    /**
     * Sets the value of the hotConstructionPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotConstructionPersonHours(Float value) {
        this.hotConstructionPersonHours = value;
    }

    /**
     * Gets the value of the hotRetirementPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotRetirementPersonHours() {
        return hotRetirementPersonHours;
    }

    /**
     * Sets the value of the hotRetirementPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotRetirementPersonHours(Float value) {
        this.hotRetirementPersonHours = value;
    }

    /**
     * Gets the value of the hotSalvagePersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotSalvagePersonHours() {
        return hotSalvagePersonHours;
    }

    /**
     * Sets the value of the hotSalvagePersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotSalvagePersonHours(Float value) {
        this.hotSalvagePersonHours = value;
    }

    /**
     * Gets the value of the hotTransferPersonHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotTransferPersonHours() {
        return hotTransferPersonHours;
    }

    /**
     * Sets the value of the hotTransferPersonHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotTransferPersonHours(Float value) {
        this.hotTransferPersonHours = value;
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
