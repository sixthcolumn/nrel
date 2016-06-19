
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkType;


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
 *         &lt;element name="ArrayOfWorkType" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkType" minOccurs="0"/>
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
    "arrayOfWorkType"
})
@XmlRootElement(name = "GetSupportedWorkTypesResponse")
public class GetSupportedWorkTypesResponse {

    @XmlElement(name = "ArrayOfWorkType")
    protected ArrayOfWorkType arrayOfWorkType;

    /**
     * Gets the value of the arrayOfWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkType }
     *     
     */
    public ArrayOfWorkType getArrayOfWorkType() {
        return arrayOfWorkType;
    }

    /**
     * Sets the value of the arrayOfWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkType }
     *     
     */
    public void setArrayOfWorkType(ArrayOfWorkType value) {
        this.arrayOfWorkType = value;
    }

}
