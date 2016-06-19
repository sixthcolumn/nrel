
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spanGuys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spanGuys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spanGuy" type="{http://www.multispeak.org/V5.0}spanGuy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spanGuys", propOrder = {
    "spanGuy"
})
public class SpanGuys {

    @XmlElement(required = true)
    protected List<SpanGuy> spanGuy;

    /**
     * Gets the value of the spanGuy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spanGuy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpanGuy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpanGuy }
     * 
     * 
     */
    public List<SpanGuy> getSpanGuy() {
        if (spanGuy == null) {
            spanGuy = new ArrayList<SpanGuy>();
        }
        return this.spanGuy;
    }

}
