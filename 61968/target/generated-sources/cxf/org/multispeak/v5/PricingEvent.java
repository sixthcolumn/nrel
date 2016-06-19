
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;


/**
 * This is an event by which the DRProgram owner issues pricing information to subscribers who have enrolled in that program.  The timeStamp is the time at which the pricing event is to start.  If the time is not specified, the event is intended to start immediately.
 * 
 * <p>Java class for pricingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pricingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventDuration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="pricingPeriods" type="{http://www.multispeak.org/V5.0}pricingPeriods"/>
 *         &lt;element name="criticality" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricingEvent", propOrder = {
    "eventID",
    "eventDuration",
    "pricingPeriods",
    "criticality",
    "modificationNumber",
    "marketContext"
})
public class PricingEvent
    extends MspEvent
{

    @XmlElement(required = true)
    protected String eventID;
    protected Duration eventDuration;
    @XmlElement(required = true)
    protected PricingPeriods pricingPeriods;
    protected BigInteger criticality;
    protected String modificationNumber;
    protected String marketContext;

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the eventDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEventDuration() {
        return eventDuration;
    }

    /**
     * Sets the value of the eventDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEventDuration(Duration value) {
        this.eventDuration = value;
    }

    /**
     * Gets the value of the pricingPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link PricingPeriods }
     *     
     */
    public PricingPeriods getPricingPeriods() {
        return pricingPeriods;
    }

    /**
     * Sets the value of the pricingPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingPeriods }
     *     
     */
    public void setPricingPeriods(PricingPeriods value) {
        this.pricingPeriods = value;
    }

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCriticality(BigInteger value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationNumber(String value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the marketContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * Sets the value of the marketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

}
