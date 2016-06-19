
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for substationLoadControlStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substationLoadControlStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="substationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scadaAnalog" type="{http://www.multispeak.org/V5.0}scadaAnalog" minOccurs="0"/>
 *         &lt;element name="controlledItems" type="{http://www.multispeak.org/V5.0}controlledItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "substationLoadControlStatus", propOrder = {
    "substationName",
    "status",
    "mode",
    "scadaAnalog",
    "controlledItems"
})
public class SubstationLoadControlStatus
    extends MspReferable
{

    protected String substationName;
    protected String status;
    protected String mode;
    protected ScadaAnalog scadaAnalog;
    protected ControlledItems controlledItems;

    /**
     * Gets the value of the substationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationName() {
        return substationName;
    }

    /**
     * Sets the value of the substationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationName(String value) {
        this.substationName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the scadaAnalog property.
     * 
     * @return
     *     possible object is
     *     {@link ScadaAnalog }
     *     
     */
    public ScadaAnalog getScadaAnalog() {
        return scadaAnalog;
    }

    /**
     * Sets the value of the scadaAnalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadaAnalog }
     *     
     */
    public void setScadaAnalog(ScadaAnalog value) {
        this.scadaAnalog = value;
    }

    /**
     * Gets the value of the controlledItems property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledItems }
     *     
     */
    public ControlledItems getControlledItems() {
        return controlledItems;
    }

    /**
     * Sets the value of the controlledItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledItems }
     *     
     */
    public void setControlledItems(ControlledItems value) {
        this.controlledItems = value;
    }

}
