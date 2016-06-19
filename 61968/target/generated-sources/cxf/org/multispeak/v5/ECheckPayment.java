
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for eCheckPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eCheckPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="tender" type="{http://www.multispeak.org/V5.0}tender"/>
 *         &lt;element name="checkInfo" type="{http://www.multispeak.org/V5.0}checkInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eCheckPayment", propOrder = {
    "tender",
    "checkInfo"
})
public class ECheckPayment
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Tender tender;
    protected CheckInfo checkInfo;

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link Tender }
     *     
     */
    public Tender getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tender }
     *     
     */
    public void setTender(Tender value) {
        this.tender = value;
    }

    /**
     * Gets the value of the checkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    /**
     * Sets the value of the checkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setCheckInfo(CheckInfo value) {
        this.checkInfo = value;
    }

}
