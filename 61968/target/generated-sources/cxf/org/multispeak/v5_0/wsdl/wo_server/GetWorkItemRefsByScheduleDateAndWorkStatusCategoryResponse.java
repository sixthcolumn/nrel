
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef;


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
 *         &lt;element name="ArrayOfWorkItemRef" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkItemRef" minOccurs="0"/>
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
    "arrayOfWorkItemRef"
})
@XmlRootElement(name = "GetWorkItemRefsByScheduleDateAndWorkStatusCategoryResponse")
public class GetWorkItemRefsByScheduleDateAndWorkStatusCategoryResponse {

    @XmlElement(name = "ArrayOfWorkItemRef")
    protected ArrayOfWorkItemRef arrayOfWorkItemRef;

    /**
     * Gets the value of the arrayOfWorkItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkItemRef }
     *     
     */
    public ArrayOfWorkItemRef getArrayOfWorkItemRef() {
        return arrayOfWorkItemRef;
    }

    /**
     * Sets the value of the arrayOfWorkItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkItemRef }
     *     
     */
    public void setArrayOfWorkItemRef(ArrayOfWorkItemRef value) {
        this.arrayOfWorkItemRef = value;
    }

}
