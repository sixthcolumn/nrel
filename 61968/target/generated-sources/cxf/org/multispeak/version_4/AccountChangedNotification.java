
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
 *         &lt;element name="changedAccounts" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAccount1" minOccurs="0"/>
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
    "changedAccounts"
})
@XmlRootElement(name = "AccountChangedNotification")
public class AccountChangedNotification {

    protected ArrayOfAccount1 changedAccounts;

    /**
     * Gets the value of the changedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public ArrayOfAccount1 getChangedAccounts() {
        return changedAccounts;
    }

    /**
     * Sets the value of the changedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public void setChangedAccounts(ArrayOfAccount1 value) {
        this.changedAccounts = value;
    }

}
