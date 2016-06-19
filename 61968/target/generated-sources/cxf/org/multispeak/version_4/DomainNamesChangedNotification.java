
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="changedDomainNames" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfDomainNameChange" minOccurs="0"/>
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
    "changedDomainNames"
})
@XmlRootElement(name = "DomainNamesChangedNotification")
public class DomainNamesChangedNotification {

    protected ArrayOfDomainNameChange changedDomainNames;

    /**
     * Gets the value of the changedDomainNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainNameChange }
     *     
     */
    public ArrayOfDomainNameChange getChangedDomainNames() {
        return changedDomainNames;
    }

    /**
     * Sets the value of the changedDomainNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainNameChange }
     *     
     */
    public void setChangedDomainNames(ArrayOfDomainNameChange value) {
        this.changedDomainNames = value;
    }

}
