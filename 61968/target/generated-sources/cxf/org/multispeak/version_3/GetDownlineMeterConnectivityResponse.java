
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
 *         &lt;element name="GetDownlineMeterConnectivityResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfMeterConnectivity" minOccurs="0"/>
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
    "getDownlineMeterConnectivityResult"
})
@XmlRootElement(name = "GetDownlineMeterConnectivityResponse")
public class GetDownlineMeterConnectivityResponse {

    @XmlElement(name = "GetDownlineMeterConnectivityResult")
    protected ArrayOfMeterConnectivity getDownlineMeterConnectivityResult;

    /**
     * Gets the value of the getDownlineMeterConnectivityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public ArrayOfMeterConnectivity getGetDownlineMeterConnectivityResult() {
        return getDownlineMeterConnectivityResult;
    }

    /**
     * Sets the value of the getDownlineMeterConnectivityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public void setGetDownlineMeterConnectivityResult(ArrayOfMeterConnectivity value) {
        this.getDownlineMeterConnectivityResult = value;
    }

}