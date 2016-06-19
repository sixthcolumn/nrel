
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for stationAssemblyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stationAssemblyDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CPRAdjustmentList" type="{http://www.multispeak.org/V5.0}CPRAdjustmentList" minOccurs="0"/>
 *         &lt;element name="pickList" type="{http://www.multispeak.org/V5.0}pickList" minOccurs="0"/>
 *         &lt;element name="laborItemList" type="{http://www.multispeak.org/V5.0}laborItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stationAssemblyDetails", propOrder = {
    "cprAdjustmentList",
    "pickList",
    "laborItemList"
})
public class StationAssemblyDetails
    extends MspExtensible
{

    @XmlElement(name = "CPRAdjustmentList")
    protected CPRAdjustmentList cprAdjustmentList;
    protected PickList pickList;
    protected LaborItemList laborItemList;

    /**
     * Gets the value of the cprAdjustmentList property.
     * 
     * @return
     *     possible object is
     *     {@link CPRAdjustmentList }
     *     
     */
    public CPRAdjustmentList getCPRAdjustmentList() {
        return cprAdjustmentList;
    }

    /**
     * Sets the value of the cprAdjustmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPRAdjustmentList }
     *     
     */
    public void setCPRAdjustmentList(CPRAdjustmentList value) {
        this.cprAdjustmentList = value;
    }

    /**
     * Gets the value of the pickList property.
     * 
     * @return
     *     possible object is
     *     {@link PickList }
     *     
     */
    public PickList getPickList() {
        return pickList;
    }

    /**
     * Sets the value of the pickList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickList }
     *     
     */
    public void setPickList(PickList value) {
        this.pickList = value;
    }

    /**
     * Gets the value of the laborItemList property.
     * 
     * @return
     *     possible object is
     *     {@link LaborItemList }
     *     
     */
    public LaborItemList getLaborItemList() {
        return laborItemList;
    }

    /**
     * Sets the value of the laborItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborItemList }
     *     
     */
    public void setLaborItemList(LaborItemList value) {
        this.laborItemList = value;
    }

}
