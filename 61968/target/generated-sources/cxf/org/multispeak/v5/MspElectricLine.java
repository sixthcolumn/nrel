
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for mspElectricLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspElectricLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspConnectivityLine">
 *       &lt;sequence>
 *         &lt;element name="conductorLength" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="lengthSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="load" type="{http://www.multispeak.org/V5.0}loadGroup" minOccurs="0"/>
 *         &lt;element name="constructionItems" type="{http://www.multispeak.org/V5.0}constructionItems" minOccurs="0"/>
 *         &lt;element name="equipmentContainerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
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
@XmlType(name = "mspElectricLine", propOrder = {
    "conductorLength",
    "lengthSource",
    "load",
    "constructionItems",
    "equipmentContainerID"
})
@XmlSeeAlso({
    ACLineSegment.class
})
public abstract class MspElectricLine
    extends MspConnectivityLine
{

    protected Length conductorLength;
    protected String lengthSource;
    protected LoadGroup load;
    protected ConstructionItems constructionItems;
    protected ObjectRef equipmentContainerID;

    /**
     * Gets the value of the conductorLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getConductorLength() {
        return conductorLength;
    }

    /**
     * Sets the value of the conductorLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setConductorLength(Length value) {
        this.conductorLength = value;
    }

    /**
     * Gets the value of the lengthSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthSource() {
        return lengthSource;
    }

    /**
     * Sets the value of the lengthSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthSource(String value) {
        this.lengthSource = value;
    }

    /**
     * Gets the value of the load property.
     * 
     * @return
     *     possible object is
     *     {@link LoadGroup }
     *     
     */
    public LoadGroup getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadGroup }
     *     
     */
    public void setLoad(LoadGroup value) {
        this.load = value;
    }

    /**
     * Gets the value of the constructionItems property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionItems }
     *     
     */
    public ConstructionItems getConstructionItems() {
        return constructionItems;
    }

    /**
     * Sets the value of the constructionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionItems }
     *     
     */
    public void setConstructionItems(ConstructionItems value) {
        this.constructionItems = value;
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

}
