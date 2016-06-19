
package org.multispeak.v5;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.enumerations.FieldNameKind;


/**
 * This is the readingType identifier as recommended in Annex C of IEC 61968-9, 2nd. Edition.  An example of the readingTypeCode would be "0.0.01.1.1.12.0.0.0.0.0.0.0.0.3.72.0".  The readingTypeCode is built up by concatenating the numerical values of each of the attributes (except "name" and "fieldName") in this element.  The readingTypeCode given above corresponds to "BulkQuantity forward electricitySecondaryMetered energy (kWh)".
 * 
 * <p>Java class for readingTypeCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypeCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="macroPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aggregate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="measuringPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flowDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commodity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="measurementKind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interharmonicNumerator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interharmonicDenominator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="argumentNumerator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="argumentDenominator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cpp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumptionTier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phases" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fieldName" type="{http://www.multispeak.org/V5.0/enumerations}fieldNameKind" />
 *       &lt;attribute name="otherFieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypeCode", propOrder = {
    "value"
})
public class ReadingTypeCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "macroPeriod")
    protected String macroPeriod;
    @XmlAttribute(name = "aggregate")
    protected String aggregate;
    @XmlAttribute(name = "measuringPeriod")
    protected String measuringPeriod;
    @XmlAttribute(name = "accumulation")
    protected String accumulation;
    @XmlAttribute(name = "flowDirection")
    protected String flowDirection;
    @XmlAttribute(name = "commodity")
    protected String commodity;
    @XmlAttribute(name = "measurementKind")
    protected String measurementKind;
    @XmlAttribute(name = "interharmonicNumerator")
    protected String interharmonicNumerator;
    @XmlAttribute(name = "interharmonicDenominator")
    protected String interharmonicDenominator;
    @XmlAttribute(name = "argumentNumerator")
    protected String argumentNumerator;
    @XmlAttribute(name = "argumentDenominator")
    protected String argumentDenominator;
    @XmlAttribute(name = "tou")
    protected String tou;
    @XmlAttribute(name = "cpp")
    protected String cpp;
    @XmlAttribute(name = "consumptionTier")
    protected String consumptionTier;
    @XmlAttribute(name = "phases")
    protected String phases;
    @XmlAttribute(name = "multiplier")
    protected String multiplier;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "fieldName")
    protected FieldNameKind fieldName;
    @XmlAttribute(name = "otherFieldName")
    protected String otherFieldName;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the macroPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacroPeriod() {
        return macroPeriod;
    }

    /**
     * Sets the value of the macroPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacroPeriod(String value) {
        this.macroPeriod = value;
    }

    /**
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregate(String value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the measuringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringPeriod() {
        return measuringPeriod;
    }

    /**
     * Sets the value of the measuringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringPeriod(String value) {
        this.measuringPeriod = value;
    }

    /**
     * Gets the value of the accumulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulation() {
        return accumulation;
    }

    /**
     * Sets the value of the accumulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulation(String value) {
        this.accumulation = value;
    }

    /**
     * Gets the value of the flowDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowDirection(String value) {
        this.flowDirection = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the measurementKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementKind() {
        return measurementKind;
    }

    /**
     * Sets the value of the measurementKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementKind(String value) {
        this.measurementKind = value;
    }

    /**
     * Gets the value of the interharmonicNumerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterharmonicNumerator() {
        return interharmonicNumerator;
    }

    /**
     * Sets the value of the interharmonicNumerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterharmonicNumerator(String value) {
        this.interharmonicNumerator = value;
    }

    /**
     * Gets the value of the interharmonicDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterharmonicDenominator() {
        return interharmonicDenominator;
    }

    /**
     * Sets the value of the interharmonicDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterharmonicDenominator(String value) {
        this.interharmonicDenominator = value;
    }

    /**
     * Gets the value of the argumentNumerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentNumerator() {
        return argumentNumerator;
    }

    /**
     * Sets the value of the argumentNumerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentNumerator(String value) {
        this.argumentNumerator = value;
    }

    /**
     * Gets the value of the argumentDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentDenominator() {
        return argumentDenominator;
    }

    /**
     * Sets the value of the argumentDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentDenominator(String value) {
        this.argumentDenominator = value;
    }

    /**
     * Gets the value of the tou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTou() {
        return tou;
    }

    /**
     * Sets the value of the tou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTou(String value) {
        this.tou = value;
    }

    /**
     * Gets the value of the cpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpp() {
        return cpp;
    }

    /**
     * Sets the value of the cpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpp(String value) {
        this.cpp = value;
    }

    /**
     * Gets the value of the consumptionTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionTier() {
        return consumptionTier;
    }

    /**
     * Sets the value of the consumptionTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionTier(String value) {
        this.consumptionTier = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhases(String value) {
        this.phases = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplier(String value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNameKind }
     *     
     */
    public FieldNameKind getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNameKind }
     *     
     */
    public void setFieldName(FieldNameKind value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the otherFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFieldName() {
        return otherFieldName;
    }

    /**
     * Sets the value of the otherFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFieldName(String value) {
        this.otherFieldName = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
