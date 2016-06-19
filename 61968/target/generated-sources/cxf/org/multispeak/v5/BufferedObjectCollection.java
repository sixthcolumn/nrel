
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the payload for the GetFeaturesNearLatLong method. It is possible to return features, object references or circuit elements depending on what is being requested by the client.
 * 
 * <p>Java class for bufferedObjectCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedObjectCollection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="physicalObjectList" type="{http://www.multispeak.org/V5.0}spatialFeatures" minOccurs="0"/>
 *         &lt;element name="bufferedObjectRefs" type="{http://www.multispeak.org/V5.0}bufferedObjectRefs" minOccurs="0"/>
 *         &lt;element name="bufferedPoint" type="{http://www.multispeak.org/V5.0}bufferedPoint"/>
 *         &lt;element name="bufferedCircuitElements" type="{http://www.multispeak.org/V5.0}bufferedCircuitElements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bufferedObjectCollection", propOrder = {
    "physicalObjectList",
    "bufferedObjectRefs",
    "bufferedPoint",
    "bufferedCircuitElements"
})
public class BufferedObjectCollection
    extends MspReferable
{

    protected SpatialFeatures physicalObjectList;
    protected BufferedObjectRefs bufferedObjectRefs;
    @XmlElement(required = true)
    protected BufferedPoint bufferedPoint;
    protected BufferedCircuitElements bufferedCircuitElements;

    /**
     * Gets the value of the physicalObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getPhysicalObjectList() {
        return physicalObjectList;
    }

    /**
     * Sets the value of the physicalObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setPhysicalObjectList(SpatialFeatures value) {
        this.physicalObjectList = value;
    }

    /**
     * Gets the value of the bufferedObjectRefs property.
     * 
     * @return
     *     possible object is
     *     {@link BufferedObjectRefs }
     *     
     */
    public BufferedObjectRefs getBufferedObjectRefs() {
        return bufferedObjectRefs;
    }

    /**
     * Sets the value of the bufferedObjectRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferedObjectRefs }
     *     
     */
    public void setBufferedObjectRefs(BufferedObjectRefs value) {
        this.bufferedObjectRefs = value;
    }

    /**
     * Gets the value of the bufferedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BufferedPoint }
     *     
     */
    public BufferedPoint getBufferedPoint() {
        return bufferedPoint;
    }

    /**
     * Sets the value of the bufferedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferedPoint }
     *     
     */
    public void setBufferedPoint(BufferedPoint value) {
        this.bufferedPoint = value;
    }

    /**
     * Gets the value of the bufferedCircuitElements property.
     * 
     * @return
     *     possible object is
     *     {@link BufferedCircuitElements }
     *     
     */
    public BufferedCircuitElements getBufferedCircuitElements() {
        return bufferedCircuitElements;
    }

    /**
     * Sets the value of the bufferedCircuitElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferedCircuitElements }
     *     
     */
    public void setBufferedCircuitElements(BufferedCircuitElements value) {
        this.bufferedCircuitElements = value;
    }

}
