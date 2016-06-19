
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This object is used to change the objectGUID for an existing instance of data.  The existing (as-is) identifier information is contained in the oldObjectRef element and the proposed (to-be) identifier information is contained in the newObjectRef element.
 * 
 * <p>Java class for objectRefChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectRefChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="oldObjectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="newObjectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectRefChange", propOrder = {
    "oldObjectRef",
    "newObjectRef"
})
public class ObjectRefChange
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef oldObjectRef;
    @XmlElement(required = true)
    protected ObjectRef newObjectRef;

    /**
     * Gets the value of the oldObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOldObjectRef() {
        return oldObjectRef;
    }

    /**
     * Sets the value of the oldObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOldObjectRef(ObjectRef value) {
        this.oldObjectRef = value;
    }

    /**
     * Gets the value of the newObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getNewObjectRef() {
        return newObjectRef;
    }

    /**
     * Sets the value of the newObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setNewObjectRef(ObjectRef value) {
        this.newObjectRef = value;
    }

}
