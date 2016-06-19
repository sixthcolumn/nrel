
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
 *         &lt;element name="GetIHDGroupNamesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString18" minOccurs="0"/>
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
    "getIHDGroupNamesResult"
})
@XmlRootElement(name = "GetIHDGroupNamesResponse")
public class GetIHDGroupNamesResponse {

    @XmlElement(name = "GetIHDGroupNamesResult")
    protected ArrayOfString18 getIHDGroupNamesResult;

    /**
     * Gets the value of the getIHDGroupNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString18 }
     *     
     */
    public ArrayOfString18 getGetIHDGroupNamesResult() {
        return getIHDGroupNamesResult;
    }

    /**
     * Sets the value of the getIHDGroupNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString18 }
     *     
     */
    public void setGetIHDGroupNamesResult(ArrayOfString18 value) {
        this.getIHDGroupNamesResult = value;
    }

}
