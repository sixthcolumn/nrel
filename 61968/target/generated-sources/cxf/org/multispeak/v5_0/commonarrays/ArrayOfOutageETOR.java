
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.OutageETOR;


/**
 * <p>Java class for ArrayOfOutageETOR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageETOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageETOR" type="{http://www.multispeak.org/V5.0}outageETOR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageETOR", propOrder = {
    "outageETOR"
})
public class ArrayOfOutageETOR {

    protected List<OutageETOR> outageETOR;

    /**
     * Gets the value of the outageETOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageETOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageETOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageETOR }
     * 
     * 
     */
    public List<OutageETOR> getOutageETOR() {
        if (outageETOR == null) {
            outageETOR = new ArrayList<OutageETOR>();
        }
        return this.outageETOR;
    }

}
