
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for waterNameplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterNameplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="installType" type="{http://www.multispeak.org/V5.0/enumerations}installType" minOccurs="0"/>
 *         &lt;element name="fluidType" type="{http://www.multispeak.org/V5.0/enumerations}fluidType" minOccurs="0"/>
 *         &lt;element name="driveType" type="{http://www.multispeak.org/V5.0/enumerations}driveType" minOccurs="0"/>
 *         &lt;element name="pipeSize" type="{http://www.multispeak.org/V5.0/enumerations}pipeSize" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterNameplate", propOrder = {
    "installType",
    "fluidType",
    "driveType",
    "pipeSize"
})
public class WaterNameplate
    extends MspExtensible
{

    protected String installType;
    protected String fluidType;
    protected String driveType;
    protected String pipeSize;

    /**
     * Gets the value of the installType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallType() {
        return installType;
    }

    /**
     * Sets the value of the installType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallType(String value) {
        this.installType = value;
    }

    /**
     * Gets the value of the fluidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluidType() {
        return fluidType;
    }

    /**
     * Sets the value of the fluidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluidType(String value) {
        this.fluidType = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the pipeSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeSize() {
        return pipeSize;
    }

    /**
     * Sets the value of the pipeSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeSize(String value) {
        this.pipeSize = value;
    }

}
