
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This object is used as the payload of a message from one system (requester) to another related system (server) to navigate its display to view a specified device and change its focus to that device. 
 * 
 * <p>Java class for highlightDisplayObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="highlightDisplayObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="scadaPointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="displayIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "highlightDisplayObject", propOrder = {
    "scadaPointID",
    "displayIdentifier",
    "userName",
    "requestedAction"
})
public class HighlightDisplayObject
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID scadaPointID;
    @XmlElement(required = true)
    protected String displayIdentifier;
    protected String userName;
    protected String requestedAction;

    /**
     * Gets the value of the scadaPointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getScadaPointID() {
        return scadaPointID;
    }

    /**
     * Sets the value of the scadaPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setScadaPointID(ObjectID value) {
        this.scadaPointID = value;
    }

    /**
     * Gets the value of the displayIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayIdentifier() {
        return displayIdentifier;
    }

    /**
     * Sets the value of the displayIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayIdentifier(String value) {
        this.displayIdentifier = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedAction(String value) {
        this.requestedAction = value;
    }

}
