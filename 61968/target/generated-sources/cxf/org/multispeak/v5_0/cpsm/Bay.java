
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * Bay is an optional element that can be used to group devices in a substation.  Each bay has a string identifier (objectID) that is unique over the domain of all substation bays. 
 * 
 * <p>Java class for Bay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}EquipmentContainer">
 *       &lt;sequence>
 *         &lt;element name="breakerConfiguration" type="{http://www.multispeak.org/V5.0/cpsm}BreakerConfiguration" minOccurs="0"/>
 *         &lt;element name="busbarConfiguration" type="{http://www.multispeak.org/V5.0/cpsm}BusbarConfiguration" minOccurs="0"/>
 *         &lt;element name="voltageLevelID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "Bay", propOrder = {
    "breakerConfiguration",
    "busbarConfiguration",
    "voltageLevelID"
})
public class Bay
    extends EquipmentContainer
{

    protected BreakerConfiguration breakerConfiguration;
    protected BusbarConfiguration busbarConfiguration;
    protected ObjectID voltageLevelID;

    /**
     * Gets the value of the breakerConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BreakerConfiguration }
     *     
     */
    public BreakerConfiguration getBreakerConfiguration() {
        return breakerConfiguration;
    }

    /**
     * Sets the value of the breakerConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakerConfiguration }
     *     
     */
    public void setBreakerConfiguration(BreakerConfiguration value) {
        this.breakerConfiguration = value;
    }

    /**
     * Gets the value of the busbarConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BusbarConfiguration }
     *     
     */
    public BusbarConfiguration getBusbarConfiguration() {
        return busbarConfiguration;
    }

    /**
     * Sets the value of the busbarConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusbarConfiguration }
     *     
     */
    public void setBusbarConfiguration(BusbarConfiguration value) {
        this.busbarConfiguration = value;
    }

    /**
     * Gets the value of the voltageLevelID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getVoltageLevelID() {
        return voltageLevelID;
    }

    /**
     * Sets the value of the voltageLevelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setVoltageLevelID(ObjectID value) {
        this.voltageLevelID = value;
    }

}
