
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.WindingConnection;


/**
 * Transformer winding attributes to be used in a transformer engineering equipment catalog entry.
 * 
 * <p>Java class for winding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="winding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="windingNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="emergencyRating" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="insulationBIL" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="phaseShift" type="{http://www.multispeak.org/V5.0/enumerations}clockPosition" minOccurs="0"/>
 *         &lt;element name="windingConnection" type="{http://www.multispeak.org/V5.0/enumerations}windingConnection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "winding", propOrder = {
    "windingNumber",
    "ratedVoltage",
    "ratedPower",
    "emergencyRating",
    "insulationBIL",
    "phaseShift",
    "windingConnection"
})
public class Winding
    extends MspExtensible
{

    protected BigInteger windingNumber;
    protected Voltage ratedVoltage;
    protected ApparentPower ratedPower;
    protected ApparentPower emergencyRating;
    protected Voltage insulationBIL;
    protected String phaseShift;
    protected WindingConnection windingConnection;

    /**
     * Gets the value of the windingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindingNumber() {
        return windingNumber;
    }

    /**
     * Sets the value of the windingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindingNumber(BigInteger value) {
        this.windingNumber = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedPower() {
        return ratedPower;
    }

    /**
     * Sets the value of the ratedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedPower(ApparentPower value) {
        this.ratedPower = value;
    }

    /**
     * Gets the value of the emergencyRating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getEmergencyRating() {
        return emergencyRating;
    }

    /**
     * Sets the value of the emergencyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setEmergencyRating(ApparentPower value) {
        this.emergencyRating = value;
    }

    /**
     * Gets the value of the insulationBIL property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getInsulationBIL() {
        return insulationBIL;
    }

    /**
     * Sets the value of the insulationBIL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setInsulationBIL(Voltage value) {
        this.insulationBIL = value;
    }

    /**
     * Gets the value of the phaseShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseShift() {
        return phaseShift;
    }

    /**
     * Sets the value of the phaseShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseShift(String value) {
        this.phaseShift = value;
    }

    /**
     * Gets the value of the windingConnection property.
     * 
     * @return
     *     possible object is
     *     {@link WindingConnection }
     *     
     */
    public WindingConnection getWindingConnection() {
        return windingConnection;
    }

    /**
     * Sets the value of the windingConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingConnection }
     *     
     */
    public void setWindingConnection(WindingConnection value) {
        this.windingConnection = value;
    }

}
