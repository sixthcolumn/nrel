
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Seconds;


/**
 * <p>Java class for listItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="scadaPointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="deadband" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="debounceTime" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listItem", propOrder = {
    "scadaPointID",
    "deadband",
    "debounceTime"
})
public class ListItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID scadaPointID;
    protected Float deadband;
    protected Seconds debounceTime;

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
     * Gets the value of the deadband property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeadband() {
        return deadband;
    }

    /**
     * Sets the value of the deadband property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeadband(Float value) {
        this.deadband = value;
    }

    /**
     * Gets the value of the debounceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getDebounceTime() {
        return debounceTime;
    }

    /**
     * Sets the value of the debounceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setDebounceTime(Seconds value) {
        this.debounceTime = value;
    }

}
