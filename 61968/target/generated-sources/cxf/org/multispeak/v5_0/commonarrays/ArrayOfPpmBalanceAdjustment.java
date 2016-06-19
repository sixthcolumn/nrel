
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.PpmBalanceAdjustment;


/**
 * <p>Java class for ArrayOfPpmBalanceAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPpmBalanceAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ppmBalanceAdjustment" type="{http://www.multispeak.org/V5.0}ppmBalanceAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPpmBalanceAdjustment", propOrder = {
    "ppmBalanceAdjustment"
})
public class ArrayOfPpmBalanceAdjustment {

    @XmlElement(nillable = true)
    protected List<PpmBalanceAdjustment> ppmBalanceAdjustment;

    /**
     * Gets the value of the ppmBalanceAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppmBalanceAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpmBalanceAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpmBalanceAdjustment }
     * 
     * 
     */
    public List<PpmBalanceAdjustment> getPpmBalanceAdjustment() {
        if (ppmBalanceAdjustment == null) {
            ppmBalanceAdjustment = new ArrayList<PpmBalanceAdjustment>();
        }
        return this.ppmBalanceAdjustment;
    }

}
