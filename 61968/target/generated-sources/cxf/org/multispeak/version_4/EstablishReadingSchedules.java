
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
 *         &lt;element name="readingSchedules" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReadingSchedule" minOccurs="0"/>
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
    "readingSchedules"
})
@XmlRootElement(name = "EstablishReadingSchedules")
public class EstablishReadingSchedules {

    protected ArrayOfReadingSchedule readingSchedules;

    /**
     * Gets the value of the readingSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReadingSchedule }
     *     
     */
    public ArrayOfReadingSchedule getReadingSchedules() {
        return readingSchedules;
    }

    /**
     * Sets the value of the readingSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReadingSchedule }
     *     
     */
    public void setReadingSchedules(ArrayOfReadingSchedule value) {
        this.readingSchedules = value;
    }

}
