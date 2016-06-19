
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageReasonItems" type="{http://www.multispeak.org/V5.0}outageReasonItems"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReasonList", propOrder = {
    "outageReasonItems"
})
public class OutageReasonList
    extends MspReferable
{

    @XmlElement(required = true)
    protected OutageReasonItems outageReasonItems;

    /**
     * Gets the value of the outageReasonItems property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonItems }
     *     
     */
    public OutageReasonItems getOutageReasonItems() {
        return outageReasonItems;
    }

    /**
     * Sets the value of the outageReasonItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonItems }
     *     
     */
    public void setOutageReasonItems(OutageReasonItems value) {
        this.outageReasonItems = value;
    }

}
