
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="connectivityNodeID" type="{cpsm_V4.1_Release}nodeIdentifier" minOccurs="0"/>
 *         &lt;element name="substationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurements" type="{cpsm_V4.1_Release}measurements" minOccurs="0"/>
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
    "substationID",
    "measurements"
})
public class NodeFields {

    protected NodeIdentifier connectivityNodeID;
    protected String substationID;
    protected Measurements measurements;

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
     * Gets the value of the substationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationID() {
        return substationID;
    }

    /**
     * Sets the value of the substationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationID(String value) {
        this.substationID = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link Measurements }
     *     
     */
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurements }
     *     
     */
    public void setMeasurements(Measurements value) {
        this.measurements = value;
    }

}
