
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.AllocatedLoads;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.cpsm.LoadCurve;
import org.multispeak.v5_0.enumerations.LoadDistribution;
import org.multispeak.v5_0.enumerations.LoadInterruptibleType;


/**
 * <p>Java class for loadSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadSection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="loadMix" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="loadGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadDistribution" type="{http://www.multispeak.org/V5.0/enumerations}loadDistribution" minOccurs="0"/>
 *         &lt;element name="loadGrowth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="interruptibleType" type="{http://www.multispeak.org/V5.0/enumerations}loadInterruptibleType" minOccurs="0"/>
 *         &lt;element name="allocated" type="{http://www.multispeak.org/V5.0/commonTypes}allocatedLoads" minOccurs="0"/>
 *         &lt;element name="loadCurve" type="{http://www.multispeak.org/V5.0/cpsm}LoadCurve" minOccurs="0"/>
 *         &lt;element name="loadGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadSection", propOrder = {
    "loadMix",
    "loadGroup",
    "loadClass",
    "loadZone",
    "loadDistribution",
    "loadGrowth",
    "interruptibleType",
    "allocated",
    "loadCurve",
    "loadGroupID"
})
public class LoadSection
    extends MspExtensible
{

    protected EquipmentCatalogRef loadMix;
    protected String loadGroup;
    protected String loadClass;
    protected String loadZone;
    protected LoadDistribution loadDistribution;
    protected Float loadGrowth;
    protected LoadInterruptibleType interruptibleType;
    protected AllocatedLoads allocated;
    protected LoadCurve loadCurve;
    protected ObjectID loadGroupID;

    /**
     * Gets the value of the loadMix property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getLoadMix() {
        return loadMix;
    }

    /**
     * Sets the value of the loadMix property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setLoadMix(EquipmentCatalogRef value) {
        this.loadMix = value;
    }

    /**
     * Gets the value of the loadGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadGroup() {
        return loadGroup;
    }

    /**
     * Sets the value of the loadGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadGroup(String value) {
        this.loadGroup = value;
    }

    /**
     * Gets the value of the loadClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadClass() {
        return loadClass;
    }

    /**
     * Sets the value of the loadClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadClass(String value) {
        this.loadClass = value;
    }

    /**
     * Gets the value of the loadZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadZone() {
        return loadZone;
    }

    /**
     * Sets the value of the loadZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadZone(String value) {
        this.loadZone = value;
    }

    /**
     * Gets the value of the loadDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDistribution }
     *     
     */
    public LoadDistribution getLoadDistribution() {
        return loadDistribution;
    }

    /**
     * Sets the value of the loadDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDistribution }
     *     
     */
    public void setLoadDistribution(LoadDistribution value) {
        this.loadDistribution = value;
    }

    /**
     * Gets the value of the loadGrowth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLoadGrowth() {
        return loadGrowth;
    }

    /**
     * Sets the value of the loadGrowth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLoadGrowth(Float value) {
        this.loadGrowth = value;
    }

    /**
     * Gets the value of the interruptibleType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadInterruptibleType }
     *     
     */
    public LoadInterruptibleType getInterruptibleType() {
        return interruptibleType;
    }

    /**
     * Sets the value of the interruptibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadInterruptibleType }
     *     
     */
    public void setInterruptibleType(LoadInterruptibleType value) {
        this.interruptibleType = value;
    }

    /**
     * Gets the value of the allocated property.
     * 
     * @return
     *     possible object is
     *     {@link AllocatedLoads }
     *     
     */
    public AllocatedLoads getAllocated() {
        return allocated;
    }

    /**
     * Sets the value of the allocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocatedLoads }
     *     
     */
    public void setAllocated(AllocatedLoads value) {
        this.allocated = value;
    }

    /**
     * Gets the value of the loadCurve property.
     * 
     * @return
     *     possible object is
     *     {@link LoadCurve }
     *     
     */
    public LoadCurve getLoadCurve() {
        return loadCurve;
    }

    /**
     * Sets the value of the loadCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadCurve }
     *     
     */
    public void setLoadCurve(LoadCurve value) {
        this.loadCurve = value;
    }

    /**
     * Gets the value of the loadGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLoadGroupID() {
        return loadGroupID;
    }

    /**
     * Sets the value of the loadGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLoadGroupID(ObjectID value) {
        this.loadGroupID = value;
    }

}
