
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.gml.LineStringType;
import org.multispeak.v5_0.gml.PointType;


/**
 * This object implements the CIM ConductingEquipment object in MultiSpeak.  The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.
 * 
 * <p>Java class for ConductingEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConductingEquipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/gml}PointType" minOccurs="0"/>
 *         &lt;element name="GMLLine" type="{http://www.multispeak.org/V5.0/gml}LineStringType" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="normallyInService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ConductingEquipment", propOrder = {
    "gmlLocation",
    "gmlLine",
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
