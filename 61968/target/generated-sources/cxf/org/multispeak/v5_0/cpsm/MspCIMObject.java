
package org.multispeak.v5_0.cpsm;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.commontypes.ErrorObjects;
import org.multispeak.v5_0.commontypes.Extensions;
import org.multispeak.v5_0.commontypes.ExtensionsList;
import org.multispeak.v5_0.commontypes.PrimaryIdentifier;
import org.multispeak.v5_0.commontypes.SecondaryIdentifier;


/**
 * <p>Java class for mspCIMObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspCIMObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *         &lt;element name="errorObjects" type="{http://www.multispeak.org/V5.0/commonTypes}errorObjects" minOccurs="0"/>
 *         &lt;element name="primaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}primaryIdentifier"/>
 *         &lt;element name="secondaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}secondaryIdentifier" minOccurs="0"/>
 *         &lt;element name="IdentifiedObject" type="{http://www.multispeak.org/V5.0/cpsm}IdentifiedObject" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspCIMObject", propOrder = {
    "extensions",
    "comments",
    "extensionsList",
    "errorObjects",
    "primaryIdentifier",
    "secondaryIdentifier",
    "identifiedObject"
})
@XmlSeeAlso({
    BaseVoltage.class,
    VoltageLimit.class,
    ControlAreaGeneratingUnit.class,
    Accumulator.class,
    NonConformLoadGroup.class,
    StringMeasurement.class,
    Unit.class,
    MeasurementType.class,
    MeasurementValueSource.class,
    SubGeographicalRegion.class,
    RegulatingControl.class,
    Discrete.class,
    EquivalentNetwork.class,
    ControlArea.class,
    ConformLoadGroup.class,
    GeographicalRegion.class,
    OperationalLimitSet.class,
    DayType.class,
    ActivePowerLimit.class,
    PowerSystemResource.class,
    ApparentPowerLimit.class,
    EquipmentContainer.class,
    SubLoadArea.class,
    MeasurementValue.class,
    BasicIntervalSchedule.class,
    ConductingEquipment.class,
    ConnectivityNode.class,
    Curve.class,
    CurrentLimit.class
})
public abstract class MspCIMObject {

    protected Extensions extensions;
    protected String comments;
    protected ExtensionsList extensionsList;
    protected ErrorObjects errorObjects;
    @XmlElement(required = true)
    protected PrimaryIdentifier primaryIdentifier;
    protected SecondaryIdentifier secondaryIdentifier;
    @XmlElement(name = "IdentifiedObject")
    protected IdentifiedObject identifiedObject;
    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "utility")
    protected String utility;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the errorObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorObjects }
     *     
     */
    public ErrorObjects getErrorObjects() {
        return errorObjects;
    }

    /**
     * Sets the value of the errorObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorObjects }
     *     
     */
    public void setErrorObjects(ErrorObjects value) {
        this.errorObjects = value;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryIdentifier }
     *     
     */
    public PrimaryIdentifier getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryIdentifier }
     *     
     */
    public void setPrimaryIdentifier(PrimaryIdentifier value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the secondaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryIdentifier }
     *     
     */
    public SecondaryIdentifier getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    /**
     * Sets the value of the secondaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryIdentifier }
     *     
     */
    public void setSecondaryIdentifier(SecondaryIdentifier value) {
        this.secondaryIdentifier = value;
    }

    /**
     * Gets the value of the identifiedObject property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedObject }
     *     
     */
    public IdentifiedObject getIdentifiedObject() {
        return identifiedObject;
    }

    /**
     * Sets the value of the identifiedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedObject }
     *     
     */
    public void setIdentifiedObject(IdentifiedObject value) {
        this.identifiedObject = value;
    }

    /**
     * Gets the value of the objectGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
