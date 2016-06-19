
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ConnectivityModelGroup;
import org.multispeak.v5_0.commontypes.GraphicSymbols;


/**
 * <p>Java class for mspConnectivityPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspConnectivityPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="graphicSymbolList" type="{http://www.multispeak.org/V5.0/commonTypes}graphicSymbols" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/V5.0}genericAnnotationFeatures" minOccurs="0"/>
 *         &lt;element name="connectivityModelGroup" type="{http://www.multispeak.org/V5.0/commonTypes}connectivityModelGroup"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspConnectivityPoint", propOrder = {
    "graphicSymbolList",
    "annotationList",
    "connectivityModelGroup"
})
@XmlSeeAlso({
    MspUsagePoint.class,
    MspElectricPoint.class
})
public abstract class MspConnectivityPoint
    extends MspPointObject
{

    protected GraphicSymbols graphicSymbolList;
    protected GenericAnnotationFeatures annotationList;
    @XmlElement(required = true)
    protected ConnectivityModelGroup connectivityModelGroup;

    /**
     * Gets the value of the graphicSymbolList property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbols }
     *     
     */
    public GraphicSymbols getGraphicSymbolList() {
        return graphicSymbolList;
    }

    /**
     * Sets the value of the graphicSymbolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbols }
     *     
     */
    public void setGraphicSymbolList(GraphicSymbols value) {
        this.graphicSymbolList = value;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public GenericAnnotationFeatures getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public void setAnnotationList(GenericAnnotationFeatures value) {
        this.annotationList = value;
    }

    /**
     * Gets the value of the connectivityModelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityModelGroup }
     *     
     */
    public ConnectivityModelGroup getConnectivityModelGroup() {
        return connectivityModelGroup;
    }

    /**
     * Sets the value of the connectivityModelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityModelGroup }
     *     
     */
    public void setConnectivityModelGroup(ConnectivityModelGroup value) {
        this.connectivityModelGroup = value;
    }

}
