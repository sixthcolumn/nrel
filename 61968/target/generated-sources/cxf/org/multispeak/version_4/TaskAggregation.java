
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskAggregation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskAggregation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="workTaskID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skillsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString7" minOccurs="0"/>
 *         &lt;element name="equipmentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString8" minOccurs="0"/>
 *         &lt;element name="vehicleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString9" minOccurs="0"/>
 *         &lt;element name="pickList" type="{http://www.multispeak.org/Version_4.1_Release}pickList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskAggregation", propOrder = {
    "workTaskID",
    "skillsList",
    "equipmentList",
    "vehicleList",
    "pickList"
})
public class TaskAggregation
    extends MspObject
{

    protected String workTaskID;
    protected ArrayOfString7 skillsList;
    protected ArrayOfString8 equipmentList;
    protected ArrayOfString9 vehicleList;
    protected PickList pickList;

    /**
     * Gets the value of the workTaskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTaskID() {
        return workTaskID;
    }

    /**
     * Sets the value of the workTaskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTaskID(String value) {
        this.workTaskID = value;
    }

    /**
     * Gets the value of the skillsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString7 }
     *     
     */
    public ArrayOfString7 getSkillsList() {
        return skillsList;
    }

    /**
     * Sets the value of the skillsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString7 }
     *     
     */
    public void setSkillsList(ArrayOfString7 value) {
        this.skillsList = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString8 }
     *     
     */
    public ArrayOfString8 getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString8 }
     *     
     */
    public void setEquipmentList(ArrayOfString8 value) {
        this.equipmentList = value;
    }

    /**
     * Gets the value of the vehicleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getVehicleList() {
        return vehicleList;
    }

    /**
     * Sets the value of the vehicleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setVehicleList(ArrayOfString9 value) {
        this.vehicleList = value;
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

}
