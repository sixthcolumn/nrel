
package org.multispeak.version_3;

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
 *         &lt;element name="ODEventNotificationResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfErrorObject" minOccurs="0"/>
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
    "odEventNotificationResult"
})
@XmlRootElement(name = "ODEventNotificationResponse")
public class ODEventNotificationResponse {

    @XmlElement(name = "ODEventNotificationResult")
    protected ArrayOfErrorObject odEventNotificationResult;

    /**
     * Gets the value of the odEventNotificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public ArrayOfErrorObject getODEventNotificationResult() {
        return odEventNotificationResult;
    }

    /**
     * Sets the value of the odEventNotificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public void setODEventNotificationResult(ArrayOfErrorObject value) {
        this.odEventNotificationResult = value;
    }

}
