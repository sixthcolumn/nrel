
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
 *         &lt;element name="GetLatestReadingsByMeterIDListIntervalDataResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalData" minOccurs="0"/>
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
    "getLatestReadingsByMeterIDListIntervalDataResult"
})
@XmlRootElement(name = "GetLatestReadingsByMeterIDListIntervalDataResponse")
public class GetLatestReadingsByMeterIDListIntervalDataResponse {

    @XmlElement(name = "GetLatestReadingsByMeterIDListIntervalDataResult")
    protected ArrayOfIntervalData getLatestReadingsByMeterIDListIntervalDataResult;

    /**
     * Gets the value of the getLatestReadingsByMeterIDListIntervalDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public ArrayOfIntervalData getGetLatestReadingsByMeterIDListIntervalDataResult() {
        return getLatestReadingsByMeterIDListIntervalDataResult;
    }

    /**
     * Sets the value of the getLatestReadingsByMeterIDListIntervalDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public void setGetLatestReadingsByMeterIDListIntervalDataResult(ArrayOfIntervalData value) {
        this.getLatestReadingsByMeterIDListIntervalDataResult = value;
    }

}