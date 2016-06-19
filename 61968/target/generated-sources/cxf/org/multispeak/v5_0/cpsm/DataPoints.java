
package org.multispeak.v5_0.cpsm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="curveData" type="{http://www.multispeak.org/V5.0/cpsm}CurveData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataPoints", propOrder = {
    "curveData"
})
public class DataPoints {

    protected List<CurveData> curveData;

    /**
     * Gets the value of the curveData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curveData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurveData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurveData }
     * 
     * 
     */
    public List<CurveData> getCurveData() {
        if (curveData == null) {
            curveData = new ArrayList<CurveData>();
        }
        return this.curveData;
    }

}
