
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkHistoryReferable;


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
 *         &lt;element name="ArrayOfWorkHistoryReferable" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkHistoryReferable" minOccurs="0"/>
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
    "arrayOfWorkHistoryReferable"
})
@XmlRootElement(name = "GetWorkHistoriesByWorkItemRefsResponse")
public class GetWorkHistoriesByWorkItemRefsResponse {

    @XmlElement(name = "ArrayOfWorkHistoryReferable")
    protected ArrayOfWorkHistoryReferable arrayOfWorkHistoryReferable;

    /**
     * Gets the value of the arrayOfWorkHistoryReferable property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkHistoryReferable }
     *     
     */
    public ArrayOfWorkHistoryReferable getArrayOfWorkHistoryReferable() {
        return arrayOfWorkHistoryReferable;
    }

    /**
     * Sets the value of the arrayOfWorkHistoryReferable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkHistoryReferable }
     *     
     */
    public void setArrayOfWorkHistoryReferable(ArrayOfWorkHistoryReferable value) {
        this.arrayOfWorkHistoryReferable = value;
    }

}
