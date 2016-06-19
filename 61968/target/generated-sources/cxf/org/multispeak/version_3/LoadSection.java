
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadDistr" type="{http://www.multispeak.org/Version_3.0}loadDistr" minOccurs="0"/>
 *         &lt;element name="loadGrowth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="interruptibleType" type="{http://www.multispeak.org/Version_3.0}loadInterruptibleType" minOccurs="0"/>
 *         &lt;element name="allocated" type="{http://www.multispeak.org/Version_3.0}ArrayOfAllocatedLoad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadSection", propOrder = {
    "loadGroup",
    "loadDesc",
    "loadZone",
    "loadDistr",
    "loadGrowth",
    "interruptibleType",
    "allocated"
})
public class LoadSection {

    protected String loadGroup;
    protected String loadDesc;
    protected String loadZone;
    protected LoadDistr loadDistr;
    protected Float loadGrowth;
    protected LoadInterruptibleType interruptibleType;
    protected ArrayOfAllocatedLoad allocated;

    /**
     * Gets the value of the loadGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadGroup() {
        return loadGroup;
    }

    /**
     * Sets the value of the loadGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadGroup(String value) {
        this.loadGroup = value;
    }

    /**
     * Gets the value of the loadDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadDesc() {
        return loadDesc;
    }

    /**
     * Sets the value of the loadDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadDesc(String value) {
        this.loadDesc = value;
    }

    /**
     * Gets the value of the loadZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadZone() {
        return loadZone;
    }

    /**
     * Sets the value of the loadZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadZone(String value) {
        this.loadZone = value;
    }

    /**
     * Gets the value of the loadDistr property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDistr }
     *     
     */
    public LoadDistr getLoadDistr() {
        return loadDistr;
    }

    /**
     * Sets the value of the loadDistr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDistr }
     *     
     */
    public void setLoadDistr(LoadDistr value) {
        this.loadDistr = value;
    }

    /**
     * Gets the value of the loadGrowth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLoadGrowth() {
        return loadGrowth;
    }

    /**
     * Sets the value of the loadGrowth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLoadGrowth(Float value) {
        this.loadGrowth = value;
    }

    /**
     * Gets the value of the interruptibleType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadInterruptibleType }
     *     
     */
    public LoadInterruptibleType getInterruptibleType() {
        return interruptibleType;
    }

    /**
     * Sets the value of the interruptibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadInterruptibleType }
     *     
     */
    public void setInterruptibleType(LoadInterruptibleType value) {
        this.interruptibleType = value;
    }

    /**
     * Gets the value of the allocated property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllocatedLoad }
     *     
     */
    public ArrayOfAllocatedLoad getAllocated() {
        return allocated;
    }

    /**
     * Sets the value of the allocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllocatedLoad }
     *     
     */
    public void setAllocated(ArrayOfAllocatedLoad value) {
        this.allocated = value;
    }

}
