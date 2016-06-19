
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="bankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitList" type="{http://www.multispeak.org/Version_3.0}linkedTransformerUnitList" minOccurs="0"/>
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
    "unitList"
})
public class LinkedTransformer {

    protected String bankID;
    protected LinkedTransformerUnitList unitList;

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the unitList property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedTransformerUnitList }
     *     
     */
    public LinkedTransformerUnitList getUnitList() {
        return unitList;
    }

    /**
     * Sets the value of the unitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedTransformerUnitList }
     *     
     */
    public void setUnitList(LinkedTransformerUnitList value) {
        this.unitList = value;
    }

}
