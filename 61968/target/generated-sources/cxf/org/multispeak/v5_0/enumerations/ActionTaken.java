
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for actionTaken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionTaken">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>actionTakenKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *       &lt;attribute name="disconnectionMeans" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionTaken", propOrder = {
    "value"
})
public class ActionTaken {

    @XmlValue
    protected ActionTakenKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;
    @XmlAttribute(name = "disconnectionMeans")
    protected String disconnectionMeans;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTakenKind }
     *     
     */
    public ActionTakenKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTakenKind }
     *     
     */
    public void setValue(ActionTakenKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

    /**
     * Gets the value of the disconnectionMeans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectionMeans() {
        return disconnectionMeans;
    }

    /**
     * Sets the value of the disconnectionMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectionMeans(String value) {
        this.disconnectionMeans = value;
    }

}
