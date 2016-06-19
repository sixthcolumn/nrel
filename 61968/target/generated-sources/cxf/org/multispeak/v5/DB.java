
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure carries a series of records (values), each matching the syntax described.
 * 
 * <p>Java class for dB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chs" type="{http://www.multispeak.org/V5.0}chs"/>
 *         &lt;element name="cS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dB", propOrder = {
    "chs",
    "cs"
})
public class DB {

    @XmlElement(required = true)
    protected Chs chs;
    @XmlElement(name = "cS")
    protected String cs;

    /**
     * Gets the value of the chs property.
     * 
     * @return
     *     possible object is
     *     {@link Chs }
     *     
     */
    public Chs getChs() {
        return chs;
    }

    /**
     * Sets the value of the chs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chs }
     *     
     */
    public void setChs(Chs value) {
        this.chs = value;
    }

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCS() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCS(String value) {
        this.cs = value;
    }

}
