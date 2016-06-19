
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for pickList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pickList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="pickListItems" type="{http://www.multispeak.org/V5.0}pickListItems"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pickList", propOrder = {
    "pickListItems"
})
public class PickList
    extends MspExtensible
{

    @XmlElement(required = true)
    protected PickListItems pickListItems;

    /**
     * Gets the value of the pickListItems property.
     * 
     * @return
     *     possible object is
     *     {@link PickListItems }
     *     
     */
    public PickListItems getPickListItems() {
        return pickListItems;
    }

    /**
     * Sets the value of the pickListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickListItems }
     *     
     */
    public void setPickListItems(PickListItems value) {
        this.pickListItems = value;
    }

}
