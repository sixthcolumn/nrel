
package org.multispeak.v5_0.cpsm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Seconds;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * Mechanism for changing transformer winding tap positions.  It is associated with a winding of a powerTransformer.  The attributes highStep, lowStep, neutralStep, and stepVoltageIncrement are all required for the CPSM profile, regardless of control mode.  If voltage control is possible, the attributes neutralkV and stepVoltageIncrement are also required. If ophase angle control is possible, the attribute stePhaseShiftIncrement is required.
 * 
 * <p>Java class for TapChanger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TapChanger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="regulatingControl" type="{http://www.multispeak.org/V5.0/cpsm}RegulatingControl" minOccurs="0"/>
 *         &lt;element name="voltageBandwidth" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="numberOfSteps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PTRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CTRating" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="ampacity" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="initialDelay" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *         &lt;element name="subsequentDelay" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *         &lt;element name="nativeAttributes" type="{http://www.multispeak.org/V5.0/cpsm}TapChangerNativeAttributes" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TapChanger", propOrder = {
    "regulatingControl",
    "voltageBandwidth",
    "numberOfSteps",
    "ptRatio",
    "ctRating",
    "ampacity",
    "initialDelay",
    "subsequentDelay",
    "nativeAttributes",
    "terminalID"
})
public class TapChanger
    extends ConductingEquipment
{

    protected RegulatingControl regulatingControl;
    protected Voltage voltageBandwidth;
    protected BigInteger numberOfSteps;
    @XmlElement(name = "PTRatio")
    protected Double ptRatio;
    @XmlElement(name = "CTRating")
    protected Current ctRating;
    protected Current ampacity;
    protected Seconds initialDelay;
    protected Seconds subsequentDelay;
    protected TapChangerNativeAttributes nativeAttributes;
    protected ObjectID terminalID;

    /**
     * Gets the value of the regulatingControl property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatingControl }
     *     
     */
    public RegulatingControl getRegulatingControl() {
        return regulatingControl;
    }

    /**
     * Sets the value of the regulatingControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatingControl }
     *     
     */
    public void setRegulatingControl(RegulatingControl value) {
        this.regulatingControl = value;
    }

    /**
     * Gets the value of the voltageBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageBandwidth() {
        return voltageBandwidth;
    }

    /**
     * Sets the value of the voltageBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageBandwidth(Voltage value) {
        this.voltageBandwidth = value;
    }

    /**
     * Gets the value of the numberOfSteps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSteps() {
        return numberOfSteps;
    }

    /**
     * Sets the value of the numberOfSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSteps(BigInteger value) {
        this.numberOfSteps = value;
    }

    /**
     * Gets the value of the ptRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPTRatio() {
        return ptRatio;
    }

    /**
     * Sets the value of the ptRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPTRatio(Double value) {
        this.ptRatio = value;
    }

    /**
     * Gets the value of the ctRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getCTRating() {
        return ctRating;
    }

    /**
     * Sets the value of the ctRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setCTRating(Current value) {
        this.ctRating = value;
    }

    /**
     * Gets the value of the ampacity property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getAmpacity() {
        return ampacity;
    }

    /**
     * Sets the value of the ampacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setAmpacity(Current value) {
        this.ampacity = value;
    }

    /**
     * Gets the value of the initialDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getInitialDelay() {
        return initialDelay;
    }

    /**
     * Sets the value of the initialDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setInitialDelay(Seconds value) {
        this.initialDelay = value;
    }

    /**
     * Gets the value of the subsequentDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getSubsequentDelay() {
        return subsequentDelay;
    }

    /**
     * Sets the value of the subsequentDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setSubsequentDelay(Seconds value) {
        this.subsequentDelay = value;
    }

    /**
     * Gets the value of the nativeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TapChangerNativeAttributes }
     *     
     */
    public TapChangerNativeAttributes getNativeAttributes() {
        return nativeAttributes;
    }

    /**
     * Sets the value of the nativeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapChangerNativeAttributes }
     *     
     */
    public void setNativeAttributes(TapChangerNativeAttributes value) {
        this.nativeAttributes = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTerminalID(ObjectID value) {
        this.terminalID = value;
    }

}
