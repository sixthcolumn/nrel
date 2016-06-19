
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.OutageReasonCategory;


/**
 * <p>Java class for outageReasonItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.multispeak.org/V5.0/enumerations}outageReasonCategory"/>
 *         &lt;element name="outageReason" type="{http://www.multispeak.org/V5.0}outageReason"/>
 *         &lt;element name="categoryGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReasonItem", propOrder = {
    "category",
    "outageReason",
    "categoryGroup"
})
public class OutageReasonItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected OutageReasonCategory category;
    @XmlElement(required = true)
    protected OutageReason outageReason;
    protected String categoryGroup;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonCategory }
     *     
     */
    public OutageReasonCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonCategory }
     *     
     */
    public void setCategory(OutageReasonCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the outageReason property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getOutageReason() {
        return outageReason;
    }

    /**
     * Sets the value of the outageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setOutageReason(OutageReason value) {
        this.outageReason = value;
    }

    /**
     * Gets the value of the categoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryGroup() {
        return categoryGroup;
    }

    /**
     * Sets the value of the categoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryGroup(String value) {
        this.categoryGroup = value;
    }

}
