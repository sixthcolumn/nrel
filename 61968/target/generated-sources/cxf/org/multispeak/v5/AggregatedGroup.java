
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for aggregatedGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aggregatedGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="aggregator" type="{http://www.multispeak.org/V5.0}organization"/>
 *         &lt;element name="aggregatorGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregatedGroup", propOrder = {
    "aggregator",
    "aggregatorGroupName"
})
public class AggregatedGroup
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Organization aggregator;
    protected String aggregatorGroupName;

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setAggregator(Organization value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the aggregatorGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorGroupName() {
        return aggregatorGroupName;
    }

    /**
     * Sets the value of the aggregatorGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorGroupName(String value) {
        this.aggregatorGroupName = value;
    }

}
