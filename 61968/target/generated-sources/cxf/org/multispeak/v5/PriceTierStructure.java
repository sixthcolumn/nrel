
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for priceTierStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceTierStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="priceTiers" type="{http://www.multispeak.org/V5.0}priceTiers"/>
 *         &lt;element name="priceBins" type="{http://www.multispeak.org/V5.0}priceBins"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceTierStructure", propOrder = {
    "startTime",
    "priceTiers",
    "priceBins"
})
public class PriceTierStructure
    extends MspReferable
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    protected PriceTiers priceTiers;
    @XmlElement(required = true)
    protected PriceBins priceBins;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the priceTiers property.
     * 
     * @return
     *     possible object is
     *     {@link PriceTiers }
     *     
     */
    public PriceTiers getPriceTiers() {
        return priceTiers;
    }

    /**
     * Sets the value of the priceTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTiers }
     *     
     */
    public void setPriceTiers(PriceTiers value) {
        this.priceTiers = value;
    }

    /**
     * Gets the value of the priceBins property.
     * 
     * @return
     *     possible object is
     *     {@link PriceBins }
     *     
     */
    public PriceBins getPriceBins() {
        return priceBins;
    }

    /**
     * Sets the value of the priceBins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceBins }
     *     
     */
    public void setPriceBins(PriceBins value) {
        this.priceBins = value;
    }

}
