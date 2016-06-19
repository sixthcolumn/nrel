
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for coincidentMeterReadingSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coincidentMeterReadingSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="triggeringEvent" type="{http://www.multispeak.org/V5.0}triggeringEvent"/>
 *         &lt;element name="associatedReadingValues" type="{http://www.multispeak.org/V5.0}readingValues"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coincidentMeterReadingSet", propOrder = {
    "triggeringEvent",
    "associatedReadingValues"
})
public class CoincidentMeterReadingSet
    extends MspExtensible
{

    @XmlElement(required = true)
    protected TriggeringEvent triggeringEvent;
    @XmlElement(required = true)
    protected ReadingValues associatedReadingValues;

    /**
     * Gets the value of the triggeringEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeringEvent }
     *     
     */
    public TriggeringEvent getTriggeringEvent() {
        return triggeringEvent;
    }

    /**
     * Sets the value of the triggeringEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeringEvent }
     *     
     */
    public void setTriggeringEvent(TriggeringEvent value) {
        this.triggeringEvent = value;
    }

    /**
     * Gets the value of the associatedReadingValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValues }
     *     
     */
    public ReadingValues getAssociatedReadingValues() {
        return associatedReadingValues;
    }

    /**
     * Sets the value of the associatedReadingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValues }
     *     
     */
    public void setAssociatedReadingValues(ReadingValues value) {
        this.associatedReadingValues = value;
    }

}
