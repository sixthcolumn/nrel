
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectivityNodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectivityNodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node1ID" type="{http://www.multispeak.org/V5.0/commonTypes}nodeIdentifier"/>
 *         &lt;element name="node2ID" type="{http://www.multispeak.org/V5.0/commonTypes}nodeIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectivityNodes", propOrder = {
    "node1ID",
    "node2ID"
})
public class ConnectivityNodes {

    @XmlElement(required = true)
    protected NodeIdentifier node1ID;
    @XmlElement(required = true)
    protected NodeIdentifier node2ID;

    /**
     * Gets the value of the node1ID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getNode1ID() {
        return node1ID;
    }

    /**
     * Sets the value of the node1ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setNode1ID(NodeIdentifier value) {
        this.node1ID = value;
    }

    /**
     * Gets the value of the node2ID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getNode2ID() {
        return node2ID;
    }

    /**
     * Sets the value of the node2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setNode2ID(NodeIdentifier value) {
        this.node2ID = value;
    }

}
