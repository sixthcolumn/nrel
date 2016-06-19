
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Premises area network addressing group. This group is an ad-hoc collection of PANDevices, PANGroups, PANInterfaces or groups managed by an aggregator.  The PANAddressingGroup is used for addressing messages to PANDevices of all types.
 * 
 * <p>Java class for PANAddressingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANAddressingGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PANGroupIDs" type="{http://www.multispeak.org/V5.0}PANGroupIDs" minOccurs="0"/>
 *         &lt;element name="PANInterfaceIDs" type="{http://www.multispeak.org/V5.0}PANInterfaceIDs" minOccurs="0"/>
 *         &lt;element name="PANDeviceRefs" type="{http://www.multispeak.org/V5.0}PANDeviceRefs" minOccurs="0"/>
 *         &lt;element name="aggregatedGroups" type="{http://www.multispeak.org/V5.0}aggregatedGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANAddressingGroup", propOrder = {
    "name",
    "panGroupIDs",
    "panInterfaceIDs",
    "panDeviceRefs",
    "aggregatedGroups"
})
public class PANAddressingGroup
    extends MspReferable
{

    protected String name;
    @XmlElement(name = "PANGroupIDs")
    protected PANGroupIDs panGroupIDs;
    @XmlElement(name = "PANInterfaceIDs")
    protected PANInterfaceIDs panInterfaceIDs;
    @XmlElement(name = "PANDeviceRefs")
    protected PANDeviceRefs panDeviceRefs;
    protected AggregatedGroups aggregatedGroups;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the panGroupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PANGroupIDs }
     *     
     */
    public PANGroupIDs getPANGroupIDs() {
        return panGroupIDs;
    }

    /**
     * Sets the value of the panGroupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANGroupIDs }
     *     
     */
    public void setPANGroupIDs(PANGroupIDs value) {
        this.panGroupIDs = value;
    }

    /**
     * Gets the value of the panInterfaceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PANInterfaceIDs }
     *     
     */
    public PANInterfaceIDs getPANInterfaceIDs() {
        return panInterfaceIDs;
    }

    /**
     * Sets the value of the panInterfaceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANInterfaceIDs }
     *     
     */
    public void setPANInterfaceIDs(PANInterfaceIDs value) {
        this.panInterfaceIDs = value;
    }

    /**
     * Gets the value of the panDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRefs }
     *     
     */
    public PANDeviceRefs getPANDeviceRefs() {
        return panDeviceRefs;
    }

    /**
     * Sets the value of the panDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRefs }
     *     
     */
    public void setPANDeviceRefs(PANDeviceRefs value) {
        this.panDeviceRefs = value;
    }

    /**
     * Gets the value of the aggregatedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedGroups }
     *     
     */
    public AggregatedGroups getAggregatedGroups() {
        return aggregatedGroups;
    }

    /**
     * Sets the value of the aggregatedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedGroups }
     *     
     */
    public void setAggregatedGroups(AggregatedGroups value) {
        this.aggregatedGroups = value;
    }

}
