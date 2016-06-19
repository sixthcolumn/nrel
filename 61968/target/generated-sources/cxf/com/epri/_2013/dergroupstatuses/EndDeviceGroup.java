
package com.epri._2013.dergroupstatuses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.epri.com/2013/DERGroupStatuses#}Status"/>
 *         &lt;choice>
 *           &lt;element name="currentActivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ActivePower" minOccurs="0"/>
 *           &lt;element name="currentApparentPower" type="{http://www.epri.com/2013/DERGroupStatuses#}ActivePower" minOccurs="0"/>
 *           &lt;element name="currentReactivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ActivePower" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="maxActivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ActivePower" minOccurs="0"/>
 *           &lt;element name="maxApparentPower" type="{http://www.epri.com/2013/DERGroupStatuses#}ApparentPower" minOccurs="0"/>
 *           &lt;element name="maxReactivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ReactivePower" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="minActivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ActivePower" minOccurs="0"/>
 *           &lt;element name="minApparentPower" type="{http://www.epri.com/2013/DERGroupStatuses#}ApparentPower" minOccurs="0"/>
 *           &lt;element name="minReactivePower" type="{http://www.epri.com/2013/DERGroupStatuses#}ReactivePower" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="mRID" type="{http://www.epri.com/2013/DERGroupStatuses#}mRID" minOccurs="0"/>
 *         &lt;element name="Names" type="{http://www.epri.com/2013/DERGroupStatuses#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherCapabilities" type="{http://www.epri.com/2013/DERGroupStatuses#}otherCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceGroup", propOrder = {
    "status",
    "currentActivePower",
    "currentApparentPower",
    "currentReactivePower",
    "maxActivePower",
    "maxApparentPower",
    "maxReactivePower",
    "minActivePower",
    "minApparentPower",
    "minReactivePower",
    "mrid",
    "names",
    "otherCapabilities"
})
public class EndDeviceGroup {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    protected ActivePower currentActivePower;
    protected ActivePower currentApparentPower;
    protected ActivePower currentReactivePower;
    protected ActivePower maxActivePower;
    protected ApparentPower maxApparentPower;
    protected ReactivePower maxReactivePower;
    protected ActivePower minActivePower;
    protected ApparentPower minApparentPower;
    protected ReactivePower minReactivePower;
    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(name = "Names")
    protected List<Name> names;
    protected OtherCapability otherCapabilities;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

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
     *     {@link ActivePower }
     *     
     */
    public ActivePower getCurrentApparentPower() {
        return currentApparentPower;
    }

    /**
     * Sets the value of the currentApparentPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setCurrentApparentPower(ActivePower value) {
        this.currentApparentPower = value;
    }

    /**
     * Gets the value of the currentReactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getCurrentReactivePower() {
        return currentReactivePower;
    }

    /**
     * Sets the value of the currentReactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setCurrentReactivePower(ActivePower value) {
        this.currentReactivePower = value;
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
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the otherCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCapability }
     *     
     */
    public OtherCapability getOtherCapabilities() {
        return otherCapabilities;
    }

    /**
     * Sets the value of the otherCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCapability }
     *     
     */
    public void setOtherCapabilities(OtherCapability value) {
        this.otherCapabilities = value;
    }

}
