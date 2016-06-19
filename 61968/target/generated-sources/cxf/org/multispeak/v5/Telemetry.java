
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.Odometer;
import org.multispeak.v5_0.commontypes.Speed;
import org.multispeak.v5_0.enumerations.IgnitionState;
import org.multispeak.v5_0.enumerations.PTOState;


/**
 * Vehicle-specific telemetry.
 * 
 * <p>Java class for telemetry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telemetry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="speed" type="{http://www.multispeak.org/V5.0/commonTypes}speed" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cardinalHeading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometer" type="{http://www.multispeak.org/V5.0/commonTypes}odometer" minOccurs="0"/>
 *         &lt;element name="maxVehSpeedLastReading" type="{http://www.multispeak.org/V5.0/commonTypes}speed" minOccurs="0"/>
 *         &lt;element name="maxEngineSpeedLastReading" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ignitionState" type="{http://www.multispeak.org/V5.0/enumerations}ignitionState" minOccurs="0"/>
 *         &lt;element name="gearShiftPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTOState" type="{http://www.multispeak.org/V5.0/enumerations}PTOState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetry", propOrder = {
    "speed",
    "heading",
    "cardinalHeading",
    "odometer",
    "maxVehSpeedLastReading",
    "maxEngineSpeedLastReading",
    "ignitionState",
    "gearShiftPosition",
    "ptoState"
})
public class Telemetry
    extends MspExtensible
{

    protected Speed speed;
    protected Float heading;
    protected String cardinalHeading;
    protected Odometer odometer;
    protected Speed maxVehSpeedLastReading;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxEngineSpeedLastReading;
    protected IgnitionState ignitionState;
    protected String gearShiftPosition;
    @XmlElement(name = "PTOState")
    protected PTOState ptoState;

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Speed }
     *     
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speed }
     *     
     */
    public void setSpeed(Speed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeading(Float value) {
        this.heading = value;
    }

    /**
     * Gets the value of the cardinalHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalHeading() {
        return cardinalHeading;
    }

    /**
     * Sets the value of the cardinalHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalHeading(String value) {
        this.cardinalHeading = value;
    }

    /**
     * Gets the value of the odometer property.
     * 
     * @return
     *     possible object is
     *     {@link Odometer }
     *     
     */
    public Odometer getOdometer() {
        return odometer;
    }

    /**
     * Sets the value of the odometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Odometer }
     *     
     */
    public void setOdometer(Odometer value) {
        this.odometer = value;
    }

    /**
     * Gets the value of the maxVehSpeedLastReading property.
     * 
     * @return
     *     possible object is
     *     {@link Speed }
     *     
     */
    public Speed getMaxVehSpeedLastReading() {
        return maxVehSpeedLastReading;
    }

    /**
     * Sets the value of the maxVehSpeedLastReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speed }
     *     
     */
    public void setMaxVehSpeedLastReading(Speed value) {
        this.maxVehSpeedLastReading = value;
    }

    /**
     * Gets the value of the maxEngineSpeedLastReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxEngineSpeedLastReading() {
        return maxEngineSpeedLastReading;
    }

    /**
     * Sets the value of the maxEngineSpeedLastReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxEngineSpeedLastReading(BigInteger value) {
        this.maxEngineSpeedLastReading = value;
    }

    /**
     * Gets the value of the ignitionState property.
     * 
     * @return
     *     possible object is
     *     {@link IgnitionState }
     *     
     */
    public IgnitionState getIgnitionState() {
        return ignitionState;
    }

    /**
     * Sets the value of the ignitionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IgnitionState }
     *     
     */
    public void setIgnitionState(IgnitionState value) {
        this.ignitionState = value;
    }

    /**
     * Gets the value of the gearShiftPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearShiftPosition() {
        return gearShiftPosition;
    }

    /**
     * Sets the value of the gearShiftPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearShiftPosition(String value) {
        this.gearShiftPosition = value;
    }

    /**
     * Gets the value of the ptoState property.
     * 
     * @return
     *     possible object is
     *     {@link PTOState }
     *     
     */
    public PTOState getPTOState() {
        return ptoState;
    }

    /**
     * Sets the value of the ptoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTOState }
     *     
     */
    public void setPTOState(PTOState value) {
        this.ptoState = value;
    }

}