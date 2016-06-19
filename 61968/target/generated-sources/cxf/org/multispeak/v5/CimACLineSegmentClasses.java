
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for cimACLineSegmentClasses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cimACLineSegmentClasses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseVoltageID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="LineID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="lineImpedances" type="{http://www.multispeak.org/V5.0}lineImpedances" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cimACLineSegmentClasses", propOrder = {
    "baseVoltageID",
    "lineID",
    "lineImpedances"
})
public class CimACLineSegmentClasses {

    @XmlElement(name = "BaseVoltageID")
    protected ObjectID baseVoltageID;
    @XmlElement(name = "LineID")
    protected ObjectID lineID;
    protected LineImpedances lineImpedances;

    /**
     * Gets the value of the baseVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getBaseVoltageID() {
        return baseVoltageID;
    }

    /**
     * Sets the value of the baseVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setBaseVoltageID(ObjectID value) {
        this.baseVoltageID = value;
    }

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLineID(ObjectID value) {
        this.lineID = value;
    }

    /**
     * Gets the value of the lineImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link LineImpedances }
     *     
     */
    public LineImpedances getLineImpedances() {
        return lineImpedances;
    }

    /**
     * Sets the value of the lineImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineImpedances }
     *     
     */
    public void setLineImpedances(LineImpedances value) {
        this.lineImpedances = value;
    }

}
