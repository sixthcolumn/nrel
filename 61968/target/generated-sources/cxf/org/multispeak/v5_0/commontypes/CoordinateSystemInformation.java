
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordinateSystemInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSUnits" type="{http://www.multispeak.org/V5.0/commonTypes}CSUnits"/>
 *         &lt;element name="CSAuthorities" type="{http://www.multispeak.org/V5.0/commonTypes}CSAuthorities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemInformation", propOrder = {
    "csUnits",
    "csAuthorities"
})
@XmlSeeAlso({
    RequestedCoordinateSystem.class
})
public class CoordinateSystemInformation {

    @XmlElement(name = "CSUnits", required = true)
    protected CSUnits csUnits;
    @XmlElement(name = "CSAuthorities", required = true)
    protected CSAuthorities csAuthorities;

    /**
     * Gets the value of the csUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CSUnits }
     *     
     */
    public CSUnits getCSUnits() {
        return csUnits;
    }

    /**
     * Sets the value of the csUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSUnits }
     *     
     */
    public void setCSUnits(CSUnits value) {
        this.csUnits = value;
    }

    /**
     * Gets the value of the csAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link CSAuthorities }
     *     
     */
    public CSAuthorities getCSAuthorities() {
        return csAuthorities;
    }

    /**
     * Sets the value of the csAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSAuthorities }
     *     
     */
    public void setCSAuthorities(CSAuthorities value) {
        this.csAuthorities = value;
    }

}
