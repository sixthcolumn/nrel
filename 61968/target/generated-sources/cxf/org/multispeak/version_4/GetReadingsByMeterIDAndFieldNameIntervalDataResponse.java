
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
 *         &lt;element name="GetReadingsByMeterIDAndFieldNameIntervalDataResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalData" minOccurs="0"/>
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
    "getReadingsByMeterIDAndFieldNameIntervalDataResult"
})
@XmlRootElement(name = "GetReadingsByMeterIDAndFieldNameIntervalDataResponse")
public class GetReadingsByMeterIDAndFieldNameIntervalDataResponse {

    @XmlElement(name = "GetReadingsByMeterIDAndFieldNameIntervalDataResult")
    protected ArrayOfIntervalData getReadingsByMeterIDAndFieldNameIntervalDataResult;

    /**
     * Gets the value of the getReadingsByMeterIDAndFieldNameIntervalDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public ArrayOfIntervalData getGetReadingsByMeterIDAndFieldNameIntervalDataResult() {
        return getReadingsByMeterIDAndFieldNameIntervalDataResult;
    }

    /**
     * Sets the value of the getReadingsByMeterIDAndFieldNameIntervalDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public void setGetReadingsByMeterIDAndFieldNameIntervalDataResult(ArrayOfIntervalData value) {
        this.getReadingsByMeterIDAndFieldNameIntervalDataResult = value;
    }

}
