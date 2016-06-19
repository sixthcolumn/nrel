
package com.epri._2013.dergroups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentActivePower" type="{http://www.epri.com/2013/DERGroups#}ActivePower" minOccurs="0"/>
 *         &lt;element name="currentApparentPower" type="{http://www.epri.com/2013/DERGroups#}ApparentPower" minOccurs="0"/>
 *         &lt;element name="currentReactivePower" type="{http://www.epri.com/2013/DERGroups#}ReactivePower" minOccurs="0"/>
 *         &lt;element name="minActivePower" type="{http://www.epri.com/2013/DERGroups#}ActivePower" minOccurs="0"/>
 *         &lt;element name="minApparentPower" type="{http://www.epri.com/2013/DERGroups#}ApparentPower" minOccurs="0"/>
 *         &lt;element name="minReactivePower" type="{http://www.epri.com/2013/DERGroups#}ReactivePower" minOccurs="0"/>
 *         &lt;element name="maxActivePower" type="{http://www.epri.com/2013/DERGroups#}ActivePower" minOccurs="0"/>
 *         &lt;element name="maxApparentPower" type="{http://www.epri.com/2013/DERGroups#}ApparentPower" minOccurs="0"/>
 *         &lt;element name="maxReactivePower" type="{http://www.epri.com/2013/DERGroups#}ReactivePower" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityList", propOrder = {
    "currentActivePower",
    "currentApparentPower",
    "currentReactivePower",
    "minActivePower",
    "minApparentPower",
    "minReactivePower",
    "maxActivePower",
    "maxApparentPower",
    "maxReactivePower"
})
public class CapabilityList {

    protected ActivePower currentActivePower;
    protected ApparentPower currentApparentPower;
    protected ReactivePower currentReactivePower;
    protected ActivePower minActivePower;
    protected ApparentPower minApparentPower;
    protected ReactivePower minReactivePower;
    protected ActivePower maxActivePower;
    protected ApparentPower maxApparentPower;
    protected ReactivePower maxReactivePower;

    /**
     * Gets the value of the currentActivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getCurrentActivePower() {
        return currentActivePower;
    }

    /**
     * Sets the value of the currentActivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setCurrentActivePower(ActivePower value) {
        this.currentActivePower = value;
    }

    /**
     * Gets the value of the currentApparentPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getCurrentApparentPower() {
        return currentApparentPower;
    }

    /**
     * Sets the value of the currentApparentPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setCurrentApparentPower(ApparentPower value) {
        this.currentApparentPower = value;
    }

    /**
     * Gets the value of the currentReactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getCurrentReactivePower() {
        return currentReactivePower;
    }

    /**
     * Sets the value of the currentReactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setCurrentReactivePower(ReactivePower value) {
        this.currentReactivePower = value;
    }

    /**
     * Gets the value of the minActivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getMinActivePower() {
        return minActivePower;
    }

    /**
     * Sets the value of the minActivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setMinActivePower(ActivePower value) {
        this.minActivePower = value;
    }

    /**
     * Gets the value of the minApparentPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getMinApparentPower() {
        return minApparentPower;
    }

    /**
     * Sets the value of the minApparentPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setMinApparentPower(ApparentPower value) {
        this.minApparentPower = value;
    }

    /**
     * Gets the value of the minReactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMinReactivePower() {
        return minReactivePower;
    }

    /**
     * Sets the value of the minReactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMinReactivePower(ReactivePower value) {
        this.minReactivePower = value;
    }

    /**
     * Gets the value of the maxActivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getMaxActivePower() {
        return maxActivePower;
    }

    /**
     * Sets the value of the maxActivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setMaxActivePower(ActivePower value) {
        this.maxActivePower = value;
    }

    /**
     * Gets the value of the maxApparentPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getMaxApparentPower() {
        return maxApparentPower;
    }

    /**
     * Sets the value of the maxApparentPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setMaxApparentPower(ApparentPower value) {
        this.maxApparentPower = value;
    }

    /**
     * Gets the value of the maxReactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxReactivePower() {
        return maxReactivePower;
    }

    /**
     * Sets the value of the maxReactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxReactivePower(ReactivePower value) {
        this.maxReactivePower = value;
    }

}
