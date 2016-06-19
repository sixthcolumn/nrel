
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZsmImpedanceEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZsmImpedanceEntries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZsmImpedanceEntry" type="{http://www.multispeak.org/V5.0}ZsmImpedanceEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZsmImpedanceEntries", propOrder = {
    "zsmImpedanceEntry"
})
public class ZsmImpedanceEntries {

    @XmlElement(name = "ZsmImpedanceEntry", required = true)
    protected List<ZsmImpedanceEntry> zsmImpedanceEntry;

    /**
     * Gets the value of the zsmImpedanceEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zsmImpedanceEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZsmImpedanceEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZsmImpedanceEntry }
     * 
     * 
     */
    public List<ZsmImpedanceEntry> getZsmImpedanceEntry() {
        if (zsmImpedanceEntry == null) {
            zsmImpedanceEntry = new ArrayList<ZsmImpedanceEntry>();
        }
        return this.zsmImpedanceEntry;
    }

}
