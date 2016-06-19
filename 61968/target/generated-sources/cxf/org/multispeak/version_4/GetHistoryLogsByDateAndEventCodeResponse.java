
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
 *         &lt;element name="GetHistoryLogsByDateAndEventCodeResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfHistoryLog" minOccurs="0"/>
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
    "getHistoryLogsByDateAndEventCodeResult"
})
@XmlRootElement(name = "GetHistoryLogsByDateAndEventCodeResponse")
public class GetHistoryLogsByDateAndEventCodeResponse {

    @XmlElement(name = "GetHistoryLogsByDateAndEventCodeResult")
    protected ArrayOfHistoryLog getHistoryLogsByDateAndEventCodeResult;

    /**
     * Gets the value of the getHistoryLogsByDateAndEventCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public ArrayOfHistoryLog getGetHistoryLogsByDateAndEventCodeResult() {
        return getHistoryLogsByDateAndEventCodeResult;
    }

    /**
     * Sets the value of the getHistoryLogsByDateAndEventCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public void setGetHistoryLogsByDateAndEventCodeResult(ArrayOfHistoryLog value) {
        this.getHistoryLogsByDateAndEventCodeResult = value;
    }

}
