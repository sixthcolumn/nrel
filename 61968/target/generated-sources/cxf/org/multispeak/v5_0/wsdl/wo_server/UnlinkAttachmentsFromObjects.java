
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentUnlinkContainer;


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
 *         &lt;element name="ArrayOfAttachmentUnlinkContainer" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfAttachmentUnlinkContainer" minOccurs="0"/>
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
    "arrayOfAttachmentUnlinkContainer"
})
@XmlRootElement(name = "UnlinkAttachmentsFromObjects")
public class UnlinkAttachmentsFromObjects {

    @XmlElement(name = "ArrayOfAttachmentUnlinkContainer")
    protected ArrayOfAttachmentUnlinkContainer arrayOfAttachmentUnlinkContainer;

    /**
     * Gets the value of the arrayOfAttachmentUnlinkContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentUnlinkContainer }
     *     
     */
    public ArrayOfAttachmentUnlinkContainer getArrayOfAttachmentUnlinkContainer() {
        return arrayOfAttachmentUnlinkContainer;
    }

    /**
     * Sets the value of the arrayOfAttachmentUnlinkContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentUnlinkContainer }
     *     
     */
    public void setArrayOfAttachmentUnlinkContainer(ArrayOfAttachmentUnlinkContainer value) {
        this.arrayOfAttachmentUnlinkContainer = value;
    }

}
