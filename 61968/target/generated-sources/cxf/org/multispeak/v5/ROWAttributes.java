
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROWAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROWAttributes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="circuits" type="{http://www.multispeak.org/V5.0}circuits" minOccurs="0"/>
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
@XmlType(name = "ROWAttributes", propOrder = {
    "circuits"
})
public class ROWAttributes
    extends MspElectricalDefinition
{

    protected Circuits circuits;

    /**
     * Gets the value of the circuits property.
     * 
     * @return
     *     possible object is
     *     {@link Circuits }
     *     
     */
    public Circuits getCircuits() {
        return circuits;
    }

    /**
     * Sets the value of the circuits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Circuits }
     *     
     */
    public void setCircuits(Circuits value) {
        this.circuits = value;
    }

}
