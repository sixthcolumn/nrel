
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetLight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streetLight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="lightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wattage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="transformerBankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "streetLight", propOrder = {
    "lightType",
    "wattage",
    "brightness",
    "transformerBankID"
})
public class StreetLight
    extends MspPointObject
{

    protected String lightType;
    protected Long wattage;
    protected Float brightness;
    protected String transformerBankID;

    /**
     * Gets the value of the lightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightType() {
        return lightType;
    }

    /**
     * Sets the value of the lightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightType(String value) {
        this.lightType = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWattage(Long value) {
        this.wattage = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the transformerBankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerBankID() {
        return transformerBankID;
    }

    /**
     * Sets the value of the transformerBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerBankID(String value) {
        this.transformerBankID = value;
    }

}
