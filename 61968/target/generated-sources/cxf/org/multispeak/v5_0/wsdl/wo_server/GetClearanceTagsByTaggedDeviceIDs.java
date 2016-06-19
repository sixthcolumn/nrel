
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfTaggedDeviceRef;


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
 *         &lt;element name="ArrayOfTaggedDeviceRef" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfTaggedDeviceRef" minOccurs="0"/>
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
    "arrayOfTaggedDeviceRef"
})
@XmlRootElement(name = "GetClearanceTagsByTaggedDeviceIDs")
public class GetClearanceTagsByTaggedDeviceIDs {

    @XmlElement(name = "ArrayOfTaggedDeviceRef")
    protected ArrayOfTaggedDeviceRef arrayOfTaggedDeviceRef;

    /**
     * Gets the value of the arrayOfTaggedDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaggedDeviceRef }
     *     
     */
    public ArrayOfTaggedDeviceRef getArrayOfTaggedDeviceRef() {
        return arrayOfTaggedDeviceRef;
    }

    /**
     * Sets the value of the arrayOfTaggedDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaggedDeviceRef }
     *     
     */
    public void setArrayOfTaggedDeviceRef(ArrayOfTaggedDeviceRef value) {
        this.arrayOfTaggedDeviceRef = value;
    }

}
