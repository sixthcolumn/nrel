
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electricLineID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="lineConstructionType" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="hCoordinate" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuit", propOrder = {
    "electricLineID",
    "lineConstructionType",
    "hCoordinate"
})
public class Circuit {

    protected ObjectRef electricLineID;
    protected EaEquipID lineConstructionType;
    protected Length hCoordinate;

    /**
     * Gets the value of the electricLineID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getElectricLineID() {
        return electricLineID;
    }

    /**
     * Sets the value of the electricLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setElectricLineID(ObjectRef value) {
        this.electricLineID = value;
    }

    /**
     * Gets the value of the lineConstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getLineConstructionType() {
        return lineConstructionType;
    }

    /**
     * Sets the value of the lineConstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setLineConstructionType(EaEquipID value) {
        this.lineConstructionType = value;
    }

    /**
     * Gets the value of the hCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getHCoordinate() {
        return hCoordinate;
    }

    /**
     * Sets the value of the hCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setHCoordinate(Length value) {
        this.hCoordinate = value;
    }

}
