
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workItemSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workItemSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="workTypeRef" type="{http://www.multispeak.org/V5.0}workTypeRef"/>
 *         &lt;element name="workStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workItemSummary", propOrder = {
    "workItemRef",
    "workTypeRef",
    "workStatusCode"
})
public class WorkItemSummary
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
    protected WorkTypeRef workTypeRef;
    @XmlElement(required = true)
    protected String workStatusCode;

    /**
     * Gets the value of the workItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRef }
     *     
     */
    public WorkItemRef getWorkItemRef() {
        return workItemRef;
    }

    /**
     * Sets the value of the workItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRef }
     *     
     */
    public void setWorkItemRef(WorkItemRef value) {
        this.workItemRef = value;
    }

    /**
     * Gets the value of the workTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTypeRef }
     *     
     */
    public WorkTypeRef getWorkTypeRef() {
        return workTypeRef;
    }

    /**
     * Sets the value of the workTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTypeRef }
     *     
     */
    public void setWorkTypeRef(WorkTypeRef value) {
        this.workTypeRef = value;
    }

    /**
     * Gets the value of the workStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatusCode() {
        return workStatusCode;
    }

    /**
     * Sets the value of the workStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatusCode(String value) {
        this.workStatusCode = value;
    }

}
