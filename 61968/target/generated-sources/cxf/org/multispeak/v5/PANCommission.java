
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.PANCommissionStatus;


/**
 * <p>Java class for PANCommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANCommission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="interfaceID" type="{http://www.multispeak.org/V5.0}PANInterfaceID"/>
 *         &lt;element name="commissionStatus" type="{http://www.multispeak.org/V5.0/enumerations}PANCommissionStatus"/>
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
@XmlType(name = "PANCommission", propOrder = {
    "interfaceID",
    "commissionStatus"
})
public class PANCommission
    extends MspObject
{

    @XmlElement(required = true)
    protected PANInterfaceID interfaceID;
    @XmlElement(required = true)
    protected PANCommissionStatus commissionStatus;

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANInterfaceID }
     *     
     */
    public PANInterfaceID getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANInterfaceID }
     *     
     */
    public void setInterfaceID(PANInterfaceID value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the commissionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PANCommissionStatus }
     *     
     */
    public PANCommissionStatus getCommissionStatus() {
        return commissionStatus;
    }

    /**
     * Sets the value of the commissionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANCommissionStatus }
     *     
     */
    public void setCommissionStatus(PANCommissionStatus value) {
        this.commissionStatus = value;
    }

}
