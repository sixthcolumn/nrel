
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for assemblyAccountingFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assemblyAccountingFields">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="cd740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblyAccountingFields", propOrder = {
    "cd740C",
    "ext740C"
})
public class AssemblyAccountingFields
    extends MspExtensible
{

    @XmlElement(name = "cd740c")
    protected String cd740C;
    @XmlElement(name = "ext740c")
    protected String ext740C;

    /**
     * Gets the value of the cd740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd740C() {
        return cd740C;
    }

    /**
     * Sets the value of the cd740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd740C(String value) {
        this.cd740C = value;
    }

    /**
     * Gets the value of the ext740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt740C() {
        return ext740C;
    }

    /**
     * Sets the value of the ext740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt740C(String value) {
        this.ext740C = value;
    }

}
