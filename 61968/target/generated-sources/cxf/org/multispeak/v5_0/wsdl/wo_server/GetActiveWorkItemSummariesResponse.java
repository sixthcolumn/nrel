
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary;


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
 *         &lt;element name="ArrayOfWorkItemSummary" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkItemSummary" minOccurs="0"/>
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
    "arrayOfWorkItemSummary"
})
@XmlRootElement(name = "GetActiveWorkItemSummariesResponse")
public class GetActiveWorkItemSummariesResponse {

    @XmlElement(name = "ArrayOfWorkItemSummary")
    protected ArrayOfWorkItemSummary arrayOfWorkItemSummary;

    /**
     * Gets the value of the arrayOfWorkItemSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkItemSummary }
     *     
     */
    public ArrayOfWorkItemSummary getArrayOfWorkItemSummary() {
        return arrayOfWorkItemSummary;
    }

    /**
     * Sets the value of the arrayOfWorkItemSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkItemSummary }
     *     
     */
    public void setArrayOfWorkItemSummary(ArrayOfWorkItemSummary value) {
        this.arrayOfWorkItemSummary = value;
    }

}
