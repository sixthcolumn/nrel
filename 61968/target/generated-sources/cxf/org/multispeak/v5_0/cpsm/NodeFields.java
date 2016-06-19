
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NodeIdentifier;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for NodeFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectivityNodeID" type="{http://www.multispeak.org/V5.0/commonTypes}nodeIdentifier" minOccurs="0"/>
 *         &lt;element name="MeasurementIDs" type="{http://www.multispeak.org/V5.0/cpsm}MeasurementIDs" minOccurs="0"/>
 *         &lt;element name="substationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeFields", propOrder = {
    "connectivityNodeID",
    "measurementIDs",
    "substationID"
})
public class NodeFields {

    protected NodeIdentifier connectivityNodeID;
    @XmlElement(name = "MeasurementIDs")
    protected MeasurementIDs measurementIDs;
    protected ObjectID substationID;

    /**
     * Gets the value of the connectivityNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getConnectivityNodeID() {
        return connectivityNodeID;
    }

    /**
     * Sets the value of the connectivityNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setConnectivityNodeID(NodeIdentifier value) {
        this.connectivityNodeID = value;
    }

    /**
     * Gets the value of the measurementIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementIDs }
     *     
     */
    public MeasurementIDs getMeasurementIDs() {
        return measurementIDs;
    }

    /**
     * Sets the value of the measurementIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementIDs }
     *     
     */
    public void setMeasurementIDs(MeasurementIDs value) {
        this.measurementIDs = value;
    }

    /**
     * Gets the value of the substationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSubstationID() {
        return substationID;
    }

    /**
     * Sets the value of the substationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSubstationID(ObjectID value) {
        this.substationID = value;
    }

}
