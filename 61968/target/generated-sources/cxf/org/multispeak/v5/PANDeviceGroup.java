
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANDeviceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANDeviceGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PANDeviceRefs" type="{http://www.multispeak.org/V5.0}PANDeviceRefs" minOccurs="0"/>
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
@XmlType(name = "PANDeviceGroup", propOrder = {
    "groupName",
    "panDeviceRefs"
})
public class PANDeviceGroup
    extends MspObject
{

    @XmlElement(required = true)
    protected String groupName;
    @XmlElement(name = "PANDeviceRefs")
    protected PANDeviceRefs panDeviceRefs;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the panDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRefs }
     *     
     */
    public PANDeviceRefs getPANDeviceRefs() {
        return panDeviceRefs;
    }

    /**
     * Sets the value of the panDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRefs }
     *     
     */
    public void setPANDeviceRefs(PANDeviceRefs value) {
        this.panDeviceRefs = value;
    }

}
