
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectivityModelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectivityModelGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="connectivityNodes" type="{http://www.multispeak.org/V5.0/commonTypes}connectivityNodes"/>
 *         &lt;element name="connectivitySections" type="{http://www.multispeak.org/V5.0/commonTypes}connectivitySections"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectivityModelGroup", propOrder = {
    "connectivityNodes",
    "connectivitySections"
})
public class ConnectivityModelGroup {

    protected ConnectivityNodes connectivityNodes;
    protected ConnectivitySections connectivitySections;

    /**
     * Gets the value of the connectivityNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityNodes }
     *     
     */
    public ConnectivityNodes getConnectivityNodes() {
        return connectivityNodes;
    }

    /**
     * Sets the value of the connectivityNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityNodes }
     *     
     */
    public void setConnectivityNodes(ConnectivityNodes value) {
        this.connectivityNodes = value;
    }

    /**
     * Gets the value of the connectivitySections property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivitySections }
     *     
     */
    public ConnectivitySections getConnectivitySections() {
        return connectivitySections;
    }

    /**
     * Sets the value of the connectivitySections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivitySections }
     *     
     */
    public void setConnectivitySections(ConnectivitySections value) {
        this.connectivitySections = value;
    }

}
