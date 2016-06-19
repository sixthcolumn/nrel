
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="readingScheduleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "readingScheduleID"
})
@XmlRootElement(name = "DisableReadingSchedule")
public class DisableReadingSchedule {

    protected String readingScheduleID;

    /**
     * Gets the value of the readingScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingScheduleID() {
        return readingScheduleID;
    }

    /**
     * Sets the value of the readingScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingScheduleID(String value) {
        this.readingScheduleID = value;
    }

}
