
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * These are pointers to abilities or skills that resources have.  If the resource is a crew, an abilityRef might reference an instance of an ability object that describes a type of work that the crew can complete (such as "Hot Construction"); if the resource is a crane, the ability object referred to might describe a rating  (such as "10 ton") ;if the resource is a worker, the abilityRef might reference a skill object that describes a skill that the worker has (such as "Journeyman", or "Commercial Driver's License").
 * 
 * <p>Java class for abilityRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abilityRefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abilityRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abilityRefs", propOrder = {
    "abilityRef"
})
public class AbilityRefs {

    @XmlElement(required = true)
    protected List<ObjectRef> abilityRef;

    /**
     * Gets the value of the abilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRef }
     * 
     * 
     */
    public List<ObjectRef> getAbilityRef() {
        if (abilityRef == null) {
            abilityRef = new ArrayList<ObjectRef>();
        }
        return this.abilityRef;
    }

}
