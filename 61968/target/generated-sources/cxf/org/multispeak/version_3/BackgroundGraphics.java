
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for backgroundGraphics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="backgroundGraphics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="genericAnnotationFeatureList" type="{http://www.multispeak.org/Version_3.0}ArrayOfGenericAnnotationFeature" minOccurs="0"/>
 *         &lt;element name="genericPointFeatureList" type="{http://www.multispeak.org/Version_3.0}ArrayOfGenericPointFeature" minOccurs="0"/>
 *         &lt;element name="genericLineFeatureList" type="{http://www.multispeak.org/Version_3.0}ArrayOfGenericLineFeature" minOccurs="0"/>
 *         &lt;element name="graphicSymbolList" type="{http://www.multispeak.org/Version_3.0}ArrayOfGraphicSymbol" minOccurs="0"/>
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
@XmlType(name = "backgroundGraphics", propOrder = {
    "genericAnnotationFeatureList",
    "genericPointFeatureList",
    "genericLineFeatureList",
    "graphicSymbolList"
})
public class BackgroundGraphics
    extends MspObject
{

    protected ArrayOfGenericAnnotationFeature genericAnnotationFeatureList;
    protected ArrayOfGenericPointFeature genericPointFeatureList;
    protected ArrayOfGenericLineFeature genericLineFeatureList;
    protected ArrayOfGraphicSymbol graphicSymbolList;

    /**
     * Gets the value of the genericAnnotationFeatureList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public ArrayOfGenericAnnotationFeature getGenericAnnotationFeatureList() {
        return genericAnnotationFeatureList;
    }

    /**
     * Sets the value of the genericAnnotationFeatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public void setGenericAnnotationFeatureList(ArrayOfGenericAnnotationFeature value) {
        this.genericAnnotationFeatureList = value;
    }

    /**
     * Gets the value of the genericPointFeatureList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericPointFeature }
     *     
     */
    public ArrayOfGenericPointFeature getGenericPointFeatureList() {
        return genericPointFeatureList;
    }

    /**
     * Sets the value of the genericPointFeatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericPointFeature }
     *     
     */
    public void setGenericPointFeatureList(ArrayOfGenericPointFeature value) {
        this.genericPointFeatureList = value;
    }

    /**
     * Gets the value of the genericLineFeatureList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericLineFeature }
     *     
     */
    public ArrayOfGenericLineFeature getGenericLineFeatureList() {
        return genericLineFeatureList;
    }

    /**
     * Sets the value of the genericLineFeatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericLineFeature }
     *     
     */
    public void setGenericLineFeatureList(ArrayOfGenericLineFeature value) {
        this.genericLineFeatureList = value;
    }

    /**
     * Gets the value of the graphicSymbolList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public ArrayOfGraphicSymbol getGraphicSymbolList() {
        return graphicSymbolList;
    }

    /**
     * Sets the value of the graphicSymbolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGraphicSymbol }
     *     
     */
    public void setGraphicSymbolList(ArrayOfGraphicSymbol value) {
        this.graphicSymbolList = value;
    }

}
