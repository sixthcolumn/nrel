
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItem;


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
 *         &lt;element name="ArrayOfWorkItem" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkItem" minOccurs="0"/>
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
    "arrayOfWorkItem"
})
@XmlRootElement(name = "GetWorkItemsByWorkItemRefsResponse")
public class GetWorkItemsByWorkItemRefsResponse {

    @XmlElement(name = "ArrayOfWorkItem")
    protected ArrayOfWorkItem arrayOfWorkItem;

    /**
     * Gets the value of the arrayOfWorkItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkItem }
     *     
     */
    public ArrayOfWorkItem getArrayOfWorkItem() {
        return arrayOfWorkItem;
    }

    /**
     * Sets the value of the arrayOfWorkItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkItem }
     *     
     */
    public void setArrayOfWorkItem(ArrayOfWorkItem value) {
        this.arrayOfWorkItem = value;
    }

}
