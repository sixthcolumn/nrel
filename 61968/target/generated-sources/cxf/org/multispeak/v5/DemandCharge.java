
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * <p>Java class for demandCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="charge" type="{http://www.multispeak.org/V5.0}charge"/>
 *         &lt;element name="effectivePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="measuringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRatcheted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ratchetPeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandCharge", propOrder = {
    "charge",
    "effectivePeriod",
    "measuringPeriod",
    "isRatcheted",
    "ratchetPeriod"
})
public class DemandCharge
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Charge charge;
    protected TimePeriod effectivePeriod;
    protected String measuringPeriod;
    protected Boolean isRatcheted;
    protected TimePeriod ratchetPeriod;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link Charge }
     *     
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge }
     *     
     */
    public void setCharge(Charge value) {
        this.charge = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setEffectivePeriod(TimePeriod value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the measuringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringPeriod() {
        return measuringPeriod;
    }

    /**
     * Sets the value of the measuringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringPeriod(String value) {
        this.measuringPeriod = value;
    }

    /**
     * Gets the value of the isRatcheted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRatcheted() {
        return isRatcheted;
    }

    /**
     * Sets the value of the isRatcheted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRatcheted(Boolean value) {
        this.isRatcheted = value;
    }

    /**
     * Gets the value of the ratchetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRatchetPeriod() {
        return ratchetPeriod;
    }

    /**
     * Sets the value of the ratchetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRatchetPeriod(TimePeriod value) {
        this.ratchetPeriod = value;
    }

}
