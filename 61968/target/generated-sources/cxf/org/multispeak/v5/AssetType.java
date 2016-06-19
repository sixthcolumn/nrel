
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * This is the classification of an asset as viewed by the system that implements an AM_Server endpoint and that owns the definition of such asset types.
 * 
 * <p>Java class for assetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="assetSubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MSName" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetType", propOrder = {
    "value"
})
public class AssetType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "assetSubType")
    protected String assetSubType;
    @XmlAttribute(name = "MSName")
    protected QName msName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the assetSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSubType() {
        return assetSubType;
    }

    /**
     * Sets the value of the assetSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSubType(String value) {
        this.assetSubType = value;
    }

    /**
     * Gets the value of the msName property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMSName() {
        return msName;
    }

    /**
     * Sets the value of the msName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMSName(QName value) {
        this.msName = value;
    }

}
