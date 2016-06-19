
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}mspPhase" minOccurs="0"/>
 *         &lt;element name="kvar" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "capacitor", propOrder = {
    "phase",
    "kvar"
})
public class Capacitor
    extends MspObject
{

    protected MspPhase phase;
    protected Float kvar;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhase(MspPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the kvar property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKvar() {
        return kvar;
    }

    /**
     * Sets the value of the kvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKvar(Float value) {
        this.kvar = value;
    }

}
