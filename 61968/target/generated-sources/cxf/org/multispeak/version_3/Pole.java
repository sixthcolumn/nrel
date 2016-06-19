
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="poleHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="poleClass" type="{http://www.multispeak.org/Version_3.0}poleClass" minOccurs="0"/>
 *         &lt;element name="poleType" type="{http://www.multispeak.org/Version_3.0}poleType" minOccurs="0"/>
 *         &lt;element name="poleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfgDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treatment" type="{http://www.multispeak.org/Version_3.0}treatment" minOccurs="0"/>
 *         &lt;element name="inspDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="poleUse" type="{http://www.multispeak.org/Version_3.0}poleUseCode" minOccurs="0"/>
 *         &lt;element name="jointUseList" type="{http://www.multispeak.org/Version_3.0}ArrayOfJointUse" minOccurs="0"/>
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
@XmlType(name = "pole", propOrder = {
    "poleHeight",
    "poleClass",
    "poleType",
    "poleNumber",
    "manufacturer",
    "mfgDate",
    "owner",
    "treatment",
    "inspDate",
    "poleUse",
    "jointUseList"
})
public class Pole
    extends MspPointObject
{

    protected Long poleHeight;
    protected PoleClass poleClass;
    protected PoleType poleType;
    protected String poleNumber;
    protected String manufacturer;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mfgDate;
    protected String owner;
    protected Treatment treatment;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inspDate;
    protected PoleUseCode poleUse;
    protected ArrayOfJointUse jointUseList;

    /**
     * Gets the value of the poleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoleHeight() {
        return poleHeight;
    }

    /**
     * Sets the value of the poleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoleHeight(Long value) {
        this.poleHeight = value;
    }

    /**
     * Gets the value of the poleClass property.
     * 
     * @return
     *     possible object is
     *     {@link PoleClass }
     *     
     */
    public PoleClass getPoleClass() {
        return poleClass;
    }

    /**
     * Sets the value of the poleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleClass }
     *     
     */
    public void setPoleClass(PoleClass value) {
        this.poleClass = value;
    }

    /**
     * Gets the value of the poleType property.
     * 
     * @return
     *     possible object is
     *     {@link PoleType }
     *     
     */
    public PoleType getPoleType() {
        return poleType;
    }

    /**
     * Sets the value of the poleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleType }
     *     
     */
    public void setPoleType(PoleType value) {
        this.poleType = value;
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMfgDate(XMLGregorianCalendar value) {
        this.mfgDate = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link Treatment }
     *     
     */
    public Treatment getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Treatment }
     *     
     */
    public void setTreatment(Treatment value) {
        this.treatment = value;
    }

    /**
     * Gets the value of the inspDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspDate() {
        return inspDate;
    }

    /**
     * Sets the value of the inspDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspDate(XMLGregorianCalendar value) {
        this.inspDate = value;
    }

    /**
     * Gets the value of the poleUse property.
     * 
     * @return
     *     possible object is
     *     {@link PoleUseCode }
     *     
     */
    public PoleUseCode getPoleUse() {
        return poleUse;
    }

    /**
     * Sets the value of the poleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleUseCode }
     *     
     */
    public void setPoleUse(PoleUseCode value) {
        this.poleUse = value;
    }

    /**
     * Gets the value of the jointUseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJointUse }
     *     
     */
    public ArrayOfJointUse getJointUseList() {
        return jointUseList;
    }

    /**
     * Sets the value of the jointUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJointUse }
     *     
     */
    public void setJointUseList(ArrayOfJointUse value) {
        this.jointUseList = value;
    }

}
