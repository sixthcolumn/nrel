
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fuse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fuse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspOverCurrentDevice">
 *       &lt;sequence>
 *         &lt;element name="linkRtg" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "fuse", propOrder = {
    "linkRtg"
})
public class Fuse
    extends MspOverCurrentDevice
{

    protected Float linkRtg;

    /**
     * Gets the value of the linkRtg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLinkRtg() {
        return linkRtg;
    }

    /**
     * Sets the value of the linkRtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLinkRtg(Float value) {
        this.linkRtg = value;
    }

}
