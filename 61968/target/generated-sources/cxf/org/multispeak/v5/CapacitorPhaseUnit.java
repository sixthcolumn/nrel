
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * Grouping of capacitor units that make up one phase of a capacitorBank.
 * 
 * <p>Java class for capacitorPhaseUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorPhaseUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="reactiveRating" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="reactivePerSection" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="maximumSections" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="normalSections" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="capacitors" type="{http://www.multispeak.org/V5.0}capacitors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitorPhaseUnit", propOrder = {
    "phaseCode",
    "reactiveRating",
    "reactivePerSection",
    "maximumSections",
    "normalSections",
    "capacitors"
})
public class CapacitorPhaseUnit
    extends MspExtensible
{

    protected PhaseCode phaseCode;
    protected ReactivePower reactiveRating;
    protected ReactivePower reactivePerSection;
    protected BigInteger maximumSections;
    protected BigInteger normalSections;
    protected Capacitors capacitors;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the reactiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactiveRating() {
        return reactiveRating;
    }

    /**
     * Sets the value of the reactiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactiveRating(ReactivePower value) {
        this.reactiveRating = value;
    }

    /**
     * Gets the value of the reactivePerSection property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePerSection() {
        return reactivePerSection;
    }

    /**
     * Sets the value of the reactivePerSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePerSection(ReactivePower value) {
        this.reactivePerSection = value;
    }

    /**
     * Gets the value of the maximumSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumSections() {
        return maximumSections;
    }

    /**
     * Sets the value of the maximumSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumSections(BigInteger value) {
        this.maximumSections = value;
    }

    /**
     * Gets the value of the normalSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNormalSections() {
        return normalSections;
    }

    /**
     * Sets the value of the normalSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNormalSections(BigInteger value) {
        this.normalSections = value;
    }

    /**
     * Gets the value of the capacitors property.
     * 
     * @return
     *     possible object is
     *     {@link Capacitors }
     *     
     */
    public Capacitors getCapacitors() {
        return capacitors;
    }

    /**
     * Sets the value of the capacitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capacitors }
     *     
     */
    public void setCapacitors(Capacitors value) {
        this.capacitors = value;
    }

}
