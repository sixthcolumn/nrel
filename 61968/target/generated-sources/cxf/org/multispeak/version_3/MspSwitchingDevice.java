
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspSwitchingDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspSwitchingDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.multispeak.org/Version_3.0}position" minOccurs="0"/>
 *         &lt;element name="ratedVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="operVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxContAmp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/Version_3.0}mounting" minOccurs="0"/>
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
@XmlType(name = "mspSwitchingDevice", propOrder = {
    "eaEquipment",
    "facilityID",
    "phase",
    "position",
    "ratedVolt",
    "operVolt",
    "maxContAmp",
    "manufacturer",
    "mounting"
})
@XmlSeeAlso({
    MspOverCurrentDevice.class
})
public class MspSwitchingDevice
    extends MspObject
{

    protected String eaEquipment;
    protected String facilityID;
    protected PhaseCd phase;
    protected Position position;
    protected Float ratedVolt;
    protected Float operVolt;
    protected Float maxContAmp;
    protected String manufacturer;
    protected Mounting mounting;

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
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the ratedVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedVolt() {
        return ratedVolt;
    }

    /**
     * Sets the value of the ratedVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedVolt(Float value) {
        this.ratedVolt = value;
    }

    /**
     * Gets the value of the operVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOperVolt() {
        return operVolt;
    }

    /**
     * Sets the value of the operVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOperVolt(Float value) {
        this.operVolt = value;
    }

    /**
     * Gets the value of the maxContAmp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxContAmp() {
        return maxContAmp;
    }

    /**
     * Sets the value of the maxContAmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxContAmp(Float value) {
        this.maxContAmp = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link Mounting }
     *     
     */
    public Mounting getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mounting }
     *     
     */
    public void setMounting(Mounting value) {
        this.mounting = value;
    }

}
