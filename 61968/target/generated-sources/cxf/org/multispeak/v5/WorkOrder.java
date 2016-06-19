
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.ActionCode;


/**
 * This is an order for work that includes capital construction.
 * 
 * <p>Java class for workOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.multispeak.org/V5.0/enumerations}actionCode" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="systemVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="engineerAssigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designs" type="{http://www.multispeak.org/V5.0}designs" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.multispeak.org/V5.0}customer" minOccurs="0"/>
 *         &lt;element name="workOrderAccountingFields" type="{http://www.multispeak.org/V5.0}workOrderAccountingFields" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
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
@XmlType(name = "workOrder", propOrder = {
    "actionCode",
    "duration",
    "systemVoltage",
    "engineerAssigned",
    "designs",
    "customer",
    "workOrderAccountingFields",
    "organizationAssociations"
})
public class WorkOrder
    extends MspWork
{

    protected ActionCode actionCode;
    protected Duration duration;
    protected Voltage systemVoltage;
    protected String engineerAssigned;
    protected Designs designs;
    protected Customer customer;
    protected WorkOrderAccountingFields workOrderAccountingFields;
    protected OrganizationAssociations organizationAssociations;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the systemVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getSystemVoltage() {
        return systemVoltage;
    }

    /**
     * Sets the value of the systemVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setSystemVoltage(Voltage value) {
        this.systemVoltage = value;
    }

    /**
     * Gets the value of the engineerAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineerAssigned() {
        return engineerAssigned;
    }

    /**
     * Sets the value of the engineerAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineerAssigned(String value) {
        this.engineerAssigned = value;
    }

    /**
     * Gets the value of the designs property.
     * 
     * @return
     *     possible object is
     *     {@link Designs }
     *     
     */
    public Designs getDesigns() {
        return designs;
    }

    /**
     * Sets the value of the designs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designs }
     *     
     */
    public void setDesigns(Designs value) {
        this.designs = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the workOrderAccountingFields property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderAccountingFields }
     *     
     */
    public WorkOrderAccountingFields getWorkOrderAccountingFields() {
        return workOrderAccountingFields;
    }

    /**
     * Sets the value of the workOrderAccountingFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderAccountingFields }
     *     
     */
    public void setWorkOrderAccountingFields(WorkOrderAccountingFields value) {
        this.workOrderAccountingFields = value;
    }

    /**
     * Gets the value of the organizationAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssociations }
     *     
     */
    public OrganizationAssociations getOrganizationAssociations() {
        return organizationAssociations;
    }

    /**
     * Sets the value of the organizationAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssociations }
     *     
     */
    public void setOrganizationAssociations(OrganizationAssociations value) {
        this.organizationAssociations = value;
    }

}
