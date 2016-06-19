
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspElectricLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspElectricLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspConnectivityLine">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="conductorList" type="{http://www.multispeak.org/Version_3.0}ArrayOfConductor" minOccurs="0"/>
 *         &lt;element name="condN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condLength" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="constr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="load" type="{http://www.multispeak.org/Version_3.0}mspLoadGroup" minOccurs="0"/>
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
@XmlType(name = "mspElectricLine", propOrder = {
    "phaseCode",
    "conductorList",
    "condN",
    "condLength",
    "constr",
    "load"
})
@XmlSeeAlso({
    OhSecondaryLine.class,
    UgSecondaryLine.class,
    UgPrimaryLine.class,
    OhPrimaryLine.class
})
public abstract class MspElectricLine
    extends MspConnectivityLine
{

    protected PhaseCd phaseCode;
    protected ArrayOfConductor conductorList;
    protected String condN;
    protected Float condLength;
    protected String constr;
    protected MspLoadGroup load;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCode(PhaseCd value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the conductorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConductor }
     *     
     */
    public ArrayOfConductor getConductorList() {
        return conductorList;
    }

    /**
     * Sets the value of the conductorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConductor }
     *     
     */
    public void setConductorList(ArrayOfConductor value) {
        this.conductorList = value;
    }

    /**
     * Gets the value of the condN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondN() {
        return condN;
    }

    /**
     * Sets the value of the condN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondN(String value) {
        this.condN = value;
    }

    /**
     * Gets the value of the condLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCondLength() {
        return condLength;
    }

    /**
     * Sets the value of the condLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCondLength(Float value) {
        this.condLength = value;
    }

    /**
     * Gets the value of the constr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstr() {
        return constr;
    }

    /**
     * Sets the value of the constr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstr(String value) {
        this.constr = value;
    }

    /**
     * Gets the value of the load property.
     * 
     * @return
     *     possible object is
     *     {@link MspLoadGroup }
     *     
     */
    public MspLoadGroup getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspLoadGroup }
     *     
     */
    public void setLoad(MspLoadGroup value) {
        this.load = value;
    }

}
