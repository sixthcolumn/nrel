
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspLineObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspLineObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="complexLine" type="{http://www.multispeak.org/Version_3.0}LineStringType" minOccurs="0"/>
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
@XmlType(name = "mspLineObject", propOrder = {
    "complexLine"
})
@XmlSeeAlso({
    GenericLineFeature.class,
    MspConnectivityLine.class
})
public abstract class MspLineObject
    extends MspObject
{

    protected LineStringType complexLine;

    /**
     * Gets the value of the complexLine property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getComplexLine() {
        return complexLine;
    }

    /**
     * Sets the value of the complexLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setComplexLine(LineStringType value) {
        this.complexLine = value;
    }

}
