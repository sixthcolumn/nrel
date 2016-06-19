
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * PAN control used to issue action/command to PAN
 * 				devices during a demand response/load control event.
 * 			
 * 
 * <p>Java class for PanDemandResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanDemandResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iec.ch/TC57/2011/EndDeviceControls#}EndDeviceAction">
 *       &lt;sequence>
 *         &lt;element name="avgLoadAdjustment" type="{http://iec.ch/TC57/2011/EndDeviceControls#}PerCent" minOccurs="0"/>
 *         &lt;element name="cancelControlMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancelNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coolingOffset" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Temperature" minOccurs="0"/>
 *         &lt;element name="coolingSetpoint" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Temperature" minOccurs="0"/>
 *         &lt;element name="criticalityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dutyCycle" type="{http://iec.ch/TC57/2011/EndDeviceControls#}PerCent" minOccurs="0"/>
 *         &lt;element name="enrollmentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingOffset" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Temperature" minOccurs="0"/>
 *         &lt;element name="heatingSetpoint" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Temperature" minOccurs="0"/>
 *         &lt;element name="appliance" type="{http://iec.ch/TC57/2011/EndDeviceControls#}ControlledAppliance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanDemandResponse", propOrder = {
    "avgLoadAdjustment",
    "cancelControlMode",
    "cancelDateTime",
    "cancelNow",
    "coolingOffset",
    "coolingSetpoint",
    "criticalityLevel",
    "dutyCycle",
    "enrollmentGroup",
    "heatingOffset",
    "heatingSetpoint",
    "appliance"
})
public class PanDemandResponse
    extends EndDeviceAction
{

    protected Float avgLoadAdjustment;
    protected String cancelControlMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDateTime;
    protected Boolean cancelNow;
    protected Float coolingOffset;
    protected Float coolingSetpoint;
    protected String criticalityLevel;
    protected Float dutyCycle;
    protected String enrollmentGroup;
    protected Float heatingOffset;
    protected Float heatingSetpoint;
    protected ControlledAppliance appliance;

    /**
     * Gets the value of the avgLoadAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvgLoadAdjustment() {
        return avgLoadAdjustment;
    }

    /**
     * Sets the value of the avgLoadAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvgLoadAdjustment(Float value) {
        this.avgLoadAdjustment = value;
    }

    /**
     * Gets the value of the cancelControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelControlMode() {
        return cancelControlMode;
    }

    /**
     * Sets the value of the cancelControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelControlMode(String value) {
        this.cancelControlMode = value;
    }

    /**
     * Gets the value of the cancelDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDateTime() {
        return cancelDateTime;
    }

    /**
     * Sets the value of the cancelDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDateTime(XMLGregorianCalendar value) {
        this.cancelDateTime = value;
    }

    /**
     * Gets the value of the cancelNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelNow() {
        return cancelNow;
    }

    /**
     * Sets the value of the cancelNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelNow(Boolean value) {
        this.cancelNow = value;
    }

    /**
     * Gets the value of the coolingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoolingOffset() {
        return coolingOffset;
    }

    /**
     * Sets the value of the coolingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoolingOffset(Float value) {
        this.coolingOffset = value;
    }

    /**
     * Gets the value of the coolingSetpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoolingSetpoint() {
        return coolingSetpoint;
    }

    /**
     * Sets the value of the coolingSetpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoolingSetpoint(Float value) {
        this.coolingSetpoint = value;
    }

    /**
     * Gets the value of the criticalityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriticalityLevel() {
        return criticalityLevel;
    }

    /**
     * Sets the value of the criticalityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriticalityLevel(String value) {
        this.criticalityLevel = value;
    }

    /**
     * Gets the value of the dutyCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDutyCycle() {
        return dutyCycle;
    }

    /**
     * Sets the value of the dutyCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDutyCycle(Float value) {
        this.dutyCycle = value;
    }

    /**
     * Gets the value of the enrollmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentGroup() {
        return enrollmentGroup;
    }

    /**
     * Sets the value of the enrollmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentGroup(String value) {
        this.enrollmentGroup = value;
    }

    /**
     * Gets the value of the heatingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeatingOffset() {
        return heatingOffset;
    }

    /**
     * Sets the value of the heatingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeatingOffset(Float value) {
        this.heatingOffset = value;
    }

    /**
     * Gets the value of the heatingSetpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeatingSetpoint() {
        return heatingSetpoint;
    }

    /**
     * Sets the value of the heatingSetpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeatingSetpoint(Float value) {
        this.heatingSetpoint = value;
    }

    /**
     * Gets the value of the appliance property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledAppliance }
     *     
     */
    public ControlledAppliance getAppliance() {
        return appliance;
    }

    /**
     * Sets the value of the appliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledAppliance }
     *     
     */
    public void setAppliance(ControlledAppliance value) {
        this.appliance = value;
    }

}
