
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Extensions;
import org.multispeak.v5_0.commontypes.ExtensionsList;


/**
 * <p>Java class for switchingDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="switch" type="{http://www.multispeak.org/V5.0}switch"/>
 *         &lt;element name="sectionalizer" type="{http://www.multispeak.org/V5.0}sectionalizer"/>
 *         &lt;element name="recloser" type="{http://www.multispeak.org/V5.0}recloser"/>
 *         &lt;element name="jumper" type="{http://www.multispeak.org/V5.0}jumper"/>
 *         &lt;element name="fuse" type="{http://www.multispeak.org/V5.0}fuse"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="elbow" type="{http://www.multispeak.org/V5.0}elbow"/>
 *         &lt;element name="cut" type="{http://www.multispeak.org/V5.0}cut"/>
 *         &lt;element name="breaker" type="{http://www.multispeak.org/V5.0}breaker"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingDevice", propOrder = {
    "_switch",
    "sectionalizer",
    "recloser",
    "jumper",
    "fuse",
    "extensionsList",
    "extensions",
    "elbow",
    "cut",
    "breaker"
})
public class SwitchingDevice {

    @XmlElement(name = "switch")
    protected Switch _switch;
    protected Sectionalizer sectionalizer;
    protected Recloser recloser;
    protected Jumper jumper;
    protected Fuse fuse;
    protected ExtensionsList extensionsList;
    protected Extensions extensions;
    protected Elbow elbow;
    protected Cut cut;
    protected Breaker breaker;

    /**
     * Gets the value of the switch property.
     * 
     * @return
     *     possible object is
     *     {@link Switch }
     *     
     */
    public Switch getSwitch() {
        return _switch;
    }

    /**
     * Sets the value of the switch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Switch }
     *     
     */
    public void setSwitch(Switch value) {
        this._switch = value;
    }

    /**
     * Gets the value of the sectionalizer property.
     * 
     * @return
     *     possible object is
     *     {@link Sectionalizer }
     *     
     */
    public Sectionalizer getSectionalizer() {
        return sectionalizer;
    }

    /**
     * Sets the value of the sectionalizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sectionalizer }
     *     
     */
    public void setSectionalizer(Sectionalizer value) {
        this.sectionalizer = value;
    }

    /**
     * Gets the value of the recloser property.
     * 
     * @return
     *     possible object is
     *     {@link Recloser }
     *     
     */
    public Recloser getRecloser() {
        return recloser;
    }

    /**
     * Sets the value of the recloser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recloser }
     *     
     */
    public void setRecloser(Recloser value) {
        this.recloser = value;
    }

    /**
     * Gets the value of the jumper property.
     * 
     * @return
     *     possible object is
     *     {@link Jumper }
     *     
     */
    public Jumper getJumper() {
        return jumper;
    }

    /**
     * Sets the value of the jumper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jumper }
     *     
     */
    public void setJumper(Jumper value) {
        this.jumper = value;
    }

    /**
     * Gets the value of the fuse property.
     * 
     * @return
     *     possible object is
     *     {@link Fuse }
     *     
     */
    public Fuse getFuse() {
        return fuse;
    }

    /**
     * Sets the value of the fuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fuse }
     *     
     */
    public void setFuse(Fuse value) {
        this.fuse = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the elbow property.
     * 
     * @return
     *     possible object is
     *     {@link Elbow }
     *     
     */
    public Elbow getElbow() {
        return elbow;
    }

    /**
     * Sets the value of the elbow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Elbow }
     *     
     */
    public void setElbow(Elbow value) {
        this.elbow = value;
    }

    /**
     * Gets the value of the cut property.
     * 
     * @return
     *     possible object is
     *     {@link Cut }
     *     
     */
    public Cut getCut() {
        return cut;
    }

    /**
     * Sets the value of the cut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cut }
     *     
     */
    public void setCut(Cut value) {
        this.cut = value;
    }

    /**
     * Gets the value of the breaker property.
     * 
     * @return
     *     possible object is
     *     {@link Breaker }
     *     
     */
    public Breaker getBreaker() {
        return breaker;
    }

    /**
     * Sets the value of the breaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breaker }
     *     
     */
    public void setBreaker(Breaker value) {
        this.breaker = value;
    }

}
