
package org.multispeak.v5_0.commonarrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.AssetsReferable;


/**
 * <p>Java class for ArrayOfAssetsReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssetsReferable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetsReferable" type="{http://www.multispeak.org/V5.0}assetsReferable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetsReferable", propOrder = {
    "assetsReferable"
})
public class ArrayOfAssetsReferable {

    @XmlElement(required = true)
    protected AssetsReferable assetsReferable;

    /**
     * Gets the value of the assetsReferable property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsReferable }
     *     
     */
    public AssetsReferable getAssetsReferable() {
        return assetsReferable;
    }

    /**
     * Sets the value of the assetsReferable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsReferable }
     *     
     */
    public void setAssetsReferable(AssetsReferable value) {
        this.assetsReferable = value;
    }

}
