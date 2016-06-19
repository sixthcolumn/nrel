
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ConnectivityModelKind;


/**
 * <p>Java class for electricConnectivityModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricConnectivityModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="connectivityModelKind" type="{http://www.multispeak.org/V5.0/enumerations}connectivityModelKind"/>
 *         &lt;element name="ACLineSegment" type="{http://www.multispeak.org/V5.0}ACLineSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trafficLight" type="{http://www.multispeak.org/V5.0}trafficLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="securityLight" type="{http://www.multispeak.org/V5.0}securityLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="streetLight" type="{http://www.multispeak.org/V5.0}streetLight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inductionMachine" type="{http://www.multispeak.org/V5.0}inductionMachine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fakeNodeSection" type="{http://www.multispeak.org/V5.0}fakeNodeSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="equivalentSource" type="{http://www.multispeak.org/V5.0}equivalentSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="synchronousMachine" type="{http://www.multispeak.org/V5.0}synchronousMachine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overcurrentDeviceBank" type="{http://www.multispeak.org/V5.0}overcurrentDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBank" type="{http://www.multispeak.org/V5.0}switchingDeviceBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transformerBank" type="{http://www.multispeak.org/V5.0}transformerBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="electricServicePoint" type="{http://www.multispeak.org/V5.0}electricServicePoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/V5.0}electricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capacitorBank" type="{http://www.multispeak.org/V5.0}capacitorBank" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regulatorBank" type="{http://www.multispeak.org/V5.0}regulatorBank" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricConnectivityModel", propOrder = {
    "connectivityModelKind",
    "acLineSegment",
    "trafficLight",
    "securityLight",
    "streetLight",
    "inductionMachine",
    "fakeNodeSection",
    "equivalentSource",
    "synchronousMachine",
    "overcurrentDeviceBank",
    "switchingDeviceBank",
    "transformerBank",
    "electricServicePoint",
    "electricMeter",
    "capacitorBank",
    "regulatorBank"
})
public class ElectricConnectivityModel
    extends MspReferable
{

    @XmlElement(required = true)
    protected ConnectivityModelKind connectivityModelKind;
    @XmlElement(name = "ACLineSegment")
    protected List<ACLineSegment> acLineSegment;
    protected List<TrafficLight> trafficLight;
    protected List<SecurityLight> securityLight;
    protected List<StreetLight> streetLight;
    protected List<InductionMachine> inductionMachine;
    protected List<FakeNodeSection> fakeNodeSection;
    protected List<EquivalentSource> equivalentSource;
    protected List<SynchronousMachine> synchronousMachine;
    protected List<OvercurrentDeviceBank> overcurrentDeviceBank;
    protected List<SwitchingDeviceBank> switchingDeviceBank;
    protected List<TransformerBank> transformerBank;
    protected List<ElectricServicePoint> electricServicePoint;
    protected List<ElectricMeter> electricMeter;
    protected List<CapacitorBank> capacitorBank;
    protected List<RegulatorBank> regulatorBank;

    /**
     * Gets the value of the connectivityModelKind property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityModelKind }
     *     
     */
    public ConnectivityModelKind getConnectivityModelKind() {
        return connectivityModelKind;
    }

    /**
     * Sets the value of the connectivityModelKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityModelKind }
     *     
     */
    public void setConnectivityModelKind(ConnectivityModelKind value) {
        this.connectivityModelKind = value;
    }

    /**
     * Gets the value of the acLineSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acLineSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACLineSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACLineSegment }
     * 
     * 
     */
    public List<ACLineSegment> getACLineSegment() {
        if (acLineSegment == null) {
            acLineSegment = new ArrayList<ACLineSegment>();
        }
        return this.acLineSegment;
    }

    /**
     * Gets the value of the trafficLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficLight }
     * 
     * 
     */
    public List<TrafficLight> getTrafficLight() {
        if (trafficLight == null) {
            trafficLight = new ArrayList<TrafficLight>();
        }
        return this.trafficLight;
    }

    /**
     * Gets the value of the securityLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityLight }
     * 
     * 
     */
    public List<SecurityLight> getSecurityLight() {
        if (securityLight == null) {
            securityLight = new ArrayList<SecurityLight>();
        }
        return this.securityLight;
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
     * Gets the value of the inductionMachine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inductionMachine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInductionMachine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InductionMachine }
     * 
     * 
     */
    public List<InductionMachine> getInductionMachine() {
        if (inductionMachine == null) {
            inductionMachine = new ArrayList<InductionMachine>();
        }
        return this.inductionMachine;
    }

    /**
     * Gets the value of the fakeNodeSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakeNodeSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFakeNodeSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FakeNodeSection }
     * 
     * 
     */
    public List<FakeNodeSection> getFakeNodeSection() {
        if (fakeNodeSection == null) {
            fakeNodeSection = new ArrayList<FakeNodeSection>();
        }
        return this.fakeNodeSection;
    }

    /**
     * Gets the value of the equivalentSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquivalentSource }
     * 
     * 
     */
    public List<EquivalentSource> getEquivalentSource() {
        if (equivalentSource == null) {
            equivalentSource = new ArrayList<EquivalentSource>();
        }
        return this.equivalentSource;
    }

    /**
     * Gets the value of the synchronousMachine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronousMachine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronousMachine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynchronousMachine }
     * 
     * 
     */
    public List<SynchronousMachine> getSynchronousMachine() {
        if (synchronousMachine == null) {
            synchronousMachine = new ArrayList<SynchronousMachine>();
        }
        return this.synchronousMachine;
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
     * Gets the value of the switchingDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingDeviceBank }
     * 
     * 
     */
    public List<SwitchingDeviceBank> getSwitchingDeviceBank() {
        if (switchingDeviceBank == null) {
            switchingDeviceBank = new ArrayList<SwitchingDeviceBank>();
        }
        return this.switchingDeviceBank;
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
     * Gets the value of the electricServicePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricServicePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricServicePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricServicePoint }
     * 
     * 
     */
    public List<ElectricServicePoint> getElectricServicePoint() {
        if (electricServicePoint == null) {
            electricServicePoint = new ArrayList<ElectricServicePoint>();
        }
        return this.electricServicePoint;
    }

    /**
     * Gets the value of the electricMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricMeter }
     * 
     * 
     */
    public List<ElectricMeter> getElectricMeter() {
        if (electricMeter == null) {
            electricMeter = new ArrayList<ElectricMeter>();
        }
        return this.electricMeter;
    }

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

}
