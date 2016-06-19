
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.cpsm.Bay;
import org.multispeak.v5_0.cpsm.BusbarSection;
import org.multispeak.v5_0.cpsm.Connector;
import org.multispeak.v5_0.cpsm.GeneratingUnit;
import org.multispeak.v5_0.cpsm.HydroGeneratingUnit;
import org.multispeak.v5_0.cpsm.StaticVarCompensator;
import org.multispeak.v5_0.cpsm.TapChanger;
import org.multispeak.v5_0.cpsm.ThermalGeneratingUnit;
import org.multispeak.v5_0.cpsm.TransformerWinding;


/**
 * <p>Java class for CIMObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMObjectList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="Bay" type="{http://www.multispeak.org/V5.0/cpsm}Bay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusbarSection" type="{http://www.multispeak.org/V5.0/cpsm}BusbarSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Connector" type="{http://www.multispeak.org/V5.0/cpsm}Connector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeneratingUnit" type="{http://www.multispeak.org/V5.0/cpsm}GeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HydroGeneratingUnit" type="{http://www.multispeak.org/V5.0/cpsm}HydroGeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransformerWinding" type="{http://www.multispeak.org/V5.0/cpsm}TransformerWinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThermalGeneratingUnit" type="{http://www.multispeak.org/V5.0/cpsm}ThermalGeneratingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StaticVarCompensator" type="{http://www.multispeak.org/V5.0/cpsm}StaticVarCompensator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TapChanger" type="{http://www.multispeak.org/V5.0/cpsm}TapChanger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMObjectList", propOrder = {
    "bay",
    "busbarSection",
    "connector",
    "generatingUnit",
    "hydroGeneratingUnit",
    "transformerWinding",
    "thermalGeneratingUnit",
    "staticVarCompensator",
    "tapChanger"
})
public class CIMObjectList
    extends MspExtensible
{

    @XmlElement(name = "Bay")
    protected List<Bay> bay;
    @XmlElement(name = "BusbarSection")
    protected List<BusbarSection> busbarSection;
    @XmlElement(name = "Connector")
    protected List<Connector> connector;
    @XmlElement(name = "GeneratingUnit")
    protected List<GeneratingUnit> generatingUnit;
    @XmlElement(name = "HydroGeneratingUnit")
    protected List<HydroGeneratingUnit> hydroGeneratingUnit;
    @XmlElement(name = "TransformerWinding")
    protected List<TransformerWinding> transformerWinding;
    @XmlElement(name = "ThermalGeneratingUnit")
    protected List<ThermalGeneratingUnit> thermalGeneratingUnit;
    @XmlElement(name = "StaticVarCompensator")
    protected List<StaticVarCompensator> staticVarCompensator;
    @XmlElement(name = "TapChanger")
    protected List<TapChanger> tapChanger;

    /**
     * Gets the value of the bay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bay }
     * 
     * 
     */
    public List<Bay> getBay() {
        if (bay == null) {
            bay = new ArrayList<Bay>();
        }
        return this.bay;
    }

    /**
     * Gets the value of the busbarSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busbarSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusbarSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusbarSection }
     * 
     * 
     */
    public List<BusbarSection> getBusbarSection() {
        if (busbarSection == null) {
            busbarSection = new ArrayList<BusbarSection>();
        }
        return this.busbarSection;
    }

    /**
     * Gets the value of the connector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connector }
     * 
     * 
     */
    public List<Connector> getConnector() {
        if (connector == null) {
            connector = new ArrayList<Connector>();
        }
        return this.connector;
    }

    /**
     * Gets the value of the generatingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generatingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneratingUnit }
     * 
     * 
     */
    public List<GeneratingUnit> getGeneratingUnit() {
        if (generatingUnit == null) {
            generatingUnit = new ArrayList<GeneratingUnit>();
        }
        return this.generatingUnit;
    }

    /**
     * Gets the value of the hydroGeneratingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydroGeneratingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydroGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HydroGeneratingUnit }
     * 
     * 
     */
    public List<HydroGeneratingUnit> getHydroGeneratingUnit() {
        if (hydroGeneratingUnit == null) {
            hydroGeneratingUnit = new ArrayList<HydroGeneratingUnit>();
        }
        return this.hydroGeneratingUnit;
    }

    /**
     * Gets the value of the transformerWinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformerWinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformerWinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformerWinding }
     * 
     * 
     */
    public List<TransformerWinding> getTransformerWinding() {
        if (transformerWinding == null) {
            transformerWinding = new ArrayList<TransformerWinding>();
        }
        return this.transformerWinding;
    }

    /**
     * Gets the value of the thermalGeneratingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thermalGeneratingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThermalGeneratingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThermalGeneratingUnit }
     * 
     * 
     */
    public List<ThermalGeneratingUnit> getThermalGeneratingUnit() {
        if (thermalGeneratingUnit == null) {
            thermalGeneratingUnit = new ArrayList<ThermalGeneratingUnit>();
        }
        return this.thermalGeneratingUnit;
    }

    /**
     * Gets the value of the staticVarCompensator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticVarCompensator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticVarCompensator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticVarCompensator }
     * 
     * 
     */
    public List<StaticVarCompensator> getStaticVarCompensator() {
        if (staticVarCompensator == null) {
            staticVarCompensator = new ArrayList<StaticVarCompensator>();
        }
        return this.staticVarCompensator;
    }

    /**
     * Gets the value of the tapChanger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tapChanger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTapChanger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TapChanger }
     * 
     * 
     */
    public List<TapChanger> getTapChanger() {
        if (tapChanger == null) {
            tapChanger = new ArrayList<TapChanger>();
        }
        return this.tapChanger;
    }

}
