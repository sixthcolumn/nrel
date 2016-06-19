
package org.multispeak.version_4;

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
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}meterGroup">
 *       &lt;sequence>
 *         &lt;element name="configuredReadingTypes" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfConfiguredReadingType" minOccurs="0"/>
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
@XmlType(name = "configurationGroup", propOrder = {
    "configuredReadingTypes"
})
public class ConfigurationGroup
    extends MeterGroup
{

    protected ArrayOfConfiguredReadingType configuredReadingTypes;

    /**
     * Gets the value of the configuredReadingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConfiguredReadingType }
     *     
     */
    public ArrayOfConfiguredReadingType getConfiguredReadingTypes() {
        return configuredReadingTypes;
    }

    /**
     * Sets the value of the configuredReadingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConfiguredReadingType }
     *     
     */
    public void setConfiguredReadingTypes(ArrayOfConfiguredReadingType value) {
        this.configuredReadingTypes = value;
    }

}
