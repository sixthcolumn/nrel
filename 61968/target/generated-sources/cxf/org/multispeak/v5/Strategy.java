
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is a description of a specific load management strategy to be employed.
 * 
 * <p>Java class for strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="strategyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationPoints" type="{http://www.multispeak.org/V5.0}applicationPoints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strategy", propOrder = {
    "strategyName",
    "applicationPoints"
})
public class Strategy
    extends MspExtensible
{

    protected String strategyName;
    protected ApplicationPoints applicationPoints;

    /**
     * Gets the value of the strategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Sets the value of the strategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyName(String value) {
        this.strategyName = value;
    }

    /**
     * Gets the value of the applicationPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPoints }
     *     
     */
    public ApplicationPoints getApplicationPoints() {
        return applicationPoints;
    }

    /**
     * Sets the value of the applicationPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPoints }
     *     
     */
    public void setApplicationPoints(ApplicationPoints value) {
        this.applicationPoints = value;
    }

}
