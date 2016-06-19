
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for linkedTransformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkedTransformer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="unitIDs" type="{http://www.multispeak.org/V5.0}unitIDs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkedTransformer", propOrder = {
    "bankID",
    "unitIDs"
})
public class LinkedTransformer {

    protected ObjectID bankID;
    protected UnitIDs unitIDs;

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setBankID(ObjectID value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the unitIDs property.
     * 
     * @return
     *     possible object is
     *     {@link UnitIDs }
     *     
     */
    public UnitIDs getUnitIDs() {
        return unitIDs;
    }

    /**
     * Sets the value of the unitIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitIDs }
     *     
     */
    public void setUnitIDs(UnitIDs value) {
        this.unitIDs = value;
    }

}
