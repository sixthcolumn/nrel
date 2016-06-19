
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laborCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="retireCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="salvageCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "laborCategory", propOrder = {
    "description",
    "installCost",
    "retireCost",
    "salvageCost"
})
public class LaborCategory
    extends MspObject
{

    protected String description;
    protected Float installCost;
    protected Float retireCost;
    protected Float salvageCost;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the installCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInstallCost() {
        return installCost;
    }

    /**
     * Sets the value of the installCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInstallCost(Float value) {
        this.installCost = value;
    }

    /**
     * Gets the value of the retireCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetireCost() {
        return retireCost;
    }

    /**
     * Sets the value of the retireCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetireCost(Float value) {
        this.retireCost = value;
    }

    /**
     * Gets the value of the salvageCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalvageCost() {
        return salvageCost;
    }

    /**
     * Sets the value of the salvageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalvageCost(Float value) {
        this.salvageCost = value;
    }

}
