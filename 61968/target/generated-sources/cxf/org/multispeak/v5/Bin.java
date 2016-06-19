
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for bin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bin">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="binIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="binName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timePeriods" type="{http://www.multispeak.org/V5.0}timePeriods"/>
 *         &lt;element name="charges" type="{http://www.multispeak.org/V5.0}charges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bin", propOrder = {
    "binIndex",
    "binName",
    "description",
    "timePeriods",
    "charges"
})
public class Bin
    extends MspExtensible
{

    @XmlElement(required = true)
    protected BigInteger binIndex;
    protected String binName;
    protected String description;
    @XmlElement(required = true)
    protected TimePeriods timePeriods;
    protected Charges charges;

    /**
     * Gets the value of the binIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinIndex() {
        return binIndex;
    }

    /**
     * Sets the value of the binIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinIndex(BigInteger value) {
        this.binIndex = value;
    }

    /**
     * Gets the value of the binName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinName() {
        return binName;
    }

    /**
     * Sets the value of the binName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinName(String value) {
        this.binName = value;
    }

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
     * Gets the value of the timePeriods property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriods }
     *     
     */
    public TimePeriods getTimePeriods() {
        return timePeriods;
    }

    /**
     * Sets the value of the timePeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriods }
     *     
     */
    public void setTimePeriods(TimePeriods value) {
        this.timePeriods = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Charges }
     *     
     */
    public Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges }
     *     
     */
    public void setCharges(Charges value) {
        this.charges = value;
    }

}
