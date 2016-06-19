
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is the second level of consolidation of loads in a load model.  One or moe LoadGroups are contained in a SubLoadArea and one or more SubLoadAreas are contained in a LoadArea.
 * 
 * <p>Java class for SubLoadArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubLoadArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="loadAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "SubLoadArea", propOrder = {
    "loadAreaID"
})
public class SubLoadArea
    extends MspCIMObject
{

    protected ObjectID loadAreaID;

    /**
     * Gets the value of the loadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLoadAreaID() {
        return loadAreaID;
    }

    /**
     * Sets the value of the loadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLoadAreaID(ObjectID value) {
        this.loadAreaID = value;
    }

}
