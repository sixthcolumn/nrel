
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for constraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constraints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="cantStartUntil" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="mustBeDoneBy" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraints", propOrder = {
    "cantStartUntil",
    "mustBeDoneBy"
})
public class Constraints
    extends MspExtensible
{

    protected XMLGregorianCalendar cantStartUntil;
    protected XMLGregorianCalendar mustBeDoneBy;

    /**
     * Gets the value of the cantStartUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCantStartUntil() {
        return cantStartUntil;
    }

    /**
     * Sets the value of the cantStartUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCantStartUntil(XMLGregorianCalendar value) {
        this.cantStartUntil = value;
    }

    /**
     * Gets the value of the mustBeDoneBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustBeDoneBy() {
        return mustBeDoneBy;
    }

    /**
     * Sets the value of the mustBeDoneBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustBeDoneBy(XMLGregorianCalendar value) {
        this.mustBeDoneBy = value;
    }

}
