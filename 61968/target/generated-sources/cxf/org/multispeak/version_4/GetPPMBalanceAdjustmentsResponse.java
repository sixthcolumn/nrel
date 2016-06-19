
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
 *         &lt;element name="GetPPMBalanceAdjustmentsResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPpmBalanceAdjustment" minOccurs="0"/>
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
    "getPPMBalanceAdjustmentsResult"
})
@XmlRootElement(name = "GetPPMBalanceAdjustmentsResponse")
public class GetPPMBalanceAdjustmentsResponse {

    @XmlElement(name = "GetPPMBalanceAdjustmentsResult")
    protected ArrayOfPpmBalanceAdjustment getPPMBalanceAdjustmentsResult;

    /**
     * Gets the value of the getPPMBalanceAdjustmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPpmBalanceAdjustment }
     *     
     */
    public ArrayOfPpmBalanceAdjustment getGetPPMBalanceAdjustmentsResult() {
        return getPPMBalanceAdjustmentsResult;
    }

    /**
     * Sets the value of the getPPMBalanceAdjustmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPpmBalanceAdjustment }
     *     
     */
    public void setGetPPMBalanceAdjustmentsResult(ArrayOfPpmBalanceAdjustment value) {
        this.getPPMBalanceAdjustmentsResult = value;
    }

}
