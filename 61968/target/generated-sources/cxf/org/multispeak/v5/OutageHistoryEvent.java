
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.OutageHistoryEventType;


/**
 * <p>Java class for outageHistoryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageHistoryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="outageHistoryEventType" type="{http://www.multispeak.org/V5.0/enumerations}outageHistoryEventType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageHistoryEvent", propOrder = {
    "outageHistoryEventType"
})
public class OutageHistoryEvent
    extends MspEvent
{

    @XmlElement(required = true)
    protected OutageHistoryEventType outageHistoryEventType;

    /**
     * Gets the value of the outageHistoryEventType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageHistoryEventType }
     *     
     */
    public OutageHistoryEventType getOutageHistoryEventType() {
        return outageHistoryEventType;
    }

    /**
     * Sets the value of the outageHistoryEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageHistoryEventType }
     *     
     */
    public void setOutageHistoryEventType(OutageHistoryEventType value) {
        this.outageHistoryEventType = value;
    }

}
