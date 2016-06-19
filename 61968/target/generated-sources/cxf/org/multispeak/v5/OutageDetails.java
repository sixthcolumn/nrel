
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for outageDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="outageWork" type="{http://www.multispeak.org/V5.0}outageWork" minOccurs="0"/>
 *         &lt;element name="outageCustomers" type="{http://www.multispeak.org/V5.0}outageCustomers" minOccurs="0"/>
 *         &lt;element name="outagePriorityLocations" type="{http://www.multispeak.org/V5.0}outagePriorityLocations" minOccurs="0"/>
 *         &lt;element name="outageAttachments" type="{http://www.multispeak.org/V5.0}outageAttachments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageDetails", propOrder = {
    "outageWork",
    "outageCustomers",
    "outagePriorityLocations",
    "outageAttachments"
})
public class OutageDetails
    extends MspExtensible
{

    protected OutageWork outageWork;
    protected OutageCustomers outageCustomers;
    protected OutagePriorityLocations outagePriorityLocations;
    protected OutageAttachments outageAttachments;

    /**
     * Gets the value of the outageWork property.
     * 
     * @return
     *     possible object is
     *     {@link OutageWork }
     *     
     */
    public OutageWork getOutageWork() {
        return outageWork;
    }

    /**
     * Sets the value of the outageWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageWork }
     *     
     */
    public void setOutageWork(OutageWork value) {
        this.outageWork = value;
    }

    /**
     * Gets the value of the outageCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomers }
     *     
     */
    public OutageCustomers getOutageCustomers() {
        return outageCustomers;
    }

    /**
     * Sets the value of the outageCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomers }
     *     
     */
    public void setOutageCustomers(OutageCustomers value) {
        this.outageCustomers = value;
    }

    /**
     * Gets the value of the outagePriorityLocations property.
     * 
     * @return
     *     possible object is
     *     {@link OutagePriorityLocations }
     *     
     */
    public OutagePriorityLocations getOutagePriorityLocations() {
        return outagePriorityLocations;
    }

    /**
     * Sets the value of the outagePriorityLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutagePriorityLocations }
     *     
     */
    public void setOutagePriorityLocations(OutagePriorityLocations value) {
        this.outagePriorityLocations = value;
    }

    /**
     * Gets the value of the outageAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link OutageAttachments }
     *     
     */
    public OutageAttachments getOutageAttachments() {
        return outageAttachments;
    }

    /**
     * Sets the value of the outageAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageAttachments }
     *     
     */
    public void setOutageAttachments(OutageAttachments value) {
        this.outageAttachments = value;
    }

}
