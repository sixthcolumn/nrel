
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.cpsm.ConformLoadSchedule;
import org.multispeak.v5_0.cpsm.NonConformLoadSchedule;


/**
 * These load characteristics are not required for MultiSpeak data exchanges, but are included for CIM compatibility.
 * 
 * <p>Java class for CIMLoadCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMLoadCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conformLoadSchedule" type="{http://www.multispeak.org/V5.0/cpsm}ConformLoadSchedule" minOccurs="0"/>
 *         &lt;element name="nonConformLoadSchedule" type="{http://www.multispeak.org/V5.0/cpsm}NonConformLoadSchedule" minOccurs="0"/>
 *         &lt;element name="feederLoadMgtFactor" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="mVArColdPickUpFactor" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="mWColdPickUpFactor" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="loadAllocationFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subLoadAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMLoadCharacteristics", propOrder = {
    "conformLoadSchedule",
    "nonConformLoadSchedule",
    "feederLoadMgtFactor",
    "mvArColdPickUpFactor",
    "mwColdPickUpFactor",
    "loadAllocationFactor",
    "subLoadAreaID"
})
public class CIMLoadCharacteristics {

    protected ConformLoadSchedule conformLoadSchedule;
    protected NonConformLoadSchedule nonConformLoadSchedule;
    protected Float feederLoadMgtFactor;
    @XmlElement(name = "mVArColdPickUpFactor")
    protected Float mvArColdPickUpFactor;
    @XmlElement(name = "mWColdPickUpFactor")
    protected Float mwColdPickUpFactor;
    protected Float loadAllocationFactor;
    protected ObjectID subLoadAreaID;

    /**
     * Gets the value of the conformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public ConformLoadSchedule getConformLoadSchedule() {
        return conformLoadSchedule;
    }

    /**
     * Sets the value of the conformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public void setConformLoadSchedule(ConformLoadSchedule value) {
        this.conformLoadSchedule = value;
    }

    /**
     * Gets the value of the nonConformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NonConformLoadSchedule }
     *     
     */
    public NonConformLoadSchedule getNonConformLoadSchedule() {
        return nonConformLoadSchedule;
    }

    /**
     * Sets the value of the nonConformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonConformLoadSchedule }
     *     
     */
    public void setNonConformLoadSchedule(NonConformLoadSchedule value) {
        this.nonConformLoadSchedule = value;
    }

    /**
     * Gets the value of the feederLoadMgtFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFeederLoadMgtFactor() {
        return feederLoadMgtFactor;
    }

    /**
     * Sets the value of the feederLoadMgtFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFeederLoadMgtFactor(Float value) {
        this.feederLoadMgtFactor = value;
    }

    /**
     * Gets the value of the mvArColdPickUpFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMVArColdPickUpFactor() {
        return mvArColdPickUpFactor;
    }

    /**
     * Sets the value of the mvArColdPickUpFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMVArColdPickUpFactor(Float value) {
        this.mvArColdPickUpFactor = value;
    }

    /**
     * Gets the value of the mwColdPickUpFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMWColdPickUpFactor() {
        return mwColdPickUpFactor;
    }

    /**
     * Sets the value of the mwColdPickUpFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMWColdPickUpFactor(Float value) {
        this.mwColdPickUpFactor = value;
    }

    /**
     * Gets the value of the loadAllocationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLoadAllocationFactor() {
        return loadAllocationFactor;
    }

    /**
     * Sets the value of the loadAllocationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLoadAllocationFactor(Float value) {
        this.loadAllocationFactor = value;
    }

    /**
     * Gets the value of the subLoadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSubLoadAreaID() {
        return subLoadAreaID;
    }

    /**
     * Sets the value of the subLoadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSubLoadAreaID(ObjectID value) {
        this.subLoadAreaID = value;
    }

}
