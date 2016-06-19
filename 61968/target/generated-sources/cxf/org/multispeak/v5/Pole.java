
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PoleClass;
import org.multispeak.v5_0.enumerations.PoleType;
import org.multispeak.v5_0.enumerations.PoleUse;
import org.multispeak.v5_0.enumerations.Treatment;


/**
 * This is a structure for supporting overhead lines.  The company pole number SHALL be used as the primaryIdentifier for this object.  This value is referred to in other objects as being the poleNumber (poleNo in Versions 3.0 and 4.1).
 * 
 * <p>Java class for pole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="poleHeight" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *         &lt;element name="poleClass" type="{http://www.multispeak.org/V5.0/enumerations}poleClass" minOccurs="0"/>
 *         &lt;element name="poleType" type="{http://www.multispeak.org/V5.0/enumerations}poleType" minOccurs="0"/>
 *         &lt;element name="poleUse" type="{http://www.multispeak.org/V5.0/enumerations}poleUse" minOccurs="0"/>
 *         &lt;element name="lastInspectedDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="poleTreatment" type="{http://www.multispeak.org/V5.0/enumerations}treatment" minOccurs="0"/>
 *         &lt;element name="jointUseList" type="{http://www.multispeak.org/V5.0}jointUseList" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
 *         &lt;element name="guyRefs" type="{http://www.multispeak.org/V5.0}guyRefs" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "pole", propOrder = {
    "poleHeight",
    "poleClass",
    "poleType",
    "poleUse",
    "lastInspectedDate",
    "poleTreatment",
    "jointUseList",
    "assetData",
    "guyRefs",
    "materialManagementAssemblyID"
})
public class Pole
    extends MspPointObject
{

    protected Height poleHeight;
    protected PoleClass poleClass;
    protected PoleType poleType;
    protected PoleUse poleUse;
    protected XMLGregorianCalendar lastInspectedDate;
    protected Treatment poleTreatment;
    protected JointUseList jointUseList;
    protected AssetData assetData;
    protected GuyRefs guyRefs;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the poleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getPoleHeight() {
        return poleHeight;
    }

    /**
     * Sets the value of the poleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setPoleHeight(Height value) {
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
     * Gets the value of the poleUse property.
     * 
     * @return
     *     possible object is
     *     {@link PoleUse }
     *     
     */
    public PoleUse getPoleUse() {
        return poleUse;
    }

    /**
     * Sets the value of the poleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleUse }
     *     
     */
    public void setPoleUse(PoleUse value) {
        this.poleUse = value;
    }

    /**
     * Gets the value of the lastInspectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInspectedDate() {
        return lastInspectedDate;
    }

    /**
     * Sets the value of the lastInspectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInspectedDate(XMLGregorianCalendar value) {
        this.lastInspectedDate = value;
    }

    /**
     * Gets the value of the poleTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link Treatment }
     *     
     */
    public Treatment getPoleTreatment() {
        return poleTreatment;
    }

    /**
     * Sets the value of the poleTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Treatment }
     *     
     */
    public void setPoleTreatment(Treatment value) {
        this.poleTreatment = value;
    }

    /**
     * Gets the value of the jointUseList property.
     * 
     * @return
     *     possible object is
     *     {@link JointUseList }
     *     
     */
    public JointUseList getJointUseList() {
        return jointUseList;
    }

    /**
     * Sets the value of the jointUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointUseList }
     *     
     */
    public void setJointUseList(JointUseList value) {
        this.jointUseList = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
    }

    /**
     * Gets the value of the guyRefs property.
     * 
     * @return
     *     possible object is
     *     {@link GuyRefs }
     *     
     */
    public GuyRefs getGuyRefs() {
        return guyRefs;
    }

    /**
     * Sets the value of the guyRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyRefs }
     *     
     */
    public void setGuyRefs(GuyRefs value) {
        this.guyRefs = value;
    }

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

}
