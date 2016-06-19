
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
 *         &lt;element name="GetLatestMeterReadingsByMeterGroupIntervalDataResult" type="{http://www.multispeak.org/Version_4.1_Release}intervalData" minOccurs="0"/>
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
    "getLatestMeterReadingsByMeterGroupIntervalDataResult"
})
@XmlRootElement(name = "GetLatestMeterReadingsByMeterGroupIntervalDataResponse")
public class GetLatestMeterReadingsByMeterGroupIntervalDataResponse {

    @XmlElement(name = "GetLatestMeterReadingsByMeterGroupIntervalDataResult")
    protected IntervalData getLatestMeterReadingsByMeterGroupIntervalDataResult;

    /**
     * Gets the value of the getLatestMeterReadingsByMeterGroupIntervalDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalData }
     *     
     */
    public IntervalData getGetLatestMeterReadingsByMeterGroupIntervalDataResult() {
        return getLatestMeterReadingsByMeterGroupIntervalDataResult;
    }

    /**
     * Sets the value of the getLatestMeterReadingsByMeterGroupIntervalDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalData }
     *     
     */
    public void setGetLatestMeterReadingsByMeterGroupIntervalDataResult(IntervalData value) {
        this.getLatestMeterReadingsByMeterGroupIntervalDataResult = value;
    }

}
