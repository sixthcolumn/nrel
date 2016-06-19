
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primaryCabinet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primaryCabinet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="structType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabinetContentsList" type="{http://www.multispeak.org/Version_3.0}cabinetContentsList" minOccurs="0"/>
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
@XmlType(name = "primaryCabinet", propOrder = {
    "structType",
    "cabinetContentsList"
})
public class PrimaryCabinet
    extends MspPointObject
{

    protected String structType;
    protected CabinetContentsList cabinetContentsList;

    /**
     * Gets the value of the structType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructType() {
        return structType;
    }

    /**
     * Sets the value of the structType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructType(String value) {
        this.structType = value;
    }

    /**
     * Gets the value of the cabinetContentsList property.
     * 
     * @return
     *     possible object is
     *     {@link CabinetContentsList }
     *     
     */
    public CabinetContentsList getCabinetContentsList() {
        return cabinetContentsList;
    }

    /**
     * Sets the value of the cabinetContentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinetContentsList }
     *     
     */
    public void setCabinetContentsList(CabinetContentsList value) {
        this.cabinetContentsList = value;
    }

}
