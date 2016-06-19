
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}meterGroup">
 *       &lt;sequence>
 *         &lt;element name="configuredReadingTypes" type="{http://www.multispeak.org/V5.0}configuredReadingTypes" minOccurs="0"/>
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
@XmlType(name = "configurationGroup", propOrder = {
    "configuredReadingTypes"
})
public class ConfigurationGroup
    extends MeterGroup
{

    protected ConfiguredReadingTypes configuredReadingTypes;

    /**
     * Gets the value of the configuredReadingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguredReadingTypes }
     *     
     */
    public ConfiguredReadingTypes getConfiguredReadingTypes() {
        return configuredReadingTypes;
    }

    /**
     * Sets the value of the configuredReadingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguredReadingTypes }
     *     
     */
    public void setConfiguredReadingTypes(ConfiguredReadingTypes value) {
        this.configuredReadingTypes = value;
    }

}
