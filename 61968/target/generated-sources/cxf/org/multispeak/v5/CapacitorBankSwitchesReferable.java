
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This is a message payload for sending capacitorBankSwitches and a reference to the bank on which they are applied.
 * 
 * <p>Java class for capacitorBankSwitchesReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorBankSwitchesReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="capacitorBankRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="capacitorBankSwitches" type="{http://www.multispeak.org/V5.0}capacitorBankSwitches"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitorBankSwitchesReferable", propOrder = {
    "capacitorBankRef",
    "capacitorBankSwitches"
})
public class CapacitorBankSwitchesReferable
    extends MspReferable
{

    protected ObjectRef capacitorBankRef;
    @XmlElement(required = true)
    protected CapacitorBankSwitches capacitorBankSwitches;

    /**
     * Gets the value of the capacitorBankRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getCapacitorBankRef() {
        return capacitorBankRef;
    }

    /**
     * Sets the value of the capacitorBankRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setCapacitorBankRef(ObjectRef value) {
        this.capacitorBankRef = value;
    }

    /**
     * Gets the value of the capacitorBankSwitches property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public CapacitorBankSwitches getCapacitorBankSwitches() {
        return capacitorBankSwitches;
    }

    /**
     * Sets the value of the capacitorBankSwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public void setCapacitorBankSwitches(CapacitorBankSwitches value) {
        this.capacitorBankSwitches = value;
    }

}
