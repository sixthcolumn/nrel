
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for meterConfigurationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConfigurationStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="configurationGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="configurationStatusItems" type="{http://www.multispeak.org/V5.0}configurationStatusItems"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterConfigurationStatus", propOrder = {
    "configurationGroupID",
    "configurationStatusItems"
})
public class MeterConfigurationStatus
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID configurationGroupID;
    @XmlElement(required = true)
    protected ConfigurationStatusItems configurationStatusItems;

    /**
     * Gets the value of the configurationGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getConfigurationGroupID() {
        return configurationGroupID;
    }

    /**
     * Sets the value of the configurationGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setConfigurationGroupID(ObjectID value) {
        this.configurationGroupID = value;
    }

    /**
     * Gets the value of the configurationStatusItems property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationStatusItems }
     *     
     */
    public ConfigurationStatusItems getConfigurationStatusItems() {
        return configurationStatusItems;
    }

    /**
     * Sets the value of the configurationStatusItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationStatusItems }
     *     
     */
    public void setConfigurationStatusItems(ConfigurationStatusItems value) {
        this.configurationStatusItems = value;
    }

}
