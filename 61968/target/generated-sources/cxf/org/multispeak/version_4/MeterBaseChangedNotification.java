
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
 *         &lt;element name="changedMBs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterBase" minOccurs="0"/>
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
    "changedMBs"
})
@XmlRootElement(name = "MeterBaseChangedNotification")
public class MeterBaseChangedNotification {

    protected ArrayOfMeterBase changedMBs;

    /**
     * Gets the value of the changedMBs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public ArrayOfMeterBase getChangedMBs() {
        return changedMBs;
    }

    /**
     * Sets the value of the changedMBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public void setChangedMBs(ArrayOfMeterBase value) {
        this.changedMBs = value;
    }

}
