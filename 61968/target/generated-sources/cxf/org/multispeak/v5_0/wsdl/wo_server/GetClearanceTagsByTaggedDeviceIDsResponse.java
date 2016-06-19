
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceTag;


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
 *         &lt;element name="ArrayOfClearanceTag" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfClearanceTag" minOccurs="0"/>
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
    "arrayOfClearanceTag"
})
@XmlRootElement(name = "GetClearanceTagsByTaggedDeviceIDsResponse")
public class GetClearanceTagsByTaggedDeviceIDsResponse {

    @XmlElement(name = "ArrayOfClearanceTag")
    protected ArrayOfClearanceTag arrayOfClearanceTag;

    /**
     * Gets the value of the arrayOfClearanceTag property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClearanceTag }
     *     
     */
    public ArrayOfClearanceTag getArrayOfClearanceTag() {
        return arrayOfClearanceTag;
    }

    /**
     * Sets the value of the arrayOfClearanceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClearanceTag }
     *     
     */
    public void setArrayOfClearanceTag(ArrayOfClearanceTag value) {
        this.arrayOfClearanceTag = value;
    }

}
