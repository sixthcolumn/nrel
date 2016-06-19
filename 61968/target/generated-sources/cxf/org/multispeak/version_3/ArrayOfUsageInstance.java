
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUsageInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUsageInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageInstance" type="{http://www.multispeak.org/Version_3.0}usageInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUsageInstance", propOrder = {
    "usageInstance"
})
public class ArrayOfUsageInstance {

    protected List<UsageInstance> usageInstance;

    /**
     * Gets the value of the usageInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageInstance }
     * 
     * 
     */
    public List<UsageInstance> getUsageInstance() {
        if (usageInstance == null) {
            usageInstance = new ArrayList<UsageInstance>();
        }
        return this.usageInstance;
    }

}
