
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="measurementDeviceType" type="{http://www.multispeak.org/Version_3.0}measurementDeviceType" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_3.0}eaLoc" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCd" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="measurementDeviceStatus" type="{http://www.multispeak.org/Version_3.0}measurementDeviceStatus" minOccurs="0"/>
 *         &lt;element name="pointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "measurementDevice", propOrder = {
    "measurementDeviceType",
    "eaLoc",
    "substation",
    "feeder",
    "phaseCd",
    "measurementDeviceStatus",
    "pointID"
})
public class MeasurementDevice
    extends MspPointObject
{

    protected MeasurementDeviceType measurementDeviceType;
    protected EaLoc eaLoc;
    protected String substation;
    protected String feeder;
    protected PhaseCd phaseCd;
    protected MeasurementDeviceStatus measurementDeviceStatus;
    protected String pointID;

    /**
     * Gets the value of the measurementDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public MeasurementDeviceType getMeasurementDeviceType() {
        return measurementDeviceType;
    }

    /**
     * Sets the value of the measurementDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public void setMeasurementDeviceType(MeasurementDeviceType value) {
        this.measurementDeviceType = value;
    }

    /**
     * Gets the value of the eaLoc property.
     * 
     * @return
     *     possible object is
     *     {@link EaLoc }
     *     
     */
    public EaLoc getEaLoc() {
        return eaLoc;
    }

    /**
     * Sets the value of the eaLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaLoc }
     *     
     */
    public void setEaLoc(EaLoc value) {
        this.eaLoc = value;
    }

    /**
     * Gets the value of the substation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstation() {
        return substation;
    }

    /**
     * Sets the value of the substation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstation(String value) {
        this.substation = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCd(PhaseCd value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the measurementDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceStatus }
     *     
     */
    public MeasurementDeviceStatus getMeasurementDeviceStatus() {
        return measurementDeviceStatus;
    }

    /**
     * Sets the value of the measurementDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceStatus }
     *     
     */
    public void setMeasurementDeviceStatus(MeasurementDeviceStatus value) {
        this.measurementDeviceStatus = value;
    }

    /**
     * Gets the value of the pointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointID() {
        return pointID;
    }

    /**
     * Sets the value of the pointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointID(String value) {
        this.pointID = value;
    }

}
