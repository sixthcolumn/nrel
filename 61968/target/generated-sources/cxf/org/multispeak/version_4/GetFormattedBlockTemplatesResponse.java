
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetFormattedBlockTemplatesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFormattedBlockTemplate" minOccurs="0"/>
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
    "getFormattedBlockTemplatesResult"
})
@XmlRootElement(name = "GetFormattedBlockTemplatesResponse")
public class GetFormattedBlockTemplatesResponse {

    @XmlElement(name = "GetFormattedBlockTemplatesResult")
    protected ArrayOfFormattedBlockTemplate getFormattedBlockTemplatesResult;

    /**
     * Gets the value of the getFormattedBlockTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedBlockTemplate }
     *     
     */
    public ArrayOfFormattedBlockTemplate getGetFormattedBlockTemplatesResult() {
        return getFormattedBlockTemplatesResult;
    }

    /**
     * Sets the value of the getFormattedBlockTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedBlockTemplate }
     *     
     */
    public void setGetFormattedBlockTemplatesResult(ArrayOfFormattedBlockTemplate value) {
        this.getFormattedBlockTemplatesResult = value;
    }

}
