
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedGasMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedGasMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="gasNameplate" type="{http://www.multispeak.org/V5.0}gasNameplate" minOccurs="0"/>
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
@XmlType(name = "receivedGasMeter", propOrder = {
    "gasNameplate"
})
public class ReceivedGasMeter
    extends MspMeter
{

    protected GasNameplate gasNameplate;

    /**
     * Gets the value of the gasNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link GasNameplate }
     *     
     */
    public GasNameplate getGasNameplate() {
        return gasNameplate;
    }

    /**
     * Sets the value of the gasNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasNameplate }
     *     
     */
    public void setGasNameplate(GasNameplate value) {
        this.gasNameplate = value;
    }

}
