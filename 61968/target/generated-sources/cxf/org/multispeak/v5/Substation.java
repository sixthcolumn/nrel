
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContentsItems;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.gml.PointType;
import org.multispeak.v5_0.gml.PolygonType;


/**
 * The substation is a container class that can hold bays, breakers, transformers, feeders, reclosers, etc.  It is suggested that the name of the substation be carried in the substation.primaryIdentifier and that the substationCode, if any, be carried in the substation.secondaryIdentifier.
 * 
 * <p>Java class for substation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="GMLPolygon" type="{http://www.multispeak.org/V5.0/gml}PolygonType" minOccurs="0"/>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/gml}PointType" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/V5.0}genericAnnotationFeatures" minOccurs="0"/>
 *         &lt;element name="busVolts" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="nominalVolts" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="voltageLevels" type="{http://www.multispeak.org/V5.0}voltageLevels" minOccurs="0"/>
 *         &lt;element name="feeders" type="{http://www.multispeak.org/V5.0}feeders" minOccurs="0"/>
 *         &lt;element name="contentsItems" type="{http://www.multispeak.org/V5.0/commonTypes}contentsItems" minOccurs="0"/>
 *         &lt;element name="bays" type="{http://www.multispeak.org/V5.0}bays" minOccurs="0"/>
 *         &lt;element name="regionID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
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
@XmlType(name = "substation", propOrder = {
    "gmlPolygon",
    "gmlLocation",
    "annotationList",
    "busVolts",
    "nominalVolts",
    "voltageLevels",
    "feeders",
    "contentsItems",
    "bays",
    "regionID"
})
public class Substation
    extends MspAsset
{

    @XmlElement(name = "GMLPolygon")
    protected PolygonType gmlPolygon;
    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    protected GenericAnnotationFeatures annotationList;
    protected Voltage busVolts;
    protected Voltage nominalVolts;
    protected VoltageLevels voltageLevels;
    protected Feeders feeders;
    protected ContentsItems contentsItems;
    protected Bays bays;
    protected ObjectRef regionID;

    /**
     * Gets the value of the gmlPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getGMLPolygon() {
        return gmlPolygon;
    }

    /**
     * Sets the value of the gmlPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setGMLPolygon(PolygonType value) {
        this.gmlPolygon = value;
    }

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setGMLLocation(PointType value) {
        this.gmlLocation = value;
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
     * Gets the value of the busVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBusVolts() {
        return busVolts;
    }

    /**
     * Sets the value of the busVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBusVolts(Voltage value) {
        this.busVolts = value;
    }

    /**
     * Gets the value of the nominalVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getNominalVolts() {
        return nominalVolts;
    }

    /**
     * Sets the value of the nominalVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setNominalVolts(Voltage value) {
        this.nominalVolts = value;
    }

    /**
     * Gets the value of the voltageLevels property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageLevels }
     *     
     */
    public VoltageLevels getVoltageLevels() {
        return voltageLevels;
    }

    /**
     * Sets the value of the voltageLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageLevels }
     *     
     */
    public void setVoltageLevels(VoltageLevels value) {
        this.voltageLevels = value;
    }

    /**
     * Gets the value of the feeders property.
     * 
     * @return
     *     possible object is
     *     {@link Feeders }
     *     
     */
    public Feeders getFeeders() {
        return feeders;
    }

    /**
     * Sets the value of the feeders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feeders }
     *     
     */
    public void setFeeders(Feeders value) {
        this.feeders = value;
    }

    /**
     * Gets the value of the contentsItems property.
     * 
     * @return
     *     possible object is
     *     {@link ContentsItems }
     *     
     */
    public ContentsItems getContentsItems() {
        return contentsItems;
    }

    /**
     * Sets the value of the contentsItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentsItems }
     *     
     */
    public void setContentsItems(ContentsItems value) {
        this.contentsItems = value;
    }

    /**
     * Gets the value of the bays property.
     * 
     * @return
     *     possible object is
     *     {@link Bays }
     *     
     */
    public Bays getBays() {
        return bays;
    }

    /**
     * Sets the value of the bays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bays }
     *     
     */
    public void setBays(Bays value) {
        this.bays = value;
    }

    /**
     * Gets the value of the regionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getRegionID() {
        return regionID;
    }

    /**
     * Sets the value of the regionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setRegionID(ObjectRef value) {
        this.regionID = value;
    }

}
