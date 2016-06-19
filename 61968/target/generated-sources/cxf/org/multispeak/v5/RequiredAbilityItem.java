
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.UnitAction;


/**
 * This is an ability that a resource needs to have in order to be qualified to perform the work implied by this materialManagementAssembly.
 * 
 * <p>Java class for requiredAbilityItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requiredAbilityItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="abilityID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="applicationActions" type="{http://www.multispeak.org/V5.0/enumerations}unitAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requiredAbilityItem", propOrder = {
    "abilityID",
    "applicationActions"
})
public class RequiredAbilityItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID abilityID;
    @XmlElement(required = true)
    protected UnitAction applicationActions;

    /**
     * Gets the value of the abilityID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAbilityID() {
        return abilityID;
    }

    /**
     * Sets the value of the abilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAbilityID(ObjectID value) {
        this.abilityID = value;
    }

    /**
     * Gets the value of the applicationActions property.
     * 
     * @return
     *     possible object is
     *     {@link UnitAction }
     *     
     */
    public UnitAction getApplicationActions() {
        return applicationActions;
    }

    /**
     * Sets the value of the applicationActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitAction }
     *     
     */
    public void setApplicationActions(UnitAction value) {
        this.applicationActions = value;
    }

}
