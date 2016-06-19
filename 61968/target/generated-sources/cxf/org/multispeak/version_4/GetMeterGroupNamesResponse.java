
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
 *         &lt;element name="GetMeterGroupNamesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString18" minOccurs="0"/>
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
    "getMeterGroupNamesResult"
})
@XmlRootElement(name = "GetMeterGroupNamesResponse")
public class GetMeterGroupNamesResponse {

    @XmlElement(name = "GetMeterGroupNamesResult")
    protected ArrayOfString18 getMeterGroupNamesResult;

    /**
     * Gets the value of the getMeterGroupNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString18 }
     *     
     */
    public ArrayOfString18 getGetMeterGroupNamesResult() {
        return getMeterGroupNamesResult;
    }

    /**
     * Sets the value of the getMeterGroupNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString18 }
     *     
     */
    public void setGetMeterGroupNamesResult(ArrayOfString18 value) {
        this.getMeterGroupNamesResult = value;
    }

}
