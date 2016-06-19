
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propaneMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="propaneNameplate" type="{http://www.multispeak.org/Version_4.1_Release}propaneNameplate" minOccurs="0"/>
 *         &lt;element name="propaneLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}propaneLocationFields" minOccurs="0"/>
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
@XmlType(name = "propaneMeter", propOrder = {
    "propaneNameplate",
    "propaneLocationFields"
})
public class PropaneMeter
    extends MspMeter
{

    protected PropaneNameplate propaneNameplate;
    protected PropaneLocationFields propaneLocationFields;

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

    /**
     * Gets the value of the propaneLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneLocationFields }
     *     
     */
    public PropaneLocationFields getPropaneLocationFields() {
        return propaneLocationFields;
    }

    /**
     * Sets the value of the propaneLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneLocationFields }
     *     
     */
    public void setPropaneLocationFields(PropaneLocationFields value) {
        this.propaneLocationFields = value;
    }

}
