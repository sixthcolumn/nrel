
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for substation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="zMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.multispeak.org/Version_3.0}zUnit" minOccurs="0"/>
 *         &lt;element name="posSeqZ" type="{http://www.multispeak.org/Version_3.0}complexNum" minOccurs="0"/>
 *         &lt;element name="zeroSeqZ" type="{http://www.multispeak.org/Version_3.0}complexNum" minOccurs="0"/>
 *         &lt;element name="negSeqZ" type="{http://www.multispeak.org/Version_3.0}complexNum" minOccurs="0"/>
 *         &lt;element name="busVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ohGndZ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ugGndZ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nomVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ldAolloc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ldCon" type="{http://www.multispeak.org/Version_3.0}ldCon" minOccurs="0"/>
 *         &lt;element name="isRegulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="feederList" type="{http://www.multispeak.org/Version_3.0}ArrayOfFeederObject" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "substation", propOrder = {
    "zMin",
    "zMax",
    "units",
    "posSeqZ",
    "zeroSeqZ",
    "negSeqZ",
    "busVolts",
    "ohGndZ",
    "ugGndZ",
    "nomVolts",
    "ldAolloc",
    "ldCon",
    "isRegulated",
    "feederList",
    "name"
})
public class Substation
    extends MspElectricPoint
{

    protected String zMin;
    protected String zMax;
    protected ZUnit units;
    protected ComplexNum posSeqZ;
    protected ComplexNum zeroSeqZ;
    protected ComplexNum negSeqZ;
    protected Float busVolts;
    protected Float ohGndZ;
    protected Float ugGndZ;
    protected Float nomVolts;
    protected Boolean ldAolloc;
    protected LdCon ldCon;
    protected Boolean isRegulated;
    protected ArrayOfFeederObject feederList;
    protected String name;

    /**
     * Gets the value of the zMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZMin() {
        return zMin;
    }

    /**
     * Sets the value of the zMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZMin(String value) {
        this.zMin = value;
    }

    /**
     * Gets the value of the zMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZMax() {
        return zMax;
    }

    /**
     * Sets the value of the zMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZMax(String value) {
        this.zMax = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link ZUnit }
     *     
     */
    public ZUnit getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZUnit }
     *     
     */
    public void setUnits(ZUnit value) {
        this.units = value;
    }

    /**
     * Gets the value of the posSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNum }
     *     
     */
    public ComplexNum getPosSeqZ() {
        return posSeqZ;
    }

    /**
     * Sets the value of the posSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNum }
     *     
     */
    public void setPosSeqZ(ComplexNum value) {
        this.posSeqZ = value;
    }

    /**
     * Gets the value of the zeroSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNum }
     *     
     */
    public ComplexNum getZeroSeqZ() {
        return zeroSeqZ;
    }

    /**
     * Sets the value of the zeroSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNum }
     *     
     */
    public void setZeroSeqZ(ComplexNum value) {
        this.zeroSeqZ = value;
    }

    /**
     * Gets the value of the negSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNum }
     *     
     */
    public ComplexNum getNegSeqZ() {
        return negSeqZ;
    }

    /**
     * Sets the value of the negSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNum }
     *     
     */
    public void setNegSeqZ(ComplexNum value) {
        this.negSeqZ = value;
    }

    /**
     * Gets the value of the busVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBusVolts() {
        return busVolts;
    }

    /**
     * Sets the value of the busVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBusVolts(Float value) {
        this.busVolts = value;
    }

    /**
     * Gets the value of the ohGndZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOhGndZ() {
        return ohGndZ;
    }

    /**
     * Sets the value of the ohGndZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOhGndZ(Float value) {
        this.ohGndZ = value;
    }

    /**
     * Gets the value of the ugGndZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUgGndZ() {
        return ugGndZ;
    }

    /**
     * Sets the value of the ugGndZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUgGndZ(Float value) {
        this.ugGndZ = value;
    }

    /**
     * Gets the value of the nomVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNomVolts() {
        return nomVolts;
    }

    /**
     * Sets the value of the nomVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNomVolts(Float value) {
        this.nomVolts = value;
    }

    /**
     * Gets the value of the ldAolloc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLdAolloc() {
        return ldAolloc;
    }

    /**
     * Sets the value of the ldAolloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLdAolloc(Boolean value) {
        this.ldAolloc = value;
    }

    /**
     * Gets the value of the ldCon property.
     * 
     * @return
     *     possible object is
     *     {@link LdCon }
     *     
     */
    public LdCon getLdCon() {
        return ldCon;
    }

    /**
     * Sets the value of the ldCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdCon }
     *     
     */
    public void setLdCon(LdCon value) {
        this.ldCon = value;
    }

    /**
     * Gets the value of the isRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegulated() {
        return isRegulated;
    }

    /**
     * Sets the value of the isRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegulated(Boolean value) {
        this.isRegulated = value;
    }

    /**
     * Gets the value of the feederList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeederObject }
     *     
     */
    public ArrayOfFeederObject getFeederList() {
        return feederList;
    }

    /**
     * Sets the value of the feederList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeederObject }
     *     
     */
    public void setFeederList(ArrayOfFeederObject value) {
        this.feederList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
