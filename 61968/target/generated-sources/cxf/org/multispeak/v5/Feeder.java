
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContentsItems;
import org.multispeak.v5_0.commontypes.SubstationRef;


/**
 * Feeders are containers for equipment associated with a distribution feeder. The use of feeders as containers is optional in MultiSpeak and not recognized in CIM.  The feederName SHALL be included in the feeder.primaryIdentifier and the feederCode, if used, SHALL be carried in the feeder.secondaryIdentifier.
 * 
 * <p>Java class for feeder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentsItems" type="{http://www.multispeak.org/V5.0/commonTypes}contentsItems" minOccurs="0"/>
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
@XmlType(name = "feeder", propOrder = {
    "substationRef",
    "feederColor",
    "bus",
    "contentsItems"
})
public class Feeder
    extends MspObject
{

    protected SubstationRef substationRef;
    protected String feederColor;
    protected String bus;
    protected ContentsItems contentsItems;

    /**
     * Gets the value of the substationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getSubstationRef() {
        return substationRef;
    }

    /**
     * Sets the value of the substationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setSubstationRef(SubstationRef value) {
        this.substationRef = value;
    }

    /**
     * Gets the value of the feederColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederColor() {
        return feederColor;
    }

    /**
     * Sets the value of the feederColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederColor(String value) {
        this.feederColor = value;
    }

    /**
     * Gets the value of the bus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBus(String value) {
        this.bus = value;
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

}
