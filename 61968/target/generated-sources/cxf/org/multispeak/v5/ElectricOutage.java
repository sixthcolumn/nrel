
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for electricOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricOutage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspOutage">
 *       &lt;sequence>
 *         &lt;element name="predictedElement" type="{http://www.multispeak.org/V5.0}predictedElement" minOccurs="0"/>
 *         &lt;element name="failedDevices" type="{http://www.multispeak.org/V5.0}failedDevices" minOccurs="0"/>
 *         &lt;element name="outagedPhase" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="outageReasonList" type="{http://www.multispeak.org/V5.0}outageReasonList" minOccurs="0"/>
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
@XmlType(name = "electricOutage", propOrder = {
    "predictedElement",
    "failedDevices",
    "outagedPhase",
    "substationRef",
    "feederRef",
    "outageReasonList"
})
public class ElectricOutage
    extends MspOutage
{

    protected PredictedElement predictedElement;
    protected FailedDevices failedDevices;
    protected PhaseCode outagedPhase;
    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected OutageReasonList outageReasonList;

    /**
     * Gets the value of the predictedElement property.
     * 
     * @return
     *     possible object is
     *     {@link PredictedElement }
     *     
     */
    public PredictedElement getPredictedElement() {
        return predictedElement;
    }

    /**
     * Sets the value of the predictedElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictedElement }
     *     
     */
    public void setPredictedElement(PredictedElement value) {
        this.predictedElement = value;
    }

    /**
     * Gets the value of the failedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link FailedDevices }
     *     
     */
    public FailedDevices getFailedDevices() {
        return failedDevices;
    }

    /**
     * Sets the value of the failedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedDevices }
     *     
     */
    public void setFailedDevices(FailedDevices value) {
        this.failedDevices = value;
    }

    /**
     * Gets the value of the outagedPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOutagedPhase() {
        return outagedPhase;
    }

    /**
     * Sets the value of the outagedPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOutagedPhase(PhaseCode value) {
        this.outagedPhase = value;
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
     * Gets the value of the outageReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonList }
     *     
     */
    public OutageReasonList getOutageReasonList() {
        return outageReasonList;
    }

    /**
     * Sets the value of the outageReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonList }
     *     
     */
    public void setOutageReasonList(OutageReasonList value) {
        this.outageReasonList = value;
    }

}
