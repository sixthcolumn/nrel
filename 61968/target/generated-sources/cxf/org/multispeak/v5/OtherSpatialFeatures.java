
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GraphicSymbols;


/**
 * A collection to exchange spatial features that are not otherwise defined in MultiSpeak.
 * 
 * <p>Java class for otherSpatialFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherSpatialFeatures">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="graphicSymbols" type="{http://www.multispeak.org/V5.0/commonTypes}graphicSymbols" minOccurs="0"/>
 *         &lt;element name="genericPointFeatures" type="{http://www.multispeak.org/V5.0}genericPointFeatures" minOccurs="0"/>
 *         &lt;element name="genericAnnotationFeatures" type="{http://www.multispeak.org/V5.0}genericAnnotationFeatures" minOccurs="0"/>
 *         &lt;element name="genericPolygonFeatures" type="{http://www.multispeak.org/V5.0}genericPolygonFeatures" minOccurs="0"/>
 *         &lt;element name="genericLineFeatures" type="{http://www.multispeak.org/V5.0}genericLineFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherSpatialFeatures", propOrder = {
    "graphicSymbols",
    "genericPointFeatures",
    "genericAnnotationFeatures",
    "genericPolygonFeatures",
    "genericLineFeatures"
})
public class OtherSpatialFeatures
    extends MspReferable
{

    protected GraphicSymbols graphicSymbols;
    protected GenericPointFeatures genericPointFeatures;
    protected GenericAnnotationFeatures genericAnnotationFeatures;
    protected GenericPolygonFeatures genericPolygonFeatures;
    protected GenericLineFeatures genericLineFeatures;

    /**
     * Gets the value of the graphicSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbols }
     *     
     */
    public GraphicSymbols getGraphicSymbols() {
        return graphicSymbols;
    }

    /**
     * Sets the value of the graphicSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbols }
     *     
     */
    public void setGraphicSymbols(GraphicSymbols value) {
        this.graphicSymbols = value;
    }

    /**
     * Gets the value of the genericPointFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPointFeatures }
     *     
     */
    public GenericPointFeatures getGenericPointFeatures() {
        return genericPointFeatures;
    }

    /**
     * Sets the value of the genericPointFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPointFeatures }
     *     
     */
    public void setGenericPointFeatures(GenericPointFeatures value) {
        this.genericPointFeatures = value;
    }

    /**
     * Gets the value of the genericAnnotationFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public GenericAnnotationFeatures getGenericAnnotationFeatures() {
        return genericAnnotationFeatures;
    }

    /**
     * Sets the value of the genericAnnotationFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public void setGenericAnnotationFeatures(GenericAnnotationFeatures value) {
        this.genericAnnotationFeatures = value;
    }

    /**
     * Gets the value of the genericPolygonFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPolygonFeatures }
     *     
     */
    public GenericPolygonFeatures getGenericPolygonFeatures() {
        return genericPolygonFeatures;
    }

    /**
     * Sets the value of the genericPolygonFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPolygonFeatures }
     *     
     */
    public void setGenericPolygonFeatures(GenericPolygonFeatures value) {
        this.genericPolygonFeatures = value;
    }

    /**
     * Gets the value of the genericLineFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link GenericLineFeatures }
     *     
     */
    public GenericLineFeatures getGenericLineFeatures() {
        return genericLineFeatures;
    }

    /**
     * Sets the value of the genericLineFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericLineFeatures }
     *     
     */
    public void setGenericLineFeatures(GenericLineFeatures value) {
        this.genericLineFeatures = value;
    }

}
