
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workProgressItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workProgressItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="workProgress" type="{http://www.multispeak.org/V5.0}workProgress"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workProgressItem", propOrder = {
    "workItemRef",
    "workProgress"
})
public class WorkProgressItem
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
    protected WorkProgress workProgress;

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
     * Gets the value of the workProgress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkProgress }
     *     
     */
    public WorkProgress getWorkProgress() {
        return workProgress;
    }

    /**
     * Sets the value of the workProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkProgress }
     *     
     */
    public void setWorkProgress(WorkProgress value) {
        this.workProgress = value;
    }

}
