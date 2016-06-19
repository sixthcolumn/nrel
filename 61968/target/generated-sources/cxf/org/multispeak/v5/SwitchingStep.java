
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for switchingStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingStep">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="stepNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="switchingStepWork" type="{http://www.multispeak.org/V5.0}switchingStepWork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingStep", propOrder = {
    "stepNumber",
    "switchingStepWork"
})
public class SwitchingStep
    extends MspExtensible
{

    @XmlElement(required = true)
    protected BigInteger stepNumber;
    protected SwitchingStepWork switchingStepWork;

    /**
     * Gets the value of the stepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStepNumber(BigInteger value) {
        this.stepNumber = value;
    }

    /**
     * Gets the value of the switchingStepWork property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingStepWork }
     *     
     */
    public SwitchingStepWork getSwitchingStepWork() {
        return switchingStepWork;
    }

    /**
     * Sets the value of the switchingStepWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingStepWork }
     *     
     */
    public void setSwitchingStepWork(SwitchingStepWork value) {
        this.switchingStepWork = value;
    }

}
