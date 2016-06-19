
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.MspPhase;
import org.multispeak.v5_0.enumerations.RegulatorBankConnectionCode;


/**
 * <p>Java class for regulatorBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulatorBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="controlPhase" type="{http://www.multispeak.org/V5.0/enumerations}mspPhase" minOccurs="0"/>
 *         &lt;element name="regulators" type="{http://www.multispeak.org/V5.0}regulators" minOccurs="0"/>
 *         &lt;element name="regulatorBankConnectionCode" type="{http://www.multispeak.org/V5.0/enumerations}regulatorBankConnectionCode" minOccurs="0"/>
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
@XmlType(name = "regulatorBank", propOrder = {
    "materialManagementAssemblyID",
    "controlPhase",
    "regulators",
    "regulatorBankConnectionCode"
})
public class RegulatorBank
    extends MspBankObject
{

    protected ObjectID materialManagementAssemblyID;
    protected MspPhase controlPhase;
    protected Regulators regulators;
    protected RegulatorBankConnectionCode regulatorBankConnectionCode;

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

    /**
     * Gets the value of the controlPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getControlPhase() {
        return controlPhase;
    }

    /**
     * Sets the value of the controlPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setControlPhase(MspPhase value) {
        this.controlPhase = value;
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
     * Gets the value of the regulatorBankConnectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorBankConnectionCode }
     *     
     */
    public RegulatorBankConnectionCode getRegulatorBankConnectionCode() {
        return regulatorBankConnectionCode;
    }

    /**
     * Sets the value of the regulatorBankConnectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorBankConnectionCode }
     *     
     */
    public void setRegulatorBankConnectionCode(RegulatorBankConnectionCode value) {
        this.regulatorBankConnectionCode = value;
    }

}
