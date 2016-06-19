
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatialFeatureGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatialFeatureGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="capacitorBank" type="{http://www.multispeak.org/Version_3.0}capacitorBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loadManagementDevice" type="{http://www.multispeak.org/Version_3.0}loadManagementDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measurementDevice" type="{http://www.multispeak.org/Version_3.0}measurementDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="meter" type="{http://www.multispeak.org/Version_3.0}meter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outageDetectionDevice" type="{http://www.multispeak.org/Version_3.0}outageDetectionDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overcurrentDeviceBank" type="{http://www.multispeak.org/Version_3.0}overcurrentDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pole" type="{http://www.multispeak.org/Version_3.0}pole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="powerSystemDevice" type="{http://www.multispeak.org/Version_3.0}powerSystemDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regulatorBank" type="{http://www.multispeak.org/Version_3.0}regulatorBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riser" type="{http://www.multispeak.org/Version_3.0}riser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceLocation" type="{http://www.multispeak.org/Version_3.0}serviceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="streetLight" type="{http://www.multispeak.org/Version_3.0}streetLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.multispeak.org/Version_3.0}substation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryCabnet" type="{http://www.multispeak.org/Version_3.0}primaryCabinet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchDeviceBank" type="{http://www.multispeak.org/Version_3.0}switchDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transformerBank" type="{http://www.multispeak.org/Version_3.0}transformerBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ohPrimaryLine" type="{http://www.multispeak.org/Version_3.0}ohPrimaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ohSecondaryLine" type="{http://www.multispeak.org/Version_3.0}ohSecondaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ugPrimaryLine" type="{http://www.multispeak.org/Version_3.0}ugPrimaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ugSecondaryLine" type="{http://www.multispeak.org/Version_3.0}ugSecondaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secondaryJunctionBox" type="{http://www.multispeak.org/Version_3.0}secondaryJunctionBox" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "spatialFeatureGroup", propOrder = {
    "capacitorBank",
    "loadManagementDevice",
    "measurementDevice",
    "meter",
    "outageDetectionDevice",
    "overcurrentDeviceBank",
    "pole",
    "powerSystemDevice",
    "regulatorBank",
    "riser",
    "serviceLocation",
    "streetLight",
    "substation",
    "primaryCabnet",
    "switchDeviceBank",
    "transformerBank",
    "ohPrimaryLine",
    "ohSecondaryLine",
    "ugPrimaryLine",
    "ugSecondaryLine",
    "secondaryJunctionBox"
})
public class SpatialFeatureGroup
    extends MspPointObject
{

    protected List<CapacitorBank> capacitorBank;
    protected List<LoadManagementDevice> loadManagementDevice;
    protected List<MeasurementDevice> measurementDevice;
    protected List<Meter> meter;
    protected List<OutageDetectionDevice> outageDetectionDevice;
    protected List<OvercurrentDeviceBank> overcurrentDeviceBank;
    protected List<Pole> pole;
    protected List<PowerSystemDevice> powerSystemDevice;
    protected List<RegulatorBank> regulatorBank;
    protected List<Riser> riser;
    protected List<ServiceLocation> serviceLocation;
    protected List<StreetLight> streetLight;
    protected List<Substation> substation;
    protected List<PrimaryCabinet> primaryCabnet;
    protected List<SwitchDeviceBank> switchDeviceBank;
    protected List<TransformerBank> transformerBank;
    protected List<OhPrimaryLine> ohPrimaryLine;
    protected List<OhSecondaryLine> ohSecondaryLine;
    protected List<UgPrimaryLine> ugPrimaryLine;
    protected List<UgSecondaryLine> ugSecondaryLine;
    protected List<SecondaryJunctionBox> secondaryJunctionBox;

    /**
     * Gets the value of the capacitorBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capacitorBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapacitorBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapacitorBank }
     * 
     * 
     */
    public List<CapacitorBank> getCapacitorBank() {
        if (capacitorBank == null) {
            capacitorBank = new ArrayList<CapacitorBank>();
        }
        return this.capacitorBank;
    }

    /**
     * Gets the value of the loadManagementDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadManagementDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadManagementDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadManagementDevice }
     * 
     * 
     */
    public List<LoadManagementDevice> getLoadManagementDevice() {
        if (loadManagementDevice == null) {
            loadManagementDevice = new ArrayList<LoadManagementDevice>();
        }
        return this.loadManagementDevice;
    }

    /**
     * Gets the value of the measurementDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementDevice }
     * 
     * 
     */
    public List<MeasurementDevice> getMeasurementDevice() {
        if (measurementDevice == null) {
            measurementDevice = new ArrayList<MeasurementDevice>();
        }
        return this.measurementDevice;
    }

    /**
     * Gets the value of the meter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meter }
     * 
     * 
     */
    public List<Meter> getMeter() {
        if (meter == null) {
            meter = new ArrayList<Meter>();
        }
        return this.meter;
    }

    /**
     * Gets the value of the outageDetectionDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageDetectionDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageDetectionDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageDetectionDevice }
     * 
     * 
     */
    public List<OutageDetectionDevice> getOutageDetectionDevice() {
        if (outageDetectionDevice == null) {
            outageDetectionDevice = new ArrayList<OutageDetectionDevice>();
        }
        return this.outageDetectionDevice;
    }

    /**
     * Gets the value of the overcurrentDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overcurrentDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOvercurrentDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvercurrentDeviceBank }
     * 
     * 
     */
    public List<OvercurrentDeviceBank> getOvercurrentDeviceBank() {
        if (overcurrentDeviceBank == null) {
            overcurrentDeviceBank = new ArrayList<OvercurrentDeviceBank>();
        }
        return this.overcurrentDeviceBank;
    }

    /**
     * Gets the value of the pole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pole }
     * 
     * 
     */
    public List<Pole> getPole() {
        if (pole == null) {
            pole = new ArrayList<Pole>();
        }
        return this.pole;
    }

    /**
     * Gets the value of the powerSystemDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerSystemDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerSystemDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerSystemDevice }
     * 
     * 
     */
    public List<PowerSystemDevice> getPowerSystemDevice() {
        if (powerSystemDevice == null) {
            powerSystemDevice = new ArrayList<PowerSystemDevice>();
        }
        return this.powerSystemDevice;
    }

    /**
     * Gets the value of the regulatorBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatorBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatorBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatorBank }
     * 
     * 
     */
    public List<RegulatorBank> getRegulatorBank() {
        if (regulatorBank == null) {
            regulatorBank = new ArrayList<RegulatorBank>();
        }
        return this.regulatorBank;
    }

    /**
     * Gets the value of the riser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Riser }
     * 
     * 
     */
    public List<Riser> getRiser() {
        if (riser == null) {
            riser = new ArrayList<Riser>();
        }
        return this.riser;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocation }
     * 
     * 
     */
    public List<ServiceLocation> getServiceLocation() {
        if (serviceLocation == null) {
            serviceLocation = new ArrayList<ServiceLocation>();
        }
        return this.serviceLocation;
    }

    /**
     * Gets the value of the streetLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetLight }
     * 
     * 
     */
    public List<StreetLight> getStreetLight() {
        if (streetLight == null) {
            streetLight = new ArrayList<StreetLight>();
        }
        return this.streetLight;
    }

    /**
     * Gets the value of the substation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substation }
     * 
     * 
     */
    public List<Substation> getSubstation() {
        if (substation == null) {
            substation = new ArrayList<Substation>();
        }
        return this.substation;
    }

    /**
     * Gets the value of the primaryCabnet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCabnet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCabnet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryCabinet }
     * 
     * 
     */
    public List<PrimaryCabinet> getPrimaryCabnet() {
        if (primaryCabnet == null) {
            primaryCabnet = new ArrayList<PrimaryCabinet>();
        }
        return this.primaryCabnet;
    }

    /**
     * Gets the value of the switchDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchDeviceBank }
     * 
     * 
     */
    public List<SwitchDeviceBank> getSwitchDeviceBank() {
        if (switchDeviceBank == null) {
            switchDeviceBank = new ArrayList<SwitchDeviceBank>();
        }
        return this.switchDeviceBank;
    }

    /**
     * Gets the value of the transformerBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformerBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformerBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformerBank }
     * 
     * 
     */
    public List<TransformerBank> getTransformerBank() {
        if (transformerBank == null) {
            transformerBank = new ArrayList<TransformerBank>();
        }
        return this.transformerBank;
    }

    /**
     * Gets the value of the ohPrimaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ohPrimaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOhPrimaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OhPrimaryLine }
     * 
     * 
     */
    public List<OhPrimaryLine> getOhPrimaryLine() {
        if (ohPrimaryLine == null) {
            ohPrimaryLine = new ArrayList<OhPrimaryLine>();
        }
        return this.ohPrimaryLine;
    }

    /**
     * Gets the value of the ohSecondaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ohSecondaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOhSecondaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OhSecondaryLine }
     * 
     * 
     */
    public List<OhSecondaryLine> getOhSecondaryLine() {
        if (ohSecondaryLine == null) {
            ohSecondaryLine = new ArrayList<OhSecondaryLine>();
        }
        return this.ohSecondaryLine;
    }

    /**
     * Gets the value of the ugPrimaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ugPrimaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUgPrimaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UgPrimaryLine }
     * 
     * 
     */
    public List<UgPrimaryLine> getUgPrimaryLine() {
        if (ugPrimaryLine == null) {
            ugPrimaryLine = new ArrayList<UgPrimaryLine>();
        }
        return this.ugPrimaryLine;
    }

    /**
     * Gets the value of the ugSecondaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ugSecondaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUgSecondaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UgSecondaryLine }
     * 
     * 
     */
    public List<UgSecondaryLine> getUgSecondaryLine() {
        if (ugSecondaryLine == null) {
            ugSecondaryLine = new ArrayList<UgSecondaryLine>();
        }
        return this.ugSecondaryLine;
    }

    /**
     * Gets the value of the secondaryJunctionBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryJunctionBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryJunctionBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryJunctionBox }
     * 
     * 
     */
    public List<SecondaryJunctionBox> getSecondaryJunctionBox() {
        if (secondaryJunctionBox == null) {
            secondaryJunctionBox = new ArrayList<SecondaryJunctionBox>();
        }
        return this.secondaryJunctionBox;
    }

}
