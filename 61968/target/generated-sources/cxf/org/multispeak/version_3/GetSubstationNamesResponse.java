
package org.multispeak.version_3;

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
 *         &lt;element name="GetSubstationNamesResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfString" minOccurs="0"/>
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
    "getSubstationNamesResult"
})
@XmlRootElement(name = "GetSubstationNamesResponse")
public class GetSubstationNamesResponse {

    @XmlElement(name = "GetSubstationNamesResult")
    protected ArrayOfString getSubstationNamesResult;

    /**
     * Gets the value of the getSubstationNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetSubstationNamesResult() {
        return getSubstationNamesResult;
    }

    /**
     * Sets the value of the getSubstationNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetSubstationNamesResult(ArrayOfString value) {
        this.getSubstationNamesResult = value;
    }

}
