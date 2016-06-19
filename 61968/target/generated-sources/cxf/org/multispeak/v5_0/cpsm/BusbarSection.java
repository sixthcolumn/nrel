
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. Voltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal. The typeName attribute indicates the type of bus bar section, e.g.: Main, Transfer.  A busbarSection may be included as part of an equipmentContainer in a bay or substation.
 * 
 * <p>Java class for BusbarSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusbarSection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}Connector">
 *       &lt;sequence>
 *         &lt;element name="busbarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipmentContainerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="bayID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "BusbarSection", propOrder = {
    "busbarType",
    "equipmentContainerID",
    "bayID"
})
public class BusbarSection
    extends Connector
{

    protected String busbarType;
    protected ObjectRef equipmentContainerID;
    protected ObjectID bayID;

    /**
     * Gets the value of the busbarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusbarType() {
        return busbarType;
    }

    /**
     * Sets the value of the busbarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusbarType(String value) {
        this.busbarType = value;
    }

    /**
     * Gets the value of the equipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEquipmentContainerID() {
        return equipmentContainerID;
    }

    /**
     * Sets the value of the equipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEquipmentContainerID(ObjectRef value) {
        this.equipmentContainerID = value;
    }

    /**
     * Gets the value of the bayID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getBayID() {
        return bayID;
    }

    /**
     * Sets the value of the bayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setBayID(ObjectID value) {
        this.bayID = value;
    }

}
