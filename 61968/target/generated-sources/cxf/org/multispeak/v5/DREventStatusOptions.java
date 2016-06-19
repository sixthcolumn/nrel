
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DREventStatusOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DREventStatusOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DREventDeviceStatuses" type="{http://www.multispeak.org/V5.0}DREventDeviceStatuses"/>
 *         &lt;element name="accumulatedEventStatuses" type="{http://www.multispeak.org/V5.0}accumulatedEventStatuses"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DREventStatusOptions", propOrder = {
    "drEventDeviceStatuses",
    "accumulatedEventStatuses"
})
public class DREventStatusOptions {

    @XmlElement(name = "DREventDeviceStatuses")
    protected DREventDeviceStatuses drEventDeviceStatuses;
    protected AccumulatedEventStatuses accumulatedEventStatuses;

    /**
     * Gets the value of the drEventDeviceStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link DREventDeviceStatuses }
     *     
     */
    public DREventDeviceStatuses getDREventDeviceStatuses() {
        return drEventDeviceStatuses;
    }

    /**
     * Sets the value of the drEventDeviceStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DREventDeviceStatuses }
     *     
     */
    public void setDREventDeviceStatuses(DREventDeviceStatuses value) {
        this.drEventDeviceStatuses = value;
    }

    /**
     * Gets the value of the accumulatedEventStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulatedEventStatuses }
     *     
     */
    public AccumulatedEventStatuses getAccumulatedEventStatuses() {
        return accumulatedEventStatuses;
    }

    /**
     * Sets the value of the accumulatedEventStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulatedEventStatuses }
     *     
     */
    public void setAccumulatedEventStatuses(AccumulatedEventStatuses value) {
        this.accumulatedEventStatuses = value;
    }

}
