
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _1_release.gml_v4.LineStringType;


/**
 * <p>Java class for mspLineObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspLineObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMLLine" type="{gml_V4.1_Release}LineStringType" minOccurs="0"/>
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
    "gmlLine"
})
@XmlSeeAlso({
    SpanGuy.class,
    GenericLineFeature.class,
    MspConnectivityLine.class
})
public abstract class MspLineObject
    extends MspObject
{

    @XmlElement(name = "GMLLine")
    protected LineStringType gmlLine;

    /**
     * Gets the value of the gmlLine property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getGMLLine() {
        return gmlLine;
    }

    /**
     * Sets the value of the gmlLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setGMLLine(LineStringType value) {
        this.gmlLine = value;
    }

}
