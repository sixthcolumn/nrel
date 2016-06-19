
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulatorBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulatorBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="regulatorBankConnectionCode" type="{http://www.multispeak.org/Version_4.1_Release}regulatorBankConnectionCode" minOccurs="0"/>
 *         &lt;element name="crlPhase" type="{http://www.multispeak.org/Version_4.1_Release}mspPhase" minOccurs="0"/>
 *         &lt;element name="regulatorList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfRegulator" minOccurs="0"/>
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
@XmlType(name = "regulatorBank", propOrder = {
    "regulatorBankConnectionCode",
    "crlPhase",
    "regulatorList"
})
public class RegulatorBank
    extends MspBankObject
{

    protected RegulatorBankConnectionCode regulatorBankConnectionCode;
    protected MspPhase crlPhase;
    protected ArrayOfRegulator regulatorList;

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

    /**
     * Gets the value of the crlPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getCrlPhase() {
        return crlPhase;
    }

    /**
     * Sets the value of the crlPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setCrlPhase(MspPhase value) {
        this.crlPhase = value;
    }

    /**
     * Gets the value of the regulatorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegulator }
     *     
     */
    public ArrayOfRegulator getRegulatorList() {
        return regulatorList;
    }

    /**
     * Sets the value of the regulatorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegulator }
     *     
     */
    public void setRegulatorList(ArrayOfRegulator value) {
        this.regulatorList = value;
    }

}
