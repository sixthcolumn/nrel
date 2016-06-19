
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * A set of CT and PT ratios that may be associated with an electric service or an electric meter base.
 * 
 * <p>Java class for instrumentTransformers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrumentTransformers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CTs" type="{http://www.multispeak.org/V5.0}CTs" minOccurs="0"/>
 *         &lt;element name="PTs" type="{http://www.multispeak.org/V5.0}PTs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrumentTransformers", propOrder = {
    "cTs",
    "pTs"
})
public class InstrumentTransformers
    extends MspExtensible
{

    @XmlElement(name = "CTs")
    protected CTs cTs;
    @XmlElement(name = "PTs")
    protected PTs pTs;

    /**
     * Gets the value of the cTs property.
     * 
     * @return
     *     possible object is
     *     {@link CTs }
     *     
     */
    public CTs getCTs() {
        return cTs;
    }

    /**
     * Sets the value of the cTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTs }
     *     
     */
    public void setCTs(CTs value) {
        this.cTs = value;
    }

    /**
     * Gets the value of the pTs property.
     * 
     * @return
     *     possible object is
     *     {@link PTs }
     *     
     */
    public PTs getPTs() {
        return pTs;
    }

    /**
     * Sets the value of the pTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTs }
     *     
     */
    public void setPTs(PTs value) {
        this.pTs = value;
    }

}
