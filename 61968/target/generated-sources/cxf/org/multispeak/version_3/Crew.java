
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crew">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="foreman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isForeign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="truckList" type="{http://www.multispeak.org/Version_3.0}ArrayOfTruck" minOccurs="0"/>
 *         &lt;element name="employeeList" type="{http://www.multispeak.org/Version_3.0}ArrayOfEmployee" minOccurs="0"/>
 *         &lt;element name="equipmentList" type="{http://www.multispeak.org/Version_3.0}ArrayOfEquipment" minOccurs="0"/>
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
@XmlType(name = "crew", propOrder = {
    "foreman",
    "contactInfo",
    "isForeign",
    "baseLocation",
    "crewType",
    "truckList",
    "employeeList",
    "equipmentList"
})
public class Crew
    extends MspObject
{

    protected String foreman;
    protected String contactInfo;
    protected Boolean isForeign;
    protected String baseLocation;
    protected String crewType;
    protected ArrayOfTruck truckList;
    protected ArrayOfEmployee employeeList;
    protected ArrayOfEquipment equipmentList;

    /**
     * Gets the value of the foreman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeman() {
        return foreman;
    }

    /**
     * Sets the value of the foreman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeman(String value) {
        this.foreman = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the isForeign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForeign() {
        return isForeign;
    }

    /**
     * Sets the value of the isForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForeign(Boolean value) {
        this.isForeign = value;
    }

    /**
     * Gets the value of the baseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLocation() {
        return baseLocation;
    }

    /**
     * Sets the value of the baseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLocation(String value) {
        this.baseLocation = value;
    }

    /**
     * Gets the value of the crewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewType() {
        return crewType;
    }

    /**
     * Sets the value of the crewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewType(String value) {
        this.crewType = value;
    }

    /**
     * Gets the value of the truckList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTruck }
     *     
     */
    public ArrayOfTruck getTruckList() {
        return truckList;
    }

    /**
     * Sets the value of the truckList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTruck }
     *     
     */
    public void setTruckList(ArrayOfTruck value) {
        this.truckList = value;
    }

    /**
     * Gets the value of the employeeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployee }
     *     
     */
    public ArrayOfEmployee getEmployeeList() {
        return employeeList;
    }

    /**
     * Sets the value of the employeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployee }
     *     
     */
    public void setEmployeeList(ArrayOfEmployee value) {
        this.employeeList = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public ArrayOfEquipment getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public void setEquipmentList(ArrayOfEquipment value) {
        this.equipmentList = value;
    }

}
