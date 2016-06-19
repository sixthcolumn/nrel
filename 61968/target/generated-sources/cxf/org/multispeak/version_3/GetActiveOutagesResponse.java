
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
 *         &lt;element name="GetActiveOutagesResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfString" minOccurs="0"/>
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
    "getActiveOutagesResult"
})
@XmlRootElement(name = "GetActiveOutagesResponse")
public class GetActiveOutagesResponse {

    @XmlElement(name = "GetActiveOutagesResult")
    protected ArrayOfString getActiveOutagesResult;

    /**
     * Gets the value of the getActiveOutagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetActiveOutagesResult() {
        return getActiveOutagesResult;
    }

    /**
     * Sets the value of the getActiveOutagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetActiveOutagesResult(ArrayOfString value) {
        this.getActiveOutagesResult = value;
    }

}
