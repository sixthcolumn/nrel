
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
 *         &lt;element name="GetReadingScheduleByIDResult" type="{http://www.multispeak.org/Version_4.1_Release}readingSchedule" minOccurs="0"/>
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
    "getReadingScheduleByIDResult"
})
@XmlRootElement(name = "GetReadingScheduleByIDResponse")
public class GetReadingScheduleByIDResponse {

    @XmlElement(name = "GetReadingScheduleByIDResult")
    protected ReadingSchedule getReadingScheduleByIDResult;

    /**
     * Gets the value of the getReadingScheduleByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingSchedule }
     *     
     */
    public ReadingSchedule getGetReadingScheduleByIDResult() {
        return getReadingScheduleByIDResult;
    }

    /**
     * Sets the value of the getReadingScheduleByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingSchedule }
     *     
     */
    public void setGetReadingScheduleByIDResult(ReadingSchedule value) {
        this.getReadingScheduleByIDResult = value;
    }

}
