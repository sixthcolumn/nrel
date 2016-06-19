
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
 *         &lt;element name="IsAMRMeterResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isAMRMeterResult"
})
@XmlRootElement(name = "IsAMRMeterResponse")
public class IsAMRMeterResponse {

    @XmlElement(name = "IsAMRMeterResult")
    protected boolean isAMRMeterResult;

    /**
     * Gets the value of the isAMRMeterResult property.
     * 
     */
    public boolean isIsAMRMeterResult() {
        return isAMRMeterResult;
    }

    /**
     * Sets the value of the isAMRMeterResult property.
     * 
     */
    public void setIsAMRMeterResult(boolean value) {
        this.isAMRMeterResult = value;
    }

}
