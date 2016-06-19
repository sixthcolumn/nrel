
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;


/**
 * <p>Java class for loadCycleTierStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadCycleTierStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="loadManagementDeviceID" type="{http://www.multispeak.org/V5.0}PANDeviceID"/>
 *         &lt;element name="cycleTiers" type="{http://www.multispeak.org/V5.0}cycleTiers"/>
 *         &lt;element name="cyclePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="randomizeStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadCycleTierStructure", propOrder = {
    "loadManagementDeviceID",
    "cycleTiers",
    "cyclePeriod",
    "randomizeStart"
})
public class LoadCycleTierStructure
    extends MspReferable
{

    @XmlElement(required = true)
    protected PANDeviceID loadManagementDeviceID;
    @XmlElement(required = true)
    protected CycleTiers cycleTiers;
    protected Duration cyclePeriod;
    protected Boolean randomizeStart;

    /**
     * Gets the value of the loadManagementDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceID }
     *     
     */
    public PANDeviceID getLoadManagementDeviceID() {
        return loadManagementDeviceID;
    }

    /**
     * Sets the value of the loadManagementDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceID }
     *     
     */
    public void setLoadManagementDeviceID(PANDeviceID value) {
        this.loadManagementDeviceID = value;
    }

    /**
     * Gets the value of the cycleTiers property.
     * 
     * @return
     *     possible object is
     *     {@link CycleTiers }
     *     
     */
    public CycleTiers getCycleTiers() {
        return cycleTiers;
    }

    /**
     * Sets the value of the cycleTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleTiers }
     *     
     */
    public void setCycleTiers(CycleTiers value) {
        this.cycleTiers = value;
    }

    /**
     * Gets the value of the cyclePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCyclePeriod() {
        return cyclePeriod;
    }

    /**
     * Sets the value of the cyclePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCyclePeriod(Duration value) {
        this.cyclePeriod = value;
    }

    /**
     * Gets the value of the randomizeStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandomizeStart() {
        return randomizeStart;
    }

    /**
     * Sets the value of the randomizeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRandomizeStart(Boolean value) {
        this.randomizeStart = value;
    }

}
