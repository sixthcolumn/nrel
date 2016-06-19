
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspConnectivityPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspConnectivityPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="graphicSymbol" type="{http://www.multispeak.org/Version_3.0}graphicSymbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/Version_3.0}genericAnnotationFeature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="toNodeID" type="{http://www.multispeak.org/Version_3.0}nodeIdentifier" minOccurs="0"/>
 *           &lt;element name="parentSectionID" type="{http://www.multispeak.org/Version_3.0}objectRef" minOccurs="0"/>
 *           &lt;element name="fromNodeID" type="{http://www.multispeak.org/Version_3.0}nodeIdentifier" minOccurs="0"/>
 *           &lt;element name="sectionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
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
@XmlType(name = "mspConnectivityPoint", propOrder = {
    "graphicSymbol",
    "annotationList",
    "toNodeIDOrParentSectionIDOrFromNodeID"
})
@XmlSeeAlso({
    Station.class,
    MspElectricPoint.class
})
public abstract class MspConnectivityPoint
    extends MspPointObject
{

    protected List<GraphicSymbol> graphicSymbol;
    protected List<GenericAnnotationFeature> annotationList;
    @XmlElementRefs({
        @XmlElementRef(name = "sectionID", namespace = "http://www.multispeak.org/Version_3.0", type = JAXBElement.class),
        @XmlElementRef(name = "parentSectionID", namespace = "http://www.multispeak.org/Version_3.0", type = JAXBElement.class),
        @XmlElementRef(name = "toNodeID", namespace = "http://www.multispeak.org/Version_3.0", type = JAXBElement.class),
        @XmlElementRef(name = "fromNodeID", namespace = "http://www.multispeak.org/Version_3.0", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> toNodeIDOrParentSectionIDOrFromNodeID;

    /**
     * Gets the value of the graphicSymbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicSymbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicSymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphicSymbol }
     * 
     * 
     */
    public List<GraphicSymbol> getGraphicSymbol() {
        if (graphicSymbol == null) {
            graphicSymbol = new ArrayList<GraphicSymbol>();
        }
        return this.graphicSymbol;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericAnnotationFeature }
     * 
     * 
     */
    public List<GenericAnnotationFeature> getAnnotationList() {
        if (annotationList == null) {
            annotationList = new ArrayList<GenericAnnotationFeature>();
        }
        return this.annotationList;
    }

    /**
     * Gets the value of the toNodeIDOrParentSectionIDOrFromNodeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toNodeIDOrParentSectionIDOrFromNodeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToNodeIDOrParentSectionIDOrFromNodeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRef }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getToNodeIDOrParentSectionIDOrFromNodeID() {
        if (toNodeIDOrParentSectionIDOrFromNodeID == null) {
            toNodeIDOrParentSectionIDOrFromNodeID = new ArrayList<JAXBElement<?>>();
        }
        return this.toNodeIDOrParentSectionIDOrFromNodeID;
    }

}
