
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachment;


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
 *         &lt;element name="ArrayOfAttachment" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfAttachment" minOccurs="0"/>
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
    "arrayOfAttachment"
})
@XmlRootElement(name = "GetAttachmentsByObjectRefsResponse")
public class GetAttachmentsByObjectRefsResponse {

    @XmlElement(name = "ArrayOfAttachment")
    protected ArrayOfAttachment arrayOfAttachment;

    /**
     * Gets the value of the arrayOfAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getArrayOfAttachment() {
        return arrayOfAttachment;
    }

    /**
     * Sets the value of the arrayOfAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setArrayOfAttachment(ArrayOfAttachment value) {
        this.arrayOfAttachment = value;
    }

}
