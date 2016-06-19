
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfDomainMember;


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
 *         &lt;element name="ArrayOfDomainMember" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfDomainMember" minOccurs="0"/>
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
    "arrayOfDomainMember"
})
@XmlRootElement(name = "GetDomainMembersResponse")
public class GetDomainMembersResponse {

    @XmlElement(name = "ArrayOfDomainMember")
    protected ArrayOfDomainMember arrayOfDomainMember;

    /**
     * Gets the value of the arrayOfDomainMember property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public ArrayOfDomainMember getArrayOfDomainMember() {
        return arrayOfDomainMember;
    }

    /**
     * Sets the value of the arrayOfDomainMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public void setArrayOfDomainMember(ArrayOfDomainMember value) {
        this.arrayOfDomainMember = value;
    }

}
