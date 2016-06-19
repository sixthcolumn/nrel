
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ugPrimaryLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ugPrimaryLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="operVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="isInConduit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condPerPhase" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="lengthSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ugPrimaryLine", propOrder = {
    "operVolt",
    "isInConduit",
    "manufacturer",
    "condPerPhase",
    "lengthSrc"
})
public class UgPrimaryLine
    extends MspElectricLine
{

    protected Float operVolt;
    protected Boolean isInConduit;
    protected String manufacturer;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger condPerPhase;
    protected String lengthSrc;

    /**
     * Gets the value of the operVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOperVolt() {
        return operVolt;
    }

    /**
     * Sets the value of the operVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOperVolt(Float value) {
        this.operVolt = value;
    }

    /**
     * Gets the value of the isInConduit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInConduit() {
        return isInConduit;
    }

    /**
     * Sets the value of the isInConduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInConduit(Boolean value) {
        this.isInConduit = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the condPerPhase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCondPerPhase() {
        return condPerPhase;
    }

    /**
     * Sets the value of the condPerPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCondPerPhase(BigInteger value) {
        this.condPerPhase = value;
    }

    /**
     * Gets the value of the lengthSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthSrc() {
        return lengthSrc;
    }

    /**
     * Sets the value of the lengthSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthSrc(String value) {
        this.lengthSrc = value;
    }

}
