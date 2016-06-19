
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
 *         &lt;element name="GetLatestReadingByFieldNameIntervalDataResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalData" minOccurs="0"/>
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
    "getLatestReadingByFieldNameIntervalDataResult"
})
@XmlRootElement(name = "GetLatestReadingByFieldNameIntervalDataResponse")
public class GetLatestReadingByFieldNameIntervalDataResponse {

    @XmlElement(name = "GetLatestReadingByFieldNameIntervalDataResult")
    protected ArrayOfIntervalData getLatestReadingByFieldNameIntervalDataResult;

    /**
     * Gets the value of the getLatestReadingByFieldNameIntervalDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public ArrayOfIntervalData getGetLatestReadingByFieldNameIntervalDataResult() {
        return getLatestReadingByFieldNameIntervalDataResult;
    }

    /**
     * Sets the value of the getLatestReadingByFieldNameIntervalDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public void setGetLatestReadingByFieldNameIntervalDataResult(ArrayOfIntervalData value) {
        this.getLatestReadingByFieldNameIntervalDataResult = value;
    }

}
