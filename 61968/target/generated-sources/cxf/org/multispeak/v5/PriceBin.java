
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * A price-bin is an association between a price tier and a TOU bin. This indicates how time consumed in different bins will be charged.
 * 
 * <p>Java class for priceBin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceBin">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="binIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceBin", propOrder = {
    "binIdentifier",
    "rateIdentifier"
})
public class PriceBin
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String binIdentifier;
    @XmlElement(required = true)
    protected String rateIdentifier;

    /**
     * Gets the value of the binIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinIdentifier() {
        return binIdentifier;
    }

    /**
     * Sets the value of the binIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinIdentifier(String value) {
        this.binIdentifier = value;
    }

    /**
     * Gets the value of the rateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateIdentifier() {
        return rateIdentifier;
    }

    /**
     * Sets the value of the rateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateIdentifier(String value) {
        this.rateIdentifier = value;
    }

}
