
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageReasonItem" type="{http://www.multispeak.org/V5.0}outageReasonItem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReasonReferable", propOrder = {
    "outageReasonItem"
})
public class OutageReasonReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected OutageReasonItem outageReasonItem;

    /**
     * Gets the value of the outageReasonItem property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonItem }
     *     
     */
    public OutageReasonItem getOutageReasonItem() {
        return outageReasonItem;
    }

    /**
     * Sets the value of the outageReasonItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonItem }
     *     
     */
    public void setOutageReasonItem(OutageReasonItem value) {
        this.outageReasonItem = value;
    }

}
