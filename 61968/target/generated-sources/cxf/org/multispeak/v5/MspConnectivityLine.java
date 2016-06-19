
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ConnectivityModelGroup;


/**
 * This is an abstract class from which all objects inherit that have line geometry and that are part of a connectivity model.
 * 
 * <p>Java class for mspConnectivityLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspConnectivityLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspLineObject">
 *       &lt;sequence>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "mspConnectivityLine", propOrder = {
    "gridLocation",
    "annotationList",
    "connectivityModelGroup"
})
@XmlSeeAlso({
    MspElectricLine.class
})
public abstract class MspConnectivityLine
    extends MspLineObject
{

    protected String gridLocation;
    protected GenericAnnotationFeatures annotationList;
    @XmlElement(required = true)
    protected ConnectivityModelGroup connectivityModelGroup;

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
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
