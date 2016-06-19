
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageRemarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageRemarks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageRemark" type="{http://www.multispeak.org/V5.0}outageRemark" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageRemarks", propOrder = {
    "outageRemark"
})
public class OutageRemarks {

    @XmlElement(required = true)
    protected List<OutageRemark> outageRemark;

    /**
     * Gets the value of the outageRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageRemark }
     * 
     * 
     */
    public List<OutageRemark> getOutageRemark() {
        if (outageRemark == null) {
            outageRemark = new ArrayList<OutageRemark>();
        }
        return this.outageRemark;
    }

}
