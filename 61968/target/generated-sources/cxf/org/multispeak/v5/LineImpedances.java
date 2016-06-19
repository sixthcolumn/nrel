
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Reactance;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Susceptance;


/**
 * This set of values is required in CIM, but is not used in MultiSpeak.
 * 
 * <p>Java class for lineImpedances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineImpedances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bch" type="{http://www.multispeak.org/V5.0/commonTypes}susceptance" minOccurs="0"/>
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
@XmlType(name = "lineImpedances", propOrder = {
    "bch",
    "r",
    "x"
})
public class LineImpedances {

    protected Susceptance bch;
    protected Resistance r;
    protected Reactance x;

    /**
     * Gets the value of the bch property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getBch() {
        return bch;
    }

    /**
     * Sets the value of the bch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setBch(Susceptance value) {
        this.bch = value;
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
