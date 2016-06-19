
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="billRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadSections" type="{http://www.multispeak.org/V5.0}loadSections" minOccurs="0"/>
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
@XmlType(name = "loadGroup", propOrder = {
    "billRef",
    "loadSections"
})
public abstract class LoadGroup
    extends MspObject
{

    protected String billRef;
    protected LoadSections loadSections;

    /**
     * Gets the value of the billRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRef() {
        return billRef;
    }

    /**
     * Sets the value of the billRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRef(String value) {
        this.billRef = value;
    }

    /**
     * Gets the value of the loadSections property.
     * 
     * @return
     *     possible object is
     *     {@link LoadSections }
     *     
     */
    public LoadSections getLoadSections() {
        return loadSections;
    }

    /**
     * Sets the value of the loadSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadSections }
     *     
     */
    public void setLoadSections(LoadSections value) {
        this.loadSections = value;
    }

}
