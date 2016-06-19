
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downGuys" type="{http://www.multispeak.org/V5.0}downGuys" minOccurs="0"/>
 *         &lt;element name="spanGuys" type="{http://www.multispeak.org/V5.0}spanGuys" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guys", propOrder = {
    "downGuys",
    "spanGuys"
})
public class Guys {

    protected DownGuys downGuys;
    protected SpanGuys spanGuys;

    /**
     * Gets the value of the downGuys property.
     * 
     * @return
     *     possible object is
     *     {@link DownGuys }
     *     
     */
    public DownGuys getDownGuys() {
        return downGuys;
    }

    /**
     * Sets the value of the downGuys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownGuys }
     *     
     */
    public void setDownGuys(DownGuys value) {
        this.downGuys = value;
    }

    /**
     * Gets the value of the spanGuys property.
     * 
     * @return
     *     possible object is
     *     {@link SpanGuys }
     *     
     */
    public SpanGuys getSpanGuys() {
        return spanGuys;
    }

    /**
     * Sets the value of the spanGuys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpanGuys }
     *     
     */
    public void setSpanGuys(SpanGuys value) {
        this.spanGuys = value;
    }

}
