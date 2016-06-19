
package org.multispeak.version_3;

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
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctrlPhase" type="{http://www.multispeak.org/Version_3.0}mspPhase" minOccurs="0"/>
 *         &lt;element name="wdgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regulatorList" type="{http://www.multispeak.org/Version_3.0}ArrayOfRegulator" minOccurs="0"/>
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
    "regType",
    "ctrlPhase",
    "wdgType",
    "regulatorList"
})
public class RegulatorBank
    extends MspBankObject
{

    protected String regType;
    protected MspPhase ctrlPhase;
    protected String wdgType;
    protected ArrayOfRegulator regulatorList;

    /**
     * Gets the value of the regType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegType(String value) {
        this.regType = value;
    }

    /**
     * Gets the value of the ctrlPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getCtrlPhase() {
        return ctrlPhase;
    }

    /**
     * Sets the value of the ctrlPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setCtrlPhase(MspPhase value) {
        this.ctrlPhase = value;
    }

    /**
     * Gets the value of the wdgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWdgType() {
        return wdgType;
    }

    /**
     * Sets the value of the wdgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWdgType(String value) {
        this.wdgType = value;
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
