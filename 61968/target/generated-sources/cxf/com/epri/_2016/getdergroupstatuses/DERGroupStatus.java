
package com.epri._2016.getdergroupstatuses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERGroupStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.epri.com/2016/GetDERGroupStatuses#}mRID" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Names" type="{http://www.epri.com/2016/GetDERGroupStatuses#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.epri.com/2016/GetDERGroupStatuses#}extensionsList" minOccurs="0"/>
 *         &lt;element name="EndDeviceGroup" type="{http://www.epri.com/2016/GetDERGroupStatuses#}EndDeviceGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupStatus", propOrder = {
    "mrid",
    "name",
    "names",
    "extensionsList",
    "endDeviceGroup"
})
public class DERGroupStatus {

    @XmlElement(name = "mRID")
    protected String mrid;
    protected String name;
    @XmlElement(name = "Names")
    protected List<Name> names;
    protected ExtensionsList extensionsList;
    @XmlElement(name = "EndDeviceGroup", required = true)
    protected EndDeviceGroup endDeviceGroup;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the endDeviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceGroup }
     *     
     */
    public EndDeviceGroup getEndDeviceGroup() {
        return endDeviceGroup;
    }

    /**
     * Sets the value of the endDeviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceGroup }
     *     
     */
    public void setEndDeviceGroup(EndDeviceGroup value) {
        this.endDeviceGroup = value;
    }

}
