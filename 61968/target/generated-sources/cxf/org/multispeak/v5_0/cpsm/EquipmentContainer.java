
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContentsItems;


/**
 * <p>Java class for EquipmentContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="contentsList" type="{http://www.multispeak.org/V5.0/commonTypes}contentsItems" minOccurs="0"/>
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
@XmlType(name = "EquipmentContainer", propOrder = {
    "contentsList"
})
@XmlSeeAlso({
    Line.class,
    VoltageLevel.class,
    Bay.class
})
public abstract class EquipmentContainer
    extends MspCIMObject
{

    protected ContentsItems contentsList;

    /**
     * Gets the value of the contentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ContentsItems }
     *     
     */
    public ContentsItems getContentsList() {
        return contentsList;
    }

    /**
     * Sets the value of the contentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentsItems }
     *     
     */
    public void setContentsList(ContentsItems value) {
        this.contentsList = value;
    }

}
