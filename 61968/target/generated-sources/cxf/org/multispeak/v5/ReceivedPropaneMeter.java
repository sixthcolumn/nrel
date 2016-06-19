
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedPropaneMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedPropaneMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="propaneNameplate" type="{http://www.multispeak.org/V5.0}propaneNameplate" minOccurs="0"/>
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
@XmlType(name = "receivedPropaneMeter", propOrder = {
    "propaneNameplate"
})
public class ReceivedPropaneMeter
    extends MspMeter
{

    protected PropaneNameplate propaneNameplate;

    /**
     * Gets the value of the propaneNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneNameplate }
     *     
     */
    public PropaneNameplate getPropaneNameplate() {
        return propaneNameplate;
    }

    /**
     * Sets the value of the propaneNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneNameplate }
     *     
     */
    public void setPropaneNameplate(PropaneNameplate value) {
        this.propaneNameplate = value;
    }

}
