
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.Uom;


/**
 * There is one channel for each value being measured (e.g., kWh in, kWh out, kWh net would be three channels).
 * 
 * <p>Java class for intervalChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalChannel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="readingTypeCode" type="{http://www.multispeak.org/V5.0}readingTypeCode"/>
 *         &lt;element name="fieldDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.multispeak.org/V5.0/enumerations}uom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalChannel", propOrder = {
    "index",
    "readingTypeCode",
    "fieldDescription",
    "units"
})
public class IntervalChannel
    extends MspExtensible
{

    @XmlElement(required = true)
    protected BigInteger index;
    @XmlElement(required = true)
    protected ReadingTypeCode readingTypeCode;
    protected String fieldDescription;
    protected Uom units;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the readingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeCode }
     *     
     */
    public ReadingTypeCode getReadingTypeCode() {
        return readingTypeCode;
    }

    /**
     * Sets the value of the readingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeCode }
     *     
     */
    public void setReadingTypeCode(ReadingTypeCode value) {
        this.readingTypeCode = value;
    }

    /**
     * Gets the value of the fieldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Sets the value of the fieldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDescription(String value) {
        this.fieldDescription = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Uom }
     *     
     */
    public Uom getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uom }
     *     
     */
    public void setUnits(Uom value) {
        this.units = value;
    }

}
