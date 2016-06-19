
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for ConformLoadGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConformLoadGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="conformLoadSchedule" type="{http://www.multispeak.org/V5.0/cpsm}ConformLoadSchedule" minOccurs="0"/>
 *         &lt;element name="subLoadAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "ConformLoadGroup", propOrder = {
    "conformLoadSchedule",
    "subLoadAreaID"
})
public class ConformLoadGroup
    extends MspCIMObject
{

    protected ConformLoadSchedule conformLoadSchedule;
    protected ObjectID subLoadAreaID;

    /**
     * Gets the value of the conformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public ConformLoadSchedule getConformLoadSchedule() {
        return conformLoadSchedule;
    }

    /**
     * Sets the value of the conformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public void setConformLoadSchedule(ConformLoadSchedule value) {
        this.conformLoadSchedule = value;
    }

    /**
     * Gets the value of the subLoadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSubLoadAreaID() {
        return subLoadAreaID;
    }

    /**
     * Sets the value of the subLoadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSubLoadAreaID(ObjectID value) {
        this.subLoadAreaID = value;
    }

}
