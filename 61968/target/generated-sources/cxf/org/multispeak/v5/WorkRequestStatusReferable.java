
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.WorkRequestStatus;


/**
 * <p>Java class for workRequestStatusReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workRequestStatusReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workRequestRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="workRequestStatus" type="{http://www.multispeak.org/V5.0/enumerations}workRequestStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workRequestStatusReferable", propOrder = {
    "workRequestRef",
    "workRequestStatus"
})
public class WorkRequestStatusReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef workRequestRef;
    @XmlElement(required = true)
    protected WorkRequestStatus workRequestStatus;

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

}
