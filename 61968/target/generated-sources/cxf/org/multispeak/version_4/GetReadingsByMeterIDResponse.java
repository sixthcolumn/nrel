
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
 *         &lt;element name="GetReadingsByMeterIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterReading1" minOccurs="0"/>
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
    "getReadingsByMeterIDResult"
})
@XmlRootElement(name = "GetReadingsByMeterIDResponse")
public class GetReadingsByMeterIDResponse {

    @XmlElement(name = "GetReadingsByMeterIDResult")
    protected ArrayOfMeterReading1 getReadingsByMeterIDResult;

    /**
     * Gets the value of the getReadingsByMeterIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterReading1 }
     *     
     */
    public ArrayOfMeterReading1 getGetReadingsByMeterIDResult() {
        return getReadingsByMeterIDResult;
    }

    /**
     * Sets the value of the getReadingsByMeterIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterReading1 }
     *     
     */
    public void setGetReadingsByMeterIDResult(ArrayOfMeterReading1 value) {
        this.getReadingsByMeterIDResult = value;
    }

}
