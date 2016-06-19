
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for workItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="primaryReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="referencedObjectList" type="{http://www.multispeak.org/V5.0}objectRefs" minOccurs="0"/>
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
@XmlType(name = "workItem", propOrder = {
    "primaryReference",
    "referencedObjectList"
})
public class WorkItem
    extends MspWork
{

    protected ObjectRef primaryReference;
    protected ObjectRefs referencedObjectList;

    /**
     * Gets the value of the primaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPrimaryReference() {
        return primaryReference;
    }

    /**
     * Sets the value of the primaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPrimaryReference(ObjectRef value) {
        this.primaryReference = value;
    }

    /**
     * Gets the value of the referencedObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefs }
     *     
     */
    public ObjectRefs getReferencedObjectList() {
        return referencedObjectList;
    }

    /**
     * Sets the value of the referencedObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefs }
     *     
     */
    public void setReferencedObjectList(ObjectRefs value) {
        this.referencedObjectList = value;
    }

}
