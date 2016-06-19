
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inHomeDisplayGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inHomeDisplayGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inHomeDisplayList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString4" minOccurs="0"/>
 *         &lt;element name="inHomeDisplays" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplay" minOccurs="0"/>
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
@XmlType(name = "inHomeDisplayGroup", propOrder = {
    "groupName",
    "inHomeDisplayList",
    "inHomeDisplays"
})
public class InHomeDisplayGroup
    extends MspObject
{

    protected String groupName;
    protected ArrayOfString4 inHomeDisplayList;
    protected ArrayOfInHomeDisplay inHomeDisplays;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the inHomeDisplayList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString4 }
     *     
     */
    public ArrayOfString4 getInHomeDisplayList() {
        return inHomeDisplayList;
    }

    /**
     * Sets the value of the inHomeDisplayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString4 }
     *     
     */
    public void setInHomeDisplayList(ArrayOfString4 value) {
        this.inHomeDisplayList = value;
    }

    /**
     * Gets the value of the inHomeDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplay }
     *     
     */
    public ArrayOfInHomeDisplay getInHomeDisplays() {
        return inHomeDisplays;
    }

    /**
     * Sets the value of the inHomeDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplay }
     *     
     */
    public void setInHomeDisplays(ArrayOfInHomeDisplay value) {
        this.inHomeDisplays = value;
    }

}
