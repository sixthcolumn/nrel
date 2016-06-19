
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspMotorGenerator">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="holdVoltsZ" type="{http://www.multispeak.org/Version_3.0}complexNum" minOccurs="0"/>
 *         &lt;element name="holdID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kwOut" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kwMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kvarLead" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kvarLag" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="srcVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="connected" type="{http://www.multispeak.org/Version_3.0}ldCon" minOccurs="0"/>
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
@XmlType(name = "generator", propOrder = {
    "model",
    "holdVoltsZ",
    "holdID",
    "kwOut",
    "kwMax",
    "kvarLead",
    "kvarLag",
    "srcVolts",
    "connected"
})
public class Generator
    extends MspMotorGenerator
{

    protected BigInteger model;
    protected ComplexNum holdVoltsZ;
    protected String holdID;
    protected Float kwOut;
    protected Float kwMax;
    protected Float kvarLead;
    protected Float kvarLag;
    protected Float srcVolts;
    protected LdCon connected;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModel(BigInteger value) {
        this.model = value;
    }

    /**
     * Gets the value of the holdVoltsZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNum }
     *     
     */
    public ComplexNum getHoldVoltsZ() {
        return holdVoltsZ;
    }

    /**
     * Sets the value of the holdVoltsZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNum }
     *     
     */
    public void setHoldVoltsZ(ComplexNum value) {
        this.holdVoltsZ = value;
    }

    /**
     * Gets the value of the holdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldID() {
        return holdID;
    }

    /**
     * Sets the value of the holdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldID(String value) {
        this.holdID = value;
    }

    /**
     * Gets the value of the kwOut property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwOut() {
        return kwOut;
    }

    /**
     * Sets the value of the kwOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwOut(Float value) {
        this.kwOut = value;
    }

    /**
     * Gets the value of the kwMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwMax() {
        return kwMax;
    }

    /**
     * Sets the value of the kwMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwMax(Float value) {
        this.kwMax = value;
    }

    /**
     * Gets the value of the kvarLead property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKvarLead() {
        return kvarLead;
    }

    /**
     * Sets the value of the kvarLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKvarLead(Float value) {
        this.kvarLead = value;
    }

    /**
     * Gets the value of the kvarLag property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKvarLag() {
        return kvarLag;
    }

    /**
     * Sets the value of the kvarLag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKvarLag(Float value) {
        this.kvarLag = value;
    }

    /**
     * Gets the value of the srcVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSrcVolts() {
        return srcVolts;
    }

    /**
     * Sets the value of the srcVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSrcVolts(Float value) {
        this.srcVolts = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     * @return
     *     possible object is
     *     {@link LdCon }
     *     
     */
    public LdCon getConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdCon }
     *     
     */
    public void setConnected(LdCon value) {
        this.connected = value;
    }

}
