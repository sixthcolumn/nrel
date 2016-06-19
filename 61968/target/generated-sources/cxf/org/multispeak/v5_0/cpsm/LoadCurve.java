
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * A curve relating  power versus time. showing the values of a specific load for each unit of the period covered. The  curve can be based on "absolute" time or on "normalized' time. An instance of this curve could represent the absolute area load forecast. An other instance could represent a normalized daily load curve for a particular day type.
 * 
 * <p>Java class for LoadCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}RegularIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="season" type="{http://www.multispeak.org/V5.0/cpsm}Season" minOccurs="0"/>
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
@XmlType(name = "LoadCurve", propOrder = {
    "season",
    "subLoadAreaID"
})
public class LoadCurve
    extends RegularIntervalSchedule
{

    protected Season season;
    protected ObjectID subLoadAreaID;

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeason(Season value) {
        this.season = value;
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
