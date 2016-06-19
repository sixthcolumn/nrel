
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
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
    "meterList"
})
@XmlSeeAlso({
    ConfigurationGroup.class
})
public class MeterGroup
    extends MspObject
{

    protected String groupName;
    protected ArrayOfMeterID meterList;

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
     * Gets the value of the meterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public ArrayOfMeterID getMeterList() {
        return meterList;
    }

    /**
     * Sets the value of the meterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public void setMeterList(ArrayOfMeterID value) {
        this.meterList = value;
    }

}
