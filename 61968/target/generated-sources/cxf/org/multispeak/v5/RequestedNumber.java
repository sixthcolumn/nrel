
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.RequestedNumberType;


/**
 * This object enables the exchange of a multipart number like a work order number that might consist of a work order and job number. 
 * 
 * <p>Java class for requestedNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestedNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="primaryNumber" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="secondaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberType" type="{http://www.multispeak.org/V5.0/enumerations}requestedNumberType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedNumber", propOrder = {
    "primaryNumber",
    "secondaryNumber",
    "numberType"
})
public class RequestedNumber
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID primaryNumber;
    protected String secondaryNumber;
    @XmlElement(required = true)
    protected RequestedNumberType numberType;

    /**
     * Gets the value of the primaryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getPrimaryNumber() {
        return primaryNumber;
    }

    /**
     * Sets the value of the primaryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setPrimaryNumber(ObjectID value) {
        this.primaryNumber = value;
    }

    /**
     * Gets the value of the secondaryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryNumber() {
        return secondaryNumber;
    }

    /**
     * Sets the value of the secondaryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryNumber(String value) {
        this.secondaryNumber = value;
    }

    /**
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedNumberType }
     *     
     */
    public RequestedNumberType getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedNumberType }
     *     
     */
    public void setNumberType(RequestedNumberType value) {
        this.numberType = value;
    }

}
