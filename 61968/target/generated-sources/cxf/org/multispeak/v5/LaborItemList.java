
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for laborItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborItemList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="laborItems" type="{http://www.multispeak.org/V5.0}laborItems"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laborItemList", propOrder = {
    "laborItems"
})
public class LaborItemList
    extends MspExtensible
{

    @XmlElement(required = true)
    protected LaborItems laborItems;

    /**
     * Gets the value of the laborItems property.
     * 
     * @return
     *     possible object is
     *     {@link LaborItems }
     *     
     */
    public LaborItems getLaborItems() {
        return laborItems;
    }

    /**
     * Sets the value of the laborItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborItems }
     *     
     */
    public void setLaborItems(LaborItems value) {
        this.laborItems = value;
    }

}
