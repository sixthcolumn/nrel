
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
 *         &lt;element name="schedules" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSchedule" minOccurs="0"/>
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
    "schedules"
})
@XmlRootElement(name = "EstablishSchedules")
public class EstablishSchedules {

    protected ArrayOfSchedule schedules;

    /**
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public ArrayOfSchedule getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public void setSchedules(ArrayOfSchedule value) {
        this.schedules = value;
    }

}
