
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectRef;


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
 *         &lt;element name="ArrayOfObjectRef" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfObjectRef" minOccurs="0"/>
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
    "arrayOfObjectRef"
})
@XmlRootElement(name = "GetAttachmentsByObjectRefs")
public class GetAttachmentsByObjectRefs {

    @XmlElement(name = "ArrayOfObjectRef")
    protected ArrayOfObjectRef arrayOfObjectRef;

    /**
     * Gets the value of the arrayOfObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public ArrayOfObjectRef getArrayOfObjectRef() {
        return arrayOfObjectRef;
    }

    /**
     * Sets the value of the arrayOfObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public void setArrayOfObjectRef(ArrayOfObjectRef value) {
        this.arrayOfObjectRef = value;
    }

}
