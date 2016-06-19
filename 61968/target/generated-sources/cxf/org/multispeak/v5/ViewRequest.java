
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a class used to request data views from a system of record.
 * 
 * <p>Java class for viewRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewParameters" type="{http://www.multispeak.org/V5.0}viewParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewRequest", propOrder = {
    "viewName",
    "viewParameters"
})
public class ViewRequest {

    @XmlElement(required = true)
    protected String viewName;
    protected ViewParameters viewParameters;

    /**
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewName(String value) {
        this.viewName = value;
    }

    /**
     * Gets the value of the viewParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ViewParameters }
     *     
     */
    public ViewParameters getViewParameters() {
        return viewParameters;
    }

    /**
     * Sets the value of the viewParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewParameters }
     *     
     */
    public void setViewParameters(ViewParameters value) {
        this.viewParameters = value;
    }

}
