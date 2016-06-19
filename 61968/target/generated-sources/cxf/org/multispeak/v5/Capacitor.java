
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Frequency;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * An individual capacitor unit.  Such a unit might be tracked individually as an asset, if so, the asset information SHOULD be populated.  If the details of the individual capacitor units is not important for a specific interface, the asset information SHOULD be omitted.
 * 
 * <p>Java class for capacitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="unitRating" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="unitRatedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="BIL" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedFrequency" type="{http://www.multispeak.org/V5.0/commonTypes}frequency" minOccurs="0"/>
 *         &lt;element name="numberOfBushings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="capacitorBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "capacitor", propOrder = {
    "unitRating",
    "unitRatedVoltage",
    "bil",
    "ratedFrequency",
    "numberOfBushings",
    "materialManagementAssemblyID",
    "capacitorBankID"
})
public class Capacitor
    extends MspAsset
{

    protected ReactivePower unitRating;
    protected Voltage unitRatedVoltage;
    @XmlElement(name = "BIL")
    protected Voltage bil;
    protected Frequency ratedFrequency;
    protected BigInteger numberOfBushings;
    protected ObjectID materialManagementAssemblyID;
    protected ObjectID capacitorBankID;

    /**
     * Gets the value of the unitRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getUnitRating() {
        return unitRating;
    }

    /**
     * Sets the value of the unitRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setUnitRating(ReactivePower value) {
        this.unitRating = value;
    }

    /**
     * Gets the value of the unitRatedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getUnitRatedVoltage() {
        return unitRatedVoltage;
    }

    /**
     * Sets the value of the unitRatedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setUnitRatedVoltage(Voltage value) {
        this.unitRatedVoltage = value;
    }

    /**
     * Gets the value of the bil property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBIL() {
        return bil;
    }

    /**
     * Sets the value of the bil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBIL(Voltage value) {
        this.bil = value;
    }

    /**
     * Gets the value of the ratedFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getRatedFrequency() {
        return ratedFrequency;
    }

    /**
     * Sets the value of the ratedFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setRatedFrequency(Frequency value) {
        this.ratedFrequency = value;
    }

    /**
     * Gets the value of the numberOfBushings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBushings() {
        return numberOfBushings;
    }

    /**
     * Sets the value of the numberOfBushings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBushings(BigInteger value) {
        this.numberOfBushings = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

    /**
     * Gets the value of the capacitorBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCapacitorBankID() {
        return capacitorBankID;
    }

    /**
     * Sets the value of the capacitorBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCapacitorBankID(ObjectID value) {
        this.capacitorBankID = value;
    }

}
