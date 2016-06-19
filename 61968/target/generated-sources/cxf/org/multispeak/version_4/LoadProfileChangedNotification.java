
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
 *         &lt;element name="changedLoadProfiles" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfProfileObject" minOccurs="0"/>
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
    "changedLoadProfiles"
})
@XmlRootElement(name = "LoadProfileChangedNotification")
public class LoadProfileChangedNotification {

    protected ArrayOfProfileObject changedLoadProfiles;

    /**
     * Gets the value of the changedLoadProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileObject }
     *     
     */
    public ArrayOfProfileObject getChangedLoadProfiles() {
        return changedLoadProfiles;
    }

    /**
     * Sets the value of the changedLoadProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileObject }
     *     
     */
    public void setChangedLoadProfiles(ArrayOfProfileObject value) {
        this.changedLoadProfiles = value;
    }

}
