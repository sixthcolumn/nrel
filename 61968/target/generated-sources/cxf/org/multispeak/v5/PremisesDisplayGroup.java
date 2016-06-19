
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premisesDisplayGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premisesDisplays" type="{http://www.multispeak.org/V5.0}premisesDisplays" minOccurs="0"/>
 *         &lt;element name="premisesDisplayIDs" type="{http://www.multispeak.org/V5.0}premisesDisplayIDs" minOccurs="0"/>
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
@XmlType(name = "premisesDisplayGroup", propOrder = {
    "groupName",
    "premisesDisplays",
    "premisesDisplayIDs"
})
public class PremisesDisplayGroup
    extends MspObject
{

    @XmlElement(required = true)
    protected String groupName;
    protected PremisesDisplays premisesDisplays;
    protected PremisesDisplayIDs premisesDisplayIDs;

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
     * Gets the value of the premisesDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplays }
     *     
     */
    public PremisesDisplays getPremisesDisplays() {
        return premisesDisplays;
    }

    /**
     * Sets the value of the premisesDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplays }
     *     
     */
    public void setPremisesDisplays(PremisesDisplays value) {
        this.premisesDisplays = value;
    }

    /**
     * Gets the value of the premisesDisplayIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayIDs }
     *     
     */
    public PremisesDisplayIDs getPremisesDisplayIDs() {
        return premisesDisplayIDs;
    }

    /**
     * Sets the value of the premisesDisplayIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayIDs }
     *     
     */
    public void setPremisesDisplayIDs(PremisesDisplayIDs value) {
        this.premisesDisplayIDs = value;
    }

}
