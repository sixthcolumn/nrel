
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetSiblingMeterConnectivityResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfMeterConnectivity" minOccurs="0"/>
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
    "getSiblingMeterConnectivityResult"
})
@XmlRootElement(name = "GetSiblingMeterConnectivityResponse")
public class GetSiblingMeterConnectivityResponse {

    @XmlElement(name = "GetSiblingMeterConnectivityResult")
    protected ArrayOfMeterConnectivity getSiblingMeterConnectivityResult;

    /**
     * Gets the value of the getSiblingMeterConnectivityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public ArrayOfMeterConnectivity getGetSiblingMeterConnectivityResult() {
        return getSiblingMeterConnectivityResult;
    }

    /**
     * Sets the value of the getSiblingMeterConnectivityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public void setGetSiblingMeterConnectivityResult(ArrayOfMeterConnectivity value) {
        this.getSiblingMeterConnectivityResult = value;
    }

}
