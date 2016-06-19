
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a group of meters.  A meter group may be used to instruct the MR to take some action on this set of meters, for instance, take a billing meter read on all of the meters in this group or configure all of the meters identically..
 * 
 * <p>Java class for meterGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs" minOccurs="0"/>
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
@XmlType(name = "meterGroup", propOrder = {
    "groupName",
    "meterIDs"
})
@XmlSeeAlso({
    ConfigurationGroup.class
})
public class MeterGroup
    extends MspObject
{

    @XmlElement(required = true)
    protected String groupName;
    protected MeterIDs meterIDs;

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
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterIDs }
     *     
     */
    public MeterIDs getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterIDs }
     *     
     */
    public void setMeterIDs(MeterIDs value) {
        this.meterIDs = value;
    }

}
