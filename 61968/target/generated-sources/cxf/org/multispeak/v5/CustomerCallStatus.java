
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ResolvedLevel;


/**
 * This class indicates the level to which a customer's outage call has been resolved.
 * 
 * <p>Java class for customerCallStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerCallStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="customerCallID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/V5.0/enumerations}resolvedLevel"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerCallStatus", propOrder = {
    "customerCallID",
    "resolvedLevel"
})
public class CustomerCallStatus
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID customerCallID;
    @XmlElement(required = true)
    protected ResolvedLevel resolvedLevel;

    /**
     * Gets the value of the customerCallID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerCallID() {
        return customerCallID;
    }

    /**
     * Sets the value of the customerCallID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerCallID(ObjectID value) {
        this.customerCallID = value;
    }

    /**
     * Gets the value of the resolvedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvedLevel }
     *     
     */
    public ResolvedLevel getResolvedLevel() {
        return resolvedLevel;
    }

    /**
     * Sets the value of the resolvedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvedLevel }
     *     
     */
    public void setResolvedLevel(ResolvedLevel value) {
        this.resolvedLevel = value;
    }

}
