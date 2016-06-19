
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
 *         &lt;element name="securityLightData" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSecurityLight1" minOccurs="0"/>
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
    "securityLightData"
})
@XmlRootElement(name = "ModifyCBDataForSecurityLight")
public class ModifyCBDataForSecurityLight {

    protected ArrayOfSecurityLight1 securityLightData;

    /**
     * Gets the value of the securityLightData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityLight1 }
     *     
     */
    public ArrayOfSecurityLight1 getSecurityLightData() {
        return securityLightData;
    }

    /**
     * Sets the value of the securityLightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityLight1 }
     *     
     */
    public void setSecurityLightData(ArrayOfSecurityLight1 value) {
        this.securityLightData = value;
    }

}
