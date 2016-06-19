
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatialFeaturesReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatialFeaturesReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="spatialFeatures" type="{http://www.multispeak.org/V5.0}spatialFeatures"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatialFeaturesReferable", propOrder = {
    "spatialFeatures"
})
public class SpatialFeaturesReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected SpatialFeatures spatialFeatures;

    /**
     * Gets the value of the spatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getSpatialFeatures() {
        return spatialFeatures;
    }

    /**
     * Sets the value of the spatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setSpatialFeatures(SpatialFeatures value) {
        this.spatialFeatures = value;
    }

}
