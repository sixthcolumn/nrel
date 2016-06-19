
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;


/**
 * The labor category is the rate for a person-hour of labor for a specific type of labor.   The labor category ID is contained in the object ID for each category.  The human-readable designator for the laborCategory is carried in the laborCategory.primaryIdentifier.  The optional description field is provided for additional information about the laborCategory, if necessary. The labor rate carried in the laborCategory will be multiplied by the laborComponent person-hours to create the labor cost for any materialManagementAssembly. 
 * 
 * <p>Java class for laborCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laborRate" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
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
@XmlType(name = "laborCategory", propOrder = {
    "description",
    "laborRate"
})
public class LaborCategory
    extends MspObject
{

    protected String description;
    @XmlElement(required = true)
    protected Money laborRate;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the laborRate property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLaborRate() {
        return laborRate;
    }

    /**
     * Sets the value of the laborRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLaborRate(Money value) {
        this.laborRate = value;
    }

}
