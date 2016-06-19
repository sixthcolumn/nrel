
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for resourceMemberRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceMemberRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="equipmentItemID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="resourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="workerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceMemberRef", propOrder = {
    "equipmentItemID",
    "resourceID",
    "workerID"
})
public class ResourceMemberRef {

    protected ObjectID equipmentItemID;
    protected ObjectID resourceID;
    protected ObjectID workerID;

    /**
     * Gets the value of the equipmentItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEquipmentItemID() {
        return equipmentItemID;
    }

    /**
     * Sets the value of the equipmentItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEquipmentItemID(ObjectID value) {
        this.equipmentItemID = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setResourceID(ObjectID value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the workerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getWorkerID() {
        return workerID;
    }

    /**
     * Sets the value of the workerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setWorkerID(ObjectID value) {
        this.workerID = value;
    }

}
