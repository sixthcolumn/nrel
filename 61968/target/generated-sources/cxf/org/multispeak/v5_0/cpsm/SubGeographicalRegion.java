
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for SubGeographicalRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGeographicalRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="geographicalRegionID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubGeographicalRegion", propOrder = {
    "geographicalRegionID"
})
public class SubGeographicalRegion
    extends MspCIMObject
{

    protected ObjectID geographicalRegionID;

    /**
     * Gets the value of the geographicalRegionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getGeographicalRegionID() {
        return geographicalRegionID;
    }

    /**
     * Sets the value of the geographicalRegionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setGeographicalRegionID(ObjectID value) {
        this.geographicalRegionID = value;
    }

}
