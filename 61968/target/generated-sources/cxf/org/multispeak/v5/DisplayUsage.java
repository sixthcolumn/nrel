
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for displayUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="totalCost" type="{http://www.multispeak.org/V5.0}totalCost" minOccurs="0"/>
 *         &lt;element name="averageCost" type="{http://www.multispeak.org/V5.0}averageCost" minOccurs="0"/>
 *         &lt;element name="totalUsages" type="{http://www.multispeak.org/V5.0}totalUsages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayUsage", propOrder = {
    "totalCost",
    "averageCost",
    "totalUsages"
})
public class DisplayUsage
    extends MspExtensible
{

    protected TotalCost totalCost;
    protected AverageCost averageCost;
    protected TotalUsages totalUsages;

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCost }
     *     
     */
    public TotalCost getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCost }
     *     
     */
    public void setTotalCost(TotalCost value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link AverageCost }
     *     
     */
    public AverageCost getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageCost }
     *     
     */
    public void setAverageCost(AverageCost value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the totalUsages property.
     * 
     * @return
     *     possible object is
     *     {@link TotalUsages }
     *     
     */
    public TotalUsages getTotalUsages() {
        return totalUsages;
    }

    /**
     * Sets the value of the totalUsages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalUsages }
     *     
     */
    public void setTotalUsages(TotalUsages value) {
        this.totalUsages = value;
    }

}
