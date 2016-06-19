
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
 *         &lt;element name="GetLatestReadingByFieldNameResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFormattedBlock" minOccurs="0"/>
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
    "getLatestReadingByFieldNameResult"
})
@XmlRootElement(name = "GetLatestReadingByFieldNameResponse")
public class GetLatestReadingByFieldNameResponse {

    @XmlElement(name = "GetLatestReadingByFieldNameResult")
    protected ArrayOfFormattedBlock getLatestReadingByFieldNameResult;

    /**
     * Gets the value of the getLatestReadingByFieldNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public ArrayOfFormattedBlock getGetLatestReadingByFieldNameResult() {
        return getLatestReadingByFieldNameResult;
    }

    /**
     * Sets the value of the getLatestReadingByFieldNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public void setGetLatestReadingByFieldNameResult(ArrayOfFormattedBlock value) {
        this.getLatestReadingByFieldNameResult = value;
    }

}
