
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldNameKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldNameKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PosKWh"/>
 *     &lt;enumeration value="NegKWh"/>
 *     &lt;enumeration value="PosKWhDateTime"/>
 *     &lt;enumeration value="NegKWhDateTime"/>
 *     &lt;enumeration value="MaxDemand"/>
 *     &lt;enumeration value="MaxDemandDateTime"/>
 *     &lt;enumeration value="CumulativeDemand"/>
 *     &lt;enumeration value="CumulativeDemandDateTime"/>
 *     &lt;enumeration value="TOU1kWh"/>
 *     &lt;enumeration value="TOU1kWhDateTime"/>
 *     &lt;enumeration value="TOU1MaxDemand"/>
 *     &lt;enumeration value="TOU1MaxDemandDateTime"/>
 *     &lt;enumeration value="TOU1CumulativeDemand"/>
 *     &lt;enumeration value="TOU1CumulativeDemandDateTime"/>
 *     &lt;enumeration value="TOU2kWh"/>
 *     &lt;enumeration value="TOU2kWhDateTime"/>
 *     &lt;enumeration value="TOU2MaxDemand"/>
 *     &lt;enumeration value="TOU2MaxDemandDateTime"/>
 *     &lt;enumeration value="TOU2CumulativeDemand"/>
 *     &lt;enumeration value="TOU2CumulativeDemandDateTime"/>
 *     &lt;enumeration value="TOU3kWh"/>
 *     &lt;enumeration value="TOU3kWhDateTime"/>
 *     &lt;enumeration value="TOU3MaxDemand"/>
 *     &lt;enumeration value="TOU3MaxDemandDateTime"/>
 *     &lt;enumeration value="TOU3CumulativeDemand"/>
 *     &lt;enumeration value="TOU3CumulativeDemandDateTime"/>
 *     &lt;enumeration value="TOU4kWh"/>
 *     &lt;enumeration value="TOU4KWhDateTime"/>
 *     &lt;enumeration value="TOU4MaxDemand"/>
 *     &lt;enumeration value="TOU4MaxDemandDateTime"/>
 *     &lt;enumeration value="TOU4CumulativeDemand"/>
 *     &lt;enumeration value="TOU4CumulativeDemandDateTime"/>
 *     &lt;enumeration value="TOU5kWh"/>
 *     &lt;enumeration value="TOU5kWhDateTime"/>
 *     &lt;enumeration value="TOU5MaxDemand"/>
 *     &lt;enumeration value="TOU5MaxDemandDateTime"/>
 *     &lt;enumeration value="TOU5CumulativeDemand"/>
 *     &lt;enumeration value="TOU5CumulativeDemandDateTime"/>
 *     &lt;enumeration value="PreviousPosKWh"/>
 *     &lt;enumeration value="PreviousNegKWh"/>
 *     &lt;enumeration value="PreviousPosKWhDateTime"/>
 *     &lt;enumeration value="PreviousNegKWhDateTime"/>
 *     &lt;enumeration value="PreviousMaxDemand"/>
 *     &lt;enumeration value="PreviousMaxDemandDateTime"/>
 *     &lt;enumeration value="PreviousCumulativeDemand"/>
 *     &lt;enumeration value="PreviousCumulativeDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU1kWh"/>
 *     &lt;enumeration value="PreviousTOU1KWhDateTime"/>
 *     &lt;enumeration value="PreviousTOU1MaxDemand"/>
 *     &lt;enumeration value="PreviousTOU1MaxDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU1CumulativeDemand"/>
 *     &lt;enumeration value="PreviousTOU1CumulativeDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU2kWh"/>
 *     &lt;enumeration value="PreviousTOU2KWhDateTime"/>
 *     &lt;enumeration value="PreviousTOU2MaxDemand"/>
 *     &lt;enumeration value="PreviousTOU2MaxDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU2CumulativeDemand"/>
 *     &lt;enumeration value="PreviousTOU2CumulativeDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU3kWh"/>
 *     &lt;enumeration value="PreviousTOU3KWhDateTime"/>
 *     &lt;enumeration value="PreviousTOU3MaxDemand"/>
 *     &lt;enumeration value="PreviousTOU3MaxDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU3CumulativeDemand"/>
 *     &lt;enumeration value="PreviousTOU3CumulativeDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU4kWh"/>
 *     &lt;enumeration value="PreviousTOU4KWhDateTime"/>
 *     &lt;enumeration value="PreviousTOU4MaxDemand"/>
 *     &lt;enumeration value="PreviousTOU4MaxDemandDateTime"/>
 *     &lt;enumeration value="PreviousTOU4CumulativeDemand"/>
 *     &lt;enumeration value="PreviousTOU4CumulativeDemandDateTime"/>
 *     &lt;enumeration value="Voltage"/>
 *     &lt;enumeration value="MinVoltage"/>
 *     &lt;enumeration value="MaxVoltage"/>
 *     &lt;enumeration value="ServiceType"/>
 *     &lt;enumeration value="RatePeriod"/>
 *     &lt;enumeration value="MomentaryOutage"/>
 *     &lt;enumeration value="MomentaryEvent"/>
 *     &lt;enumeration value="SustainedOutage"/>
 *     &lt;enumeration value="LoadActionCode"/>
 *     &lt;enumeration value="OutageState"/>
 *     &lt;enumeration value="MeterName"/>
 *     &lt;enumeration value="SerialNumber"/>
 *     &lt;enumeration value="Manufacturer"/>
 *     &lt;enumeration value="AMRType"/>
 *     &lt;enumeration value="AMRMeterType"/>
 *     &lt;enumeration value="BillingGroup"/>
 *     &lt;enumeration value="SubstationName"/>
 *     &lt;enumeration value="Feeder"/>
 *     &lt;enumeration value="PhaseCode"/>
 *     &lt;enumeration value="Frequency"/>
 *     &lt;enumeration value="SignalStrength"/>
 *     &lt;enumeration value="Tamper"/>
 *     &lt;enumeration value="Leak"/>
 *     &lt;enumeration value="CustomerID"/>
 *     &lt;enumeration value="ServiceLocationID"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="TransponderID"/>
 *     &lt;enumeration value="CalcDm1"/>
 *     &lt;enumeration value="CalcDm1T"/>
 *     &lt;enumeration value="CalcDm1D"/>
 *     &lt;enumeration value="PreviousCoincidentKVA"/>
 *     &lt;enumeration value="PreviousCoincidentKVAR"/>
 *     &lt;enumeration value="PFAvg"/>
 *     &lt;enumeration value="PFCoincident1"/>
 *     &lt;enumeration value="PFCoincident2"/>
 *     &lt;enumeration value="RollingKW1"/>
 *     &lt;enumeration value="RollingKW2"/>
 *     &lt;enumeration value="MaxMUDmd"/>
 *     &lt;enumeration value="MaxMUDemandDate"/>
 *     &lt;enumeration value="PreviousMaxMUDemand"/>
 *     &lt;enumeration value="PreviousMaxMUDemandDate"/>
 *     &lt;enumeration value="CollectorName"/>
 *     &lt;enumeration value="UnscaledReading"/>
 *     &lt;enumeration value="kWhADRR"/>
 *     &lt;enumeration value="kWhBDRR"/>
 *     &lt;enumeration value="NetKWh"/>
 *     &lt;enumeration value="TotalKWh"/>
 *     &lt;enumeration value="PosKVAh"/>
 *     &lt;enumeration value="NegKVAh"/>
 *     &lt;enumeration value="TotalKVAh"/>
 *     &lt;enumeration value="PosKVARh"/>
 *     &lt;enumeration value="NetKVARh"/>
 *     &lt;enumeration value="TotalKVARh"/>
 *     &lt;enumeration value="CorrectedGasVolume"/>
 *     &lt;enumeration value="UncorrectedGasVolume"/>
 *     &lt;enumeration value="WaterVolume"/>
 *     &lt;enumeration value="TOU2PosKWh"/>
 *     &lt;enumeration value="TOU2NegKWh"/>
 *     &lt;enumeration value="TOU2NetKWh"/>
 *     &lt;enumeration value="TOU2TotalKWh"/>
 *     &lt;enumeration value="kVArDelMaxRateE"/>
 *     &lt;enumeration value="kVArDelTimeRateE"/>
 *     &lt;enumeration value="kVArSumMaxRateE"/>
 *     &lt;enumeration value="kVArSumTimeRateE"/>
 *     &lt;enumeration value="PkVADelTimeRateE"/>
 *     &lt;enumeration value="PkVASumMaxRateE"/>
 *     &lt;enumeration value="PkVASumTimeRateE"/>
 *     &lt;enumeration value="PkVAhNetRateA"/>
 *     &lt;enumeration value="PkVAhNetRateB"/>
 *     &lt;enumeration value="PkVAhSumRateE"/>
 *     &lt;enumeration value="kVARhDelRateE"/>
 *     &lt;enumeration value="kVARhNetRateE"/>
 *     &lt;enumeration value="kVARhSumRateE"/>
 *     &lt;enumeration value="kVARhRcvdRateE"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fieldNameKind")
