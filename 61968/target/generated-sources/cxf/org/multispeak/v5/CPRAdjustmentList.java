
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for CPRAdjustmentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPRAdjustmentList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CPRAdjustments" type="{http://www.multispeak.org/V5.0}CPRAdjustments"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPRAdjustmentList", propOrder = {
    "cprAdjustments"
})
public class CPRAdjustmentList
    extends MspExtensible
{

    @XmlElement(name = "CPRAdjustments", required = true)
    protected CPRAdjustments cprAdjustments;

    /**
     * Gets the value of the cprAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link CPRAdjustments }
     *     
     */
    public CPRAdjustments getCPRAdjustments() {
        return cprAdjustments;
    }

    /**
     * Sets the value of the cprAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPRAdjustments }
     *     
     */
    public void setCPRAdjustments(CPRAdjustments value) {
        this.cprAdjustments = value;
    }

}
