
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspMotorGenerator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMotorGenerator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="ssDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tranDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtdVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "mspMotorGenerator", propOrder = {
    "ssDesc",
    "tranDesc",
    "stDesc",
    "rtdVolts"
})
@XmlSeeAlso({
    Motor.class,
    Generator.class
})
public abstract class MspMotorGenerator
    extends MspElectricPoint
{

    protected String ssDesc;
    protected String tranDesc;
    protected String stDesc;
    protected Float rtdVolts;

    /**
     * Gets the value of the ssDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsDesc() {
        return ssDesc;
    }

    /**
     * Sets the value of the ssDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsDesc(String value) {
        this.ssDesc = value;
    }

    /**
     * Gets the value of the tranDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDesc() {
        return tranDesc;
    }

    /**
     * Sets the value of the tranDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDesc(String value) {
        this.tranDesc = value;
    }

    /**
     * Gets the value of the stDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStDesc() {
        return stDesc;
    }

    /**
     * Sets the value of the stDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStDesc(String value) {
        this.stDesc = value;
    }

    /**
     * Gets the value of the rtdVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRtdVolts() {
        return rtdVolts;
    }

    /**
     * Sets the value of the rtdVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRtdVolts(Float value) {
        this.rtdVolts = value;
    }

}