@XmlEnum
public enum FieldNameKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * kWh – positive energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PosKWh")
    POS_K_WH("PosKWh"),

    /**
     * kWh – negative energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("NegKWh")
    NEG_K_WH("NegKWh"),

    /**
     * kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PosKWhDateTime")
    POS_K_WH_DATE_TIME("PosKWhDateTime"),

    /**
     * kWh – negative energy recorded timestamp
     * 
     */
    @XmlEnumValue("NegKWhDateTime")
    NEG_K_WH_DATE_TIME("NegKWhDateTime"),

    /**
     * Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("MaxDemand")
    MAX_DEMAND("MaxDemand"),

    /**
     * Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("MaxDemandDateTime")
    MAX_DEMAND_DATE_TIME("MaxDemandDateTime"),

    /**
     * Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("CumulativeDemand")
    CUMULATIVE_DEMAND("CumulativeDemand"),

    /**
     * Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("CumulativeDemandDateTime")
    CUMULATIVE_DEMAND_DATE_TIME("CumulativeDemandDateTime"),

    /**
     * TOU1 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("TOU1kWh")
    TOU_1_K_WH("TOU1kWh"),

    /**
     * TOU1 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU1kWhDateTime")
    TOU_1_K_WH_DATE_TIME("TOU1kWhDateTime"),

    /**
     * TOU1 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU1MaxDemand")
    TOU_1_MAX_DEMAND("TOU1MaxDemand"),

    /**
     * TOU1 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU1MaxDemandDateTime")
    TOU_1_MAX_DEMAND_DATE_TIME("TOU1MaxDemandDateTime"),

    /**
     * TOU1 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU1CumulativeDemand")
    TOU_1_CUMULATIVE_DEMAND("TOU1CumulativeDemand"),

    /**
     * TOU1 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU1CumulativeDemandDateTime")
    TOU_1_CUMULATIVE_DEMAND_DATE_TIME("TOU1CumulativeDemandDateTime"),

    /**
     * TOU2 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("TOU2kWh")
    TOU_2_K_WH("TOU2kWh"),

    /**
     * TOU2 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("TOU2kWhDateTime")
    TOU_2_K_WH_DATE_TIME("TOU2kWhDateTime"),

    /**
     * TOU2 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU2MaxDemand")
    TOU_2_MAX_DEMAND("TOU2MaxDemand"),

    /**
     * TOU2 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU2MaxDemandDateTime")
    TOU_2_MAX_DEMAND_DATE_TIME("TOU2MaxDemandDateTime"),

    /**
     * TOU2 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU2CumulativeDemand")
    TOU_2_CUMULATIVE_DEMAND("TOU2CumulativeDemand"),

    /**
     * TOU2 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU2CumulativeDemandDateTime")
    TOU_2_CUMULATIVE_DEMAND_DATE_TIME("TOU2CumulativeDemandDateTime"),

    /**
     * TOU3 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("TOU3kWh")
    TOU_3_K_WH("TOU3kWh"),

    /**
     * TOU3 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("TOU3kWhDateTime")
    TOU_3_K_WH_DATE_TIME("TOU3kWhDateTime"),

    /**
     * TOU3 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU3MaxDemand")
    TOU_3_MAX_DEMAND("TOU3MaxDemand"),

    /**
     * TOU3 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU3MaxDemandDateTime")
    TOU_3_MAX_DEMAND_DATE_TIME("TOU3MaxDemandDateTime"),

    /**
     * TOU3 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU3CumulativeDemand")
    TOU_3_CUMULATIVE_DEMAND("TOU3CumulativeDemand"),

    /**
     * TOU3 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU3CumulativeDemandDateTime")
    TOU_3_CUMULATIVE_DEMAND_DATE_TIME("TOU3CumulativeDemandDateTime"),

    /**
     * TOU4 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("TOU4kWh")
    TOU_4_K_WH("TOU4kWh"),

    /**
     * TOU4 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("TOU4KWhDateTime")
    TOU_4_K_WH_DATE_TIME("TOU4KWhDateTime"),

    /**
     * TOU4 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU4MaxDemand")
    TOU_4_MAX_DEMAND("TOU4MaxDemand"),

    /**
     * TOU4 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU4MaxDemandDateTime")
    TOU_4_MAX_DEMAND_DATE_TIME("TOU4MaxDemandDateTime"),

    /**
     * TOU4 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU4CumulativeDemand")
    TOU_4_CUMULATIVE_DEMAND("TOU4CumulativeDemand"),

    /**
     * TOU4 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU4CumulativeDemandDateTime")
    TOU_4_CUMULATIVE_DEMAND_DATE_TIME("TOU4CumulativeDemandDateTime"),

    /**
     * TOU5 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("TOU5kWh")
    TOU_5_K_WH("TOU5kWh"),

    /**
     * TOU5 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("TOU5kWhDateTime")
    TOU_5_K_WH_DATE_TIME("TOU5kWhDateTime"),

    /**
     * TOU5 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU5MaxDemand")
    TOU_5_MAX_DEMAND("TOU5MaxDemand"),

    /**
     * TOU5 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU5MaxDemandDateTime")
    TOU_5_MAX_DEMAND_DATE_TIME("TOU5MaxDemandDateTime"),

    /**
     * TOU5 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("TOU5CumulativeDemand")
    TOU_5_CUMULATIVE_DEMAND("TOU5CumulativeDemand"),

    /**
     * TOU5 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("TOU5CumulativeDemandDateTime")
    TOU_5_CUMULATIVE_DEMAND_DATE_TIME("TOU5CumulativeDemandDateTime"),

    /**
     * Previous kWh – positive energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousPosKWh")
    PREVIOUS_POS_K_WH("PreviousPosKWh"),

    /**
     * Previous kWh – negative energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousNegKWh")
    PREVIOUS_NEG_K_WH("PreviousNegKWh"),

    /**
     * Previous kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousPosKWhDateTime")
    PREVIOUS_POS_K_WH_DATE_TIME("PreviousPosKWhDateTime"),

    /**
     * Previous kWh – negative energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousNegKWhDateTime")
    PREVIOUS_NEG_K_WH_DATE_TIME("PreviousNegKWhDateTime"),

    /**
     * Previous Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousMaxDemand")
    PREVIOUS_MAX_DEMAND("PreviousMaxDemand"),

    /**
     * Previous Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousMaxDemandDateTime")
    PREVIOUS_MAX_DEMAND_DATE_TIME("PreviousMaxDemandDateTime"),

    /**
     * Previous Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousCumulativeDemand")
    PREVIOUS_CUMULATIVE_DEMAND("PreviousCumulativeDemand"),

    /**
     * Previous Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousCumulativeDemandDateTime")
    PREVIOUS_CUMULATIVE_DEMAND_DATE_TIME("PreviousCumulativeDemandDateTime"),

    /**
     * Previous TOU1 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousTOU1kWh")
    PREVIOUS_TOU_1_K_WH("PreviousTOU1kWh"),

    /**
     * Previous TOU1 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU1KWhDateTime")
    PREVIOUS_TOU_1_K_WH_DATE_TIME("PreviousTOU1KWhDateTime"),

    /**
     * Previous TOU1 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU1MaxDemand")
    PREVIOUS_TOU_1_MAX_DEMAND("PreviousTOU1MaxDemand"),

    /**
     * Previous TOU1 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU1MaxDemandDateTime")
    PREVIOUS_TOU_1_MAX_DEMAND_DATE_TIME("PreviousTOU1MaxDemandDateTime"),

    /**
     * Previous TOU1 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU1CumulativeDemand")
    PREVIOUS_TOU_1_CUMULATIVE_DEMAND("PreviousTOU1CumulativeDemand"),

    /**
     * Previous TOU1 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU1CumulativeDemandDateTime")
    PREVIOUS_TOU_1_CUMULATIVE_DEMAND_DATE_TIME("PreviousTOU1CumulativeDemandDateTime"),

    /**
     * Previous TOU2 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousTOU2kWh")
    PREVIOUS_TOU_2_K_WH("PreviousTOU2kWh"),

    /**
     * Previous TOU2 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU2KWhDateTime")
    PREVIOUS_TOU_2_K_WH_DATE_TIME("PreviousTOU2KWhDateTime"),

    /**
     * Previous TOU2 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU2MaxDemand")
    PREVIOUS_TOU_2_MAX_DEMAND("PreviousTOU2MaxDemand"),

    /**
     * Previous TOU2 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU2MaxDemandDateTime")
    PREVIOUS_TOU_2_MAX_DEMAND_DATE_TIME("PreviousTOU2MaxDemandDateTime"),

    /**
     * Previous TOU2 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU2CumulativeDemand")
    PREVIOUS_TOU_2_CUMULATIVE_DEMAND("PreviousTOU2CumulativeDemand"),

    /**
     * Previous TOU2 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU2CumulativeDemandDateTime")
    PREVIOUS_TOU_2_CUMULATIVE_DEMAND_DATE_TIME("PreviousTOU2CumulativeDemandDateTime"),

    /**
     * Previous TOU3 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousTOU3kWh")
    PREVIOUS_TOU_3_K_WH("PreviousTOU3kWh"),

    /**
     * Previous TOU3 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU3KWhDateTime")
    PREVIOUS_TOU_3_K_WH_DATE_TIME("PreviousTOU3KWhDateTime"),

    /**
     * Previous TOU3 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU3MaxDemand")
    PREVIOUS_TOU_3_MAX_DEMAND("PreviousTOU3MaxDemand"),

    /**
     * Previous TOU3 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU3MaxDemandDateTime")
    PREVIOUS_TOU_3_MAX_DEMAND_DATE_TIME("PreviousTOU3MaxDemandDateTime"),

    /**
     * Previous TOU3 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU3CumulativeDemand")
    PREVIOUS_TOU_3_CUMULATIVE_DEMAND("PreviousTOU3CumulativeDemand"),

    /**
     * Previous TOU3 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU3CumulativeDemandDateTime")
    PREVIOUS_TOU_3_CUMULATIVE_DEMAND_DATE_TIME("PreviousTOU3CumulativeDemandDateTime"),

    /**
     * Previous TOU4 kWh – energy recorded (expressed in kWh)
     * 
     */
    @XmlEnumValue("PreviousTOU4kWh")
    PREVIOUS_TOU_4_K_WH("PreviousTOU4kWh"),

    /**
     * Previous TOU4 kWh – positive energy recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU4KWhDateTime")
    PREVIOUS_TOU_4_K_WH_DATE_TIME("PreviousTOU4KWhDateTime"),

    /**
     * Previous TOU4 Max demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU4MaxDemand")
    PREVIOUS_TOU_4_MAX_DEMAND("PreviousTOU4MaxDemand"),

    /**
     * Previous TOU4 Max demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU4MaxDemandDateTime")
    PREVIOUS_TOU_4_MAX_DEMAND_DATE_TIME("PreviousTOU4MaxDemandDateTime"),

    /**
     * Previous TOU4 Cumulative demand recorded expressed as kW
     * 
     */
    @XmlEnumValue("PreviousTOU4CumulativeDemand")
    PREVIOUS_TOU_4_CUMULATIVE_DEMAND("PreviousTOU4CumulativeDemand"),

    /**
     * Previous TOU4 Cumulative demand recorded timestamp
     * 
     */
    @XmlEnumValue("PreviousTOU4CumulativeDemandDateTime")
    PREVIOUS_TOU_4_CUMULATIVE_DEMAND_DATE_TIME("PreviousTOU4CumulativeDemandDateTime"),

    /**
     * Voltage
     * 
     */
    @XmlEnumValue("Voltage")
    VOLTAGE("Voltage"),

    /**
     * Minimum voltage
     * 
     */
    @XmlEnumValue("MinVoltage")
    MIN_VOLTAGE("MinVoltage"),

    /**
     * Maximum voltage
     * 
     */
    @XmlEnumValue("MaxVoltage")
    MAX_VOLTAGE("MaxVoltage"),

    /**
     * Type of service (Electric |Gas | Water | Propane | Refuse | Sewer | Telecom | TV | Cable | Heating | Steam | Transportation |All |Other)
     * 
     */
    @XmlEnumValue("ServiceType")
    SERVICE_TYPE("ServiceType"),

    /**
     * blank), 1, 2, 3, 4, 5 … where blank represents total or default register
     * 
     */
    @XmlEnumValue("RatePeriod")
    RATE_PERIOD("RatePeriod"),
    @XmlEnumValue("MomentaryOutage")
    MOMENTARY_OUTAGE("MomentaryOutage"),
    @XmlEnumValue("MomentaryEvent")
    MOMENTARY_EVENT("MomentaryEvent"),
    @XmlEnumValue("SustainedOutage")
    SUSTAINED_OUTAGE("SustainedOutage"),

    /**
     * See enumeration list for loadActionCode.
     * 
     */
    @XmlEnumValue("LoadActionCode")
    LOAD_ACTION_CODE("LoadActionCode"),
    @XmlEnumValue("OutageState")
    OUTAGE_STATE("OutageState"),

    /**
     * Meter name.  This is a human-readable identifier for this meter.
     * 
     */
    @XmlEnumValue("MeterName")
    METER_NAME("MeterName"),

    /**
     * Meter.SerialNumber
     * 
     */
    @XmlEnumValue("SerialNumber")
    SERIAL_NUMBER("SerialNumber"),

    /**
     * Meter.Manufacturer
     * 
     */
    @XmlEnumValue("Manufacturer")
    MANUFACTURER("Manufacturer"),

    /**
     * Meter.AMRType - AMR vendor type
     * 
     */
    @XmlEnumValue("AMRType")
    AMR_TYPE("AMRType"),

    /**
     * Meter.AMRMeterType - AMR Meter type
     * 
     */
    @XmlEnumValue("AMRMeterType")
    AMR_METER_TYPE("AMRMeterType"),

    /**
     * ServiceLocation.Billing\Group
     * 
     */
    @XmlEnumValue("BillingGroup")
    BILLING_GROUP("BillingGroup"),

    /**
     * UtilityInfo.SubstationName
     * 
     */
    @XmlEnumValue("SubstationName")
    SUBSTATION_NAME("SubstationName"),

    /**
     * UtilityInfo.Feeder
     * 
     */
    @XmlEnumValue("Feeder")
    FEEDER("Feeder"),

    /**
     * Phase code.
     * 
     */
    @XmlEnumValue("PhaseCode")
    PHASE_CODE("PhaseCode"),

    /**
     * Frequency.value
     * 
     */
    @XmlEnumValue("Frequency")
    FREQUENCY("Frequency"),
    @XmlEnumValue("SignalStrength")
    SIGNAL_STRENGTH("SignalStrength"),

    /**
     * Tamper flag.
     * 
     */
    @XmlEnumValue("Tamper")
    TAMPER("Tamper"),

    /**
     * Leak Flag
     * 
     */
    @XmlEnumValue("Leak")
    LEAK("Leak"),

    /**
     * CustomerID.
     * 
     */
    @XmlEnumValue("CustomerID")
    CUSTOMER_ID("CustomerID"),

    /**
     * ServiceLocationID.
     * 
     */
    @XmlEnumValue("ServiceLocationID")
    SERVICE_LOCATION_ID("ServiceLocationID"),

    /**
     * Customer account number.
     * 
     */
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),

    /**
     * UtilityInfo.TransponderID - Endpoint Serial Number
     * 
     */
    @XmlEnumValue("TransponderID")
    TRANSPONDER_ID("TransponderID"),

    /**
     * Derived Max kW 1
     * 
     */
    @XmlEnumValue("CalcDm1")
    CALC_DM_1("CalcDm1"),

    /**
     * Derived Max kW 1 Time
     * 
     */
    @XmlEnumValue("CalcDm1T")
    CALC_DM_1_T("CalcDm1T"),

    /**
     * Derived Max kW 1 Date
     * 
     */
    @XmlEnumValue("CalcDm1D")
    CALC_DM_1_D("CalcDm1D"),

    /**
     * Previous Coincident kVA
     * 
     */
    @XmlEnumValue("PreviousCoincidentKVA")
    PREVIOUS_COINCIDENT_KVA("PreviousCoincidentKVA"),

    /**
     * Previous Coincident kVAR
     * 
     */
    @XmlEnumValue("PreviousCoincidentKVAR")
    PREVIOUS_COINCIDENT_KVAR("PreviousCoincidentKVAR"),

    /**
     * Average Power Factor
     * 
     */
    @XmlEnumValue("PFAvg")
    PF_AVG("PFAvg"),

    /**
     * Coincident Power Factor 1
     * 
     */
    @XmlEnumValue("PFCoincident1")
    PF_COINCIDENT_1("PFCoincident1"),

    /**
     * Coincident Power Factor 2
     * 
     */
    @XmlEnumValue("PFCoincident2")
    PF_COINCIDENT_2("PFCoincident2"),

    /**
     * Primary Rolling kW
     * 
     */
    @XmlEnumValue("RollingKW1")
    ROLLING_KW_1("RollingKW1"),

    /**
     * Secondary Rolling kW
     * 
     */
    @XmlEnumValue("RollingKW2")
    ROLLING_KW_2("RollingKW2"),

    /**
     * Derived Max MU Demand
     * 
     */
    @XmlEnumValue("MaxMUDmd")
    MAX_MU_DMD("MaxMUDmd"),

    /**
     * Date
     * 
     */
    @XmlEnumValue("MaxMUDemandDate")
    MAX_MU_DEMAND_DATE("MaxMUDemandDate"),

    /**
     * Previous Max MU Demand
     * 
     */
    @XmlEnumValue("PreviousMaxMUDemand")
    PREVIOUS_MAX_MU_DEMAND("PreviousMaxMUDemand"),

    /**
     * Date
     * 
     */
    @XmlEnumValue("PreviousMaxMUDemandDate")
    PREVIOUS_MAX_MU_DEMAND_DATE("PreviousMaxMUDemandDate"),

    /**
     * Collection Device Name
     * 
     */
    @XmlEnumValue("CollectorName")
    COLLECTOR_NAME("CollectorName"),

    /**
     * Unscaled Reading
     * 
     */
    @XmlEnumValue("UnscaledReading")
    UNSCALED_READING("UnscaledReading"),

    /**
     * kWh Rate A DRR
     * 
     */
    @XmlEnumValue("kWhADRR")
    K_WH_ADRR("kWhADRR"),

    /**
     * kWh Rate B DRR
     * 
     */
    @XmlEnumValue("kWhBDRR")
    K_WH_BDRR("kWhBDRR"),
    @XmlEnumValue("NetKWh")
    NET_K_WH("NetKWh"),
    @XmlEnumValue("TotalKWh")
    TOTAL_K_WH("TotalKWh"),
    @XmlEnumValue("PosKVAh")
    POS_KV_AH("PosKVAh"),
    @XmlEnumValue("NegKVAh")
    NEG_KV_AH("NegKVAh"),
    @XmlEnumValue("TotalKVAh")
    TOTAL_KV_AH("TotalKVAh"),
    @XmlEnumValue("PosKVARh")
    POS_KVA_RH("PosKVARh"),
    @XmlEnumValue("NetKVARh")
    NET_KVA_RH("NetKVARh"),
    @XmlEnumValue("TotalKVARh")
    TOTAL_KVA_RH("TotalKVARh"),
    @XmlEnumValue("CorrectedGasVolume")
    CORRECTED_GAS_VOLUME("CorrectedGasVolume"),
    @XmlEnumValue("UncorrectedGasVolume")
    UNCORRECTED_GAS_VOLUME("UncorrectedGasVolume"),
    @XmlEnumValue("WaterVolume")
    WATER_VOLUME("WaterVolume"),
    @XmlEnumValue("TOU2PosKWh")
    TOU_2_POS_K_WH("TOU2PosKWh"),
    @XmlEnumValue("TOU2NegKWh")
    TOU_2_NEG_K_WH("TOU2NegKWh"),
    @XmlEnumValue("TOU2NetKWh")
    TOU_2_NET_K_WH("TOU2NetKWh"),
    @XmlEnumValue("TOU2TotalKWh")
    TOU_2_TOTAL_K_WH("TOU2TotalKWh"),

    /**
     * kVAR - (Q1+Q2) Max Rate E
     * 
     */
    @XmlEnumValue("kVArDelMaxRateE")
    K_V_AR_DEL_MAX_RATE_E("kVArDelMaxRateE"),

    /**
     * kVAR - (Q1+Q2) Time Rate E
     * 
     */
    @XmlEnumValue("kVArDelTimeRateE")
    K_V_AR_DEL_TIME_RATE_E("kVArDelTimeRateE"),

    /**
     * kVAR - (Q1+Q2) + (Q3+Q4) Max Rate E
     * 
     */
    @XmlEnumValue("kVArSumMaxRateE")
    K_V_AR_SUM_MAX_RATE_E("kVArSumMaxRateE"),

    /**
     * kVAR - (Q1+Q2) + (Q3+Q4) Time Rate E
     * 
     */
    @XmlEnumValue("kVArSumTimeRateE")
    K_V_AR_SUM_TIME_RATE_E("kVArSumTimeRateE"),

    /**
     * Phasor kVA - (Q1+Q4) Time Rate E
     * 
     */
    @XmlEnumValue("PkVADelTimeRateE")
    PK_VA_DEL_TIME_RATE_E("PkVADelTimeRateE"),

    /**
     * Phasor kVA - (Q1+Q4) + (Q2+Q3) Max Rate E
     * 
     */
    @XmlEnumValue("PkVASumMaxRateE")
    PK_VA_SUM_MAX_RATE_E("PkVASumMaxRateE"),

    /**
     * Phasor kVA - (Q1+Q4) + (Q2+Q3) Time Rate E
     * 
     */
    @XmlEnumValue("PkVASumTimeRateE")
    PK_VA_SUM_TIME_RATE_E("PkVASumTimeRateE"),

    /**
     * Phasor kVAh - (Q1+Q4) - (Q2+Q3) Rate A
     * 
     */
    @XmlEnumValue("PkVAhNetRateA")
    PK_V_AH_NET_RATE_A("PkVAhNetRateA"),

    /**
     * Phasor kVAh - (Q1+Q4) - (Q2+Q3) Rate B
     * 
     */
    @XmlEnumValue("PkVAhNetRateB")
    PK_V_AH_NET_RATE_B("PkVAhNetRateB"),

    /**
     * Phasor kVAh - (Q1+Q4) + (Q2+Q3) Rate E
     * 
     */
    @XmlEnumValue("PkVAhSumRateE")
    PK_V_AH_SUM_RATE_E("PkVAhSumRateE"),

    /**
     * kVARh - (Q1+Q2) Rate E
     * 
     */
    @XmlEnumValue("kVARhDelRateE")
    K_VA_RH_DEL_RATE_E("kVARhDelRateE"),

    /**
     * kVARh - (Q1+Q2) - (Q3+Q4) Rate E
     * 
     */
    @XmlEnumValue("kVARhNetRateE")
    K_VA_RH_NET_RATE_E("kVARhNetRateE"),

    /**
     * kVARh - (Q1+Q2) + (Q3+Q4) Rate E
     * 
     */
    @XmlEnumValue("kVARhSumRateE")
    K_VA_RH_SUM_RATE_E("kVARhSumRateE"),

    /**
     * kVARh - (Q3+Q4) Rate E
     * 
     */
    @XmlEnumValue("kVARhRcvdRateE")
    K_VA_RH_RCVD_RATE_E("kVARhRcvdRateE"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FieldNameKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldNameKind fromValue(String v) {
        for (FieldNameKind c: FieldNameKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
