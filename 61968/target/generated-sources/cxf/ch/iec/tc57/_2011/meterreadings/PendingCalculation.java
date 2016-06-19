
package ch.iec.tc57._2011.meterreadings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * When present, a scalar conversion that needs to be
 * 				applied to every IntervalReading.value contained in IntervalBlock.
 * 				This conversion results in a new associated ReadingType, reflecting
 * 				the true dimensions of IntervalReading values after the conversion.
 * 			
 * 
 * <p>Java class for PendingCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplyBeforeAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="scalarDenominator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="scalarFloat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="scalarNumerator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ReadingType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingCalculation", propOrder = {
    "multiplyBeforeAdd",
    "offset",
    "scalarDenominator",
    "scalarFloat",
    "scalarNumerator",
    "readingType"
})
public class PendingCalculation {

    protected Boolean multiplyBeforeAdd;
    protected BigInteger offset;
    protected BigInteger scalarDenominator;
    protected Float scalarFloat;
    protected BigInteger scalarNumerator;
    @XmlElement(name = "ReadingType", required = true)
    protected PendingCalculation.ReadingType readingType;

    /**
     * Gets the value of the multiplyBeforeAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiplyBeforeAdd() {
        return multiplyBeforeAdd;
    }

    /**
     * Sets the value of the multiplyBeforeAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiplyBeforeAdd(Boolean value) {
        this.multiplyBeforeAdd = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Gets the value of the scalarDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScalarDenominator() {
        return scalarDenominator;
    }

    /**
     * Sets the value of the scalarDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScalarDenominator(BigInteger value) {
        this.scalarDenominator = value;
    }

    /**
     * Gets the value of the scalarFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScalarFloat() {
        return scalarFloat;
    }

    /**
     * Sets the value of the scalarFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScalarFloat(Float value) {
        this.scalarFloat = value;
    }

    /**
     * Gets the value of the scalarNumerator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScalarNumerator() {
        return scalarNumerator;
    }

    /**
     * Sets the value of the scalarNumerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScalarNumerator(BigInteger value) {
        this.scalarNumerator = value;
    }

    /**
     * Gets the value of the readingType property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCalculation.ReadingType }
     *     
     */
    public PendingCalculation.ReadingType getReadingType() {
        return readingType;
    }

    /**
     * Sets the value of the readingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCalculation.ReadingType }
     *     
     */
    public void setReadingType(PendingCalculation.ReadingType value) {
        this.readingType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReadingType {

        @XmlAttribute(name = "ref")
        protected String ref;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }

}
