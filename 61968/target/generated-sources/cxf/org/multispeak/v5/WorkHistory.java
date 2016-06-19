
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for workHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="workProgresses" type="{http://www.multispeak.org/V5.0}workProgresses" minOccurs="0"/>
 *         &lt;element name="workHistoryEvents" type="{http://www.multispeak.org/V5.0}workHistoryEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workHistory", propOrder = {
    "workProgresses",
    "workHistoryEvents"
})
public class WorkHistory
    extends MspExtensible
{

    protected WorkProgresses workProgresses;
    protected WorkHistoryEvents workHistoryEvents;

    /**
     * Gets the value of the workProgresses property.
     * 
     * @return
     *     possible object is
     *     {@link WorkProgresses }
     *     
     */
    public WorkProgresses getWorkProgresses() {
        return workProgresses;
    }

    /**
     * Sets the value of the workProgresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkProgresses }
     *     
     */
    public void setWorkProgresses(WorkProgresses value) {
        this.workProgresses = value;
    }

    /**
     * Gets the value of the workHistoryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHistoryEvents }
     *     
     */
    public WorkHistoryEvents getWorkHistoryEvents() {
        return workHistoryEvents;
    }

    /**
     * Sets the value of the workHistoryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHistoryEvents }
     *     
     */
    public void setWorkHistoryEvents(WorkHistoryEvents value) {
        this.workHistoryEvents = value;
    }

}
