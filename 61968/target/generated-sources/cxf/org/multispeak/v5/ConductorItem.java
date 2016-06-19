
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for conductorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductorItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horizontalOffset" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="verticalOffset" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *         &lt;element name="bundleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="bundleSeparation" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductorItem", propOrder = {
    "positionNumber",
    "horizontalOffset",
    "verticalOffset",
    "bundleCount",
    "bundleSeparation"
})
public class ConductorItem
    extends MspExtensible
{

    protected String positionNumber;
    protected Length horizontalOffset;
    protected Height verticalOffset;
    protected BigInteger bundleCount;
    protected Length bundleSeparation;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the horizontalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getHorizontalOffset() {
        return horizontalOffset;
    }

    /**
     * Sets the value of the horizontalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setHorizontalOffset(Length value) {
        this.horizontalOffset = value;
    }

    /**
     * Gets the value of the verticalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getVerticalOffset() {
        return verticalOffset;
    }

    /**
     * Sets the value of the verticalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setVerticalOffset(Height value) {
        this.verticalOffset = value;
    }

    /**
     * Gets the value of the bundleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBundleCount() {
        return bundleCount;
    }

    /**
     * Sets the value of the bundleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBundleCount(BigInteger value) {
        this.bundleCount = value;
    }

    /**
     * Gets the value of the bundleSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getBundleSeparation() {
        return bundleSeparation;
    }

    /**
     * Sets the value of the bundleSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setBundleSeparation(Length value) {
        this.bundleSeparation = value;
    }

}
