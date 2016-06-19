
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.Reactance;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Susceptance;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * <p>Java class for WindingNativeAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindingNativeAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratedV" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedS" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="windingType" type="{http://www.multispeak.org/V5.0/cpsm}WindingType" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.multispeak.org/V5.0/commonTypes}susceptance" minOccurs="0"/>
 *         &lt;element name="r" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.multispeak.org/V5.0/commonTypes}reactance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindingNativeAttributes", propOrder = {
    "ratedV",
    "ratedS",
    "windingType",
    "b",
    "r",
    "x"
})
public class WindingNativeAttributes {

    protected Voltage ratedV;
    protected ApparentPower ratedS;
    protected WindingType windingType;
    protected Susceptance b;
    protected Resistance r;
    protected Reactance x;

    /**
     * Gets the value of the ratedV property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedV() {
        return ratedV;
    }

    /**
     * Sets the value of the ratedV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedV(Voltage value) {
        this.ratedV = value;
    }

    /**
     * Gets the value of the ratedS property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedS() {
        return ratedS;
    }

    /**
     * Sets the value of the ratedS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedS(ApparentPower value) {
        this.ratedS = value;
    }

    /**
     * Gets the value of the windingType property.
     * 
     * @return
     *     possible object is
     *     {@link WindingType }
     *     
     */
    public WindingType getWindingType() {
        return windingType;
    }

    /**
     * Sets the value of the windingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingType }
     *     
     */
    public void setWindingType(WindingType value) {
        this.windingType = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setB(Susceptance value) {
        this.b = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setR(Resistance value) {
        this.r = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setX(Reactance value) {
        this.x = value;
    }

}
