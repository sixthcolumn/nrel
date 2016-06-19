
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workOrderUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrderUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workReference" type="{http://www.multispeak.org/V5.0}workReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workOrderUpdate", propOrder = {
    "workReference"
})
public class WorkOrderUpdate
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkReference workReference;

    /**
     * Gets the value of the workReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkReference }
     *     
     */
    public WorkReference getWorkReference() {
        return workReference;
    }

    /**
     * Sets the value of the workReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkReference }
     *     
     */
    public void setWorkReference(WorkReference value) {
        this.workReference = value;
    }

}
