
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
 *         &lt;element name="GetReadingsByDateResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterReading1" minOccurs="0"/>
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
    "getReadingsByDateResult"
})
@XmlRootElement(name = "GetReadingsByDateResponse")
public class GetReadingsByDateResponse {

    @XmlElement(name = "GetReadingsByDateResult")
    protected ArrayOfMeterReading1 getReadingsByDateResult;

    /**
     * Gets the value of the getReadingsByDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterReading1 }
     *     
     */
    public ArrayOfMeterReading1 getGetReadingsByDateResult() {
        return getReadingsByDateResult;
    }

    /**
     * Sets the value of the getReadingsByDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterReading1 }
     *     
     */
    public void setGetReadingsByDateResult(ArrayOfMeterReading1 value) {
        this.getReadingsByDateResult = value;
    }

}
