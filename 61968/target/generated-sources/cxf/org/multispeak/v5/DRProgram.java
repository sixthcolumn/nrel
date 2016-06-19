
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.enumerations.DRProgramStatus;


/**
 * <p>Java class for DRProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DRProgram">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="DRProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRProgramType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DRProgramOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRProgramDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRProgramStartDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="DRProgramEndDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="isDRDeviceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PANDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRProgramStatus" type="{http://www.multispeak.org/V5.0/enumerations}DRProgramStatus"/>
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
@XmlType(name = "DRProgram", propOrder = {
    "drProgramName",
    "drProgramType",
    "drProgramOwner",
    "drProgramDescription",
    "drProgramStartDate",
    "drProgramEndDate",
    "isDRDeviceRequired",
    "panDeviceType",
    "drProgramStatus"
})
public class DRProgram
    extends MspObject
{

    @XmlElement(name = "DRProgramName", required = true)
    protected String drProgramName;
    @XmlElement(name = "DRProgramType", required = true)
    protected String drProgramType;
    @XmlElement(name = "DRProgramOwner")
    protected String drProgramOwner;
    @XmlElement(name = "DRProgramDescription")
    protected String drProgramDescription;
    @XmlElement(name = "DRProgramStartDate")
    protected XMLGregorianCalendar drProgramStartDate;
    @XmlElement(name = "DRProgramEndDate")
    protected XMLGregorianCalendar drProgramEndDate;
    protected Boolean isDRDeviceRequired;
    @XmlElement(name = "PANDeviceType")
    protected String panDeviceType;
    @XmlElement(name = "DRProgramStatus", required = true)
    protected DRProgramStatus drProgramStatus;

    /**
     * Gets the value of the drProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRProgramName() {
        return drProgramName;
    }

    /**
     * Sets the value of the drProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRProgramName(String value) {
        this.drProgramName = value;
    }

    /**
     * Gets the value of the drProgramType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRProgramType() {
        return drProgramType;
    }

    /**
     * Sets the value of the drProgramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRProgramType(String value) {
        this.drProgramType = value;
    }

    /**
     * Gets the value of the drProgramOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRProgramOwner() {
        return drProgramOwner;
    }

    /**
     * Sets the value of the drProgramOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRProgramOwner(String value) {
        this.drProgramOwner = value;
    }

    /**
     * Gets the value of the drProgramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRProgramDescription() {
        return drProgramDescription;
    }

    /**
     * Sets the value of the drProgramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRProgramDescription(String value) {
        this.drProgramDescription = value;
    }

    /**
     * Gets the value of the drProgramStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRProgramStartDate() {
        return drProgramStartDate;
    }

    /**
     * Sets the value of the drProgramStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRProgramStartDate(XMLGregorianCalendar value) {
        this.drProgramStartDate = value;
    }

    /**
     * Gets the value of the drProgramEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRProgramEndDate() {
        return drProgramEndDate;
    }

    /**
     * Sets the value of the drProgramEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRProgramEndDate(XMLGregorianCalendar value) {
        this.drProgramEndDate = value;
    }

    /**
     * Gets the value of the isDRDeviceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDRDeviceRequired() {
        return isDRDeviceRequired;
    }

    /**
     * Sets the value of the isDRDeviceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDRDeviceRequired(Boolean value) {
        this.isDRDeviceRequired = value;
    }

    /**
     * Gets the value of the panDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANDeviceType() {
        return panDeviceType;
    }

    /**
     * Sets the value of the panDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANDeviceType(String value) {
        this.panDeviceType = value;
    }

    /**
     * Gets the value of the drProgramStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DRProgramStatus }
     *     
     */
    public DRProgramStatus getDRProgramStatus() {
        return drProgramStatus;
    }

    /**
     * Sets the value of the drProgramStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRProgramStatus }
     *     
     */
    public void setDRProgramStatus(DRProgramStatus value) {
        this.drProgramStatus = value;
    }

}
