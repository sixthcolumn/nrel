
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
 *         &lt;element name="changedDomainMembers" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfDomainMember" minOccurs="0"/>
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
    "changedDomainMembers"
})
@XmlRootElement(name = "DomainMembersChangedNotification")
public class DomainMembersChangedNotification {

    protected ArrayOfDomainMember changedDomainMembers;

    /**
     * Gets the value of the changedDomainMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public ArrayOfDomainMember getChangedDomainMembers() {
        return changedDomainMembers;
    }

    /**
     * Sets the value of the changedDomainMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainMember }
     *     
     */
    public void setChangedDomainMembers(ArrayOfDomainMember value) {
        this.changedDomainMembers = value;
    }

}
