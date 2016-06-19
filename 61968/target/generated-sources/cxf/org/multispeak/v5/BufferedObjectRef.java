
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for bufferedObjectRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedObjectRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
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
@XmlType(name = "bufferedObjectRef", propOrder = {
    "objectRef",
    "distance"
})
public class BufferedObjectRef {

    protected ObjectRef objectRef;
    protected Length distance;

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setObjectRef(ObjectRef value) {
        this.objectRef = value;
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
