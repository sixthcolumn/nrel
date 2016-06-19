
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for outageReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReason">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outageReportingCodes" type="{http://www.multispeak.org/V5.0}outageReportingCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReason", propOrder = {
    "description",
    "outageReportingCodes"
})
public class OutageReason
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String description;
    protected OutageReportingCodes outageReportingCodes;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the outageReportingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReportingCodes }
     *     
     */
    public OutageReportingCodes getOutageReportingCodes() {
        return outageReportingCodes;
    }

    /**
     * Sets the value of the outageReportingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReportingCodes }
     *     
     */
    public void setOutageReportingCodes(OutageReportingCodes value) {
        this.outageReportingCodes = value;
    }

}
