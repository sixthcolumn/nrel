
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is an abstract class from which concrete examples of location tracking device codes (sometimes referred to as vehicle modem codes) inherit.
 * 
 * <p>Java class for mspLTDeviceCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspLTDeviceCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="interpretedCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspLTDeviceCode", propOrder = {
    "interpretedCodeValue",
    "codeName",
    "actualCodeValue"
})
@XmlSeeAlso({
    ODBIITroubleCode.class,
    AlertCode.class,
    OtherCode.class
})
public class MspLTDeviceCode
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String interpretedCodeValue;
    @XmlElement(required = true)
    protected String codeName;
    protected String actualCodeValue;

    /**
     * Gets the value of the interpretedCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretedCodeValue() {
        return interpretedCodeValue;
    }

    /**
     * Sets the value of the interpretedCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretedCodeValue(String value) {
        this.interpretedCodeValue = value;
    }

    /**
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
    }

    /**
     * Gets the value of the actualCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualCodeValue() {
        return actualCodeValue;
    }

    /**
     * Sets the value of the actualCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualCodeValue(String value) {
        this.actualCodeValue = value;
    }

}
