
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for mspUsagePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspUsagePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspConnectivityPoint">
 *       &lt;sequence>
 *         &lt;element name="premisesID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceAgreements" type="{http://www.multispeak.org/V5.0}serviceAgreements" minOccurs="0"/>
 *         &lt;element name="usagePointPriorities" type="{http://www.multispeak.org/V5.0}usagePointPriorities" minOccurs="0"/>
 *         &lt;element name="usagePointHazards" type="{http://www.multispeak.org/V5.0}usagePointHazards" minOccurs="0"/>
 *         &lt;element name="usagePointNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspUsagePoint", propOrder = {
    "premisesID",
    "serviceAgreements",
    "usagePointPriorities",
    "usagePointHazards",
    "usagePointNotes"
})
@XmlSeeAlso({
    MspGasUsagePoint.class,
    MspOtherUsagePoint.class,
    MspElectricUsagePoint.class,
    MspPropaneUsagePoint.class,
    MspWaterUsagePoint.class
})
public abstract class MspUsagePoint
    extends MspConnectivityPoint
{

    protected ObjectID premisesID;
    protected ServiceAgreements serviceAgreements;
    protected UsagePointPriorities usagePointPriorities;
    protected UsagePointHazards usagePointHazards;
    protected SupplementalNotes usagePointNotes;

    /**
     * Gets the value of the premisesID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getPremisesID() {
        return premisesID;
    }

    /**
     * Sets the value of the premisesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setPremisesID(ObjectID value) {
        this.premisesID = value;
    }

    /**
     * Gets the value of the serviceAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAgreements }
     *     
     */
    public ServiceAgreements getServiceAgreements() {
        return serviceAgreements;
    }

    /**
     * Sets the value of the serviceAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAgreements }
     *     
     */
    public void setServiceAgreements(ServiceAgreements value) {
        this.serviceAgreements = value;
    }

    /**
     * Gets the value of the usagePointPriorities property.
     * 
     * @return
     *     possible object is
     *     {@link UsagePointPriorities }
     *     
     */
    public UsagePointPriorities getUsagePointPriorities() {
        return usagePointPriorities;
    }

    /**
     * Sets the value of the usagePointPriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsagePointPriorities }
     *     
     */
    public void setUsagePointPriorities(UsagePointPriorities value) {
        this.usagePointPriorities = value;
    }

    /**
     * Gets the value of the usagePointHazards property.
     * 
     * @return
     *     possible object is
     *     {@link UsagePointHazards }
     *     
     */
    public UsagePointHazards getUsagePointHazards() {
        return usagePointHazards;
    }

    /**
     * Sets the value of the usagePointHazards property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsagePointHazards }
     *     
     */
    public void setUsagePointHazards(UsagePointHazards value) {
        this.usagePointHazards = value;
    }

    /**
     * Gets the value of the usagePointNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getUsagePointNotes() {
        return usagePointNotes;
    }

    /**
     * Sets the value of the usagePointNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setUsagePointNotes(SupplementalNotes value) {
        this.usagePointNotes = value;
    }

}
