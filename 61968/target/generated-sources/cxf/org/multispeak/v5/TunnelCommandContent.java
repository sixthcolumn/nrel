
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a manufacturer-specific command that is to be tunnelled over the AMI network to a HANDevice.
 * 
 * <p>Java class for tunnelCommandContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tunnelCommandContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="commandEncoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tunnelCommandContent", propOrder = {
    "commandContent"
})
public class TunnelCommandContent {

    @XmlElement(required = true)
    protected String commandContent;
    @XmlAttribute(name = "commandEncoding")
    protected String commandEncoding;

    /**
     * Gets the value of the commandContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandContent() {
        return commandContent;
    }

    /**
     * Sets the value of the commandContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandContent(String value) {
        this.commandContent = value;
    }

    /**
     * Gets the value of the commandEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandEncoding() {
        return commandEncoding;
    }

    /**
     * Sets the value of the commandEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandEncoding(String value) {
        this.commandEncoding = value;
    }

}
