
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for meterSeal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterSeal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="sealNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sealColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datePlaced" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterSeal", propOrder = {
    "sealNumber",
    "sealColor",
    "datePlaced"
})
public class MeterSeal
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String sealNumber;
    protected String sealColor;
    protected XMLGregorianCalendar datePlaced;

    /**
     * Gets the value of the sealNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealNumber() {
        return sealNumber;
    }

    /**
     * Sets the value of the sealNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealNumber(String value) {
        this.sealNumber = value;
    }

    /**
     * Gets the value of the sealColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealColor() {
        return sealColor;
    }

    /**
     * Sets the value of the sealColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealColor(String value) {
        this.sealColor = value;
    }

    /**
     * Gets the value of the datePlaced property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePlaced() {
        return datePlaced;
    }

    /**
     * Sets the value of the datePlaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePlaced(XMLGregorianCalendar value) {
        this.datePlaced = value;
    }

}
