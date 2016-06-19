
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for J1939TroubleCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="J1939TroubleCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FMI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "J1939TroubleCode", propOrder = {
    "cm",
    "fmi",
    "oc",
    "spn"
})
public class J1939TroubleCode
    extends MspExtensible
{

    @XmlElement(name = "CM", required = true)
    protected String cm;
    @XmlElement(name = "FMI", required = true)
    protected String fmi;
    @XmlElement(name = "OC", required = true)
    protected String oc;
    @XmlElement(name = "SPN", required = true)
    protected String spn;

    /**
     * Gets the value of the cm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCM() {
        return cm;
    }

    /**
     * Sets the value of the cm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCM(String value) {
        this.cm = value;
    }

    /**
     * Gets the value of the fmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMI() {
        return fmi;
    }

    /**
     * Sets the value of the fmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMI(String value) {
        this.fmi = value;
    }

    /**
     * Gets the value of the oc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOC() {
        return oc;
    }

    /**
     * Sets the value of the oc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOC(String value) {
        this.oc = value;
    }

    /**
     * Gets the value of the spn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPN() {
        return spn;
    }

    /**
     * Sets the value of the spn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPN(String value) {
        this.spn = value;
    }

}
