
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.RequestByType;


/**
 * <p>Java class for dateTimeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateTimeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="requestByType" type="{http://www.multispeak.org/V5.0/enumerations}requestByType" minOccurs="0"/>
 *         &lt;element name="requestByValue" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateTimeRequest", propOrder = {
    "requestByType",
    "requestByValue"
})
public class DateTimeRequest
    extends MspExtensible
{

    protected RequestByType requestByType;
    protected XMLGregorianCalendar requestByValue;

    /**
     * Gets the value of the requestByType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestByType }
     *     
     */
    public RequestByType getRequestByType() {
        return requestByType;
    }

    /**
     * Sets the value of the requestByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestByType }
     *     
     */
    public void setRequestByType(RequestByType value) {
        this.requestByType = value;
    }

    /**
     * Gets the value of the requestByValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestByValue() {
        return requestByValue;
    }

    /**
     * Sets the value of the requestByValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestByValue(XMLGregorianCalendar value) {
        this.requestByValue = value;
    }

}
