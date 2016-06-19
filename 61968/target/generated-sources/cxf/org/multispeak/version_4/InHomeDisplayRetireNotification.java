
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
 *         &lt;element name="retiredIHDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplay1" minOccurs="0"/>
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
    "retiredIHDs"
})
@XmlRootElement(name = "InHomeDisplayRetireNotification")
public class InHomeDisplayRetireNotification {

    protected ArrayOfInHomeDisplay1 retiredIHDs;

    /**
     * Gets the value of the retiredIHDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public ArrayOfInHomeDisplay1 getRetiredIHDs() {
        return retiredIHDs;
    }

    /**
     * Sets the value of the retiredIHDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public void setRetiredIHDs(ArrayOfInHomeDisplay1 value) {
        this.retiredIHDs = value;
    }

}
