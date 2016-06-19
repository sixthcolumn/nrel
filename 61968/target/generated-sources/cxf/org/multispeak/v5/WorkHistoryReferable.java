
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workHistoryReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workHistoryReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="workHistory" type="{http://www.multispeak.org/V5.0}workHistory"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workHistoryReferable", propOrder = {
    "workItemRef",
    "workHistory"
})
public class WorkHistoryReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
    protected WorkHistory workHistory;

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
     * Gets the value of the workHistory property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHistory }
     *     
     */
    public WorkHistory getWorkHistory() {
        return workHistory;
    }

    /**
     * Sets the value of the workHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHistory }
     *     
     */
    public void setWorkHistory(WorkHistory value) {
        this.workHistory = value;
    }

}
