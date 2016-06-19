
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
 *         &lt;element name="GetUsageByMonthResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfUsage" minOccurs="0"/>
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
    "getUsageByMonthResult"
})
@XmlRootElement(name = "GetUsageByMonthResponse")
public class GetUsageByMonthResponse {

    @XmlElement(name = "GetUsageByMonthResult")
    protected ArrayOfUsage getUsageByMonthResult;

    /**
     * Gets the value of the getUsageByMonthResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUsage }
     *     
     */
    public ArrayOfUsage getGetUsageByMonthResult() {
        return getUsageByMonthResult;
    }

    /**
     * Sets the value of the getUsageByMonthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUsage }
     *     
     */
    public void setGetUsageByMonthResult(ArrayOfUsage value) {
        this.getUsageByMonthResult = value;
    }

}
