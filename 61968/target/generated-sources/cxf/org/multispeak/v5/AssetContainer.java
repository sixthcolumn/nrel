
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a container for items that might be tracked in an Asset Management System (AMS). This is the same as the physicalObjectList, except that the cut and jumper have been removed since they are unlikely to be tracked in an AMS.
 * 
 * <p>Java class for assetContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="ACLineSegments" type="{http://www.multispeak.org/V5.0}ACLineSegments" minOccurs="0"/>
 *         &lt;element name="anchors" type="{http://www.multispeak.org/V5.0}anchors" minOccurs="0"/>
 *         &lt;element name="breakers" type="{http://www.multispeak.org/V5.0}breakers" minOccurs="0"/>
 *         &lt;element name="capacitors" type="{http://www.multispeak.org/V5.0}capacitors" minOccurs="0"/>
 *         &lt;element name="capacitorBanks" type="{http://www.multispeak.org/V5.0}capacitorBanks" minOccurs="0"/>
 *         &lt;element name="capacitorBankSwitches" type="{http://www.multispeak.org/V5.0}capacitorBankSwitches" minOccurs="0"/>
 *         &lt;element name="CDDevices" type="{http://www.multispeak.org/V5.0}CDDevices" minOccurs="0"/>
 *         &lt;element name="conduits" type="{http://www.multispeak.org/V5.0}conduits" minOccurs="0"/>
 *         &lt;element name="elbows" type="{http://www.multispeak.org/V5.0}elbows" minOccurs="0"/>
 *         &lt;element name="electricMeters" type="{http://www.multispeak.org/V5.0}electricMeters" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://www.multispeak.org/V5.0}equipment" minOccurs="0"/>
 *         &lt;element name="fuses" type="{http://www.multispeak.org/V5.0}fuses" minOccurs="0"/>
 *         &lt;element name="gasMeters" type="{http://www.multispeak.org/V5.0}gasMeters" minOccurs="0"/>
 *         &lt;element name="guys" type="{http://www.multispeak.org/V5.0}guys" minOccurs="0"/>
 *         &lt;element name="inductionMachines" type="{http://www.multispeak.org/V5.0}inductionMachines" minOccurs="0"/>
 *         &lt;element name="loadManagementDevices" type="{http://www.multispeak.org/V5.0}loadManagementDevices" minOccurs="0"/>
 *         &lt;element name="locationTrackingDevice" type="{http://www.multispeak.org/V5.0}locationTrackingDevice"/>
 *         &lt;element name="measurementDevices" type="{http://www.multispeak.org/V5.0}measurementDevices" minOccurs="0"/>
 *         &lt;element name="meterBases" type="{http://www.multispeak.org/V5.0}meterBases" minOccurs="0"/>
 *         &lt;element name="modules" type="{http://www.multispeak.org/V5.0}modules" minOccurs="0"/>
 *         &lt;element name="otherMeters" type="{http://www.multispeak.org/V5.0}otherMeters" minOccurs="0"/>
 *         &lt;element name="outageDetectionDevices" type="{http://www.multispeak.org/V5.0}outageDetectionDevices" minOccurs="0"/>
 *         &lt;element name="overcurrentDeviceBanks" type="{http://www.multispeak.org/V5.0}overcurrentDeviceBanks" minOccurs="0"/>
 *         &lt;element name="parcels" type="{http://www.multispeak.org/V5.0}parcels" minOccurs="0"/>
 *         &lt;element name="poles" type="{http://www.multispeak.org/V5.0}poles" minOccurs="0"/>
 *         &lt;element name="powerMonitors" type="{http://www.multispeak.org/V5.0}powerMonitors" minOccurs="0"/>
 *         &lt;element name="powerSystemDevices" type="{http://www.multispeak.org/V5.0}powerSystemDevices" minOccurs="0"/>
 *         &lt;element name="premisesDisplays" type="{http://www.multispeak.org/V5.0}premisesDisplays" minOccurs="0"/>
 *         &lt;element name="primaryCabinets" type="{http://www.multispeak.org/V5.0}primaryCabinets" minOccurs="0"/>
 *         &lt;element name="propaneMeters" type="{http://www.multispeak.org/V5.0}propaneMeters" minOccurs="0"/>
 *         &lt;element name="reclosers" type="{http://www.multispeak.org/V5.0}reclosers" minOccurs="0"/>
 *         &lt;element name="regulators" type="{http://www.multispeak.org/V5.0}regulators" minOccurs="0"/>
 *         &lt;element name="regulatorBanks" type="{http://www.multispeak.org/V5.0}regulatorBanks" minOccurs="0"/>
 *         &lt;element name="risers" type="{http://www.multispeak.org/V5.0}risers" minOccurs="0"/>
 *         &lt;element name="secondaryJunctionBoxes" type="{http://www.multispeak.org/V5.0}secondaryJunctionBoxes" minOccurs="0"/>
 *         &lt;element name="sectionalizers" type="{http://www.multispeak.org/V5.0}sectionalizers" minOccurs="0"/>
 *         &lt;element name="securityLights" type="{http://www.multispeak.org/V5.0}securityLights" minOccurs="0"/>
 *         &lt;element name="streetLights" type="{http://www.multispeak.org/V5.0}streetLights" minOccurs="0"/>
 *         &lt;element name="substations" type="{http://www.multispeak.org/V5.0}substations" minOccurs="0"/>
 *         &lt;element name="surgeArrestors" type="{http://www.multispeak.org/V5.0}surgeArrestors" minOccurs="0"/>
 *         &lt;element name="switches" type="{http://www.multispeak.org/V5.0}switches" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBanks" type="{http://www.multispeak.org/V5.0}switchingDeviceBanks" minOccurs="0"/>
 *         &lt;element name="synchronousMachines" type="{http://www.multispeak.org/V5.0}synchronousMachines" minOccurs="0"/>
 *         &lt;element name="trafficLights" type="{http://www.multispeak.org/V5.0}trafficLights" minOccurs="0"/>
 *         &lt;element name="transformers" type="{http://www.multispeak.org/V5.0}transformers" minOccurs="0"/>
 *         &lt;element name="transformerBanks" type="{http://www.multispeak.org/V5.0}transformerBanks" minOccurs="0"/>
 *         &lt;element name="vehicles" type="{http://www.multispeak.org/V5.0}equipment" minOccurs="0"/>
 *         &lt;element name="waterMeters" type="{http://www.multispeak.org/V5.0}waterMeters" minOccurs="0"/>
 *         &lt;element name="CIMObjectList" type="{http://www.multispeak.org/V5.0}CIMObjectList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetContainer", propOrder = {
    "acLineSegments",
    "anchors",
    "breakers",
    "capacitors",
    "capacitorBanks",
    "capacitorBankSwitches",
    "cdDevices",
    "conduits",
    "elbows",
    "electricMeters",
    "equipment",
    "fuses",
    "gasMeters",
    "guys",
    "inductionMachines",
    "loadManagementDevices",
    "locationTrackingDevice",
    "measurementDevices",
    "meterBases",
    "modules",
    "otherMeters",
    "outageDetectionDevices",
    "overcurrentDeviceBanks",
    "parcels",
    "poles",
    "powerMonitors",
    "powerSystemDevices",
    "premisesDisplays",
    "primaryCabinets",
    "propaneMeters",
    "reclosers",
    "regulators",
    "regulatorBanks",
    "risers",
    "secondaryJunctionBoxes",
    "sectionalizers",
    "securityLights",
    "streetLights",
    "substations",
    "surgeArrestors",
    "switches",
    "switchingDeviceBanks",
    "synchronousMachines",
    "trafficLights",
    "transformers",
    "transformerBanks",
    "vehicles",
    "waterMeters",
    "cimObjectList"
})
public class AssetContainer
    extends MspReferable
{

    @XmlElement(name = "ACLineSegments")
    protected ACLineSegments acLineSegments;
    protected Anchors anchors;
    protected Breakers breakers;
    protected Capacitors capacitors;
    protected CapacitorBanks capacitorBanks;
    protected CapacitorBankSwitches capacitorBankSwitches;
    @XmlElement(name = "CDDevices")
    protected CDDevices cdDevices;
    protected Conduits conduits;
    protected Elbows elbows;
    protected ElectricMeters electricMeters;
    protected Equipment equipment;
    protected Fuses fuses;
    protected GasMeters gasMeters;
    protected Guys guys;
    protected InductionMachines inductionMachines;
    protected LoadManagementDevices loadManagementDevices;
    @XmlElement(required = true)
    protected LocationTrackingDevice locationTrackingDevice;
    protected MeasurementDevices measurementDevices;
    protected MeterBases meterBases;
    protected Modules modules;
    protected OtherMeters otherMeters;
    protected OutageDetectionDevices outageDetectionDevices;
    protected OvercurrentDeviceBanks overcurrentDeviceBanks;
    protected Parcels parcels;
    protected Poles poles;
    protected PowerMonitors powerMonitors;
    protected PowerSystemDevices powerSystemDevices;
    protected PremisesDisplays premisesDisplays;
    protected PrimaryCabinets primaryCabinets;
    protected PropaneMeters propaneMeters;
    protected Reclosers reclosers;
    protected Regulators regulators;
    protected RegulatorBanks regulatorBanks;
    protected Risers risers;
    protected SecondaryJunctionBoxes secondaryJunctionBoxes;
    protected Sectionalizers sectionalizers;
    protected SecurityLights securityLights;
    protected StreetLights streetLights;
    protected Substations substations;
    protected SurgeArrestors surgeArrestors;
    protected Switches switches;
    protected SwitchingDeviceBanks switchingDeviceBanks;
    protected SynchronousMachines synchronousMachines;
    protected TrafficLights trafficLights;
    protected Transformers transformers;
    protected TransformerBanks transformerBanks;
    protected Equipment vehicles;
    protected WaterMeters waterMeters;
    @XmlElement(name = "CIMObjectList")
    protected CIMObjectList cimObjectList;

    /**
     * Gets the value of the acLineSegments property.
     * 
     * @return
     *     possible object is
     *     {@link ACLineSegments }
     *     
     */
    public ACLineSegments getACLineSegments() {
        return acLineSegments;
    }

    /**
     * Sets the value of the acLineSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACLineSegments }
     *     
     */
    public void setACLineSegments(ACLineSegments value) {
        this.acLineSegments = value;
    }

    /**
     * Gets the value of the anchors property.
     * 
     * @return
     *     possible object is
     *     {@link Anchors }
     *     
     */
    public Anchors getAnchors() {
        return anchors;
    }

    /**
     * Sets the value of the anchors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anchors }
     *     
     */
    public void setAnchors(Anchors value) {
        this.anchors = value;
    }

    /**
     * Gets the value of the breakers property.
     * 
     * @return
     *     possible object is
     *     {@link Breakers }
     *     
     */
    public Breakers getBreakers() {
        return breakers;
    }

    /**
     * Sets the value of the breakers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakers }
     *     
     */
    public void setBreakers(Breakers value) {
        this.breakers = value;
    }

    /**
     * Gets the value of the capacitors property.
     * 
     * @return
     *     possible object is
     *     {@link Capacitors }
     *     
     */
    public Capacitors getCapacitors() {
        return capacitors;
    }

    /**
     * Sets the value of the capacitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capacitors }
     *     
     */
    public void setCapacitors(Capacitors value) {
        this.capacitors = value;
    }

    /**
     * Gets the value of the capacitorBanks property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorBanks }
     *     
     */
    public CapacitorBanks getCapacitorBanks() {
        return capacitorBanks;
    }

    /**
     * Sets the value of the capacitorBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorBanks }
     *     
     */
    public void setCapacitorBanks(CapacitorBanks value) {
        this.capacitorBanks = value;
    }

    /**
     * Gets the value of the capacitorBankSwitches property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public CapacitorBankSwitches getCapacitorBankSwitches() {
        return capacitorBankSwitches;
    }

    /**
     * Sets the value of the capacitorBankSwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public void setCapacitorBankSwitches(CapacitorBankSwitches value) {
        this.capacitorBankSwitches = value;
    }

    /**
     * Gets the value of the cdDevices property.
     * 
     * @return
     *     possible object is
     *     {@link CDDevices }
     *     
     */
    public CDDevices getCDDevices() {
        return cdDevices;
    }

    /**
     * Sets the value of the cdDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDDevices }
     *     
     */
    public void setCDDevices(CDDevices value) {
        this.cdDevices = value;
    }

    /**
     * Gets the value of the conduits property.
     * 
     * @return
     *     possible object is
     *     {@link Conduits }
     *     
     */
    public Conduits getConduits() {
        return conduits;
    }

    /**
     * Sets the value of the conduits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conduits }
     *     
     */
    public void setConduits(Conduits value) {
        this.conduits = value;
    }

    /**
     * Gets the value of the elbows property.
     * 
     * @return
     *     possible object is
     *     {@link Elbows }
     *     
     */
    public Elbows getElbows() {
        return elbows;
    }

    /**
     * Sets the value of the elbows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Elbows }
     *     
     */
    public void setElbows(Elbows value) {
        this.elbows = value;
    }

    /**
     * Gets the value of the electricMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeters }
     *     
     */
    public ElectricMeters getElectricMeters() {
        return electricMeters;
    }

    /**
     * Sets the value of the electricMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeters }
     *     
     */
    public void setElectricMeters(ElectricMeters value) {
        this.electricMeters = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setEquipment(Equipment value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the fuses property.
     * 
     * @return
     *     possible object is
     *     {@link Fuses }
     *     
     */
    public Fuses getFuses() {
        return fuses;
    }

    /**
     * Sets the value of the fuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fuses }
     *     
     */
    public void setFuses(Fuses value) {
        this.fuses = value;
    }

    /**
     * Gets the value of the gasMeters property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeters }
     *     
     */
    public GasMeters getGasMeters() {
        return gasMeters;
    }

    /**
     * Sets the value of the gasMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeters }
     *     
     */
    public void setGasMeters(GasMeters value) {
        this.gasMeters = value;
    }

    /**
     * Gets the value of the guys property.
     * 
     * @return
     *     possible object is
     *     {@link Guys }
     *     
     */
    public Guys getGuys() {
        return guys;
    }

    /**
     * Sets the value of the guys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guys }
     *     
     */
    public void setGuys(Guys value) {
        this.guys = value;
    }

    /**
     * Gets the value of the inductionMachines property.
     * 
     * @return
     *     possible object is
     *     {@link InductionMachines }
     *     
     */
    public InductionMachines getInductionMachines() {
        return inductionMachines;
    }

    /**
     * Sets the value of the inductionMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link InductionMachines }
     *     
     */
    public void setInductionMachines(InductionMachines value) {
        this.inductionMachines = value;
    }

    /**
     * Gets the value of the loadManagementDevices property.
     * 
     * @return
     *     possible object is
     *     {@link LoadManagementDevices }
     *     
     */
    public LoadManagementDevices getLoadManagementDevices() {
        return loadManagementDevices;
    }

    /**
     * Sets the value of the loadManagementDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadManagementDevices }
     *     
     */
    public void setLoadManagementDevices(LoadManagementDevices value) {
        this.loadManagementDevices = value;
    }

    /**
     * Gets the value of the locationTrackingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingDevice }
     *     
     */
    public LocationTrackingDevice getLocationTrackingDevice() {
        return locationTrackingDevice;
    }

    /**
     * Sets the value of the locationTrackingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingDevice }
     *     
     */
    public void setLocationTrackingDevice(LocationTrackingDevice value) {
        this.locationTrackingDevice = value;
    }

    /**
     * Gets the value of the measurementDevices property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDevices }
     *     
     */
    public MeasurementDevices getMeasurementDevices() {
        return measurementDevices;
    }

    /**
     * Sets the value of the measurementDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDevices }
     *     
     */
    public void setMeasurementDevices(MeasurementDevices value) {
        this.measurementDevices = value;
    }

    /**
     * Gets the value of the meterBases property.
     * 
     * @return
     *     possible object is
     *     {@link MeterBases }
     *     
     */
    public MeterBases getMeterBases() {
        return meterBases;
    }

    /**
     * Sets the value of the meterBases property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterBases }
     *     
     */
    public void setMeterBases(MeterBases value) {
        this.meterBases = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Modules }
     *     
     */
    public Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modules }
     *     
     */
    public void setModules(Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the otherMeters property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeters }
     *     
     */
    public OtherMeters getOtherMeters() {
        return otherMeters;
    }

    /**
     * Sets the value of the otherMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeters }
     *     
     */
    public void setOtherMeters(OtherMeters value) {
        this.otherMeters = value;
    }

    /**
     * Gets the value of the outageDetectionDevices property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectionDevices }
     *     
     */
    public OutageDetectionDevices getOutageDetectionDevices() {
        return outageDetectionDevices;
    }

    /**
     * Sets the value of the outageDetectionDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectionDevices }
     *     
     */
    public void setOutageDetectionDevices(OutageDetectionDevices value) {
        this.outageDetectionDevices = value;
    }

    /**
     * Gets the value of the overcurrentDeviceBanks property.
     * 
     * @return
     *     possible object is
     *     {@link OvercurrentDeviceBanks }
     *     
     */
    public OvercurrentDeviceBanks getOvercurrentDeviceBanks() {
        return overcurrentDeviceBanks;
    }

    /**
     * Sets the value of the overcurrentDeviceBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvercurrentDeviceBanks }
     *     
     */
    public void setOvercurrentDeviceBanks(OvercurrentDeviceBanks value) {
        this.overcurrentDeviceBanks = value;
    }

    /**
     * Gets the value of the parcels property.
     * 
     * @return
     *     possible object is
     *     {@link Parcels }
     *     
     */
    public Parcels getParcels() {
        return parcels;
    }

    /**
     * Sets the value of the parcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parcels }
     *     
     */
    public void setParcels(Parcels value) {
        this.parcels = value;
    }

    /**
     * Gets the value of the poles property.
     * 
     * @return
     *     possible object is
     *     {@link Poles }
     *     
     */
    public Poles getPoles() {
        return poles;
    }

    /**
     * Sets the value of the poles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poles }
     *     
     */
    public void setPoles(Poles value) {
        this.poles = value;
    }

    /**
     * Gets the value of the powerMonitors property.
     * 
     * @return
     *     possible object is
     *     {@link PowerMonitors }
     *     
     */
    public PowerMonitors getPowerMonitors() {
        return powerMonitors;
    }

    /**
     * Sets the value of the powerMonitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerMonitors }
     *     
     */
    public void setPowerMonitors(PowerMonitors value) {
        this.powerMonitors = value;
    }

    /**
     * Gets the value of the powerSystemDevices property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemDevices }
     *     
     */
    public PowerSystemDevices getPowerSystemDevices() {
        return powerSystemDevices;
    }

    /**
     * Sets the value of the powerSystemDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemDevices }
     *     
     */
    public void setPowerSystemDevices(PowerSystemDevices value) {
        this.powerSystemDevices = value;
    }

    /**
     * Gets the value of the premisesDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplays }
     *     
     */
    public PremisesDisplays getPremisesDisplays() {
        return premisesDisplays;
    }

    /**
     * Sets the value of the premisesDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplays }
     *     
     */
    public void setPremisesDisplays(PremisesDisplays value) {
        this.premisesDisplays = value;
    }

    /**
     * Gets the value of the primaryCabinets property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryCabinets }
     *     
     */
    public PrimaryCabinets getPrimaryCabinets() {
        return primaryCabinets;
    }

    /**
     * Sets the value of the primaryCabinets property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryCabinets }
     *     
     */
    public void setPrimaryCabinets(PrimaryCabinets value) {
        this.primaryCabinets = value;
    }

    /**
     * Gets the value of the propaneMeters property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeters }
     *     
     */
    public PropaneMeters getPropaneMeters() {
        return propaneMeters;
    }

    /**
     * Sets the value of the propaneMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeters }
     *     
     */
    public void setPropaneMeters(PropaneMeters value) {
        this.propaneMeters = value;
    }

    /**
     * Gets the value of the reclosers property.
     * 
     * @return
     *     possible object is
     *     {@link Reclosers }
     *     
     */
    public Reclosers getReclosers() {
        return reclosers;
    }

    /**
     * Sets the value of the reclosers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reclosers }
     *     
     */
    public void setReclosers(Reclosers value) {
        this.reclosers = value;
    }

    /**
     * Gets the value of the regulators property.
     * 
     * @return
     *     possible object is
     *     {@link Regulators }
     *     
     */
    public Regulators getRegulators() {
        return regulators;
    }

    /**
     * Sets the value of the regulators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Regulators }
     *     
     */
    public void setRegulators(Regulators value) {
        this.regulators = value;
    }

    /**
     * Gets the value of the regulatorBanks property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorBanks }
     *     
     */
    public RegulatorBanks getRegulatorBanks() {
        return regulatorBanks;
    }

    /**
     * Sets the value of the regulatorBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorBanks }
     *     
     */
    public void setRegulatorBanks(RegulatorBanks value) {
        this.regulatorBanks = value;
    }

    /**
     * Gets the value of the risers property.
     * 
     * @return
     *     possible object is
     *     {@link Risers }
     *     
     */
    public Risers getRisers() {
        return risers;
    }

    /**
     * Sets the value of the risers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Risers }
     *     
     */
    public void setRisers(Risers value) {
        this.risers = value;
    }

    /**
     * Gets the value of the secondaryJunctionBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryJunctionBoxes }
     *     
     */
    public SecondaryJunctionBoxes getSecondaryJunctionBoxes() {
        return secondaryJunctionBoxes;
    }

    /**
     * Sets the value of the secondaryJunctionBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryJunctionBoxes }
     *     
     */
    public void setSecondaryJunctionBoxes(SecondaryJunctionBoxes value) {
        this.secondaryJunctionBoxes = value;
    }

    /**
     * Gets the value of the sectionalizers property.
     * 
     * @return
     *     possible object is
     *     {@link Sectionalizers }
     *     
     */
    public Sectionalizers getSectionalizers() {
        return sectionalizers;
    }

    /**
     * Sets the value of the sectionalizers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sectionalizers }
     *     
     */
    public void setSectionalizers(Sectionalizers value) {
        this.sectionalizers = value;
    }

    /**
     * Gets the value of the securityLights property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLights }
     *     
     */
    public SecurityLights getSecurityLights() {
        return securityLights;
    }

    /**
     * Sets the value of the securityLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLights }
     *     
     */
    public void setSecurityLights(SecurityLights value) {
        this.securityLights = value;
    }

    /**
     * Gets the value of the streetLights property.
     * 
     * @return
     *     possible object is
     *     {@link StreetLights }
     *     
     */
    public StreetLights getStreetLights() {
        return streetLights;
    }

    /**
     * Sets the value of the streetLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetLights }
     *     
     */
    public void setStreetLights(StreetLights value) {
        this.streetLights = value;
    }

    /**
     * Gets the value of the substations property.
     * 
     * @return
     *     possible object is
     *     {@link Substations }
     *     
     */
    public Substations getSubstations() {
        return substations;
    }

    /**
     * Sets the value of the substations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Substations }
     *     
     */
    public void setSubstations(Substations value) {
        this.substations = value;
    }

    /**
     * Gets the value of the surgeArrestors property.
     * 
     * @return
     *     possible object is
     *     {@link SurgeArrestors }
     *     
     */
    public SurgeArrestors getSurgeArrestors() {
        return surgeArrestors;
    }

    /**
     * Sets the value of the surgeArrestors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurgeArrestors }
     *     
     */
    public void setSurgeArrestors(SurgeArrestors value) {
        this.surgeArrestors = value;
    }

    /**
     * Gets the value of the switches property.
     * 
     * @return
     *     possible object is
     *     {@link Switches }
     *     
     */
    public Switches getSwitches() {
        return switches;
    }

    /**
     * Sets the value of the switches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Switches }
     *     
     */
    public void setSwitches(Switches value) {
        this.switches = value;
    }

    /**
     * Gets the value of the switchingDeviceBanks property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingDeviceBanks }
     *     
     */
    public SwitchingDeviceBanks getSwitchingDeviceBanks() {
        return switchingDeviceBanks;
    }

    /**
     * Sets the value of the switchingDeviceBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingDeviceBanks }
     *     
     */
    public void setSwitchingDeviceBanks(SwitchingDeviceBanks value) {
        this.switchingDeviceBanks = value;
    }

    /**
     * Gets the value of the synchronousMachines property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachines }
     *     
     */
    public SynchronousMachines getSynchronousMachines() {
        return synchronousMachines;
    }

    /**
     * Sets the value of the synchronousMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachines }
     *     
     */
    public void setSynchronousMachines(SynchronousMachines value) {
        this.synchronousMachines = value;
    }

    /**
     * Gets the value of the trafficLights property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficLights }
     *     
     */
    public TrafficLights getTrafficLights() {
        return trafficLights;
    }

    /**
     * Sets the value of the trafficLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficLights }
     *     
     */
    public void setTrafficLights(TrafficLights value) {
        this.trafficLights = value;
    }

    /**
     * Gets the value of the transformers property.
     * 
     * @return
     *     possible object is
     *     {@link Transformers }
     *     
     */
    public Transformers getTransformers() {
        return transformers;
    }

    /**
     * Sets the value of the transformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transformers }
     *     
     */
    public void setTransformers(Transformers value) {
        this.transformers = value;
    }

    /**
     * Gets the value of the transformerBanks property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerBanks }
     *     
     */
    public TransformerBanks getTransformerBanks() {
        return transformerBanks;
    }

    /**
     * Sets the value of the transformerBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerBanks }
     *     
     */
    public void setTransformerBanks(TransformerBanks value) {
        this.transformerBanks = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Equipment }
     *     
     */
    public Equipment getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipment }
     *     
     */
    public void setVehicles(Equipment value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the waterMeters property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeters }
     *     
     */
    public WaterMeters getWaterMeters() {
        return waterMeters;
    }

    /**
     * Sets the value of the waterMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeters }
     *     
     */
    public void setWaterMeters(WaterMeters value) {
        this.waterMeters = value;
    }

    /**
     * Gets the value of the cimObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link CIMObjectList }
     *     
     */
    public CIMObjectList getCIMObjectList() {
        return cimObjectList;
    }

    /**
     * Sets the value of the cimObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMObjectList }
     *     
     */
    public void setCIMObjectList(CIMObjectList value) {
        this.cimObjectList = value;
    }

}
