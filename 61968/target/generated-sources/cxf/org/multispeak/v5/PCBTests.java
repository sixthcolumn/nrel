
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCBTests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCBTests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PCBTest" type="{http://www.multispeak.org/V5.0}PCBTest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCBTests", propOrder = {
    "pcbTest"
})
public class PCBTests {

    @XmlElement(name = "PCBTest", required = true)
    protected List<PCBTest> pcbTest;

    /**
     * Gets the value of the pcbTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcbTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCBTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCBTest }
     * 
     * 
     */
    public List<PCBTest> getPCBTest() {
        if (pcbTest == null) {
            pcbTest = new ArrayList<PCBTest>();
        }
        return this.pcbTest;
    }

}
