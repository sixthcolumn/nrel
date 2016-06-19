
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.NetworkModelRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for electricLocationFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricLocationFields">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="bus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="networkModelRef" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" minOccurs="0"/>
 *         &lt;element name="transformerBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="linemenServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="electricServicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricLocationFields", propOrder = {
    "substationRef",
    "feederRef",
    "bus",
    "phaseCode",
    "networkModelRef",
    "transformerBankID",
    "linemenServiceArea",
    "poleNumber",
    "serviceLocationID",
    "electricServicePointID"
})
public class ElectricLocationFields
    extends MspExtensible
{

    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected String bus;
    protected PhaseCode phaseCode;
    protected NetworkModelRef networkModelRef;
    protected ObjectID transformerBankID;
    protected String linemenServiceArea;
    protected String poleNumber;
    protected ObjectID serviceLocationID;
    protected ObjectID electricServicePointID;

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
     * Gets the value of the bus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBus(String value) {
        this.bus = value;
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
     * Gets the value of the networkModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModelRef }
     *     
     */
    public NetworkModelRef getNetworkModelRef() {
        return networkModelRef;
    }

    /**
     * Sets the value of the networkModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModelRef }
     *     
     */
    public void setNetworkModelRef(NetworkModelRef value) {
        this.networkModelRef = value;
    }

    /**
     * Gets the value of the transformerBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTransformerBankID() {
        return transformerBankID;
    }

    /**
     * Sets the value of the transformerBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTransformerBankID(ObjectID value) {
        this.transformerBankID = value;
    }

    /**
     * Gets the value of the linemenServiceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinemenServiceArea() {
        return linemenServiceArea;
    }

    /**
     * Sets the value of the linemenServiceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinemenServiceArea(String value) {
        this.linemenServiceArea = value;
    }

    /**
     * Gets the value of the poleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoleNumber() {
        return poleNumber;
    }

    /**
     * Sets the value of the poleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoleNumber(String value) {
        this.poleNumber = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the electricServicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getElectricServicePointID() {
        return electricServicePointID;
    }

    /**
     * Sets the value of the electricServicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setElectricServicePointID(ObjectID value) {
        this.electricServicePointID = value;
    }

}
