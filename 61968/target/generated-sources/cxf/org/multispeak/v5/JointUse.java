
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for jointUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointUse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="organizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jointUseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jointUseHeight" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *         &lt;element name="isGuyed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jointUse", propOrder = {
    "organizationID",
    "jointUseType",
    "jointUseHeight",
    "isGuyed"
})
public class JointUse
    extends MspExtensible
{

    protected String organizationID;
    protected String jointUseType;
    protected Height jointUseHeight;
    protected Boolean isGuyed;

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationID(String value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the jointUseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointUseType() {
        return jointUseType;
    }

    /**
     * Sets the value of the jointUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointUseType(String value) {
        this.jointUseType = value;
    }

    /**
     * Gets the value of the jointUseHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getJointUseHeight() {
        return jointUseHeight;
    }

    /**
     * Sets the value of the jointUseHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setJointUseHeight(Height value) {
        this.jointUseHeight = value;
    }

    /**
     * Gets the value of the isGuyed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGuyed() {
        return isGuyed;
    }

    /**
     * Sets the value of the isGuyed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGuyed(Boolean value) {
        this.isGuyed = value;
    }

}
