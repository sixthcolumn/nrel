
package org.multispeak.v5_0.cpsm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrregularTimePoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrregularTimePoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="irregularTimePoint" type="{http://www.multispeak.org/V5.0/cpsm}IrregularTimePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularTimePoints", propOrder = {
    "irregularTimePoint"
})
public class IrregularTimePoints {

    protected List<IrregularTimePoint> irregularTimePoint;

    /**
     * Gets the value of the irregularTimePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irregularTimePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrregularTimePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrregularTimePoint }
     * 
     * 
     */
    public List<IrregularTimePoint> getIrregularTimePoint() {
        if (irregularTimePoint == null) {
            irregularTimePoint = new ArrayList<IrregularTimePoint>();
        }
        return this.irregularTimePoint;
    }

}
