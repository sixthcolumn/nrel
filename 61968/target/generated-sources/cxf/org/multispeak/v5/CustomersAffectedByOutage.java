
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.OutageState;


/**
 * This is a list of customer meters that are affected by a specific outage event.
 * 
 * <p>Java class for customersAffectedByOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customersAffectedByOutage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef" minOccurs="0"/>
 *         &lt;element name="outageState" type="{http://www.multispeak.org/V5.0/enumerations}outageState" minOccurs="0"/>
 *         &lt;element name="affectedMeters" type="{http://www.multispeak.org/V5.0}affectedMeters" minOccurs="0"/>
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
@XmlType(name = "customersAffectedByOutage", propOrder = {
    "outageRef",
    "outageState",
    "affectedMeters"
})
public class CustomersAffectedByOutage
    extends MspObject
{

    protected OutageRef outageRef;
    protected OutageState outageState;
    protected AffectedMeters affectedMeters;

    /**
     * Gets the value of the outageRef property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRef }
     *     
     */
    public OutageRef getOutageRef() {
        return outageRef;
    }

    /**
     * Sets the value of the outageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRef }
     *     
     */
    public void setOutageRef(OutageRef value) {
        this.outageRef = value;
    }

    /**
     * Gets the value of the outageState property.
     * 
     * @return
     *     possible object is
     *     {@link OutageState }
     *     
     */
    public OutageState getOutageState() {
        return outageState;
    }

    /**
     * Sets the value of the outageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageState }
     *     
     */
    public void setOutageState(OutageState value) {
        this.outageState = value;
    }

    /**
     * Gets the value of the affectedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedMeters }
     *     
     */
    public AffectedMeters getAffectedMeters() {
        return affectedMeters;
    }

    /**
     * Sets the value of the affectedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedMeters }
     *     
     */
    public void setAffectedMeters(AffectedMeters value) {
        this.affectedMeters = value;
    }

}
