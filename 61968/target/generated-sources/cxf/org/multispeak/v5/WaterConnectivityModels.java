
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waterConnectivityModels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterConnectivityModels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waterConnectivityModel" type="{http://www.multispeak.org/V5.0}waterConnectivityModel" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterConnectivityModels", propOrder = {
    "waterConnectivityModel"
})
public class WaterConnectivityModels {

    @XmlElement(required = true)
    protected List<WaterConnectivityModel> waterConnectivityModel;

    /**
     * Gets the value of the waterConnectivityModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterConnectivityModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterConnectivityModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterConnectivityModel }
     * 
     * 
     */
    public List<WaterConnectivityModel> getWaterConnectivityModel() {
        if (waterConnectivityModel == null) {
            waterConnectivityModel = new ArrayList<WaterConnectivityModel>();
        }
        return this.waterConnectivityModel;
    }

}
