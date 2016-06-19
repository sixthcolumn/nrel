
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
 *         &lt;element name="GetReadingsByDateAndFieldNameResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFormattedBlock" minOccurs="0"/>
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
    "getReadingsByDateAndFieldNameResult"
})
@XmlRootElement(name = "GetReadingsByDateAndFieldNameResponse")
public class GetReadingsByDateAndFieldNameResponse {

    @XmlElement(name = "GetReadingsByDateAndFieldNameResult")
    protected ArrayOfFormattedBlock getReadingsByDateAndFieldNameResult;

    /**
     * Gets the value of the getReadingsByDateAndFieldNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public ArrayOfFormattedBlock getGetReadingsByDateAndFieldNameResult() {
        return getReadingsByDateAndFieldNameResult;
    }

    /**
     * Sets the value of the getReadingsByDateAndFieldNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public void setGetReadingsByDateAndFieldNameResult(ArrayOfFormattedBlock value) {
        this.getReadingsByDateAndFieldNameResult = value;
    }

}
