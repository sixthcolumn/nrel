
package org.multispeak.version_3;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for mspObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verb" type="{http://www.multispeak.org/Version_3.0}action" default="Change" />
 *       &lt;attribute name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="replaceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
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
    "extensionsList"
})
@XmlSeeAlso({
    OutageEventStatus.class,
    OutageLocation.class,
    Equipment.class,
    Customer.class,
    ConnectDisconnectEvent.class,
    Timesheet.class,
    Truck.class,
    Capacitor.class,
    OutageEvent.class,
    PowerMonitor.class,
    ScadaStatus.class,
    ProfileObject.class,
    ScadaAnalog.class,
    CircuitElement.class,
    Measurement.class,
    PowerFactorManagementEvent.class,
    GpsLocation.class,
    MspSwitchingDevice.class,
    Employee.class,
    ScadaPoints.class,
    MspResultsBase.class,
    WorkOrderSelection.class,
    OutageDetectionEvent.class,
    Message.class,
    ReadingObject.class,
    Usage.class,
    BackgroundGraphics.class,
    FeederObject.class,
    LaborCategory.class,
    BillingAccountLoad.class,
    MeterRead.class,
    Regulator.class,
    MspDevice.class,
    WorkOrder.class,
    CrewActionEvent.class,
    Crew.class,
    CallBackList.class,
    EmployeeTimeRecord.class,
    MeterConnectivity.class,
    WorkTicket.class,
    CustomersAttachedToDevice.class,
    CustomerCall.class,
    CustomersAffectedByOutage.class,
    LoadManagementEvent.class,
    MaterialManagementAssembly.class,
    Transformer.class,
    ConnectDisconnectList.class,
    HistoryLog.class,
    MspLineObject.class,
    MaterialItem.class,
    MspPointObject.class
})
public abstract class MspObject {

    protected Extensions extensions;
    protected String comments;
    protected ExtensionsList extensionsList;
    @XmlAttribute(name = "objectID")
    protected String objectID;
    @XmlAttribute(name = "verb")
    protected Action verb;
    @XmlAttribute(name = "errorString")
    protected String errorString;
    @XmlAttribute(name = "replaceID")
    protected String replaceID;
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
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getVerb() {
        if (verb == null) {
            return Action.CHANGE;
        } else {
            return verb;
        }
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setVerb(Action value) {
        this.verb = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the replaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceID() {
        return replaceID;
    }

    /**
     * Sets the value of the replaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceID(String value) {
        this.replaceID = value;
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
