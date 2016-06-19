
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="CTRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT", propOrder = {
    "ctRatio",
    "assetData"
})
public class CT
    extends MspExtensible
{

    @XmlElement(name = "CTRatio")
    protected Double ctRatio;
    protected AssetData assetData;

    /**
     * Gets the value of the ctRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCTRatio() {
        return ctRatio;
    }

    /**
     * Sets the value of the ctRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCTRatio(Double value) {
        this.ctRatio = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
    }

}
