
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secondaryJunctionBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryJunctionBox">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="junctionBoxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "secondaryJunctionBox", propOrder = {
    "junctionBoxType"
})
public class SecondaryJunctionBox
    extends MspPointObject
{

    protected String junctionBoxType;

    /**
     * Gets the value of the junctionBoxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionBoxType() {
        return junctionBoxType;
    }

    /**
     * Sets the value of the junctionBoxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionBoxType(String value) {
        this.junctionBoxType = value;
    }

}
