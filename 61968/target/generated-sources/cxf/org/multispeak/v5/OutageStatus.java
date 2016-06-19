
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.OutageState;
import org.multispeak.v5_0.enumerations.ResourceState;


/**
 * This class is a summary of the current status of an outage.
 * 
 * <p>Java class for outageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="outageState" type="{http://www.multispeak.org/V5.0/enumerations}outageState"/>
 *         &lt;element name="crewState" type="{http://www.multispeak.org/V5.0/enumerations}resourceState" minOccurs="0"/>
 *         &lt;element name="firstETA" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="ETOR" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageStatus", propOrder = {
    "outageState",
    "crewState",
    "firstETA",
    "etor"
})
public class OutageStatus
    extends MspExtensible
{

    @XmlElement(required = true)
    protected OutageState outageState;
    protected ResourceState crewState;
    protected XMLGregorianCalendar firstETA;
    @XmlElement(name = "ETOR")
    protected XMLGregorianCalendar etor;

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
     * Gets the value of the crewState property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceState }
     *     
     */
    public ResourceState getCrewState() {
        return crewState;
    }

    /**
     * Sets the value of the crewState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceState }
     *     
     */
    public void setCrewState(ResourceState value) {
        this.crewState = value;
    }

    /**
     * Gets the value of the firstETA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstETA() {
        return firstETA;
    }

    /**
     * Sets the value of the firstETA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstETA(XMLGregorianCalendar value) {
        this.firstETA = value;
    }

    /**
     * Gets the value of the etor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETOR() {
        return etor;
    }

    /**
     * Sets the value of the etor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETOR(XMLGregorianCalendar value) {
        this.etor = value;
    }

}
