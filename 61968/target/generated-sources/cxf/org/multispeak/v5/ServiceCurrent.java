
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.enumerations.ServiceLimitType;


/**
 * <p>Java class for serviceCurrent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceCurrent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nominalCurrent" type="{http://www.multispeak.org/V5.0/commonTypes}current"/>
 *         &lt;element name="serviceLimitType" type="{http://www.multispeak.org/V5.0/enumerations}serviceLimitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceCurrent", propOrder = {
    "nominalCurrent",
    "serviceLimitType"
})
public class ServiceCurrent {

    @XmlElement(required = true)
    protected Current nominalCurrent;
    @XmlElement(required = true)
    protected ServiceLimitType serviceLimitType;

    /**
     * Gets the value of the nominalCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getNominalCurrent() {
        return nominalCurrent;
    }

    /**
     * Sets the value of the nominalCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setNominalCurrent(Current value) {
        this.nominalCurrent = value;
    }

    /**
     * Gets the value of the serviceLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLimitType }
     *     
     */
    public ServiceLimitType getServiceLimitType() {
        return serviceLimitType;
    }

    /**
     * Sets the value of the serviceLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLimitType }
     *     
     */
    public void setServiceLimitType(ServiceLimitType value) {
        this.serviceLimitType = value;
    }

}
