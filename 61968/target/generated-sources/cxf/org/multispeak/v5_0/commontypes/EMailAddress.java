
package org.multispeak.v5_0.commontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.EMailType;


/**
 * <p>Java class for eMailAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eMailAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eMailType" type="{http://www.multispeak.org/V5.0/enumerations}eMailType" minOccurs="0"/>
 *         &lt;element name="priorityOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eMailAddress", propOrder = {
    "eMail",
    "eMailType",
    "priorityOrder"
})
public class EMailAddress
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String eMail;
    protected EMailType eMailType;
    protected BigInteger priorityOrder;

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the eMailType property.
     * 
     * @return
     *     possible object is
     *     {@link EMailType }
     *     
     */
    public EMailType getEMailType() {
        return eMailType;
    }

    /**
     * Sets the value of the eMailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailType }
     *     
     */
    public void setEMailType(EMailType value) {
        this.eMailType = value;
    }

    /**
     * Gets the value of the priorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * Sets the value of the priorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityOrder(BigInteger value) {
        this.priorityOrder = value;
    }

}
