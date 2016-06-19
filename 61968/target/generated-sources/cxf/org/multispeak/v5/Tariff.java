
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * This is a utility tariff for service.  It is intended to model a rate tariff for utility service.
 * 
 * <p>Java class for tariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariff">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectivePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="tariffDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCharacteristics" type="{http://www.multispeak.org/V5.0}serviceCharacteristics" minOccurs="0"/>
 *         &lt;element name="flatCharges" type="{http://www.multispeak.org/V5.0}charges" minOccurs="0"/>
 *         &lt;element name="variablePricing" type="{http://www.multispeak.org/V5.0}rateComponent" minOccurs="0"/>
 *         &lt;element name="consumptionTiers" type="{http://www.multispeak.org/V5.0}consumptionTiers" minOccurs="0"/>
 *         &lt;element name="demandCharges" type="{http://www.multispeak.org/V5.0}demandCharges" minOccurs="0"/>
 *         &lt;element name="CPPSchedules" type="{http://www.multispeak.org/V5.0}CPPSchedules" minOccurs="0"/>
 *         &lt;element name="TOUSchedules" type="{http://www.multispeak.org/V5.0}TOUSchedules" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariff", propOrder = {
    "revenueClass",
    "purpose",
    "rateCode",
    "effectivePeriod",
    "tariffDescription",
    "serviceCharacteristics",
    "flatCharges",
    "variablePricing",
    "consumptionTiers",
    "demandCharges",
    "cppSchedules",
    "touSchedules"
})
public class Tariff
    extends MspObject
{

    @XmlElement(required = true)
    protected String revenueClass;
    protected String purpose;
    @XmlElement(required = true)
    protected String rateCode;
    protected TimePeriod effectivePeriod;
    protected String tariffDescription;
    protected ServiceCharacteristics serviceCharacteristics;
    protected Charges flatCharges;
    protected RateComponent variablePricing;
    protected ConsumptionTiers consumptionTiers;
    protected DemandCharges demandCharges;
    @XmlElement(name = "CPPSchedules")
    protected CPPSchedules cppSchedules;
    @XmlElement(name = "TOUSchedules")
    protected TOUSchedules touSchedules;

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setEffectivePeriod(TimePeriod value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Sets the value of the tariffDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffDescription(String value) {
        this.tariffDescription = value;
    }

    /**
     * Gets the value of the serviceCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCharacteristics }
     *     
     */
    public ServiceCharacteristics getServiceCharacteristics() {
        return serviceCharacteristics;
    }

    /**
     * Sets the value of the serviceCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCharacteristics }
     *     
     */
    public void setServiceCharacteristics(ServiceCharacteristics value) {
        this.serviceCharacteristics = value;
    }

    /**
     * Gets the value of the flatCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Charges }
     *     
     */
    public Charges getFlatCharges() {
        return flatCharges;
    }

    /**
     * Sets the value of the flatCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges }
     *     
     */
    public void setFlatCharges(Charges value) {
        this.flatCharges = value;
    }

    /**
     * Gets the value of the variablePricing property.
     * 
     * @return
     *     possible object is
     *     {@link RateComponent }
     *     
     */
    public RateComponent getVariablePricing() {
        return variablePricing;
    }

    /**
     * Sets the value of the variablePricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateComponent }
     *     
     */
    public void setVariablePricing(RateComponent value) {
        this.variablePricing = value;
    }

    /**
     * Gets the value of the consumptionTiers property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTiers }
     *     
     */
    public ConsumptionTiers getConsumptionTiers() {
        return consumptionTiers;
    }

    /**
     * Sets the value of the consumptionTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTiers }
     *     
     */
    public void setConsumptionTiers(ConsumptionTiers value) {
        this.consumptionTiers = value;
    }

    /**
     * Gets the value of the demandCharges property.
     * 
     * @return
     *     possible object is
     *     {@link DemandCharges }
     *     
     */
    public DemandCharges getDemandCharges() {
        return demandCharges;
    }

    /**
     * Sets the value of the demandCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandCharges }
     *     
     */
    public void setDemandCharges(DemandCharges value) {
        this.demandCharges = value;
    }

    /**
     * Gets the value of the cppSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link CPPSchedules }
     *     
     */
    public CPPSchedules getCPPSchedules() {
        return cppSchedules;
    }

    /**
     * Sets the value of the cppSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPPSchedules }
     *     
     */
    public void setCPPSchedules(CPPSchedules value) {
        this.cppSchedules = value;
    }

    /**
     * Gets the value of the touSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link TOUSchedules }
     *     
     */
    public TOUSchedules getTOUSchedules() {
        return touSchedules;
    }

    /**
     * Sets the value of the touSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOUSchedules }
     *     
     */
    public void setTOUSchedules(TOUSchedules value) {
        this.touSchedules = value;
    }

}
