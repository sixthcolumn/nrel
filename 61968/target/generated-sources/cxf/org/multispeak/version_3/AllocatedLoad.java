
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allocatedLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allocatedLoad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="kw" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kvar" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="noOfCustomers" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allocatedLoad", propOrder = {
    "phase",
    "kw",
    "kvar",
    "noOfCustomers"
})
public class AllocatedLoad {

    protected PhaseCd phase;
    protected Float kw;
    protected Float kvar;
    protected Float noOfCustomers;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhase(PhaseCd value) {
        this.phase = value;
    }

    /**
     * Gets the value of the kw property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKw() {
        return kw;
    }

    /**
     * Sets the value of the kw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKw(Float value) {
        this.kw = value;
    }

    /**
     * Gets the value of the kvar property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKvar() {
        return kvar;
    }

    /**
     * Sets the value of the kvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKvar(Float value) {
        this.kvar = value;
    }

    /**
     * Gets the value of the noOfCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNoOfCustomers() {
        return noOfCustomers;
    }

    /**
     * Sets the value of the noOfCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNoOfCustomers(Float value) {
        this.noOfCustomers = value;
    }

}
