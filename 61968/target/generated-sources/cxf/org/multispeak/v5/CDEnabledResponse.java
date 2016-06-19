
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDEnabledResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDEnabledResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDEnabledItem" type="{http://www.multispeak.org/V5.0}CDEnabledItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDEnabledResponse", propOrder = {
    "cdEnabledItem"
})
public class CDEnabledResponse {

    @XmlElement(name = "CDEnabledItem", required = true)
    protected List<CDEnabledItem> cdEnabledItem;

    /**
     * Gets the value of the cdEnabledItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdEnabledItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDEnabledItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDEnabledItem }
     * 
     * 
     */
    public List<CDEnabledItem> getCDEnabledItem() {
        if (cdEnabledItem == null) {
            cdEnabledItem = new ArrayList<CDEnabledItem>();
        }
        return this.cdEnabledItem;
    }

}
