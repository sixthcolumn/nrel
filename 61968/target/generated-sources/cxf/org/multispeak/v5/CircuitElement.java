
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.CircuitElementType;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * This element is used to exchange information about a trace of the electrical connectivity tree.  It contains topology information, but does not include the engineering or asset information.  The name of the circuit element SHALL be carried in the circuitElement.primaryIdentifier.
 * 
 * <p>Java class for circuitElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuitElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="parentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementType" type="{http://www.multispeak.org/V5.0/enumerations}circuitElementType" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="circuitElementStatus" type="{http://www.multispeak.org/V5.0}circuitElementStatus" minOccurs="0"/>
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
@XmlType(name = "circuitElement", propOrder = {
    "parentName",
    "elementType",
    "substationRef",
    "feederRef",
    "phaseCode",
    "circuitElementStatus"
})
public class CircuitElement
    extends MspObject
{

    protected String parentName;
    protected CircuitElementType elementType;
    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected PhaseCode phaseCode;
    protected CircuitElementStatus circuitElementStatus;

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementType }
     *     
     */
    public CircuitElementType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementType }
     *     
     */
    public void setElementType(CircuitElementType value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the substationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getSubstationRef() {
        return substationRef;
    }

    /**
     * Sets the value of the substationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setSubstationRef(SubstationRef value) {
        this.substationRef = value;
    }

    /**
     * Gets the value of the feederRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getFeederRef() {
        return feederRef;
    }

    /**
     * Sets the value of the feederRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setFeederRef(ObjectRef value) {
        this.feederRef = value;
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
     * Gets the value of the circuitElementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementStatus }
     *     
     */
    public CircuitElementStatus getCircuitElementStatus() {
        return circuitElementStatus;
    }

    /**
     * Sets the value of the circuitElementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementStatus }
     *     
     */
    public void setCircuitElementStatus(CircuitElementStatus value) {
        this.circuitElementStatus = value;
    }

}
