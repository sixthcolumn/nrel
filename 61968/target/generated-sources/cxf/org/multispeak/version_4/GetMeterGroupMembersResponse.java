
package org.multispeak.version_4;

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
 *         &lt;element name="GetMeterGroupMembersResult" type="{http://www.multispeak.org/Version_4.1_Release}meterGroups" minOccurs="0"/>
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
    "getMeterGroupMembersResult"
})
@XmlRootElement(name = "GetMeterGroupMembersResponse")
public class GetMeterGroupMembersResponse {

    @XmlElement(name = "GetMeterGroupMembersResult")
    protected MeterGroups getMeterGroupMembersResult;

    /**
     * Gets the value of the getMeterGroupMembersResult property.
     * 
     * @return
     *     possible object is
     *     {@link MeterGroups }
     *     
     */
    public MeterGroups getGetMeterGroupMembersResult() {
        return getMeterGroupMembersResult;
    }

    /**
     * Sets the value of the getMeterGroupMembersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterGroups }
     *     
     */
    public void setGetMeterGroupMembersResult(MeterGroups value) {
        this.getMeterGroupMembersResult = value;
    }

}
