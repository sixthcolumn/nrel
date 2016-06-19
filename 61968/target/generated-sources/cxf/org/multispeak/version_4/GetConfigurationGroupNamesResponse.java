
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
 *         &lt;element name="GetConfigurationGroupNamesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
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
    "getConfigurationGroupNamesResult"
})
@XmlRootElement(name = "GetConfigurationGroupNamesResponse")
public class GetConfigurationGroupNamesResponse {

    @XmlElement(name = "GetConfigurationGroupNamesResult")
    protected ArrayOfString getConfigurationGroupNamesResult;

    /**
     * Gets the value of the getConfigurationGroupNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetConfigurationGroupNamesResult() {
        return getConfigurationGroupNamesResult;
    }

    /**
     * Sets the value of the getConfigurationGroupNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetConfigurationGroupNamesResult(ArrayOfString value) {
        this.getConfigurationGroupNamesResult = value;
    }

}
