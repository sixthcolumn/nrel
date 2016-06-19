
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;


/**
 * <p>Java class for bufferedCircuitElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedCircuitElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="circuitElement" type="{http://www.multispeak.org/V5.0}circuitElement"/>
 *         &lt;element name="distance" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bufferedCircuitElement", propOrder = {
    "circuitElement",
    "distance"
})
public class BufferedCircuitElement {

    @XmlElement(required = true)
    protected CircuitElement circuitElement;
    protected Length distance;

    /**
     * Gets the value of the circuitElement property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElement }
     *     
     */
    public CircuitElement getCircuitElement() {
        return circuitElement;
    }

    /**
     * Sets the value of the circuitElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElement }
     *     
     */
    public void setCircuitElement(CircuitElement value) {
        this.circuitElement = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setDistance(Length value) {
        this.distance = value;
    }

}
