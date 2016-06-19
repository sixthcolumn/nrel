
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.RelationType;


/**
 * <p>Java class for workItemRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workItemRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="relatedObject" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="relationType" type="{http://www.multispeak.org/V5.0/enumerations}relationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workItemRelationship", propOrder = {
    "relatedObject",
    "relationType"
})
public class WorkItemRelationship
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectRef relatedObject;
    protected RelationType relationType;

    /**
     * Gets the value of the relatedObject property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getRelatedObject() {
        return relatedObject;
    }

    /**
     * Sets the value of the relatedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setRelatedObject(ObjectRef value) {
        this.relatedObject = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationType }
     *     
     */
    public RelationType getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationType }
     *     
     */
    public void setRelationType(RelationType value) {
        this.relationType = value;
    }

}
