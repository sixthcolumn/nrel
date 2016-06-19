
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vOut" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ldcR" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ldcX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fhHi" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fhLo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}mspPhase" minOccurs="0"/>
 *         &lt;element name="kva" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regulator", propOrder = {
    "eaEquipment",
    "vOut",
    "ldcR",
    "ldcX",
    "fhHi",
    "fhLo",
    "phase",
    "kva"
})
public class Regulator
    extends MspObject
{

    protected String eaEquipment;
    protected Float vOut;
    protected Float ldcR;
    protected Float ldcX;
    protected Float fhHi;
    protected Float fhLo;
    protected MspPhase phase;
    protected Float kva;

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEaEquipment(String value) {
        this.eaEquipment = value;
    }

    /**
     * Gets the value of the vOut property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVOut() {
        return vOut;
    }

    /**
     * Sets the value of the vOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVOut(Float value) {
        this.vOut = value;
    }

    /**
     * Gets the value of the ldcR property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLdcR() {
        return ldcR;
    }

    /**
     * Sets the value of the ldcR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLdcR(Float value) {
        this.ldcR = value;
    }

    /**
     * Gets the value of the ldcX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLdcX() {
        return ldcX;
    }

    /**
     * Sets the value of the ldcX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLdcX(Float value) {
        this.ldcX = value;
    }

    /**
     * Gets the value of the fhHi property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFhHi() {
        return fhHi;
    }

    /**
     * Sets the value of the fhHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFhHi(Float value) {
        this.fhHi = value;
    }

    /**
     * Gets the value of the fhLo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFhLo() {
        return fhLo;
    }

    /**
     * Sets the value of the fhLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFhLo(Float value) {
        this.fhLo = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhase(MspPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the kva property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKva() {
        return kva;
    }

    /**
     * Sets the value of the kva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKva(Float value) {
        this.kva = value;
    }

}
