
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
 *         &lt;element name="retiredMBs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterBase" minOccurs="0"/>
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
    "retiredMBs"
})
@XmlRootElement(name = "MeterBaseRetireNotification")
public class MeterBaseRetireNotification {

    protected ArrayOfMeterBase retiredMBs;

    /**
     * Gets the value of the retiredMBs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public ArrayOfMeterBase getRetiredMBs() {
        return retiredMBs;
    }

    /**
     * Sets the value of the retiredMBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public void setRetiredMBs(ArrayOfMeterBase value) {
        this.retiredMBs = value;
    }

}
