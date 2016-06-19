
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedXfmrBanks" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTransformerBank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changedXfmrBanks"
})
@XmlRootElement(name = "TransformerBankChangedNotification")
public class TransformerBankChangedNotification {

    protected ArrayOfTransformerBank changedXfmrBanks;

    /**
     * Gets the value of the changedXfmrBanks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformerBank }
     *     
     */
    public ArrayOfTransformerBank getChangedXfmrBanks() {
        return changedXfmrBanks;
    }

    /**
     * Sets the value of the changedXfmrBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformerBank }
     *     
     */
    public void setChangedXfmrBanks(ArrayOfTransformerBank value) {
        this.changedXfmrBanks = value;
    }

}
