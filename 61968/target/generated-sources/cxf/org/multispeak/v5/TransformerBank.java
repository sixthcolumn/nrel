
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.MountingType;
import org.multispeak.v5_0.enumerations.MspPhase;
import org.multispeak.v5_0.enumerations.WindingCode;


/**
 * <p>Java class for transformerBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformerBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="windingCode" type="{http://www.multispeak.org/V5.0/enumerations}windingCode" minOccurs="0"/>
 *         &lt;element name="centerTapPhase" type="{http://www.multispeak.org/V5.0/enumerations}mspPhase" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/V5.0/enumerations}mountingType" minOccurs="0"/>
 *         &lt;element name="tertiarySectionID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="secondaryProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="electricLocationFields" type="{http://www.multispeak.org/V5.0}electricLocationFields" minOccurs="0"/>
 *         &lt;element name="bankRatings" type="{http://www.multispeak.org/V5.0}bankRatings" minOccurs="0"/>
 *         &lt;element name="transformers" type="{http://www.multispeak.org/V5.0}transformers" minOccurs="0"/>
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
@XmlType(name = "transformerBank", propOrder = {
    "windingCode",
    "centerTapPhase",
    "description",
    "mounting",
    "tertiarySectionID",
    "secondaryProtection",
    "primaryProtection",
    "materialManagementAssemblyID",
    "electricLocationFields",
    "bankRatings",
    "transformers"
})
public class TransformerBank
    extends MspBankObject
{

    protected WindingCode windingCode;
    protected MspPhase centerTapPhase;
    protected String description;
    protected MountingType mounting;
    protected ObjectRef tertiarySectionID;
    protected String secondaryProtection;
    protected String primaryProtection;
    protected ObjectID materialManagementAssemblyID;
    protected ElectricLocationFields electricLocationFields;
    protected BankRatings bankRatings;
    protected Transformers transformers;

    /**
     * Gets the value of the windingCode property.
     * 
     * @return
     *     possible object is
     *     {@link WindingCode }
     *     
     */
    public WindingCode getWindingCode() {
        return windingCode;
    }

    /**
     * Sets the value of the windingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingCode }
     *     
     */
    public void setWindingCode(WindingCode value) {
        this.windingCode = value;
    }

    /**
     * Gets the value of the centerTapPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getCenterTapPhase() {
        return centerTapPhase;
    }

    /**
     * Sets the value of the centerTapPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setCenterTapPhase(MspPhase value) {
        this.centerTapPhase = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link MountingType }
     *     
     */
    public MountingType getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MountingType }
     *     
     */
    public void setMounting(MountingType value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the tertiarySectionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getTertiarySectionID() {
        return tertiarySectionID;
    }

    /**
     * Sets the value of the tertiarySectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setTertiarySectionID(ObjectRef value) {
        this.tertiarySectionID = value;
    }

    /**
     * Gets the value of the secondaryProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryProtection() {
        return secondaryProtection;
    }

    /**
     * Sets the value of the secondaryProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryProtection(String value) {
        this.secondaryProtection = value;
    }

    /**
     * Gets the value of the primaryProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryProtection() {
        return primaryProtection;
    }

    /**
     * Sets the value of the primaryProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryProtection(String value) {
        this.primaryProtection = value;
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

    /**
     * Gets the value of the electricLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricLocationFields }
     *     
     */
    public ElectricLocationFields getElectricLocationFields() {
        return electricLocationFields;
    }

    /**
     * Sets the value of the electricLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricLocationFields }
     *     
     */
    public void setElectricLocationFields(ElectricLocationFields value) {
        this.electricLocationFields = value;
    }

    /**
     * Gets the value of the bankRatings property.
     * 
     * @return
     *     possible object is
     *     {@link BankRatings }
     *     
     */
    public BankRatings getBankRatings() {
        return bankRatings;
    }

    /**
     * Sets the value of the bankRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRatings }
     *     
     */
    public void setBankRatings(BankRatings value) {
        this.bankRatings = value;
    }

    /**
     * Gets the value of the transformers property.
     * 
     * @return
     *     possible object is
     *     {@link Transformers }
     *     
     */
    public Transformers getTransformers() {
        return transformers;
    }

    /**
     * Sets the value of the transformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transformers }
     *     
     */
    public void setTransformers(Transformers value) {
        this.transformers = value;
    }

}
