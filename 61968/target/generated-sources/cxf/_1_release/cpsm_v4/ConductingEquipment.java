
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _1_release.gml_v4.LineStringType;
import _1_release.gml_v4.PointType;


/**
 * <p>Java class for ConductingEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConductingEquipment">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{gml_V4.1_Release}PointType" minOccurs="0"/>
 *         &lt;element name="GMLLine" type="{gml_V4.1_Release}LineStringType" minOccurs="0"/>
 *         &lt;element name="connectivitySections" type="{cpsm_V4.1_Release}ConnectivitySections" minOccurs="0"/>
 *         &lt;element name="connectivityNodes" type="{cpsm_V4.1_Release}ConnectivityNodes" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{cpsm_V4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="normallyInService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ConductingEquipment", propOrder = {
    "gmlLocation",
    "gmlLine",
    "connectivitySections",
    "connectivityNodes",
    "phaseCode",
    "normallyInService"
})
@XmlSeeAlso({
    TapChanger.class,
    TransformerWinding.class,
    Terminal.class,
    EquivalentEquipment.class,
    GeneratingUnit.class,
    RegulatingCondEq.class,
    Connector.class
})
public abstract class ConductingEquipment
    extends MspCIMObject
{

    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    @XmlElement(name = "GMLLine")
    protected LineStringType gmlLine;
    protected ConnectivitySections connectivitySections;
    protected ConnectivityNodes connectivityNodes;
    protected PhaseCode phaseCode;
    protected Boolean normallyInService;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setGMLLocation(PointType value) {
        this.gmlLocation = value;
    }

    /**
     * Gets the value of the gmlLine property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getGMLLine() {
        return gmlLine;
    }

    /**
     * Sets the value of the gmlLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setGMLLine(LineStringType value) {
        this.gmlLine = value;
    }

    /**
     * Gets the value of the connectivitySections property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivitySections }
     *     
     */
    public ConnectivitySections getConnectivitySections() {
        return connectivitySections;
    }

    /**
     * Sets the value of the connectivitySections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivitySections }
     *     
     */
    public void setConnectivitySections(ConnectivitySections value) {
        this.connectivitySections = value;
    }

    /**
     * Gets the value of the connectivityNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityNodes }
     *     
     */
    public ConnectivityNodes getConnectivityNodes() {
        return connectivityNodes;
    }

    /**
     * Sets the value of the connectivityNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityNodes }
     *     
     */
    public void setConnectivityNodes(ConnectivityNodes value) {
        this.connectivityNodes = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the normallyInService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNormallyInService() {
        return normallyInService;
    }

    /**
     * Sets the value of the normallyInService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormallyInService(Boolean value) {
        this.normallyInService = value;
    }

}
