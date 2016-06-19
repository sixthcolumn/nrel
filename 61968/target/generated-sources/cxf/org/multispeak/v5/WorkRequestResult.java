
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.WorkRequestStatus;


/**
 * <p>Java class for workRequestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workRequestResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workRequestRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="workRequestStatus" type="{http://www.multispeak.org/V5.0/enumerations}workRequestStatus"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="workItemRefs" type="{http://www.multispeak.org/V5.0}workItemRefs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workRequestResult", propOrder = {
    "workRequestRef",
    "workRequestStatus",
    "timeStamp",
    "workItemRefs"
})
public class WorkRequestResult
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef workRequestRef;
    @XmlElement(required = true)
    protected WorkRequestStatus workRequestStatus;
    protected XMLGregorianCalendar timeStamp;
    protected WorkItemRefs workItemRefs;

    /**
     * Gets the value of the workRequestRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getWorkRequestRef() {
        return workRequestRef;
    }

    /**
     * Sets the value of the workRequestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setWorkRequestRef(ObjectRef value) {
        this.workRequestRef = value;
    }

    /**
     * Gets the value of the workRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRequestStatus }
     *     
     */
    public WorkRequestStatus getWorkRequestStatus() {
        return workRequestStatus;
    }

    /**
     * Sets the value of the workRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRequestStatus }
     *     
     */
    public void setWorkRequestStatus(WorkRequestStatus value) {
        this.workRequestStatus = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the workItemRefs property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRefs }
     *     
     */
    public WorkItemRefs getWorkItemRefs() {
        return workItemRefs;
    }

    /**
     * Sets the value of the workItemRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRefs }
     *     
     */
    public void setWorkItemRefs(WorkItemRefs value) {
        this.workItemRefs = value;
    }

}
