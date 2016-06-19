
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for customerHazard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerHazard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="customerHazardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerHazardSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazardText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerHazard", propOrder = {
    "customerHazardType",
    "customerHazardSubType",
    "hazardText"
})
public class CustomerHazard
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String customerHazardType;
    protected String customerHazardSubType;
    @XmlElement(required = true)
    protected String hazardText;

    /**
     * Gets the value of the customerHazardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHazardType() {
        return customerHazardType;
    }

    /**
     * Sets the value of the customerHazardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHazardType(String value) {
        this.customerHazardType = value;
    }

    /**
     * Gets the value of the customerHazardSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHazardSubType() {
        return customerHazardSubType;
    }

    /**
     * Sets the value of the customerHazardSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHazardSubType(String value) {
        this.customerHazardSubType = value;
    }

    /**
     * Gets the value of the hazardText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardText() {
        return hazardText;
    }

    /**
     * Sets the value of the hazardText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardText(String value) {
        this.hazardText = value;
    }

}
