
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for resourceMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceMember">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="memberRef" type="{http://www.multispeak.org/V5.0}resourceMemberRef"/>
 *         &lt;element name="LTDeviceRefs" type="{http://www.multispeak.org/V5.0}LTDeviceRefs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceMember", propOrder = {
    "memberRef",
    "ltDeviceRefs"
})
public class ResourceMember
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ResourceMemberRef memberRef;
    @XmlElement(name = "LTDeviceRefs")
    protected LTDeviceRefs ltDeviceRefs;

    /**
     * Gets the value of the memberRef property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceMemberRef }
     *     
     */
    public ResourceMemberRef getMemberRef() {
        return memberRef;
    }

    /**
     * Sets the value of the memberRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceMemberRef }
     *     
     */
    public void setMemberRef(ResourceMemberRef value) {
        this.memberRef = value;
    }

    /**
     * Gets the value of the ltDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link LTDeviceRefs }
     *     
     */
    public LTDeviceRefs getLTDeviceRefs() {
        return ltDeviceRefs;
    }

    /**
     * Sets the value of the ltDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LTDeviceRefs }
     *     
     */
    public void setLTDeviceRefs(LTDeviceRefs value) {
        this.ltDeviceRefs = value;
    }

}
