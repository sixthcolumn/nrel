
package org.multispeak.v5;

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
import org.multispeak.v5_0.commontypes.SingleIdentifier;
import org.multispeak.v5_0.cpsm.IdentifiedObject;


/**
 * This is the class from which all classes that can be acted upon inherit (either directly or indirectly).
 * 
 * <p>Java class for mspObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *         &lt;element name="errorObjects" type="{http://www.multispeak.org/V5.0/commonTypes}errorObjects" minOccurs="0"/>
 *         &lt;element name="primaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}singleIdentifier"/>
 *         &lt;element name="secondaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}singleIdentifier" minOccurs="0"/>
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
@XmlType(name = "mspObject", propOrder = {
    "extensions",
    "comments",
    "extensionsList",
    "errorObjects",
    "primaryIdentifier",
    "secondaryIdentifier",
    "identifiedObject"
})
@XmlSeeAlso({
    DRProgram.class,
    PpmBalanceAdjustment.class,
    PremisesDisplayMessage.class,
    PremisesDisplayGroup.class,
    ClearanceCertificate.class,
    PANRegistration.class,
    WorkType.class,
    WorkRequest.class,
    ThresholdNotificationItem.class,
    PpmLocation.class,
    ClearanceTag.class,
    LoadGroup.class,
    CallBackList.class,
    MaterialManagementAssembly.class,
    RecurringPaymentConfiguration.class,
    MspMultiGeometryObject.class,
    DemandResponseParameters.class,
    PANCommission.class,
    Tender.class,
    MeterExchanges.class,
    Feeder.class,
    ReadingType.class,
    Agreement.class,
    DRProgramEnrollment.class,
    ChargeableDevice.class,
    ClearanceInstanceRequest.class,
    CircuitElement.class,
    ThresholdMonitoringItem.class,
    SwitchingOrder.class,
    LaborCategory.class,
    PremisesDisplayBillingMessage.class,
    CustomersAffectedByOutage.class,
    OutageDurationEvent.class,
    FormattedBlockTemplate.class,
    MaterialItem.class,
    OutageSplit.class,
    Tariff.class,
    MspPolygonObject.class,
    ClearanceInstance.class,
    PANDeviceGroup.class,
    TOUSchedule.class,
    OutageDetectionLog.class,
    SwitchingSchedule.class,
    Measurement.class,
    Organization.class,
    Message.class,
    MeterGroup.class,
    OutageMerge.class,
    CustomersAttachedToDevice.class,
    CustomerCall.class,
    Account.class,
    Resource.class,
    AccumulatedValue.class,
    DemandResponseEventStatus.class,
    Content.class,
    Ability.class,
    MspWork.class,
    ScadaAnalog.class,
    MspResultsBase.class,
    Attachment.class,
    CPPSchedule.class,
    MspPerson.class,
    Schedule.class,
    MspLineObject.class,
    MspAsset.class,
    MspOutage.class,
    MspPointObject.class,
    MspElectricalDefinition.class,
    CPR.class,
    PpmTransaction.class
})
public abstract class MspObject {

    protected Extensions extensions;
    protected String comments;
    protected ExtensionsList extensionsList;
    protected ErrorObjects errorObjects;
    @XmlElement(required = true)
    protected SingleIdentifier primaryIdentifier;
    protected SingleIdentifier secondaryIdentifier;
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
     *     {@link SingleIdentifier }
     *     
     */
    public SingleIdentifier getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleIdentifier }
     *     
     */
    public void setPrimaryIdentifier(SingleIdentifier value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the secondaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SingleIdentifier }
     *     
     */
    public SingleIdentifier getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    /**
     * Sets the value of the secondaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleIdentifier }
     *     
     */
    public void setSecondaryIdentifier(SingleIdentifier value) {
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
