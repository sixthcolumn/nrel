
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for workType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="workTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workSubTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryObjectType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredObjectTypes" type="{http://www.multispeak.org/V5.0}requiredObjectTypes" minOccurs="0"/>
 *         &lt;element name="supportedNotificationList" type="{http://www.multispeak.org/V5.0}supportedNotificationList" minOccurs="0"/>
 *         &lt;element name="possibleWorkStatuses" type="{http://www.multispeak.org/V5.0}possibleWorkStatuses" minOccurs="0"/>
 *         &lt;element name="possibleWorkPriorities" type="{http://www.multispeak.org/V5.0}possibleWorkPriorities" minOccurs="0"/>
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
@XmlType(name = "workType", propOrder = {
    "workTypeName",
    "workSubTypeName",
    "primaryObjectType",
    "profileName",
    "requiredObjectTypes",
    "supportedNotificationList",
    "possibleWorkStatuses",
    "possibleWorkPriorities"
})
public class WorkType
    extends MspObject
{

    @XmlElement(required = true)
    protected String workTypeName;
    protected String workSubTypeName;
    protected QName primaryObjectType;
    protected String profileName;
    protected RequiredObjectTypes requiredObjectTypes;
    protected SupportedNotificationList supportedNotificationList;
    protected PossibleWorkStatuses possibleWorkStatuses;
    protected PossibleWorkPriorities possibleWorkPriorities;

    /**
     * Gets the value of the workTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTypeName() {
        return workTypeName;
    }

    /**
     * Sets the value of the workTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTypeName(String value) {
        this.workTypeName = value;
    }

    /**
     * Gets the value of the workSubTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSubTypeName() {
        return workSubTypeName;
    }

    /**
     * Sets the value of the workSubTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSubTypeName(String value) {
        this.workSubTypeName = value;
    }

    /**
     * Gets the value of the primaryObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPrimaryObjectType() {
        return primaryObjectType;
    }

    /**
     * Sets the value of the primaryObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPrimaryObjectType(QName value) {
        this.primaryObjectType = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the requiredObjectTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredObjectTypes }
     *     
     */
    public RequiredObjectTypes getRequiredObjectTypes() {
        return requiredObjectTypes;
    }

    /**
     * Sets the value of the requiredObjectTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredObjectTypes }
     *     
     */
    public void setRequiredObjectTypes(RequiredObjectTypes value) {
        this.requiredObjectTypes = value;
    }

    /**
     * Gets the value of the supportedNotificationList property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedNotificationList }
     *     
     */
    public SupportedNotificationList getSupportedNotificationList() {
        return supportedNotificationList;
    }

    /**
     * Sets the value of the supportedNotificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedNotificationList }
     *     
     */
    public void setSupportedNotificationList(SupportedNotificationList value) {
        this.supportedNotificationList = value;
    }

    /**
     * Gets the value of the possibleWorkStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleWorkStatuses }
     *     
     */
    public PossibleWorkStatuses getPossibleWorkStatuses() {
        return possibleWorkStatuses;
    }

    /**
     * Sets the value of the possibleWorkStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleWorkStatuses }
     *     
     */
    public void setPossibleWorkStatuses(PossibleWorkStatuses value) {
        this.possibleWorkStatuses = value;
    }

    /**
     * Gets the value of the possibleWorkPriorities property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleWorkPriorities }
     *     
     */
    public PossibleWorkPriorities getPossibleWorkPriorities() {
        return possibleWorkPriorities;
    }

    /**
     * Sets the value of the possibleWorkPriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleWorkPriorities }
     *     
     */
    public void setPossibleWorkPriorities(PossibleWorkPriorities value) {
        this.possibleWorkPriorities = value;
    }

}
