
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspBankObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspBankObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="isGrounded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groundingImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspBankObject", propOrder = {
    "isGrounded",
    "groundingImpedance"
})
@XmlSeeAlso({
    TransformerBank.class,
    RegulatorBank.class,
    MspSwitchingBank.class,
    CapacitorBank.class
})
public abstract class MspBankObject
    extends MspElectricPoint
{

    protected Boolean isGrounded;
    protected ComplexImpedance groundingImpedance;

    /**
     * Gets the value of the isGrounded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGrounded() {
        return isGrounded;
    }

    /**
     * Sets the value of the isGrounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGrounded(Boolean value) {
        this.isGrounded = value;
    }

    /**
     * Gets the value of the groundingImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getGroundingImpedance() {
        return groundingImpedance;
    }

    /**
     * Sets the value of the groundingImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setGroundingImpedance(ComplexImpedance value) {
        this.groundingImpedance = value;
    }

}
